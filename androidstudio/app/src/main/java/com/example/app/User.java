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

    private String firstName;
    private String lastName;
    private String phone;
    private String type;
    private String[] needs;
    private String[] offers;

    public User(String firstName, String lastName, String phone, String type){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.type = type;
        this.needs = new String[5];
        this.offers = new String[5];
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getPhone(){
        return this.phone;
    }


    public void setFirstName(String name){
        this.firstName = name;
    }
    public void setLastName(String name){
        this.lastName = name;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public String storeToFile(Context ctx){

        final String FILE_NAME = "users.txt";
        String result;
        String text = this.getPhone();
        FileOutputStream fos = null;

        try {
            fos = ctx.openFileOutput(FILE_NAME, MODE_PRIVATE);
            fos.write(text.getBytes());
            result = ctx.getDir(FILE_NAME, MODE_PRIVATE).toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            result = "file not found";
        } catch (IOException e) {
            e.printStackTrace();
            result = "io exception";
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        /*try {



            File f = new File(filePath);
            if (f.createNewFile()) {
                result = ("File created: " + users.getName());
            } else {
                result = ("File already exists.");
            }

            *//*FileWriter writer;
            writer = new FileWriter("users.txt");
            writer.write(this.getPhone() + "\n");
            writer.close();*//*
            result = result + "yipee!";

        } catch (IOException e) {
            e.printStackTrace();
            result = "yuck";
        }*/

        return result;


    }





}
