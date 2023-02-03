package com.example.renang;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TekDasar extends AppCompatActivity {
    TextView mengapung;
    TextView dorongan;
    TextView pernapasan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tek_dasar);

        mengapung = findViewById(R.id.mengapung);
        dorongan = findViewById(R.id.dorongan);
        pernapasan = findViewById(R.id.pernapasan);

        mengapung.setText("Teknik ini dilakukan oleh perenang dengan memanfaatkan tekanan air yang " +
                "dapat mendorong tubuh perenang tetap diatas permukaan air.");

        dorongan.setText("Teknik ini digunakan untuk mendorong tubuh perenang dengan memanfaatkan kekuatan " +
                "tarikan gerakan lengan dan dapat dihasilkan dari gerakan cambukan atau dorongan tungkai.");

        pernapasan.setText("Teknik ini dilakukan dengan cara mengabil nafas melalui mulut, lalu tahan " +
                "beberapa saat kemudian buang nafas secara perlahan melalui hidung. Teknik ini sangat " +
                "penting karana dapat memengaruhi kekuatan dan kecepatan seseorang perenang.");
    }
    public void back(View view) {
        onBackPressed();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}