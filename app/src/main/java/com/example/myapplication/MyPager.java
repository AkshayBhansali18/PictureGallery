package com.example.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MyPager extends PagerAdapter {
  Context context;
    MyPager(Context context)
    {
        this.context=context;
    }
    String url[]={"https://cdn.pixabay.com/photo/2015/04/15/21/06/cricket-724616_1280.jpg",
            "https://cdn.pixabay.com/photo/2013/07/25/11/58/cricket-166904_1280.jpg",
            "https://cdn.pixabay.com/photo/2013/07/25/10/12/cricket-166794_1280.jpg",
            "https://cdn.pixabay.com/photo/2015/04/15/21/06/cricket-724621_960_720.jpg",
            "https://cdn.pixabay.com/photo/2015/03/11/09/35/cricket-668392_1280.jpg"};
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
