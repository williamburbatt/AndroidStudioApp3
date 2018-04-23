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
        final Spinner group = (Spinner)findViewById(R.id.txtGroup);
        EditText tickets = (EditText)findViewById(R.id.numTickets) ;
        String groupChoice = group.getSelectedItem( ).toString();
        int numTick = Integer.parseInt(tickets.getText().toString());
        double cost = 79.99;
        i.putExtra("groupName",groupChoice);
        i.putExtra("numT",numTick);
        i.putExtra("cost",cost);
        startActivity(i);

    }
}
