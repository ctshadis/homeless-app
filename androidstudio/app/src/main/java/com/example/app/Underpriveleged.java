package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;
import android.widget.TextView;



public class Underpriveleged extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.underpriveleged);
        addShelters();



    }

    protected void addShelters(){
        TextView t = new TextView(this);

        LinearLayout ll = (LinearLayout) findViewById(R.id.shelterslinear);


        ArrayList<String> testList = new ArrayList<String>();
        testList.add("A");
        testList.add("B");
        testList.add("C");
        testList.add("D");
        testList.add("E");
        testList.add("F");
        testList.add("G");
        testList.add("A");
        testList.add("A");
        testList.add("A");
        testList.add("A");
        testList.add("A");
        testList.add("A");
        testList.add("A");testList.add("A");
        testList.add("A");
        testList.add("A");
        testList.add("A");
        testList.add("A");
        testList.add("A");
        testList.add("B");
        testList.add("C");
        testList.add("D");
        testList.add("E");
        testList.add("F");
        testList.add("G");
        testList.add("A");
        testList.add("A");
        testList.add("A");
        testList.add("A");
        testList.add("A");
        testList.add("A");
        testList.add("A");testList.add("A");
        testList.add("A");
        testList.add("A");
        testList.add("A");
        testList.add("A");



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

        for (int i = 0; i < testList.size(); i++){
            TextView shelterName = new TextView(this);
            String name = testList.get(i);
            //String name = arrList.get(i).getName();
            shelterName.setText(name);
            shelterName.setPadding(0, 5, 0, 2);
            ll.addView(shelterName);

        }


    }




}



