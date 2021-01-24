package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Underpriveleged extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.underpriveleged);

        getSupportActionBar().hide();


        Button button=(Button)findViewById(R.id.shelterButton);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Underpriveleged.this,SheltersPage.class);
                startActivity(i);
            }
        });

        Button button2=(Button)findViewById(R.id.foodButton);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Underpriveleged.this,FoodBanks.class);
                startActivity(i);
            }
        });

        Button button3=(Button)findViewById(R.id.requestButton);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Underpriveleged.this, Request.class);
                startActivity(i);
            }
        });
    }
}








