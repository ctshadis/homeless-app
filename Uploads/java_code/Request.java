package com.example.app;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.snackbar.Snackbar;

public class Request extends AppCompatActivity {
    EditText editText;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.request);
        //TODO Change this title
        getSupportActionBar().hide();


        ImageView button=(ImageView) findViewById(R.id.submitRequest);
        editText = (EditText)findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Snackbar mySnackbar = Snackbar.make(v, "Request Successfully Sent", 1500);
                mySnackbar.show();

                editText.getText().clear();
            }
        });




    }

}
