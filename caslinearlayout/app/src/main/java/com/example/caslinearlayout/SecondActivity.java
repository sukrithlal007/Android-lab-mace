package com.example.caslinearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView name,prec,result;
    Integer phy,chem,maths;
    float avg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name=(TextView) findViewById(R.id.name);
        prec=(TextView) findViewById(R.id.perc);
        result=(TextView) findViewById(R.id.res);


        SharedPreferences sharedPreferences=getSharedPreferences("mypref",MODE_PRIVATE);
        phy=sharedPreferences.getInt("phy",0);
        maths=sharedPreferences.getInt("maths",0);
        chem=sharedPreferences.getInt("chem",0);

        name.setText(sharedPreferences.getString("name",""));
        // avg=float(phy+chem+maths)/3;

        avg=(phy.floatValue()+ chem.floatValue()+ maths.floatValue())/3;
        prec.setText("Percentage : "+String.valueOf(avg));


        if (avg > 50){
            result.setText("pass");

        }
        else {
            result.setText("failed");
        }
    }
}