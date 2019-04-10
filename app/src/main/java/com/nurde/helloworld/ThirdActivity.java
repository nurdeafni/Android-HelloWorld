package com.nurde.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //get intent
        Intent intent = getIntent();

        /*
        //get data
        String pesan = intent.getData().toString();
        */

        //get extra
        Bundle data = intent.getExtras();
        String nama = data.getString("name");
        String pesan = data.getString("info");

        //nama
        TextView nm = (TextView) findViewById(R.id.txtNama);
        nm.setText(nama);

        //give data to textView
        TextView txt = (TextView) findViewById(R.id.txtSecound);
        txt.setText(pesan);

    }
}

