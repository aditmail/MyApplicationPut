package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView IVmenusehat=(ImageView)findViewById(R.id.IVmenusehat);
        IVmenusehat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this,makanansehat.class);
                startActivity(i);
            }
        });
        ImageView IVmenuiden=(ImageView)findViewById(R.id.IVmenuiden);
        IVmenuiden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,identifikasimenu.class);
                startActivity(i);
            }
        });
    }
}



