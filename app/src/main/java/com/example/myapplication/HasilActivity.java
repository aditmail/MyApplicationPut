package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HasilActivity extends AppCompatActivity {

    Integer totalya, totaltidak;
    Integer persentase;
    TextView tvHasil, tvSaran ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasilactivity);
        tvHasil = findViewById(R.id.tvHasil);
        tvSaran = findViewById(R.id.tvSaran);
        Intent intent = getIntent();
        totalya = intent.getIntExtra("totalya",0);
        totaltidak = intent.getIntExtra("totaltidak",0);
        persentase = (totalya * 100 / 12);

        tvHasil.setText(persentase+"%");

        if (persentase > 50) {
            tvSaran.setText("Anda teridentifikasi menderita penyakit Demam Berdarah Dengue, segera mengunjungi dokter");
        } else if (persentase >= 1 && persentase <= 50) {
            tvSaran.setText("Anda harus istirahat dan minum vitamin ");
        } else {
            tvSaran.setText("Tetap menjaga pola makan dan olahraga");
        }

        findViewById(R.id.btnUlang).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HasilActivity.this, IdentifikasiMenu.class);

                startActivity(intent);
                finish();
            }
        });

    }
}
