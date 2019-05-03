package com.example.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean bartIsShowing = true;
    public void fade(View view)
    {
        Log.i("info","Image is loaded");
        ImageView bratImageView = findViewById(R.id.bratImageView);
        ImageView homerImageview = findViewById(R.id.homerImageView);
        if(bartIsShowing){
            bratImageView.animate().alpha(0).setDuration(2000);
            homerImageview.animate().alpha(1).setDuration(2000);
            bartIsShowing = false;
        }else {
            bratImageView.animate().alpha(1).setDuration(2000);
            homerImageview.animate().alpha(0).setDuration(2000);
            bartIsShowing = true;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*ImageView homerImageview = findViewById(R.id.homerImageView);
        homerImageview.setX(-1000);
        homerImageview.animate().translationXBy(1000).rotation(3600).setDuration(3000);*/
    }
}
