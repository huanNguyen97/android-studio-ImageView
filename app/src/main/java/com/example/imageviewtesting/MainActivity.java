package com.example.imageviewtesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare and set imageView for elements
        ImageView simpleImageViewLion
            = (ImageView) findViewById(R.id.simpleImageViewLion);
        ImageView simpleImageViewMonkey
            = (ImageView) findViewById(R.id.simpleImageViewMonkey);

        // ImageView events
        // Lion ImageView events
        simpleImageViewLion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                    getApplicationContext(),
                    "Lion",
                    Toast.LENGTH_SHORT
                ).show();
            }
        });

        // Monkey ImageView events
        simpleImageViewMonkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                    getApplicationContext(),
                    "Monkey",
                    Toast.LENGTH_LONG
                ).show();
            }
        });
    }
}