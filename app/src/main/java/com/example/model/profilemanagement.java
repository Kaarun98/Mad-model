package com.example.model;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class profilemanagement extends AppCompatActivity {

    EditText username;
    EditText Dateofbirth;
    EditText password;
    RadioButton male;
    RadioButton female;
    Button updateprofile;
    DBHelper D4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilemanagement);
        username = findViewById(R.id.editText2);
        Dateofbirth = findViewById(R.id.editText3);
        password = findViewById(R.id.editText5);
        male = findViewById(R.id.radioButton);
        female = findViewById(R.id.radioButton2);
        updateprofile = findViewById(R.id.button3);
        D4 = new DBHelper(this);

        addInfo();

    }

    public void addInfo() {

        updateprofile.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        String textusername = username.getText().toString().trim();
                        String textDateofBirth = Dateofbirth.getText().toString().trim();
                        String textpassword = password.getText().toString().trim();

                        // String amount = amount.getText().toString().trim();

                        if (textusername.isEmpty()) {
                            username.setError("Enter the city");
                            username.requestFocus();
                            return;
                        }

                        if (textDateofBirth.isEmpty()) {
                            Dateofbirth.setError("Enter the Street");
                            Dateofbirth.requestFocus();
                            return;
                        }
                        if (textpassword.isEmpty()) {
                            password.setError("Enter the District");
                            password.requestFocus();
                            return;
                        }


                        boolean isInserted = D4.addInfo(textusername, textDateofBirth, textpassword);

                        if (isInserted == true)
                            Toast.makeText(profilemanagement.this, "Details Are Inserted", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(profilemanagement.this, "Details Are Not Inserted", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
