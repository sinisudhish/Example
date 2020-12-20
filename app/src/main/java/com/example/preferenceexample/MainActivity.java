package com.example.preferenceexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText psw;
    Button btn;
    String stringname,stringpassword;
    //correct name=ann
    //correct password=12345

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.login);
        name=findViewById(R.id.username);
        psw=findViewById(R.id.password);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                stringname=name.getText().toString();
                stringpassword=psw.getText().toString();
                if(stringname.equals("ann")&& stringpassword.equals("12345"))
                {
                    Toast.makeText(MainActivity.this,"Login success",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(MainActivity.this,"Login failed",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}