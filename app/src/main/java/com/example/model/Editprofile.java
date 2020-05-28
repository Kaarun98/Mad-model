package com.example.model;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Editprofile extends AppCompatActivity {

    EditText username;
    EditText Dateofbirth;
    EditText password;
    RadioButton male;
    RadioButton female;
    Button edit;
    Button delete;
    Button search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editprofile);
        username=findViewById(R.id.editText6);
        Dateofbirth=findViewById(R.id.editText7);
        password=findViewById(R.id.editText8);
        male=findViewById(R.id.radioButton4);
        female=findViewById(R.id.radioButton3);
        edit=findViewById(R.id.button5);
        delete=findViewById(R.id.button6);
        search=findViewById(R.id.button4);

        


    }
}
