package com.example.image;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void switchCat(View view) {
        ImageView image = (ImageView) findViewById(R.id.imageDog);
        image.setImageResource(R.drawable.dog22);
        Log.i("info", "button pressed");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
