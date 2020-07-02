package tech.riseofdevelopers.stars;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class OnBoarding extends AppCompatActivity {
    Preferences preference;
    SharedPreferences sharedPreferences;
    Boolean firstTime;
    private InterstitialAd mInterstitialAd,mInterstitialAd2;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        preference = new Preferences(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        next = findViewById(R.id.next);

        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);

        firstTime = sharedPreferences.getBoolean("firstTime", true);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-1001933083418910/2351397915");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd2 = new InterstitialAd(this);
        mInterstitialAd2.setAdUnitId("ca-app-pub-1001933083418910/4003708167");
        mInterstitialAd2.loadAd(new AdRequest.Builder().build());

        if (firstTime) {
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    firstTime = false;
                    editor.putBoolean("firstTime", firstTime);
                    editor.apply();

                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (mInterstitialAd.isLoaded()) {
                                mInterstitialAd.show();
                            } else if (mInterstitialAd2.isLoaded()) {
                                mInterstitialAd2.show();
                            } else {
                                Log.d("TAG", "The interstitial wasn't loaded yet.");
                                Intent main = new Intent(OnBoarding.this, MainActivity.class);
                                startActivity(main);
                                finish();
                            }
                        }
                    });
            } else {
            Intent i = new Intent(OnBoarding.this, MainActivity.class);
            startActivity(i);
            finish();
        }

    }


}
