package com.example.midterm_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity4 extends ListActivity {
    MediaPlayer md3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        md3 = new MediaPlayer();
        md3 = MediaPlayer.create(this,R.raw.track2);
        String[] attraction =
                {
                        "Art Institute of Chicago", "Magnificent Mile", "Willis Tower",
                        "Navy Peer"
                };

        setListAdapter(new ArrayAdapter<String>(this,
                R.layout.activity_main4,
                R.id.list,
                attraction));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {

            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alfaisal.edu")));
                break;

            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alfaisal.edu")));
                md3.start();
                break;

        }

    }
}