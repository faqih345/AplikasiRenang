package com.example.renang;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class TekRenang extends AppCompatActivity {
    Dialog popup;
    TextView deskripsi_teknik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tek_renang);

        popup = new Dialog(this);
        deskripsi_teknik = findViewById(R.id.deskripsi_teknik);

        deskripsi_teknik.setText("Olahraga renang memiliki banyak macam gaya renang yang umumnya diperlombakan. " +
                "Masing-masing gaya renang memiliki gerakan dan teknik renang yang berbeda.\n" +
                "Berikut beberapa gaya renang yang ada dalam olahraga renang :");

    }
    public void Gbebas(View view) {
        Button tutup;
        TextView judul_teknik;
        TextView deskripsi_teknik;
        GifImageView gif_teknik;
        popup.setContentView(R.layout.popup_tek_renang);

        tutup = popup.findViewById(R.id.tutup);
        judul_teknik = popup.findViewById(R.id.judul_teknik);
        gif_teknik = popup.findViewById(R.id.gif_teknik);
        deskripsi_teknik = popup.findViewById(R.id.deskripsi_teknik);

        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup.dismiss();
            }
        });
        judul_teknik.setText("Gaya Bebas");
        gif_teknik.setBackgroundResource(R.drawable.gbebas);
        deskripsi_teknik.setText("Gaya ini dilakukan dengan posisi dada menghadap ke permukaan air. " +
                "Kedua belah tangan secara bergantian digerakkan jauh ke depan dengan gerakan mengayuh, " +
                "sementara kedua belah kaki secara bergantian dicambukkan naik turun ke atas dan ke bawah.");
        popup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popup.show();
    }

    public void Gdada(View view) {
        Button tutup;
        TextView judul_teknik;
        TextView deskripsi_teknik;
        GifImageView gif_teknik;
        popup.setContentView(R.layout.popup_tek_renang);

        tutup = popup.findViewById(R.id.tutup);
        judul_teknik = popup.findViewById(R.id.judul_teknik);
        gif_teknik = popup.findViewById(R.id.gif_teknik);
        deskripsi_teknik = popup.findViewById(R.id.deskripsi_teknik);

        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup.dismiss();
            }
        });
        judul_teknik.setText("Gaya Dada");
        gif_teknik.setBackgroundResource(R.drawable.gdada);
        deskripsi_teknik.setText("Gaya ini dilakukan dengan posisi dada menghadap ke permukaan air. " +
                "Kedua belah kaki menendang ke arah luar sementara kedua belah tangan diluruskan " +
                "dan dibuka ke samping seperti gerakan membelah air agar badan maju lebih cepat ke depan.");
        popup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popup.show();
    }

    public void Gpunggung(View view) {
        Button tutup;
        TextView judul_teknik;
        TextView deskripsi_teknik;
        GifImageView gif_teknik;
        popup.setContentView(R.layout.popup_tek_renang);

        tutup = popup.findViewById(R.id.tutup);
        judul_teknik = popup.findViewById(R.id.judul_teknik);
        gif_teknik = popup.findViewById(R.id.gif_teknik);
        deskripsi_teknik = popup.findViewById(R.id.deskripsi_teknik);

        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup.dismiss();
            }
        });
        judul_teknik.setText("Gaya Punggung");
        gif_teknik.setBackgroundResource(R.drawable.gpunggung);
        deskripsi_teknik.setText("Gaya ini dilakukan dengan menggerakan lengan dan kaki serupa dengan " +
                "gaya bebas, namun dengan posisi tubuh telentang di permukaan air. Kedua belah tangan " +
                "secara bergantian digerakkan menuju pinggang seperti gerakan mengayuh.");
        popup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popup.show();
    }

    public void Gkupu(View view) {
        Button tutup;
        TextView judul_teknik;
        TextView deskripsi_teknik;
        GifImageView gif_teknik;
        popup.setContentView(R.layout.popup_tek_renang);

        tutup = popup.findViewById(R.id.tutup);
        judul_teknik = popup.findViewById(R.id.judul_teknik);
        gif_teknik = popup.findViewById(R.id.gif_teknik);
        deskripsi_teknik = popup.findViewById(R.id.deskripsi_teknik);

        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup.dismiss();
            }
        });
        judul_teknik.setText("Gaya Kupu-kupu");
        gif_teknik.setBackgroundResource(R.drawable.gkupu);
        deskripsi_teknik.setText("Gaya ini dilakukan dengan posisi dada menghadap ke permukaan air. " +
                "Kedua belah lengan secara bersamaan ditekan ke bawah dan digerakkan ke arah luar " +
                "sebelum diayunkan ke depan. Sementara kedua belah kaki secara bersamaan menendang ke bawah " +
                "dan ke atas.");
        popup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popup.show();
    }

    public void Gganti(View view) {
        Button tutup;
        TextView judul_teknik;
        TextView deskripsi_teknik;
        GifImageView gif_teknik;
        popup.setContentView(R.layout.popup_tek_renang);

        tutup = popup.findViewById(R.id.tutup);
        judul_teknik = popup.findViewById(R.id.judul_teknik);
        deskripsi_teknik = popup.findViewById(R.id.deskripsi_teknik);

        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup.dismiss();
            }
        });
        judul_teknik.setText("Gaya Ganti");
        deskripsi_teknik.setText("Dalam perlombaan gaya ganti perorangan, perenang harus melakukan 4 gaya " +
                "dengan urutan gaya yang dimulai dari gaya kupu-kupu, gaya punggung, " +
                "gaya dada dan gaya bebas.");
        popup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popup.show();
    }

    public void back(View view) {
        onBackPressed();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}