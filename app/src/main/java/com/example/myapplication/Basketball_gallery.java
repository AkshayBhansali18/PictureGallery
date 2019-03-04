package com.example.myapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Basketball_gallery extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball_gallery);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
        BasketPager adapter=new BasketPager(this);
        viewPager.setAdapter(adapter);
    }
}
