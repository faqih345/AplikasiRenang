package com.example.renang;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuBelajar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_belajar);
    }

    public void PengRenang(View view) {
        Intent intent = new Intent(MenuBelajar.this, PengRenang.class);
        startActivity(intent);
    }
    public void SejRenang(View view) {
        Intent intent = new Intent(MenuBelajar.this, SejRenang.class);
        startActivity(intent);
    }
    public void TekRenang(View view) {
        Intent intent = new Intent(MenuBelajar.this, TekRenang.class);
        startActivity(intent);
    }
    public void TekDasar(View view) {
        Intent intent = new Intent(MenuBelajar.this, TekDasar.class);
        startActivity(intent);
    }
    public void FasPerlengkapan(View view) {
        Intent intent = new Intent(MenuBelajar.this, FasPerlengkapan.class);
        startActivity(intent);
    }

    public void back(View view) {
        onBackPressed();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}