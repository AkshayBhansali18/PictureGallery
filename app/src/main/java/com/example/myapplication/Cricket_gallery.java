package com.example.myapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Cricket_gallery extends AppCompatActivity {
    String url[]={"https://cdn.pixabay.com/photo/2015/04/15/21/06/cricket-724616_1280.jpg",
            "https://cdn.pixabay.com/photo/2013/07/25/11/58/cricket-166904_1280.jpg",
            "https://cdn.pixabay.com/photo/2013/07/25/10/12/cricket-166794_1280.jpg",
            "https://cdn.pixabay.com/photo/2015/04/15/21/06/cricket-724621_960_720.jpg",
            "https://cdn.pixabay.com/photo/2015/03/11/09/35/cricket-668392_1280.jpg"};
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricket_gallery);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
        MyPager adapter=new MyPager(this);
        viewPager.setAdapter(adapter);
    }
}
