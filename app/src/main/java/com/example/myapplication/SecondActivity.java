package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    Intent intent;
    public static final String RESULT = "result";
    int result;
    RadioButton q2;
    TextView result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        intent = new Intent(SecondActivity.this, ThirdActivity.class);
        result = getIntent().getIntExtra(RESULT, 0);
        q2 = findViewById(R.id.q2_2);
        result2 = findViewById(R.id.result2);
    }

    public void click2 (View n){
        if (q2.isChecked()) {
            result++;
            result2.setText("Верно!");
            result2.setTextColor(Color.GREEN);
            intent.putExtra("result", result);
        } else {
            result2.setTextColor(Color.RED);
            result2.setText("Не верно!");
        }
    }

    public void click(View v){
        startActivity(intent);
    }
}