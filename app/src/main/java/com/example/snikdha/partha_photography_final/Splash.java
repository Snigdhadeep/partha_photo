package com.example.snikdha.partha_photography_final;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by Snikdha on 7/18/2016.
 */
public class Splash extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        int secondsDelayed = 1;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(Splash.this, MainActivity.class));
                finish();
            }
        }, secondsDelayed * 1000);
    }
}
