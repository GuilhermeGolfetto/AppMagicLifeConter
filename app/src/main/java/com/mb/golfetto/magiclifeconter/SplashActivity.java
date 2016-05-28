package com.mb.golfetto.magiclifeconter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Handler;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent it = new Intent(SplashActivity.this, PrincipalActivity.class);
                startActivity(it);
                finish();
            }
        },5000);
    }
}
