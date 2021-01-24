package com.example.app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class ComOut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.com_ops);

    }

}
