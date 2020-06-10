package tech.riseofdevelopers.stars;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailStarsActivity extends AppCompatActivity {
    public static final String EXTRA_DETAIL = "extra_detail";

    ImageView imgDetail;
    TextView tvJudulDetail, tvDetail;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);

        imgDetail = findViewById(R.id.imgDetail);
        tvJudulDetail = findViewById(R.id.tvJudulDetail);
        tvDetail = findViewById(R.id.tvDetail);
        btnBack = findViewById(R.id.back);

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
                finish();
            }
        });
    }

}
