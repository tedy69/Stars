package tech.riseofdevelopers.stars;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class DetailStarsActivity extends AppCompatActivity {
    public static final String EXTRA_DETAIL = "extra_detail";
    private AdView mAdView,mAdView2;
    private InterstitialAd mInterstitialAd,mInterstitialAd2;
    ImageView imgDetail;
    TextView tvJudulDetail, tvDetail;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);

        mAdView = findViewById(R.id.adView);
        mAdView2 = findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView2.loadAd(adRequest);

        imgDetail = findViewById(R.id.imgDetail);
        tvJudulDetail = findViewById(R.id.tvJudulDetail);
        tvDetail = findViewById(R.id.tvDetail);
        btnBack = findViewById(R.id.back);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-1001933083418910/2499054809");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd2 = new InterstitialAd(this);
        mInterstitialAd2.setAdUnitId("ca-app-pub-1001933083418910/4003708167");
        mInterstitialAd2.loadAd(new AdRequest.Builder().build());

        final Stars mStars = getIntent().getParcelableExtra(EXTRA_DETAIL);

        String name = null;
        String detail = null;
        Integer photo = null;

        if (mStars != null) {
            name = mStars.getName();
            detail = mStars.getDetail();
            photo = mStars.getFoto();
        }

        tvJudulDetail.setText(name);
        tvDetail.setText(detail);
        imgDetail.setImageResource(photo);

        if (mStars != null) {
            Glide.with(getApplicationContext())
                    .load(mStars.getFoto())
                    .into(imgDetail);
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else if(mInterstitialAd2.isLoaded()) {
                    mInterstitialAd2.show();
                }
                else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                    finish();
                }
            }
        });
    }

}
