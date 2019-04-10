package com.nurde.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Counter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
    }
    public void sendData(View v) {
        //get pesan from edit text
        EditText edit = (EditText)  findViewById(R.id.editText);
        String pesan = edit.getText().toString(); //variable pesan


        //creat Object Intent
        Intent intent = new Intent(this, ThirdActivity.class);

        //Put Data
        intent.setData(Uri.parse(pesan));

        //Start Activitty
        startActivity(intent);
    }
    public void sendExtras(View v){
        //get pesan from edit text
        EditText ps = (EditText) findViewById(R.id.editText);
        String pesan = ps.getText().toString(); //variable pesan

        EditText input = (EditText) findViewById(R.id.inputNama);
        String nama = input.getText().toString(); //variable nama

        //creat Object Intent
        Intent intent = new Intent(this, ThirdActivity.class);

        //Put Extras

        intent.putExtra("name", nama);
        intent.putExtra("info", pesan);


        //Start Activitty
        startActivity(intent);
    }
//    public void sendExtrasBundle (View v){
//        EditText name = (EditText) findViewById(R.id.inputNama);
//        String nama = name.getText().toString();
//        EditText info = (EditText) findViewById(R.id.editText);
//        String pesan = info.getText().toString();
//
//        //creat object intent
//        Intent intent = new Intent((this,ThirdActivity.class));
//        //creat Bundle
//        Bundle data = new Bundle();
//        data.putString("name", nama);
//        data.putString("info",pesan);
//        //put extra
//        intent.putExtra(data);
//        //start activity
//        startActivity(intent);
//    }

}
