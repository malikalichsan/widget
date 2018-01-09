package com.learnandroid.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.gambar);
        Glide.with(this)
                .load("https://yhscriminalrecord.com/wp-content/uploads/2017/05/aaa.png")
                .into(imageView);
    }
}
