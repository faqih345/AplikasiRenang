package com.example.renang;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SejRenang extends AppCompatActivity {
    TextView sej_renang;
    TextView sej_indo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sej_renang);
        sej_renang = findViewById(R.id.sej_renang);
        sej_renang.setText("Kegiatan berenang sudah ada sejak zaman prasejarah, bukti tertua mengenai " +
                "berenang adalah lukisan-lukisan dari zaman batu yang ditemukan di “Gua Perenang” yang " +
                "berdekatan dengan teluk Wadi Sora di Gilf Sora, Mesir Barat Daya.\n" +
                "Pada tahun 1538, profesor bahasa bernama Nikolaus Wynmann dari Jerman menulis " +
                "buku mengenai kegiatan berenang yang berjudul “Der Schwimmer oder ein Zwiegespräch über die Schwimmkunst”. " +
                "Sejak saat itu, banyak orang yang mulai mempelajari dan melakukan olahraga renang." +
                "Perlombaan renang dimulai di Eropa sekitar tahun 1800-an.");

        sej_indo = findViewById(R.id.sej_indo);
        sej_indo.setText("Sejarah renang di Indonesia pertama kali diketahui pada tahun 1904. Namun, pada saat itu olahraga renang " +
                "hanya dilakukan oleh bangsa Belanda dan orang-orang berada saja. \n" +
                "Perkembangan olahraga renang mulai dapat dilihat pada saat didirikannya perkumpulan renang Bandungsche Zwembond atau " +
                "Perserikatan Renang Bandung pada tahun 1917\n" +
                "Setahun berselang, perkumpulan renang Indonesia ini menjadi bertambah luas, yaitu mulai dibentuknya Perserikatan Berenang Jawa Barat. " +
                "Setelah Jawa Barat, Jawa Timur pun menyusul dengan mendirikan Perserikatan Berenang Jawa Timur. " +
                "Setelah mulai banyak memiliki anggota, perserikatan renang mulai menyelenggarakan perlombaan renang antar daerah." +
                "Pada Maret tahun 1951 Persatuan Berenang Seluruh Indonesia atau disingkat PBSI yang dibentuk di Jakarta");
    }
    public void back(View view) {
        onBackPressed();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
