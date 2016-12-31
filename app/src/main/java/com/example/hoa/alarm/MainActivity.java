package com.example.hoa.alarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvTime;
    private Button btnDung;
    private Button btnBatDau;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTime=(TextView) findViewById(R.id.tvTime);
        btnDung=(Button) findViewById(R.id.btnDung);
        btnBatDau=(Button)findViewById(R.id.btnBatDau);


        btnDung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnBatDau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
