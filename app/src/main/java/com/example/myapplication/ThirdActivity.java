package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    Intent intent;
    RadioButton q3;
    TextView result3;
    int result;
    public static final String RESULT = "result";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        q3 = findViewById(R.id.q1_3);
        result3 = findViewById(R.id.resul3);
        intent = new Intent(ThirdActivity.this, FourthActivity.class);
        result = getIntent().getIntExtra(RESULT, 0);
    }

    public void click(View v){
        startActivity(intent);
    }

    public void click2 (View n){
        if (q3.isChecked()) {
            result++;
            result3.setText("Верно!");
            result3.setTextColor(Color.GREEN);
            intent.putExtra("result", result);
        } else {
            result3.setText("Не верно!");
            result3.setTextColor(Color.RED);
        }
    }
}