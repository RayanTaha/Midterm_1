package com.example.midterm_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


    MediaPlayer md1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn = (Button) findViewById(R.id.button4) ;

        ImageView img =(ImageView) findViewById(R.id.imageView);
        md1 = new MediaPlayer();
        md1 = MediaPlayer.create(this, R.raw.track1);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            md1.start();
            }
        });

    }

}