package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;



/**
 * Created by Asep Mohamad Noor on 5/12/2018.
 */

public class MenuSenin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = getIntent().getExtras();
        String hari = bundle.getString("hari");

        if (hari.equals("senin")) {
            setContentView(R.layout.menusenin);
        } else if (hari.equals("selasa")) {
            setContentView(R.layout.menuselasa);
        } else if (hari.equals("rabu")) {
            setContentView(R.layout.menurabu);
        } else if (hari.equals("kamis")) {
            setContentView(R.layout.menukamis);
        } else if (hari.equals("jumat")) {
            setContentView(R.layout.menujumat);
        } else if (hari.equals("sabtu")) {
            setContentView(R.layout.menusabtu);
        } else if (hari.equals("minggu")) {
            setContentView(R.layout.menuminggu);
        }
    }
}
