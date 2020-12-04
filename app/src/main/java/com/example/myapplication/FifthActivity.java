package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class FifthActivity extends AppCompatActivity {
    TextView result5;
    CheckBox q1, q2, q3, q4;
    Button next, result_but;
    Intent intent;
    public static final String RESULT = "result";
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        intent = new Intent(FifthActivity.this, LastActivity.class);
        q1 = findViewById(R.id.q1_5);
        q2 = findViewById(R.id.q2_5);
        q3 = findViewById(R.id.q3_5);
        q4 = findViewById(R.id.q4_5);
        result5 = findViewById(R.id.result5);
        next = findViewById(R.id.next);
        result_but = findViewById(R.id.resul_but);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });

        result_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!q1.isChecked() && q2.isChecked() && !q3.isChecked() && q4.isChecked()) {
                    result++;
                    result5.setText("Верно!");
                    result5.setTextColor(Color.GREEN);
                    intent.putExtra("result", result);
                } else {
                    result5.setText("Не верно!");
                    result5.setTextColor(Color.RED);
                }
            }
        });
    }
}