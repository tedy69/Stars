package tech.riseofdevelopers.stars;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class AboutMe extends AppCompatActivity {
    private AdView mAdView,mAdView2;
    private InterstitialAd mInterstitialAd,mInterstitialAd2;
    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        back = findViewById(R.id.back);

        mAdView = findViewById(R.id.adView);
        mAdView2 = findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView2.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-1001933083418910/2351397915");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd2 = new InterstitialAd(this);
        mInterstitialAd2.setAdUnitId("ca-app-pub-1001933083418910/4003708167");
        mInterstitialAd2.loadAd(new AdRequest.Builder().build());

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else if (mInterstitialAd2.isLoaded()) {
                    mInterstitialAd2.show();
                }
                else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                    finish();
                }
            }
        });
        initEmail();
        initWeb();
    }

    private void initEmail() {

        Button email = findViewById(R.id.email);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else if (mInterstitialAd2.isLoaded()) {
                    mInterstitialAd2.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("message/rfc822");
                    intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"admin@riseofdevelopers.tech"});
                    intent.setPackage("com.google.android.gm");
                    if (intent.resolveActivity(getPackageManager()) != null)
                        startActivity(intent);
                    else {
                        Toast.makeText(getApplicationContext(), "Aplikasi Gmail Belum Di Install", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private void initWeb(){
        Button web = findViewById(R.id.website);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else if (mInterstitialAd2.isLoaded()) {
                    mInterstitialAd2.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.riseofdevelopers.tech/")));
                }
            }
        });
    }
}
