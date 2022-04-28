package com.ncumis.kendohamster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TrainingResult extends AppCompatActivity {

    TextView textResultMotionName, textResultPracticeTime, textResultAccuracy;
    Button btnPracticeAgain, btnDownloadVideo, btnBackToMotionList;
    String motionName;
    int practiceTime;
    Double accuracy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_result);

        motionName = "正面劈刀";
        practiceTime = 10;
        accuracy = 0.8;

        textResultMotionName = findViewById(R.id.textResultMotionName);
        textResultPracticeTime = findViewById(R.id.textResultPracticeTime);
        textResultAccuracy = findViewById(R.id.textResultAccuracy);
        btnPracticeAgain = findViewById(R.id.btnPracticeAgain);
        btnDownloadVideo = findViewById(R.id.btnDownloadVideo);
        btnBackToMotionList = findViewById(R.id.btnBackToMotionList);

        textResultMotionName.setText(motionName);
        textResultPracticeTime.setText("練習次數：" + String.valueOf(practiceTime) + "次");
        textResultAccuracy.setText("正確率：" + String.valueOf(accuracy*100) + "%");

        btnPracticeAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TrainingResult.this, TrainingView.class);
                startActivity(i);
            }
        });
        btnDownloadVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Download Video",Toast.LENGTH_SHORT).show();
            }
        });
        btnBackToMotionList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TrainingResult.this, MotionList.class);
                startActivity(i);
            }
        });

    }
}