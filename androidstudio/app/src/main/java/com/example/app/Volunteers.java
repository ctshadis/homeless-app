package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Volunteers extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volunteers);

        Button button=(Button)findViewById(R.id.volOps);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Volunteers.this,VolOps.class);
                startActivity(i);
            }

        });

        Button button2 =(Button)findViewById(R.id.comOut);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Volunteers.this,ComOut.class);
                startActivity(i);
            }
        });

        Button button3 =(Button)findViewById(R.id.donate);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Volunteers.this,Donate.class);
                startActivity(i);
            }
        });



    }




}


