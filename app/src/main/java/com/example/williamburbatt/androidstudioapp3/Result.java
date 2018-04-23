package com.example.williamburbatt.androidstudioapp3;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Result extends MainActivity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_page);
        final TextView result = ((TextView)findViewById(R.id.ResultVal));
        String value = getIntent().getStringExtra("val");

        result.setText(value);
        //
    }
}
