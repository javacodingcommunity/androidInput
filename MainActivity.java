package com.example.gettingtextinput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText userName; // this is how we access the name
    private Button submit; // button to confirm

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.name); // we link Java to our Layout
        submit = findViewById(R.id.button); // we link the button, too

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = userName.getText().toString(); // take the text
                // and convert it to a string
                // usually after this you want to switch to a different activity
                // but we will just print the user's name in a Toast
                Toast.makeText(MainActivity.this,"Hey, "+ name,Toast.LENGTH_LONG).show();
            }
        });


    }
}











