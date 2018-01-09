package com.learnandroid.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Spinner spiner;

    String[] buah = {"Nanas", "Anggur", "Pear"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.gambar);
        spiner = (Spinner)findViewById(R.id.spinner);
        Glide.with(this)
                .load("https://yhscriminalrecord.com/wp-content/uploads/2017/05/aaa.png")
                .into(imageView);

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, buah);
        spiner.setAdapter(aa);
    }
}
