package com.example.convertcurrency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {
        EditText editText = findViewById(R.id.editText5);
        String amountInPounds = editText.getText().toString();
        double amountInPoundsDouble = Double.parseDouble(amountInPounds);
        double amountInDollors = amountInPoundsDouble * 111.34;
        String amountInDollorsString = String.format("%.2f", amountInDollors);
        for (int i = 0; i < 5; i++) {
            Toast.makeText(this, "$" + amountInPoundsDouble + " is $" + amountInDollorsString, Toast.LENGTH_LONG).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
