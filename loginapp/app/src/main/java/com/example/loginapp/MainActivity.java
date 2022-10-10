package com.example.loginapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
    EditText user,pass;
    Button btn;
    String u,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user =(EditText) findViewById(R.id.username);
        pass =(EditText) findViewById(R.id.pass);
    }

    public void login(View view) {
        String x ="sukrith";
        String y ="123";
        u=user.getText().toString();
        p=pass.getText().toString();
        if(u.equals(x) && p.equals(y))
        {
            Toast.makeText(this, "login success", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "login failed", Toast.LENGTH_SHORT).show();
        }

    }
}