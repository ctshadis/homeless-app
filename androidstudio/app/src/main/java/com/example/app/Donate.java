package com.example.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Donate extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donate);
    }

    private void charities(){
        Charity catholicCharities = new Charity("Catholic Charities", "(508) 798-0191", "Worcester, MA 01610", "Low income families and individuals");
        Charity abbyKelly = new Charity("Abby Kelly Foster House", "(508) 756-5486", " 52 High St, Worcester, MA 01609", "Shelter and affordable housing");
        Charity buenSamar = new Charity("El Buen Samaritano Food Program", "(508) 410-8902", "39 Piedmont St, Worcester, MA 01610", "Food and Clothing");
        Charity commonGround = new Charity("Worcester Common Ground Inc", " (508) 754-0908", "5 Piedmont Street, Worcester, MA 01610 ", "Low income families and individuals");

        ArrayList<Charity> arrList = new ArrayList<Charity>();
    }




}
