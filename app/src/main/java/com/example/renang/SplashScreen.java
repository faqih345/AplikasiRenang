package com.example.renang;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

public class SplashScreen extends AppCompatActivity {
    RelativeLayout logosplash;
    public static MediaPlayer welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        logosplash = findViewById(R.id.logo_splash);
        welcome = new MediaPlayer();
        welcome=MediaPlayer.create(this,R.raw.welcome);
        welcome.setVolume(1, 1);
        welcome.start();

        Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.fade);
        logosplash.startAnimation(animation1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                SplashScreen.this.startActivity(intent);
                SplashScreen.this.finish();
            }
        },2000);
    }
}

