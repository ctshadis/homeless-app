package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import java.lang.reflect.Array;
import java.util.ArrayList;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;



public class SheltersPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shelters_page);
        //TODO Change this title
        getSupportActionBar().hide();
        //addShelters();


    }


    /*protected void addShelters(){


        ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.shelters_constraint);






        ArrayList<Shelter> arrList = new ArrayList<Shelter>();
        Shelter abbys = new Shelter("abbys", "Abby's House", "5087565486", 52, "High St");
        Shelter jeremiahs = new Shelter("jeremiahs", "Jeremiah's Inn",  "5087556403", 1059, "Main St");
        Shelter francesperkins = new Shelter("francesperkins","Frances Perkins Home",  "5087577506", 70, "James St., Suite 139B");
        Shelter interfaith = new Shelter("interfaith", "Interfaith Hospitality Network", "5087552212", 91, "June St");
        Shelter ywca = new Shelter("ywca", "Y.W.C.A. of Central MA", "5087913181", 1, "Salem Square");
        Shelter veterans = new Shelter("vetsinc", "Veterans, Inc.", "8004822565", 69, "Grove St");


        arrList.add(abbys);
        arrList.add(jeremiahs);
        arrList.add(francesperkins);
        arrList.add(interfaith);
        arrList.add(ywca);
        arrList.add(veterans);

        for (int i = 0; i < arrList.size(); i++){

            ConstraintLayout card = new ConstraintLayout(this);
            String idString = "@+id/" + arrList.get(i).getID() + "_constraint"
            card.setId(idString);
            card.setLayoutParams(new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, 117));



            TextView shelterName = new TextView(card);
            String name = arrList.get(i).getName();
            shelterName.setText(name);
            shelterName.setPadding(0, 5, 0, 2);
            cl.addView(shelterName);

        }*/
}