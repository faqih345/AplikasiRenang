package com.example.renang;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    public static boolean mAudio = false;
    public static MediaPlayer audio;
    public static float volume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audio = new MediaPlayer();
        audio=MediaPlayer.create(this,R.raw.lagu);
        audio.setLooping(true);
        audio.setVolume(1,1);
        audio.start();

        ToggleButton toggleButton = findViewById(R.id.sounds);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecker) {
                mAudio = isChecker;
                if(mAudio) {
                    audio.setVolume(1, 1);
                    volume=1;
                }else{
                    audio.setVolume(0,0);
                    volume=0;
                }
            }
        });
    }
    public void pindah(View view) {
        Intent intent = new Intent(MainActivity.this, MenuAwal.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        MainActivity.this.finish();
        audio.setVolume(0, 0);
    }
}