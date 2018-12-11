package com.example.dani.cobaquiz;

public class Question {
    public String mQuestion[] ={
            "Pengelompokkan bakteri berdasarkan kelompok bakteri gram-positif dan gram-negatif didasarkan pada …",
            "Beberapa tumbuhan memiliki nilai ekonomi yang tinggi karena memiliki kayu yang harum. Salah satu tumbuhan tersebut adalah cendana. Cendana berbau harum karena …",
            "Sklera pada bagian anterior mata akan tersambung dengan …",
            "Kekurangan unsur kimia berikut dapat menyebabkan tanaman mengalami klorosis yang ditandai dengan menguningnya daun, yaitu …",
            "Pindah silang pada meiosis yang ditandai dengan terbentuknya kiasmata terjadi pada tahapan …",
            "Komponen pada sitoplasma yang ditemukan pada sel prokariotik maupun eukariotik, yang tersusun atas serat protein adalah …",
            "Komponen sel bakteri Escherichia coli yang berperan dalam pembentukan energi adalah .... ",
            "Seleksi unsur hara yang diserap akar tumbuhan dilakukan melalui pita Kaspari yang terdapat pada jaringan ...",
            "Bayi kembar identik dan bayi kembar siam memiliki kesamaan dalam proses fertilisasinya tetapi memiliki … ",
            "Hematuria merupakan gangguan yang terjadi pada sistem ekskresi karena ... "
    };

    private  String mChoices[][] = {

            {"permeabilitas membran sel", "komposisi kimiawi sitoplasma", "keberadaan lapisan peptidoglikan", "komposisi senyawa penyusun dinding sel"},
            {"batangnya ditumbuhi lumut kerak sehingga menghasilkan senyawa berbau harum", "batangnya dihuni oleh serangga yang menghasilkan feromon berbau harum", "memiliki simbion berupa bakteri yang menghasilkan resin berbau harum", "batangnya mengandung minyak atsiri yang berbau harum"},
            {"kornea", "konjungtiva", "lensa", "bintik buta"},
            {"kalsium", "magnesium", "mangan", "kalium"},
            {"zigoten", "pakiten", "diploten", "diakinesis"},
            {"sitoskeleton", "nukleosom", "kromatin", "murein"},
            {"membran sel", "mitokondria", "mesosom", "lisosom"},
            {"perisikel", "endodermis", "korteks", "pembuluh"},
            {"kesamaan dalam proses organogenesis dan diferensiasi sel.", "perbedaan pembelahan sel saat embriogenesis pada tahap morula.", "kesamaan pembelahan sel saat embriogenesis pada tahap blastula.", "perbedaan pada pemisahan sel-sel saat proses diferensiasi."},
            {"banyaknya kadar hormon ADH di glomerulus sehingga proses filtrasi air semakin cepat.", "kurangnya kadar hormon ADH di tubulus kontortus proksimal sehingga proses reabsorpsi air semakin lambat.", "kurangnya kadar air yang ada di darah pada saat proses filtrasi di glomerulus sehingga pada urin masih ditemukan sela darah merah.", "banyaknya kadar air yang ada di darah pada saat proses filtrasi di glomerulus sehingga terbentuk urin dalam jumlah yang banyak."}
    };

    private String mCorrectAnswer[] = {"komposisi senyawa penyusun dinding sel", "batangnya mengandung minyak atsiri yang berbau harum", "kornea", "magnesium", "diploten", "sitoskeleton", "mesosom", "perisikel", "perbedaan pembelahan sel saat embriogenesis pada tahap morula.", "banyaknya kadar air yang ada di darah pada saat proses filtrasi di glomerulus sehingga terbentuk urin dalam jumlah yang banyak."};

    public String getQuestion(int a){
        String  Question = mQuestion[a];
        return Question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorretAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
