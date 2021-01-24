package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import java.lang.reflect.Array;
import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class Register extends AppCompatActivity {

    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_page);
        //TODO Change this title
        getSupportActionBar().hide();

        TextView registerText = (TextView)findViewById(R.id.register_text);
        ImageView button=(ImageView)findViewById(R.id.login_button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                EditText nameField = (EditText)findViewById(R.id.editTextName);
                String name = nameField.getText().toString();
                EditText phoneField = (EditText)findViewById(R.id.editTextMobile);
                String phone = phoneField.toString();
                EditText emailField = (EditText)findViewById(R.id.editTextEmail);
                String email = emailField.getText().toString();
                EditText passwordField = (EditText)findViewById(R.id.editTextPassword);
                String password = passwordField.getText().toString();
                RadioGroup choiceField = (RadioGroup)findViewById(R.id.radio_group);
                RadioButton selection =  (RadioButton)findViewById(choiceField.getCheckedRadioButtonId());
                String choice;
                if (selection.getId() == R.id.volunteer_choice){
                    choice = "volunteer";
                }
                else{
                    choice = "benefactor";
                }

                User newUser = new User(name, phone, email, password, choice);
                //String message = newUser.storeToFile();

                Context context = getApplicationContext();
                String text = "Welcome " + newUser.getName() + "! You are now a " + choice + "!";
                int duration = Toast.LENGTH_SHORT;

                //Toast toast = Toast.makeText(context, message, duration);
                //toast.show();

            }
        });


    }
}