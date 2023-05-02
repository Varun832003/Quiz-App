package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String questions[] = {"There are 4 lungs in the human body. ","The human skin regenerates once in two weeks.","The speed of the average human sneeze can be measured up to 100 miles an hour.","Humans lose an an average of 75 strands of hair per week.","The number of bones in an infant is more than that of an average human."};
    private boolean answers[] = {false,false,true,false,true};
    Button Yes,No;
    TextView ques,Score;
    private int idx=0,score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Yes = findViewById(R.id.Yes);
        No = findViewById(R.id.No);
        ques = findViewById(R.id.ques);
        ques.setText(questions[idx]);
        Score = findViewById(R.id.Score);
        Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answers[idx]  ){
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    score++;
                    idx++;
                    if(idx<questions.length) {
                        ques.setText(questions[idx]);
                    }
                }
               else {
                    Toast.makeText(MainActivity.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    idx++;
                    if(idx<questions.length) {
                        ques.setText(questions[idx]);
                    }
                }

                if(idx == questions.length){
                    Score.setText("Your score is "+score);
                    Toast.makeText(MainActivity.this, "Quiz Completed!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answers[idx]==false){
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    score++;
                    idx++;
                    if(idx<questions.length){
                        ques.setText(questions[idx]);
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    idx++;
                    if(idx<questions.length){
                        ques.setText(questions[idx]);
                    }
                }
                if(idx == questions.length){
                    Score.setText("Your score is "+score);
                    Toast.makeText(MainActivity.this, "Quiz Completed!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}