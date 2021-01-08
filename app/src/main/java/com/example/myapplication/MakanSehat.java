package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MakanSehat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.makanansehat);
        ImageView IVmon, IVtue, IVwed, IVthu, IVfri, IVsat, IVsun;

        IVmon = findViewById(R.id.IVmon);
        IVmon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MakanSehat.this, MenuSenin.class);
                String hari = "senin";
                i.putExtra("hari", hari);
                startActivity(i);
            }
        });

        IVtue = findViewById(R.id.IVtue);
        IVtue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MakanSehat.this, MenuSenin.class);
                String hari = "selasa";
                i.putExtra("hari", hari);
                startActivity(i);
            }
        });

        IVwed = findViewById(R.id.IVwed);
        IVwed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MakanSehat.this, MenuSenin.class);
                String hari = "rabu";
                i.putExtra("hari", hari);
                startActivity(i);
            }
        });

        IVthu = findViewById(R.id.IVthu);
        IVthu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MakanSehat.this, MenuSenin.class);
                String hari = "kamis";
                i.putExtra("hari", hari);
                startActivity(i);
            }
        });

        IVfri = findViewById(R.id.IVfri);
        IVfri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MakanSehat.this, MenuSenin.class);
                String hari = "jumat";
                i.putExtra("hari", hari);
                startActivity(i);
            }
        });

        IVsat = findViewById(R.id.IVsat);
        IVsat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MakanSehat.this, MenuSenin.class);
                String hari = "sabtu";
                i.putExtra("hari", hari);
                startActivity(i);
            }
        });

        IVsun = findViewById(R.id.IVsun);
        IVsun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MakanSehat.this, MenuSenin.class);
                String hari = "minggu";
                i.putExtra("hari", hari);
                startActivity(i);
            }
        });
    }
}



