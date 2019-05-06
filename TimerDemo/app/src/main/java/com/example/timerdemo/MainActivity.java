package com.example.timerdemo;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000, 1000) {
            public void onTick(long milisecondUntilDone) {
                Log.i("counttime", String.valueOf(milisecondUntilDone / 1000));
            }

            public void onFinish() {
                Log.i("counttimefinish", "no more countdown");
            }
        }.start();

        /*final Handler handler = new Handler();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Log.i("Hey it's us", "A second param has passed");
                handler.postDelayed(this, 1000);
            }
        };
        handler.post(runnable);*/
    }
}
