package com.example.database;


import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    MyHelper myhelper;
    EditText name, location;
    TextView all_users_details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myhelper = new MyHelper(this);

        SQLiteDatabase sql = myhelper.getWritableDatabase();
        name = (EditText)findViewById(R.id.name);
        location = (EditText) findViewById(R.id.location);

        all_users_details = (TextView) findViewById(R.id.all_users_details);

        ViewAllUsers();

    }

    public void AddUser(View view) {
        String user = name.getText().toString();
        String loc = location.getText().toString();
        long id = myhelper.insertData(user,loc);
        if(id <0 )
            Toast.makeText(this,"Unsuccessful Insertion",Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this,"Successful Insertion",Toast.LENGTH_LONG).show();

        ViewAllUsers();
    }

    public void ViewAllUsers() {
        String allData = myhelper.getAllData();
        all_users_details.setText(allData);
    }

    }







