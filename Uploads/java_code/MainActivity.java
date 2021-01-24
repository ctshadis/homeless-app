package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        ConstraintLayout layout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable)
                layout.getBackground();
        animationDrawable.setEnterFadeDuration(1500);
        animationDrawable.setExitFadeDuration(2000);
        animationDrawable.start();

        Button button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this,Underpriveleged.class);
                startActivity(i);
            }
        });

        Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this,Volunteers.class);
                startActivity(i);
            }
        });

        Button button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this,Register.class);
                startActivity(i);
            }
        });
    }





}