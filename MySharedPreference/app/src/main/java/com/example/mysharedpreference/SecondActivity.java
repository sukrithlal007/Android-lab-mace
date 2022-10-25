package com.example.mysharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView name,email;
    Button back;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name=(TextView) findViewById(R.id.name1);
        email=(TextView) findViewById(R.id.email1);

        back=(Button) findViewById(R.id.back);

        sharedPreferences =getSharedPreferences("mypref",MODE_PRIVATE);

        name.setText("name :"+sharedPreferences.getString("name",""));
        email.setText("email :"+sharedPreferences.getString("email",""));

        //String value = sharedPreferences.getString("value","");
        //textView.setText(value);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }
}