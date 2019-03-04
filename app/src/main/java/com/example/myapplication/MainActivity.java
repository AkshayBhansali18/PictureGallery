package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String images[]={"Cricket","Football","Basketball","Hockey","Volleyball"};
    int imageid[]={R.drawable.cricket,R.drawable.football,R.drawable.basket,R.drawable.hockey,R.drawable.volley};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listView);
        MyAdapter adapter=new MyAdapter();
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent intent=new Intent(MainActivity.this,Cricket_gallery.class);
                    startActivity(intent);

                }
                else if(position==1)
                {
                    Intent intent=new Intent(MainActivity.this,Football_gallery.class);
                    startActivity(intent);

                }
                else if(position==2)
                {
                    Intent intent=new Intent(MainActivity.this,Basketball_gallery.class);
                    startActivity(intent);
                }
                else if(position==3)
                {
                    Intent intent=new Intent(MainActivity.this,Hockey_gallery.class);
                    startActivity(intent);
                }
                else if(position==4)
                {
                    Intent intent=new Intent(MainActivity.this,Volleyball_gallery.class);
                    startActivity(intent);
                }
            }
        });


    }
    class MyAdapter extends BaseAdapter
    {
        Context context;


        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView=getLayoutInflater().inflate(R.layout.list_layout,parent,false);
            ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView);
            TextView textView=(TextView)convertView.findViewById(R.id.textView);
            imageView.setImageResource(imageid[position]);
            textView.setText(images[position]);
            return convertView;
        }
    }

}
