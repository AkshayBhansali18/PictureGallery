package com.example.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class BasketPager extends PagerAdapter {
    Context context;
    BasketPager(Context context)
    {
        this.context=context;
    }
    String url[]={"https://cdn.pixabay.com/photo/2013/03/21/15/52/basketball-95607_1280.jpg",
    "https://cdn.pixabay.com/photo/2016/06/23/02/06/basketball-1474505_960_720.jpg",
    "https://cdn.pixabay.com/photo/2016/08/24/19/58/basketball-1617891_960_720.jpg",
    "https://cdn.pixabay.com/photo/2016/06/23/19/11/basketball-1476010_960_720.jpg",
    "https://cdn.pixabay.com/photo/2015/09/09/19/47/kobe-bryant-932875_1280.jpg"};
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
container.removeView((ImageView)object);    }
}
