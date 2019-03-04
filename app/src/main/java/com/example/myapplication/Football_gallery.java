package com.example.myapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Football_gallery extends AppCompatActivity {
    ViewPager viewPager2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football_gallery);
        viewPager2=(ViewPager)findViewById(R.id.viewPager2);
        FootballPager adapter=new FootballPager(this);
        viewPager2.setAdapter(adapter);

    }
}
