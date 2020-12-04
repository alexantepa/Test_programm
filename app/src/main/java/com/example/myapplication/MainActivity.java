package com.example.myapplication;

import androidx.annotation.ColorLong;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    RadioButton q1;
    int result;
    TextView result1;
    public static final String RESULT = "result";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(MainActivity.this, SecondActivity.class);
        q1 = findViewById(R.id.q1_1);
        result1 = findViewById(R.id.resul1);
        result = getIntent().getIntExtra(RESULT, 0);
    }

    public void click2 (View n){
        if (q1.isChecked()) {
            result++;
            result1.setText("Верно!");
            result1.setTextColor(Color.GREEN);
            intent.putExtra("result", result);
        } else {
            result1.setText("Не верно!");
            result1.setTextColor(Color.RED);
        }
    }

    public void click (View v){
        startActivity(intent);
    }
}