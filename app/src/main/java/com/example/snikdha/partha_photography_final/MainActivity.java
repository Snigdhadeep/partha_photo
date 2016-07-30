package com.example.snikdha.partha_photography_final;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ImageView bird=(ImageView)findViewById(R.id.camera_icon) ;
        Animation rotate= AnimationUtils.loadAnimation(this,R.anim.rotation);
        bird.startAnimation(rotate);
        getIntent();








        //RotateAnimation rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 1f, Animation.RELATIVE_TO_SELF, 1f);

        //ImageView bird=(ImageView)findViewById(R.id.camera_icon) ;
        //bird.setAnimation(rotate);
        //rotate.setDuration(1000);
        //rotate.start();




        // button variables
       ImageButton about_btn=(ImageButton) findViewById(R.id.about_btn);
       final ImageButton gallery_btn=(ImageButton) findViewById(R.id.gallery_btn);
        final ImageButton favourite_btn=(ImageButton) findViewById(R.id.favourite_btn);
        final ImageButton blog_btn=(ImageButton) findViewById(R.id.blog_btn);
        final ImageButton contact_btn=(ImageButton) findViewById(R.id.contact_btn);

        //on  click methods

        about_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(getApplicationContext(),About_Activity.class);
                startActivity(i1);


            }
        });

       gallery_btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i2=new Intent(getApplicationContext(),Gallery_Activity.class);
               startActivity(i2);

           }
       });

        favourite_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(getApplicationContext(),Favourite_Activity.class);
                startActivity(i3);

            }
        });

        blog_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(getApplicationContext(),Blog_Activity.class);
                startActivity(i4);
            }
        });

        contact_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5=new Intent(getApplicationContext(),Contact_Activity.class);
                startActivity(i5);
            }
        });




    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.home_icon_contact) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
