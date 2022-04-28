package com.ncumis.kendohamster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TrainingView extends AppCompatActivity {

    Button btnQuit, btnStartRecording, btnPractice;
    TextView textCounter;
    int practiceCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_view);

        btnPractice = findViewById(R.id.btnPractice);
        btnQuit = findViewById(R.id.btnQuit);
        btnStartRecording = findViewById(R.id.btnStartRecording);
        textCounter = findViewById(R.id.textCounter);
        practiceCount = 10;

        textCounter.setText(String.valueOf(practiceCount));

        btnPractice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(practiceCount>1) { practiceCount -= 1; }
                else{
                    Intent i = new Intent(TrainingView.this, TrainingResult.class);
                    startActivity(i);
                    TrainingView.this.finish();
                    Toast.makeText(getApplicationContext(),"Practice Complete",Toast.LENGTH_SHORT).show();
                }
                textCounter.setText(String.valueOf(practiceCount));

            }
        });

        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(TrainingView.this, MotionVideo.class);
                startActivity(i);
                TrainingView.this.finish();

            }
        });

        btnStartRecording.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Start Recording",Toast.LENGTH_SHORT).show();

            }
        });

    }

}