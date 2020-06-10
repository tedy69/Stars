package tech.riseofdevelopers.stars;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Splashscreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        Handler mhandler = new Handler();

        mhandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent onBoarding = new Intent(Splashscreen.this, OnBoarding.class);
                startActivity(onBoarding);
                finish();
            }
        },2500);
    }
}
