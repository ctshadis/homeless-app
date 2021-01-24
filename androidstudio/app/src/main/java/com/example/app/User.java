package com.example.app;

import android.content.Context;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;


import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

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

    public String toString(){
        return "name:" + this.name + ",phone:" + this.phone + ",type:" + this.type + ",email:"
                + this.email + ",password:" + this.password;
    }


    public String storeToFile() {
        String path = Environment.getExternalStorageDirectory() + File.separator + "yourFolder";
        // Create the folder.
        File folder = new File(path);
        folder.mkdirs();

        // Create the file.
        File file = new File(folder, "users.txt");
        try {
            file.createNewFile();
            FileOutputStream fOut = new FileOutputStream(file);
            OutputStreamWriter myOutWriter = new OutputStreamWriter(fOut);
            myOutWriter.append(this.toString());

            myOutWriter.close();

            fOut.flush();
            fOut.close();

        } catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }
        return this.toString();
    }






}
