package com.example.renang;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FasPerlengkapan extends AppCompatActivity {
    Dialog layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fas_perlengkapan);

        layout = new Dialog(this);
    }
    public void back(View view) {
        onBackPressed();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void fas1(View view) {
        Button tutup;
        TextView judul_layout;
        TextView deskripsi_layout;
        RelativeLayout gambar_layout;
        layout.setContentView(R.layout.layout_fas_per);

        tutup = layout.findViewById(R.id.tutup);
        judul_layout = layout.findViewById(R.id.judul_layout);
        gambar_layout = layout.findViewById(R.id.gambar_layout);
        deskripsi_layout = layout.findViewById(R.id.deskripsi_layout);

        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.dismiss();
            }
        });
        judul_layout.setText("Kolam Renang");
        gambar_layout.setBackgroundResource(R.drawable.kolam_renang);
        deskripsi_layout.setText("Olahraga renang biasanya dilakukan di kolam renang dengan panjang 50 meter " +
                "untuk lintasan panjang dan 25 meter untuk lintasan pendek.");
        layout.show();
    }

    public void fas2(View view) {
        Button tutup;
        TextView judul_layout;
        TextView deskripsi_layout;
        RelativeLayout gambar_layout;
        layout.setContentView(R.layout.layout_fas_per);

        tutup = layout.findViewById(R.id.tutup);
        judul_layout = layout.findViewById(R.id.judul_layout);
        gambar_layout = layout.findViewById(R.id.gambar_layout);
        deskripsi_layout = layout.findViewById(R.id.deskripsi_layout);

        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.dismiss();
            }
        });
        judul_layout.setText("Lintasan");
        gambar_layout.setBackgroundResource(R.drawable.lintasan);
        deskripsi_layout.setText("Lintasan dibuat dengan rangkaian pelampung berukuran kecil yang tempelkan " +
                "pada sebuah tali yang panjangnya sama dengan panjang lintasan. Tali pelampung lintasan " +
                "dibedakan menurut warna, hijau untuk lintasan 1 dan 8, biru untuk lintasan 2, 3, 6, dan 7, " +
                "dan warna kuning untuk lintasan 4 dan 5.");
        layout.show();
    }

    public void fas3(View view) {
        Button tutup;
        TextView judul_layout;
        TextView deskripsi_layout;
        RelativeLayout gambar_layout;
        layout.setContentView(R.layout.layout_fas_per);

        tutup = layout.findViewById(R.id.tutup);
        judul_layout = layout.findViewById(R.id.judul_layout);
        gambar_layout = layout.findViewById(R.id.gambar_layout);
        deskripsi_layout = layout.findViewById(R.id.deskripsi_layout);

        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.dismiss();
            }
        });
        judul_layout.setText("Balok Start");
        gambar_layout.setBackgroundResource(R.drawable.balok_start);
        deskripsi_layout.setText("Balok start merupakan tempat perenang untuk melakukan posisi start. " +
                "Balok start memiliki tinggi antara 0,5 meter hingga 0,75 meter dan " +
                "diatasnya dilapisi bahan antilicin.");
        layout.show();
    }

    public void fas4(View view) {
        Button tutup;
        TextView judul_layout;
        TextView deskripsi_layout;
        RelativeLayout gambar_layout;
        layout.setContentView(R.layout.layout_fas_per);

        tutup = layout.findViewById(R.id.tutup);
        judul_layout = layout.findViewById(R.id.judul_layout);
        gambar_layout = layout.findViewById(R.id.gambar_layout);
        deskripsi_layout = layout.findViewById(R.id.deskripsi_layout);

        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.dismiss();
            }
        });
        judul_layout.setText("Pakaian Renang");
        gambar_layout.setBackgroundResource(R.drawable.pakaian_renang);
        deskripsi_layout.setText("Pakaian renang biasanya terbuat dari bahan karet yang mengikuti bentuk " +
                "tubuh untuk menghindari masuknya udara ke dalam pakaian.");
        layout.show();
    }

    public void fas5(View view) {
        Button tutup;
        TextView judul_layout;
        TextView deskripsi_layout;
        RelativeLayout gambar_layout;
        layout.setContentView(R.layout.layout_fas_per);

        tutup = layout.findViewById(R.id.tutup);
        judul_layout = layout.findViewById(R.id.judul_layout);
        gambar_layout = layout.findViewById(R.id.gambar_layout);
        deskripsi_layout = layout.findViewById(R.id.deskripsi_layout);

        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.dismiss();
            }
        });
        judul_layout.setText("Kacamata Renang");
        gambar_layout.setBackgroundResource(R.drawable.kacamata_renang);
        deskripsi_layout.setText("Kacamata di desain melengkung agar sesuai wajah pengguna. Terdapat " +
                "sebuah celah tipis panjang untuk memungkinkan mata tetap bisa melihat dengan sedikit " +
                "cahaya, serta mengurangi paparan sinar ultraviolet.");
        layout.show();
    }

    public void fas6(View view) {
        Button tutup;
        TextView judul_layout;
        TextView deskripsi_layout;
        RelativeLayout gambar_layout;
        layout.setContentView(R.layout.layout_fas_per);

        tutup = layout.findViewById(R.id.tutup);
        judul_layout = layout.findViewById(R.id.judul_layout);
        gambar_layout = layout.findViewById(R.id.gambar_layout);
        deskripsi_layout = layout.findViewById(R.id.deskripsi_layout);

        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.dismiss();
            }
        });
        judul_layout.setText("Topi Renang");
        gambar_layout.setBackgroundResource(R.drawable.topi_renang);
        deskripsi_layout.setText("Topi renang berfungsi sebagai pelindung rambut dari kaporit kolam," +
                " serta merapihkan rambut agar tidaak mengganggu wajah.");
        layout.show();
    }
}