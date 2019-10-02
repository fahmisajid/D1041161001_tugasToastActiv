package com.example.d1041161001_tugastoastactiv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_second extends AppCompatActivity implements View.OnClickListener{


    private Button btnCountUp;
    private Button btnCountDown;
    private TextView angka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);

        btnCountUp = findViewById(R.id.tambah);
        btnCountDown= findViewById(R.id.kurang);
        angka = findViewById(R.id.number);

        btnCountUp.setOnClickListener(this);
        btnCountDown.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tambah){
            Integer tambah1 = Integer.parseInt(String.valueOf(angka.getText())) + 1;
            angka.setText(String.valueOf(tambah1));
        }
        if (v.getId() == R.id.kurang){
            Integer kurang1 = Integer.parseInt(String.valueOf(angka.getText())) - 1;
            angka.setText(String.valueOf(kurang1));
        }
    }
}
