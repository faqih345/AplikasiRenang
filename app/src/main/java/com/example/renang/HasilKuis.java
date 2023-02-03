package com.example.renang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HasilKuis extends AppCompatActivity {
    int nilai;
    int nilaiAkhir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_kuis);

        TextView skor = findViewById(R.id.skor);

        nilai=(MenuKuis.skor);
        nilaiAkhir=(10*nilai);
        skor.setText(""+nilaiAkhir+" / 15");

    }
    public void ulang(View view) {
        Intent intent = new Intent(HasilKuis.this, MenuKuis.class);
        startActivity(intent);
    }

    public void menuAwal(View view) {
        Intent intent = new Intent(HasilKuis.this, MenuAwal.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        Intent intent = new Intent(HasilKuis.this, MenuAwal.class);
        startActivity(intent);
    }
}