package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "onCreate() invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected  void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart() invoked", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected  void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop() invoked", Toast.LENGTH_SHORT).show();
    }

}