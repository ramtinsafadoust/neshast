package com.oracto.jitsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

public class splashscrean extends AppCompatActivity {


    private final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscrean);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent myIntent = new Intent(splashscrean.this, MainActivity.class);
                splashscrean.this.startActivity(myIntent);
                splashscrean.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
    }
