package com.example.dani.cobaquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button Start, Exit, Setting;

    MediaPlayer backsound;
    MediaPlayer soundeffects;
    Button Sound;
    Button Mute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Start = (Button) findViewById(R.id.Start);
        Exit = (Button) findViewById(R.id.Exit);
        Setting = (Button) findViewById(R.id.pengaturan);


        backsound = MediaPlayer.create(HomeActivity.this, R.raw.bensound_energy);
        backsound.setLooping(true);
        backsound.start();

        soundeffects = MediaPlayer.create(HomeActivity.this, R.raw.misc001);

        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundeffects.start();
                Intent i = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(i);
            }
        });


        Setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundeffects.start();
                Intent i = new Intent(HomeActivity.this, SettingActivity.class);
                startActivity(i);
            }
        });


        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundeffects.start();
                ActivityCompat.finishAffinity(HomeActivity.this);
            }
        });

        Sound = (Button) findViewById(R.id.Sound);
        Sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backsound.setVolume(1,1);
            }
        });


        Mute = (Button) findViewById(R.id.Mute);
        Mute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backsound.setVolume(0,0);

            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        if(this.isFinishing()){
            backsound.stop();
        }
    }



}
