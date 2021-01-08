package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

    public class identifikasimenu extends AppCompatActivity {
        private List<String> soal =  new ArrayList<String>();
        int index = 0;
        int totalYa = 0 ;
        int totalTidak = 0 ;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.identifikasimenu);

            final TextView tvSoal;
            Button btnYa,btnTidak;
            // final Integer[] hitungYa = new Integer[1];

            //hitungYa[0] = 0;
            soal.add("Apakah anda demam tinggi ?");
            soal.add("Apakah anda merasakan pusing ?");
            soal.add("Apakah anda kehilangan nafsu makan?");
            soal.add("Apakah anda merasakan mual ?");
            soal.add("Apakah nyeri otot dan tulang ?");
            soal.add("Apakah nyeri sendi? ");
            soal.add("Apakah sakit perut yang parah? ");
            soal.add("Apakah anda muntah terus-menerus? ");
            soal.add("Apakah muntah darah ? ");
            soal.add("Apakah anda mimisan ? ");
            soal.add("Apakah sulit bernafas? ");
            soal.add("Apakah timbul bintik-bintik merah pada badan? ");

            tvSoal=(TextView)findViewById(R.id.txtSoal);
            btnYa=(Button)findViewById(R.id.btnYa);
            btnTidak=(Button)findViewById(R.id.btnTidak);
            tvSoal.setText(soal.get(0));
            btnYa.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    int maxQuestion = soal.size();
                    totalYa++;
//                Toast.makeText(identfidikasi_menu.this,"Total ya : "+totalYa,Toast.LENGTH_SHORT).show();
                    index++;
                    if(index<maxQuestion){

                        if(index!=maxQuestion){
                            tvSoal.setText(soal.get(index));
                        }

                    } else {
                        tampilHasil();
                    }
                }
            });

            btnTidak.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    int maxQuestion = soal.size();
                    totalTidak++;
//                Toast.makeText(identfidikasi_menu.this,"Total tidak : "+totalTidak,Toast.LENGTH_SHORT).show();
                    index++;
                    if(index<maxQuestion){

                        if(index!=maxQuestion){
                            tvSoal.setText(soal.get(index));
                        }


                    } else {
                        tampilHasil();
                    }
                }
            });

        }

        private void tampilHasil() {
            Intent intent = new Intent(this,hasilactivity.class);
            intent.putExtra("totalya", totalYa);
            intent.putExtra("totaltidak", totalTidak);
            startActivity(intent);
            finish();
        }
    }


