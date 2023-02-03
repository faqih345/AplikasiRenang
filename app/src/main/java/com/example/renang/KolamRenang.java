package com.example.renang;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class KolamRenang extends AppCompatActivity {
    Dialog popup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolam_renang);
        popup = new Dialog(this);
    }
    public void back(View view) {
        onBackPressed();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void kolam1(View view) {
        Button tutup;
        Button map;
        TextView judul_kolam;
        TextView deskripsi_kolam;
        popup.setContentView(R.layout.popup_kolam_renang);

        tutup = popup.findViewById(R.id.tutup);
        map = popup.findViewById(R.id.map);
        judul_kolam = popup.findViewById(R.id.judul_kolam);
        deskripsi_kolam = popup.findViewById(R.id.deskripsi_kolam);

        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup.dismiss();
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.google.com/maps/place/Pandu+Jaya+Sport+Center/@-6.2303829,107.0087643,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698ea1b99a9c6d:0x8431c61ac3cd869a!8m2!3d-6.2303829!4d107.010953";
                Intent intent = new Intent (Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        judul_kolam.setText("Pandu Jaya Sport Center");
        deskripsi_kolam.setText("Jl. KH. Agus Salim Gg. Pandu, RT.009/RW.007, Bekasi Jaya, Kec. Bekasi Tim., Kota Bks, Jawa Barat 17112");
        popup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popup.show();
    }

    public void kolam2(View view) {
        Button tutup;
        Button map;
        TextView judul_kolam;
        TextView deskripsi_kolam;
        popup.setContentView(R.layout.popup_kolam_renang);

        tutup = popup.findViewById(R.id.tutup);
        map = popup.findViewById(R.id.map);
        judul_kolam = popup.findViewById(R.id.judul_kolam);
        deskripsi_kolam = popup.findViewById(R.id.deskripsi_kolam);

        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup.dismiss();
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.google.com/maps/place/Elmo's+Sport+Club/@-6.2491512,107.0023363,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698c2a5075f4e9:0xc6eaad23adb5f4f1!8m2!3d-6.249158!4d107.0045316";
                Intent intent = new Intent (Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        judul_kolam.setText("Elmo's Sport Club");
        deskripsi_kolam.setText("Graha Duta 1 No.16, RT.001/RW.023, Margahayu, Kec. Bekasi Tim., Kota Bks, Jawa Barat 17113");
        popup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popup.show();
    }

    public void kolam3(View view) {
        Button tutup;
        Button map;
        TextView judul_kolam;
        TextView deskripsi_kolam;
        popup.setContentView(R.layout.popup_kolam_renang);

        tutup = popup.findViewById(R.id.tutup);
        map = popup.findViewById(R.id.map);
        judul_kolam = popup.findViewById(R.id.judul_kolam);
        deskripsi_kolam = popup.findViewById(R.id.deskripsi_kolam);

        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup.dismiss();
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.google.com/maps/place/Swimming+Pool+City+Club/@-6.23875,107.0087199,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698e9dad6c12e9:0x30574404c1ee6fcd!8m2!3d-6.2387611!4d107.0109178";
                Intent intent = new Intent (Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        judul_kolam.setText("Swimming Pool City Club");
        deskripsi_kolam.setText("Jalan Perumahan Taman Kota, RT.008/RW.016, Bekasi Jaya, Bekasi Timur, Bekasi City, West Java 17112");
        popup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popup.show();
    }

    public void kolam4(View view) {
        Button tutup;
        Button map;
        TextView judul_kolam;
        TextView deskripsi_kolam;
        popup.setContentView(R.layout.popup_kolam_renang);

        tutup = popup.findViewById(R.id.tutup);
        map = popup.findViewById(R.id.map);
        judul_kolam = popup.findViewById(R.id.judul_kolam);
        deskripsi_kolam = popup.findViewById(R.id.deskripsi_kolam);

        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup.dismiss();
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.google.com/maps/place/Bintang+Sport+Center/@-6.2917095,107.0010849,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698dff0c8750af:0xcc70a1001000a628!8m2!3d-6.2917148!4d107.0032736";
                Intent intent = new Intent (Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        judul_kolam.setText("Bintang Sport Center");
        deskripsi_kolam.setText("Jl. Raya Mustikasari No.109, RT.004/RW.001, Mustikasari, Kec. Mustika Jaya, Kota Bks, Jawa Barat 17116");
        popup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popup.show();
    }

    public void kolam5(View view) {
        Button tutup;
        Button map;
        TextView judul_kolam;
        TextView deskripsi_kolam;
        popup.setContentView(R.layout.popup_kolam_renang);

        tutup = popup.findViewById(R.id.tutup);
        map = popup.findViewById(R.id.map);
        judul_kolam = popup.findViewById(R.id.judul_kolam);
        deskripsi_kolam = popup.findViewById(R.id.deskripsi_kolam);

        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup.dismiss();
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.google.com/maps/place/Kolam+Renang+Green+Park/@-6.3118855,106.9353188,19z/data=!4m9!1m2!2m1!1sKolam+Renang+Green+Park!3m5!1s0x2e699295f350b08b:0xfe2df6616b0fbb1c!8m2!3d-6.3117101!4d106.9361116!15sChdLb2xhbSBSZW5hbmcgR3JlZW4gUGFya5IBDXN3aW1taW5nX3Bvb2w";
                Intent intent = new Intent (Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        judul_kolam.setText("Green Park");
        deskripsi_kolam.setText("RT.005/RW.004, Jatimelati, Bekasi, Bekasi City, West Java 17415");
        popup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popup.show();
    }

    public void kolam6(View view) {
        Button tutup;
        Button map;
        TextView judul_kolam;
        TextView deskripsi_kolam;
        popup.setContentView(R.layout.popup_kolam_renang);

        tutup = popup.findViewById(R.id.tutup);
        map = popup.findViewById(R.id.map);
        judul_kolam = popup.findViewById(R.id.judul_kolam);
        deskripsi_kolam = popup.findViewById(R.id.deskripsi_kolam);

        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup.dismiss();
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.google.com/maps/place/Kolam+Renang+Emerald+Spring/@-6.2370482,107.0139962,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698e9a2c4a4ec1:0x57dfeac4faa3e16f!8m2!3d-6.2370495!4d107.016153";
                Intent intent = new Intent (Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        judul_kolam.setText("Emerald Spring");
        deskripsi_kolam.setText("RT.009/RW.003, Bekasi Jaya, Kec. Bekasi Tim., Kota Bks, Jawa Barat 17112");
        popup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popup.show();
    }

    public void kolam7(View view) {
        Button tutup;
        Button map;
        TextView judul_kolam;
        TextView deskripsi_kolam;
        popup.setContentView(R.layout.popup_kolam_renang);

        tutup = popup.findViewById(R.id.tutup);
        map = popup.findViewById(R.id.map);
        judul_kolam = popup.findViewById(R.id.judul_kolam);
        deskripsi_kolam = popup.findViewById(R.id.deskripsi_kolam);

        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup.dismiss();
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.google.com/maps/place/Sport+Center+Puri+Gading/@-6.3159977,106.9387806,17z/data=!3m1!4b1!4m5!3m4!1s0x2e6992eb4e44126f:0x48b952af9b79110c!8m2!3d-6.316003!4d106.9409693";
                Intent intent = new Intent (Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        judul_kolam.setText("Sport Center Puri Gading");
        deskripsi_kolam.setText("RT.004/RW.007, Jatiluhur, Kec. Jatiasih, Kota Bks, Jawa Barat 17425");
        popup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popup.show();
    }

    public void kolam8(View view) {
        Button tutup;
        Button map;
        TextView judul_kolam;
        TextView deskripsi_kolam;
        popup.setContentView(R.layout.popup_kolam_renang);

        tutup = popup.findViewById(R.id.tutup);
        map = popup.findViewById(R.id.map);
        judul_kolam = popup.findViewById(R.id.judul_kolam);
        deskripsi_kolam = popup.findViewById(R.id.deskripsi_kolam);

        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup.dismiss();
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.google.com/maps/place/Jaka+Permai+Water+Park/@-6.2474158,106.9729559,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698c4e906c651d:0x76dfbe28b920abc6!8m2!3d-6.2474211!4d106.9751446";
                Intent intent = new Intent (Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        judul_kolam.setText("Jaka Permai Water Park");
        deskripsi_kolam.setText("Jl. Cemara Raya No.59, RT.006/RW.006A, Jakasampurna, Kec. Bekasi Bar., Kota Bks, Jawa Barat 17148");
        popup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popup.show();
    }

    public void kolam9(View view) {
        Button tutup;
        Button map;
        TextView judul_kolam;
        TextView deskripsi_kolam;
        popup.setContentView(R.layout.popup_kolam_renang);

        tutup = popup.findViewById(R.id.tutup);
        map = popup.findViewById(R.id.map);
        judul_kolam = popup.findViewById(R.id.judul_kolam);
        deskripsi_kolam = popup.findViewById(R.id.deskripsi_kolam);

        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup.dismiss();
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.google.com/maps/place/Kemang+Pratama+Sports+Club/@-6.2801791,106.981604,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698deccf7b1829:0x1c32ddab9736b526!8m2!3d-6.2801691!4d106.983792";
                Intent intent = new Intent (Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        judul_kolam.setText("Kemang Pratama Sports Club");
        deskripsi_kolam.setText("Jl. Nilam No.2, RT.006/RW.001, Bojong Rawalumbu, Kec. Rawalumbu, Kota Bks, Jawa Barat 17116");
        popup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popup.show();
    }

}