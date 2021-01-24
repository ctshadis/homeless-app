package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class Register extends AppCompatActivity {

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

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                nameField.setText("");
                phoneField.setText("");
                emailField.setText("");
                passwordField.setText("");
                Intent i;
                if (choice.equals("benefactor")) {
                    i = new Intent(Register.this, Underpriveleged.class);
                }
                else{
                    i = new Intent(Register.this, Volunteers.class);
                }
                startActivity(i);

            }
        });


    }
}