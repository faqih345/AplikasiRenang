package com.example.renang;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PengRenang extends AppCompatActivity {
    TextView peng_renang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peng_renang);
        peng_renang = findViewById(R.id.peng_renang);

        peng_renang.setText("Renang adalah olahraga yang dilakukan dengan cara berpindah tempat secara teratur " +
                "didalam air dengan cepat menggunakan tangan dan kaki. Berenang adalah latihan aerobik yang " +
                "membantu menjaga jantung dan paru-paru tetap sehat. Berenang juga membantu menjaga sendi " +
                "tetap fleksibel, terutama di bagian leher, bahu, pinggul dan selangkangan. Tujuan olahraga " +
                "renang adalah untuk menentukan siapa perenang yang paling cepat dari beberapa perenang yang " +
                "mengikuti perlombaan tersebut.");
    }
    public void back(View view) {
        onBackPressed();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
