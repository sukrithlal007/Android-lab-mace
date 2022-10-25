package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button browser,playstore,map,gmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        browser =(Button) findViewById(R.id.browser);
        playstore =(Button) findViewById(R.id.playstore);
        map=(Button) findViewById(R.id.map);
        gmail=(Button) findViewById(R.id.gmail);

    }

    public void clk_browser(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=google+colab&rlz=1C1UEAD_enIN978IN978&oq=&aqs=chrome.4.35i39i362j46i39i362j35i39i362l6.269055061j0j15&sourceid=chrome&ie=UTF-8"));
        Intent chooser=Intent.createChooser(intent,"choose your browser");
        startActivity(chooser);


    }

    public void clk_playstore(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://market.android.com/details?id=com.instagram.android"));
        Intent chooser=Intent.createChooser(intent,"choose appstore");
        startActivity(chooser);
    }

    public void clk_map(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("geo:9.967589, 76.422502"));
        Intent chooser=intent.createChooser(intent,"open map");
        startActivity(chooser);
    }

    public void clk_email(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://mail.google.com/mail/u/0/#inbox"));
        Intent chooser=Intent.createChooser(intent,"open mail");
        startActivity(chooser);
    }
}