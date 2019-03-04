package com.example.myapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Hockey_gallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hockey_gallery);
        ViewPager viewPager=(ViewPager) findViewById(R.id.viewPager);
        HockeyPager adapter=new HockeyPager(this);
        viewPager.setAdapter(adapter);

    }
}
