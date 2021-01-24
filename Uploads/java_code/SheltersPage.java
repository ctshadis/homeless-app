package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class SheltersPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shelters_page);

        getSupportActionBar().hide();

    }
}