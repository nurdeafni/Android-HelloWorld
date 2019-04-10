package com.nurde.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText name;
    Button btnSend;

    private String KEY_NAME = "NAMA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeText(View v){
        TextView helloText = (TextView) findViewById(R.id.helloText);
        helloText.setText("Welcome");
    }
    public void goToCounter(View v){
        Intent counter = new Intent(this, Counter.class);
        startActivity(counter);
    }
}
