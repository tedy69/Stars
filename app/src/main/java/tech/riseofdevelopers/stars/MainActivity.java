package tech.riseofdevelopers.stars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView rvBintang;
    TextView tvaboutMe;
    ImageView imgaboutme;
    private ArrayList<Stars> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBintang = findViewById(R.id.rvBintang);
        tvaboutMe = findViewById(R.id.tvAboutme);
        imgaboutme = findViewById(R.id.imgaboutMe);
        rvBintang.setHasFixedSize(true);
        tvaboutMe.setOnClickListener(this);
        imgaboutme.setOnClickListener(this);

        list.addAll(StarsData.getListData());
        showRecycleList();
    }

    private void showRecycleList() {
        rvBintang.setLayoutManager(new LinearLayoutManager(this));
        ListBintangAdapter listBintangAdapter = new ListBintangAdapter(list);
        rvBintang.setAdapter(listBintangAdapter);

        listBintangAdapter.setOnItemClickCallBack(new ListBintangAdapter.OnItemClickCallBack() {

            @Override
            public void onItemClicked(Stars data) {
                showSelectedMovie(data);
            }
        });
    }

    private void showSelectedMovie(Stars stars) {
        Toast.makeText(this, "detail to : " + stars.getName(), Toast.LENGTH_SHORT).show();

        Stars mStars = new Stars();
        mStars.setName(stars.getName());
        mStars.setDetail(stars.getDetail());
        mStars.setFoto(stars.getFoto());

        Intent intentDetailStars = new Intent(MainActivity.this, DetailStarsActivity.class);
        intentDetailStars.putExtra(DetailStarsActivity.EXTRA_DETAIL, mStars);
        startActivity(intentDetailStars);

    }

    @Override
    public void onClick(View v) {
        Intent aboutme = new Intent(MainActivity.this,AboutMe.class);
        switch (v.getId()){

            case R.id.tvAboutme:
            case R.id.imgaboutMe:

                startActivity(aboutme);
                break;
        }
    }

}
