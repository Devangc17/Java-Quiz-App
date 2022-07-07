package com.example.ch1q1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "com.example.ch1q1.extra.NAME";
    String [] questions = {"Is java a person?","is java created in 1200?","is java same as C?","does follow OOPS concepts?","Is java used in android?"};
    boolean [] answers = {false,false,false,true,true};
    int score = 0;
    int index = 0;
    Button Yes;
    Button No;
    TextView question;
    private Object MainActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Yes = findViewById(R.id.Yes);
        No = findViewById(R.id.No);
        question = findViewById(R.id.question);
        question.setText(questions[index]);

        Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<=questions.length - 1)
                {
                    if(answers[index]==true)
                    {
                        score++;
                    }
                    index++;
                    if(index<=questions.length - 1)
                    {
                        question.setText(questions[index]);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Opening second activity", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        String scorestr = Integer.toString(score);
                        intent.putExtra(EXTRA_NAME,scorestr);
                        startActivity(intent);
                    }
                }

            }
        });

        No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<=questions.length - 1)
                {
                    if(answers[index]==false)
                    {
                        score++;
                    }
                    index++;
                    if(index<=questions.length - 1)
                    {
                        question.setText(questions[index]);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Opening second activity", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        String scorestr = Integer.toString(score);
                        intent.putExtra(EXTRA_NAME,scorestr);
                        startActivity(intent);
                    }
                }
            }
        });
    }
}