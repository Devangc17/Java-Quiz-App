package com.example.ch1q1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView2 = findViewById(R.id.textView2);
        Intent intent = getIntent();
        int score1 = Integer.parseInt(intent.getStringExtra(MainActivity.EXTRA_NAME));
        String score2 = Integer.toString(score1);
        textView2.setText("Your score is:" + score2);
    }
}