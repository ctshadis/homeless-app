package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.lang.reflect.Array;
import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;



public class Underpriveleged extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.underpriveleged);
        //TODO Change this title
        getSupportActionBar().setTitle("Helping Hand: Resources (Change Me)");
        //addShelters();

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

        Button button3=(Button)findViewById(R.id.hotlinesButton);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Underpriveleged.this, Hotlines.class);
                startActivity(i);
            }
        });



    }
/*
    protected void addShelters(){
        TextView t = new TextView(this);

        ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.underpriveleged_constraint);






        ArrayList<Shelter> arrList = new ArrayList<Shelter>();
        Shelter abbys = new Shelter("Abby's House", "5087565486", 52, "High St");
        Shelter jeremiahs = new Shelter("Jeremiah's Inn",  "5087556403", 1059, "Main St");
        Shelter francesperkins = new Shelter("Frances Perkins Home",  "5087577506", 70, "James St., Suite 139B");
        Shelter interfaith = new Shelter("Interfaith Hospitality Network", "5087552212", 91, "June St");
        Shelter ywca = new Shelter("Y.W.C.A. of Central MA", "5087913181", 1, "Salem Square");
        Shelter veterans = new Shelter("Veterans, Inc.", "8004822565", 69, "Grove St");


        arrList.add(abbys);
        arrList.add(jeremiahs);
        arrList.add(francesperkins);
        arrList.add(interfaith);
        arrList.add(ywca);
        arrList.add(veterans);

        for (int i = 0; i < arrList.size(); i++){
            TextView shelterName = new TextView(this);
            String name = arrList.get(i).getName();
            shelterName.setText(name);
            shelterName.setPadding(0, 5, 0, 2);
            cl.addView(shelterName);

        }

 */


}








