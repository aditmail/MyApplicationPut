package com.example.myapplication;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;


import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView IVmenusehat = findViewById(R.id.IVmenusehat);
        IVmenusehat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MakanSehat.class);
                startActivity(i);
            }
        });
        ImageView IVmenuiden = findViewById(R.id.IVmenuiden);
        IVmenuiden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, IdentifikasiMenu.class);
                startActivity(i);
            }
        });
    }
}



