package com.example.midterm_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    int timer = 9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txtview = (TextView) findViewById(R.id.timerdown);
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {

                finish();
           startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        };
        Timer openning = new Timer();
        openning.schedule(timerTask, 9000);

        for(int i=0;i<9;i++ ){
            txtview.setText("Time left: "+ timer);
            timer--;
        }

    }
}