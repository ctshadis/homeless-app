package com.example.app;

import android.os.Bundle;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class VolOps extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vol_ops);


    }
}
