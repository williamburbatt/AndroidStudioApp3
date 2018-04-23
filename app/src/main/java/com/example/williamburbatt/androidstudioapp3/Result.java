package com.example.williamburbatt.androidstudioapp3;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Result extends MainActivity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_page);
        final TextView result = ((TextView)findViewById(R.id.ResultVal));
        String gn = getIntent().getStringExtra("groupName");
        double cost = getIntent().getDoubleExtra("cost",0);
        int num = getIntent().getIntExtra("numT", 0);
        DecimalFormat df = new DecimalFormat("#.00");
        double retVal =cost*num;
        df.format(retVal);
        String value = num + " Tickets for: " +gn + " is " +df.format(retVal);

        result.setText(value);
        //
    }
}
