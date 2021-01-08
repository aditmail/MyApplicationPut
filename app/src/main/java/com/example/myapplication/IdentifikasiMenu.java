package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class IdentifikasiMenu extends AppCompatActivity {

    private final List<String> soal = new ArrayList<String>();
    int index = 0;
    int totalYa = 0;
    int totalTidak = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.identifikasimenu);

        final TextView tvSoal;
        Button btnYa, btnTidak;
        // final Integer[] hitungYa = new Integer[1];

        //hitungYa[0] = 0;
        soal.add("Apakah ering merasa haus?");
        soal.add("Apakah sering buang air kecil, terutama di malam hari?");
        soal.add("Apakah Anda sering merasa sangat lapar?");
        soal.add("Apakah berat badan turun drastis?");
        soal.add("Apakah nyeri otot dan tulang?");
        soal.add("Apakah merasa lemas? ");
        soal.add("Apakah pandangan kabur? ");
        soal.add("Apakah ada luka yang sulit sembuh? ");
        soal.add("Apakah mulut merasa sering kering ? ");
        soal.add("Apakah mudah tersinggung? ");
        soal.add("Apakah sering kesemutan? ");
        soal.add("Apakah sering merasa gatal-gatal karena infeksi jamur? ");

        tvSoal = findViewById(R.id.txtSoal);
        btnYa = findViewById(R.id.btnYa);
        btnTidak = findViewById(R.id.btnTidak);
        tvSoal.setText(soal.get(0));
        btnYa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int maxQuestion = soal.size();
                totalYa++;
//                Toast.makeText(identfidikasi_menu.this,"Total ya : "+totalYa,Toast.LENGTH_SHORT).show();
                index++;
                if (index < maxQuestion) {

                    if (index != maxQuestion) {
                        tvSoal.setText(soal.get(index));
                    }

                } else {
                    tampilHasil();
                }
            }
        });

        btnTidak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int maxQuestion = soal.size();
                totalTidak++;
//                Toast.makeText(identfidikasi_menu.this,"Total tidak : "+totalTidak,Toast.LENGTH_SHORT).show();
                index++;
                if (index < maxQuestion) {
                    if (index != maxQuestion) {
                        tvSoal.setText(soal.get(index));
                    }
                } else {
                    tampilHasil();
                }
            }
        });
    }

    private void tampilHasil() {
        Intent intent = new Intent(this, HasilActivity.class);
        intent.putExtra("totalya", totalYa);
        intent.putExtra("totaltidak", totalTidak);
        startActivity(intent);
        finish();
    }
}


