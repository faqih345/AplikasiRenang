package com.example.renang;

public class Question {

    private String cQuestion[] = {
            "Pengertian renang adalah …",
            "Judul Buku yang ditulis Profesor Nikolaus Wynmann adalah …",
            "Tahun berapa perlombaan renang dimulai di Eropa …",
            "Gaya renang yang dilakukan dengan posisi kedua belah tangan secara bergantian digerakkan ke depan dengan gerakan mengayuh, " +
                    "sementara kedua belah kaki secara bergantian dicambukkan naik turun adalah gaya …",
            "Gaya renang yang dilakukan dengan posisi dada menghadap ke permukaan air. Kedua belah kaki menendang ke arah luar sementara kedua belah tangan" +
                    "dibuka ke samping seperti gerakan membelah air adalah gaya …",
            "Gaya renang yang dilakukan dengan posisi tubuh telentang di permukaan air. Kedua belah tangan" +
                    "secara bergantian digerakkan menuju pinggang seperti gerakan mengayuh. …",
            "Gaya renang yang dilakukan dengan posisi dada menghadap ke permukaan air.Kedua belah lengan secara bersamaan ditekan ke bawah dan digerakkan ke arah luar " +
                    "sebelum diayunkan ke depan. Sementara kedua belah kaki menendang ke bawah dan ke atas. …",
            "Gaya renang yang harus melakukan 4 gaya dengan urutan yang sudah ditentukan …",
            "Ada berapa teknik dasar dalam olahraga renang …",
            "Teknik yang dilakukan oleh perenang dengan memanfaatkan tekanan air agar " +
                    "dapat mendorong tubuh perenang tetap diatas permukaan air merupakan teknik …",
            "Teknik yang digunakan untuk mendorong tubuh perenang dengan memanfaatkan kekuatan tarikan gerakan " +
                    "lengan dan dapat dihasilkan dari gerakan cambukan atau dorongan tungkai merupakan teknik …",
            "Teknik yang dilakukan dengan cara mengabil nafas melalui mulut, lalu tahan " +
                    "beberapa saat kemudian buang nafas secara perlahan melalui hidung merupakan teknik …",
            "Berapa ukuran internasional kolam renang yang digunakan untuk olahraga renang …",
            "Dimana tempat perenang untuk melakukan posisi start saat ingin memulai perlombaan renang …",
            "Bahan apa yang digunakan topi dan pakaian renang …"

    };

    private String cChoise[][] = {
            {"Cara berpindah tempat didalam air menggunakan tangan dan kaki", "Cara berpindah berdiam diri didalam air", "Cara berpindah tempat didalam air tanpa menggunakan tangan dan kaki", "Cara mengendalikan air menggunakan tangan dan kaki"},
            {"Der Schwimmer oder ein Zuverlässiger oder eint", "Der Schwimmer oder über die Schwimmkunst", "Der Zuverlässiger Schwimmer oder ein Schwimmkunst", "Der Schwimmer oder ein Zwiegespräch über die Schwimmkunst"},
            {"1600-an", "1700-an", "1800-an", "1900-an"},
            {"Gaya Bebas", "Gaya Dada", "Gaya Punggung", "Gaya Kupu-kupu"},
            {"Gaya Bebas", "Gaya Dada", "Gaya Punggung", "Gaya Kupu-kupu"},
            {"Gaya Bebas", "Gaya Dada", "Gaya Punggung", "Gaya Kupu-kupu"},
            {"Gaya Dada", "Gaya Punggung", "Gaya Kupu-kupu", "Gaya Ganti"},
            {"Gaya Dada", "Gaya Punggung", "Gaya Kupu-kupu", "Gaya Ganti"},
            {"2 (Dua)", "3 (Tiga)", "4 (Empat)", "5 (lima)"},
            {"Mengapung", "Dorongan", "Pernapasan", "Menyelam"},
            {"Mengapung", "Dorongan", "Pernapasan", "Menyelam"},
            {"Mengapung", "Dorongan", "Pernapasan", "Menyelam"},
            {"30 meter", "40 meter", "50 meter", "60 meter"},
            {"Balok Start", "Garis Start", "Balok Finish", "garis Finish"},
            {"Jeans", "Sutra", "Karet", "Katun"}
    };

    private String cAnswer[] = {
            "Cara berpindah tempat didalam air menggunakan tangan dan kaki",
            "Der Schwimmer oder ein Zwiegespräch über die Schwimmkunst",
            "1800-an",
            "Gaya Bebas",
            "Gaya Dada",
            "Gaya Punggung",
            "Gaya Kupu-kupu",
            "Gaya Ganti",
            "3 (Tiga)",
            "Mengapung",
            "Dorongan",
            "Pernapasan",
            "50 meter",
            "Balok Start",
            "Karet"
    };

    public String getQuestion(int nomor){
        String tanya = cQuestion[nomor];
        return tanya;
    }
    public String getAnswer(int nomor){
        String jawab = cAnswer[nomor];
        return jawab;
    }

    public String getChoice1(int nomor){
        String pilih = cChoise[nomor][0];
        return pilih;
    }
    public String getChoice2(int nomor){
        String pilih = cChoise[nomor][1];
        return pilih;
    }
    public String getChoice3(int nomor){
        String pilih = cChoise[nomor][2];
        return pilih;
    }
    public String getChoice4(int nomor){
        String pilih = cChoise[nomor][3];
        return pilih;
    }

}
