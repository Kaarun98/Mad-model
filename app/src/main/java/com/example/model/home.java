package com.example.model;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class home extends AppCompatActivity {

    EditText username;
    EditText password;
    Button login;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        username=findViewById(R.id.editText);
        password=findViewById(R.id.editText4);
        login=findViewById(R.id.button);
        register=findViewById(R.id.button2);
    }
}
