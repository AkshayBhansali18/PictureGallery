package com.example.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class FootballPager extends PagerAdapter {
    Context context;
    FootballPager(Context context)
    {
        this.context=context;
    }
    String url[]={"https://cdn.pixabay.com/photo/2016/11/14/05/21/children-1822688_1280.jpg",
            "https://cdn.pixabay.com/photo/2015/01/26/22/40/child-613199_1280.jpg",
            "https://cdn.pixabay.com/photo/2018/06/12/20/17/football-3471402_1280.jpg",
            "https://cdn.pixabay.com/photo/2016/03/27/20/57/people-1284253_1280.jpg",
            "https://cdn.pixabay.com/photo/2016/11/08/05/18/football-1807520_1280.jpg"};
    @Override
    public int getCount() {
        return url.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView=new ImageView(context);
        container.addView(imageView);
        Picasso.get().load(url[position]).fit().into(imageView);
        return imageView;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView)object);
     }
}
