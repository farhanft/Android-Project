package com.example.dani.cobaquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class PembahasanActivity extends AppCompatActivity {

    Button kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembahasan);

        TextView pembahasan = (TextView) findViewById(R.id.pembahasan);
        TextView description_text = (TextView) findViewById(R.id.description_text);
        Button kembali = (Button) findViewById(R.id.kembali);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PembahasanActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });

        pembahasan.setText("Pembahasan");
        description_text.setText("Soal 1: Pengelompokkan bakteri berdasarkan kelompok bakteri gram-positif dan gram-negatif didasarkan pada\n" +
                "Jawaban: komposisi senyawa penyusun dinding sel\n" +
                "Pembahasan: Pada lapisan dinding sel bakteri terdapat peptidoglikan, pada bakteri gram positif kandungan peptidoglikan lebih tebal dibandingkan dengan bakteri gram negatif. Selain itu pada bakteri garam negatif dua laporan membran yang mengapit lapisan peptidoglikan.\n" +
                "Soal 2: Beberapa tumbuhan memiliki nilai ekonomi yang tinggi karena memiliki kayu yang harum. Salah satu tumbuhan tersebut adalah cendana. Cendana berbau harum karena \n" +
                "Jawaban: batangnya mengandung minyak atsiri yang berbau harum\n" +
                "Pembahasan: Minyak atsiri dapat dihasilkan di daun dan batang, pada pohon cendana minyak atsiri yang berbau harum banyak dihasilkan pada batang daripada daun.\n" +
                "Soal 3: Kekurangan unsur kimia berikut dapat menyebabkan tanaman mengalami klorosis yang ditandai dengan menguningnya daun, yaitu\n" +
                "Jawaban: magnesium\n" +
                "Pembahasan: Klorofil merupakan molekul organik yang tersusun dari C, H, O, N, Mg. Apabila tumbuhan kekurangan magnesium maka tanaman akan mengalami klorosis/pucat daun karena terhambatnya pembentukan klorofil.\n" +
                "Soal 4: Pindah silang pada meiosis yang ditandai dengan terbentuknya kiasmata terjadi pada tahapan\n" +
                "Jawaban: diploten\n" +
                "Pembahasan:  Pindah silang/crosing over ditandai dengan terbentuknya kiasmata pada tahap diploten profase meiosis I.\n" +
                "Soal 5: Komponen pada sitoplasma yang ditemukan pada sel prokariotik maupun eukariotik, yang tersusun atas serat protein adalah ….\n" +
                "Jawaban: sitoskeleton\n" +
                "Pembahasan: Sitoskeleton merupakan kerangka sel yang membentuk berkas-berkas protein yang menyusun sitoplasma dalam sel. Sitoskeleton ditemukan pada eukariot maupun prokariot.\n" +
                "Soal 6: Hematuria merupakan gangguan yang terjadi pada sistem ekskresi karena\n" +
                "Jawaban: banyaknya kadar air yang ada di darah pada saat proses filtrasi di glomerulus sehingga terbentuk urin dalam jumlah yang banyak.\n" +
                "Pembahasan: Hematuria merupakan gangguan yang terjadi pada sistem ekskresi karena kurangnya kadar air yang ada di darah pada saat proses filtrasi di glomerulus sehingga pada urin masih ditemukan sel darah merah.\n" +
                "Soal 7: Bayi kembar identik dan bayi kembar siam memiliki kesamaan dalam proses fertilisasinya tetapi memiliki\n" +
                "Jawaban: perbedaan pembelahan sel saat embriogenesis pada tahap morula.\n" +
                "Pembahasan: Pembahasan Bayi kembar identik dan bayi kembar siam memiliki kesamaan dalam proses fertilisasinya karena berasal dari sperma dan telur yang sama, tetapi memiliki perbedaan pembelahan sel saat embriogenesis pada tahap morula, pada bayi kembar identik morula terbagi dan membelah secara sempurna, sedangkan pada bayi kembar siam morula terbagi dan membelah secara tidak sempurna sehingga ada bagian-bagian tubuh bayi yang masih menjadi satu.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");


    }
}
