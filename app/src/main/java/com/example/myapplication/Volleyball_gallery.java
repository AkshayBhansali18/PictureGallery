package com.example.myapplication;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Volleyball_gallery extends AppCompatActivity {
ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volleyball_gallery);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
VolleyPager adapter=new VolleyPager(this);
viewPager.setAdapter(adapter);

    }
}
