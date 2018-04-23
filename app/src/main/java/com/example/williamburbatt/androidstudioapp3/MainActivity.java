package com.example.williamburbatt.androidstudioapp3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //final EditText tickets = (EditText)findViewById(R.id.txtTitle);
        //final Spinner group = (Spinner)findViewById(R.id.txtGroup);
       // Button cost = (Button)findViewById(R.id.btnCost);
    }
    public void onClick(View v) {
        Intent i = new Intent(MainActivity.this, Result.class);
        //final Spinner group = (Spinner)findViewById(R.id.txtGroup);
        //String w = group.toString();
        String w = "here";
        i.putExtra("val",w);
        startActivity(i);

    }
}
