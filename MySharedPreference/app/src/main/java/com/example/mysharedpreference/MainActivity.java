package com.example.mysharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name1,email2;
    Button save;
    String string_name,string_email;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name1=(EditText) findViewById(R.id.name);
        email2=(EditText) findViewById(R.id.email);
        save=(Button) findViewById(R.id.save);

        sharedPreferences =getSharedPreferences("mypref",MODE_PRIVATE);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_name=name1.getText().toString();
                string_email=email2.getText().toString();

                SharedPreferences.Editor editor=sharedPreferences.edit();

                editor.putString("name",string_name);
                editor.putString("email",string_email);
                editor.commit();

                Intent second =new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(second);

            }
        });









    }


}