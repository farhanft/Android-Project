package com.example.dani.cobaquiz;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button Answer1, Answer2, Answer3, Answer4;
    TextView Score, Question;
    int lastscore;

    private Question mQuestion = new Question();

    private String mAnswer;
    private int mScore = 0;
    private int mQustionLenght = mQuestion.mQuestion.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();


        Answer1 = (Button) findViewById(R.id.Answer1);
        Answer2 = (Button) findViewById(R.id.Answer2);
        Answer3 = (Button) findViewById(R.id.Answer3);
        Answer4 = (Button) findViewById(R.id.Answer4);

        Score = (TextView) findViewById(R.id.Score);
        Question = (TextView) findViewById(R.id.Question);

        SharedPreferences preferences = getSharedPreferences("PREFS", 0);
        lastscore = preferences.getInt("lastscore", 0);

        Score.setText("Score :" +mScore);

        updateQuestion(r.nextInt(mQustionLenght));

        Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Answer1.getText() == mAnswer) {
                    mScore++;
                    Score.setText("Score :" + mScore);
                    updateQuestion(r.nextInt(mQustionLenght));
                } else

                {
                    nextQuestion();

                }
            }
        });

        Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Answer2.getText() == mAnswer) {
                    mScore++;
                    Score.setText("Score :" + mScore);
                    updateQuestion(r.nextInt(mQustionLenght));
                } else

                {
                    nextQuestion();
                }
            }
        });

        Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Answer3.getText() == mAnswer) {
                    mScore++;
                    Score.setText("Score :" + mScore);
                    updateQuestion(r.nextInt(mQustionLenght));
                } else

                {
                    nextQuestion();
                }

            }
        });

        Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Answer4.getText()== mAnswer){
                    mScore++;
                    Score.setText("Score :" +mScore);
                    updateQuestion(r.nextInt(mQustionLenght));
                } else{
                    nextQuestion();
                }

            }
        });
        
    }


    private void updateQuestion(int num){
        Question.setText(mQuestion.getQuestion(num));
        Answer1.setText(mQuestion.getChoice1(num));
        Answer2.setText(mQuestion.getChoice2(num));
        Answer3.setText(mQuestion.getChoice3(num));
        Answer4.setText(mQuestion.getChoice4(num));

        mAnswer = mQuestion.getCorretAnswer(num);
    }

    private void nextQuestion(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setMessage("You are false! Your score is" + mScore + "points")
                .setCancelable(false)
                .setPositiveButton("New Question",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                SharedPreferences myScore = getSharedPreferences("MyAwsomeScore", Context.MODE_PRIVATE);
                                SharedPreferences.Editor editor = myScore.edit();
                                editor.putInt("mScore", mScore);
                                editor.commit();

                                Score.setText("Score :" +mScore);
                            }
                        })
                .setNegativeButton("Go to Explanation",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(MainActivity.this, PembahasanActivity.class);
                                startActivity(i);
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

}
