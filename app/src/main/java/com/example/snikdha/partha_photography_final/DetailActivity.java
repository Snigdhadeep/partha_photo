package com.example.snikdha.partha_photography_final;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;

import com.google.gson.Gson;
import com.example.snikdha.partha_photography_final.MovieModel;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

public class DetailActivity extends AppCompatActivity {

    private ImageView ivMovieIcon;
    private TextView tvMovie;
    private TextView tvTagline;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_list);

        // Showing and Enabling clicks on the Home/Up button
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        // setting up text views and stuff
        setUpUIViews();

        // recovering data from MainActivity, sent via intent
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String json = bundle.getString("movieModel");
            MovieModel movieModel = new Gson().fromJson(json, MovieModel.class);


            tvMovie.setText(movieModel.getType());



            StringBuffer stringBuffer = new StringBuffer();


        }

    }

    private void setUpUIViews() {
        ivMovieIcon = (ImageView)findViewById(R.id.ivIcon);
        tvMovie = (TextView)findViewById(R.id.tvMovie);
        tvTagline = (TextView)findViewById(R.id.tvTagline);

        progressBar = (ProgressBar)findViewById(R.id.progressBar);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

}
