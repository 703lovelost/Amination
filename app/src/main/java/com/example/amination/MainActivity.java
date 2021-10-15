package com.example.amination;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = (ImageView)findViewById(R.id.animationView);
        img.setBackgroundResource(R.drawable.rabbit_animation);
        AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
        frameAnimation.setOneShot(false);
        Button buttonStart = (Button) findViewById(R.id.buttonStart);
        Button buttonStop = (Button) findViewById(R.id.buttonStop);

        buttonStart.setOnClickListener(v -> {
            frameAnimation.start();
        });

        buttonStop.setOnClickListener(v -> {
            frameAnimation.stop();
        });

    }
}