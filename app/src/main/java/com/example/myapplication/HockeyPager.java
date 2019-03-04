package com.example.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class HockeyPager extends PagerAdapter {
    Context context;
    HockeyPager(Context context)
    {
        this.context=context;
    }
    String url[]={"https://cdn.pixabay.com/photo/2014/12/04/22/30/hockey-557219_1280.jpg",
    "https://cdn.pixabay.com/photo/2015/12/09/04/36/ice-hockey-1084197_1280.jpg",
    "https://cdn.pixabay.com/photo/2017/03/28/02/17/hockey-2180834_1280.jpg",
    "https://cdn.pixabay.com/photo/2014/03/24/17/06/ice-skating-295042_1280.png",
    "https://cdn.pixabay.com/photo/2016/02/16/02/08/hockey-1202478_960_720.jpg"};
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
        Picasso.get().load(url[position]).into(imageView);
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView)object);
    }
}
