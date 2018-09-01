package com.example.jmidar.imageloadingglideexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

//import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

        /*Glide.with(MainActivity.this)
                .load("https://st1.bollywoodlife.com/wp-content/uploads/2017/09/salman-khan.jpg")
                .placeholder(R.drawable.pageloading)
                .error(R.drawable.pagenotfound)
                .into(imageView);*/
        Picasso.get()
                .load("https://st1.bollywoodlife.com/wp-content/uploads/2017/09/salman-khan.jpg")
                .placeholder(R.drawable.pageloading)
                .error(R.drawable.pagenotfound)
                .into(imageView);
    }
}
