package com.example.app;

import android.content.Context;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import static android.content.Context.MODE_PRIVATE;

public class User {

    private String name;
    private String phone;
    private String email;
    private String password;
    private String type;
    private String[] needs;
    private String[] offers;

    public User(String name, String phone, String type, String email, String password){
        this.name = name;
        this.phone = phone;
        this.type = type;
        this.email = email;
        this.password = password;
        this.needs = new String[5];
        this.offers = new String[5];
    }

    public String getName(){
        return this.name;
    }
    public String getPhone(){
        return this.phone;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String storeToFile(Context ctx){
        File file = getFileStreamPath("test.txt");

        if (!file.exists()) {
            file.createNewFile();
        }

        FileOutputStream writer = openFileOutput(file.getName(), Context.MODE_PRIVATE);

        for (String string: data){
            writer.write(string.getBytes());
            writer.flush();
        }

        writer.close();

    }





}
