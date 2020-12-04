package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    Intent intent;
    CheckBox q1, q2, q3, q4;
    TextView result4;
    int result;
    public static final String RESULT = "result";
    Button next, result_but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        q1 = findViewById(R.id.q1_4);
        q2 = findViewById(R.id.q2_4);
        q3 = findViewById(R.id.q3_4);
        q4 = findViewById(R.id.q4_4);
        result4 = findViewById(R.id.resul4);
        next = findViewById(R.id.next);
        result_but = findViewById(R.id.resul_but);
        intent = new Intent(FourthActivity.this, FifthActivity.class);

        result_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (q1.isChecked() && !q2.isChecked() && !q3.isChecked() && q4.isChecked()) {
                    result++;
                    result4.setText("Верно!");
                    result4.setTextColor(Color.GREEN);
                    intent.putExtra("result", result);
                } else {
                    result4.setText("Не верно!");
                    result4.setTextColor(Color.RED);
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }





}