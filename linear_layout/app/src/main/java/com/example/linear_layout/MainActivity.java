package com.example.linear_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout l1;
    TextView t;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        l1 = new LinearLayout(this);
        t = new TextView(this);
        b = new Button(this);
        LinearLayout.LayoutParams dm = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        LinearLayout.LayoutParams vdim = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        vdim.setMargins(0, 50, 0, 0);
        t.setLayoutParams(vdim);
        b.setLayoutParams(vdim);
        l1.setOrientation(LinearLayout.VERTICAL);
        l1.setGravity(Gravity.CENTER);
        t.setText("welcome SUKRITH");
        t.setGravity(Gravity.CENTER);
        t.setTextSize(35);
        t.setTextColor(Color.RED);
        b.setText("submit");
        b.setBackgroundColor(Color.GREEN);
        b.setTextColor(Color.BLUE);
        l1.addView(t);
        l1.addView(b);
        setContentView(l1);
    }
}