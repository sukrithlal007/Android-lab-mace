package com.example.caslinearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,phy,maths,chem;
    Button cbtn;
    String nameval;
    Integer phyval,mathsval,chemval;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name=(EditText) findViewById(R.id.name);
        phy=(EditText) findViewById(R.id.phy);
        chem=(EditText) findViewById(R.id.che);
        maths=(EditText) findViewById(R.id.math);
        cbtn=(Button) findViewById(R.id.clc);

    }

    public void clck(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("mypref",MODE_PRIVATE);

        nameval=name.getText().toString();
        phyval=Integer.parseInt(String.valueOf(phy.getText()));
        mathsval=Integer.parseInt(maths.getText().toString());
        chemval=Integer.parseInt(chem.getText().toString());
        SharedPreferences.Editor editor=sharedPreferences.edit();


        editor.putString("name",nameval);
        editor.putInt("phy",phyval);
        editor.putInt("che",chemval);
        editor.putInt("maths",mathsval);
        editor.commit();

        Intent second=new Intent(this,SecondActivity.class);
        startActivity(second);

    }
}