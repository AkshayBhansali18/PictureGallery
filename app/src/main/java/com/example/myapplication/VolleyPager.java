package com.example.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class VolleyPager extends PagerAdapter {
    Context context;
    VolleyPager(Context context)
    {
        this.context=context;
    }
    String url[]={"https://cdn.pixabay.com/photo/2014/11/07/00/00/volleyball-520093_1280.jpg",
    "https://cdn.pixabay.com/photo/2016/08/01/16/53/volleyball-team-1561544_1280.jpg",
    "https://cdn.pixabay.com/photo/2016/08/24/19/54/volleyball-1617874_1280.jpg",
    "https://cdn.pixabay.com/photo/2016/08/30/00/01/volleyball-1629527_960_720.jpg",
    "https://cdn.pixabay.com/photo/2016/08/10/06/27/volleyball-1582542_960_720.jpg"};

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
        Picasso.get().load(url[position]).fit().into(imageView);
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView)object);
    }
}
