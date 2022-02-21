package com.example.midterm_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    ImageView pic;
    Integer [] Animals = {R.drawable.animalimage, R.drawable.animalimage, R.drawable.animalimage};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        GridView grid = (GridView) findViewById(R.id.gridView);
        final ImageView pic = (ImageView) findViewById(R.id.imageView);
        grid.setAdapter(new ImageAdapter(this));

        ImageView img =(ImageView) findViewById(R.id.imageView2);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getBaseContext(), "You Clicked on " + (position + 1) + "picture", Toast.LENGTH_LONG).show();
                pic.setImageResource(Animals[position]);
            }
        });
    }

    public class ImageAdapter extends BaseAdapter {
        private Context context;

        public ImageAdapter(Context c){
            this.context = c;
        }

        @Override
        public int getCount() {
            return Animals.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            pic = new ImageView(context);
            pic.setImageResource(Animals[position]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new ViewGroup.LayoutParams(330, 300));
            return pic;
        }
    }

   }
