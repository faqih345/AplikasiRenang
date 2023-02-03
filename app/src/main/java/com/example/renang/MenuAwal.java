package com.example.renang;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MenuAwal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_awal);
    }

    public void belajar(View view) {
        Intent intent = new Intent(MenuAwal.this, MenuBelajar.class);
        startActivity(intent);
    }

    public void kolam(View view) {
        Intent intent = new Intent(MenuAwal.this, KolamRenang.class);
        startActivity(intent);
    }

    public void kuis(View view) {
        Intent intent = new Intent(MenuAwal.this, MenuKuis.class);
        startActivity(intent);
    }

    public void back(View view) {
        onBackPressed();
    }
    @Override
    public void onBackPressed() {
        MediaPlayer audio1;
        audio1 = (MainActivity.audio);
        audio1.setVolume(0,0);
        Intent intent = new Intent(MenuAwal.this, MainActivity.class);
        startActivity(intent);
    }
}