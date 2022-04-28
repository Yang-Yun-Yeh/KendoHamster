package com.ncumis.kendohamster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnMotionList,btnHistory,btnTrainingMenu,btnSettings;
    Button btnTestPractice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMotionList = findViewById(R.id.btnMotionList);
        btnHistory = findViewById(R.id.btnHistory);
        btnTrainingMenu =findViewById(R.id.btnTrainingMenu);
        btnSettings = findViewById(R.id.btnSettings);

        btnMotionList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,MotionList.class);
                startActivity(i);
            }
        });
        btnTrainingMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,TrainingMenu.class);
                startActivity(i);
            }
        });
        btnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,History.class);
                startActivity(i);
            }
        });
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Settings.class);
                startActivity(i);
            }
        });


        btnTestPractice = findViewById(R.id.btnTestPractice);
        btnTestPractice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,TrainingView.class);
                startActivity(i);
            }
        });

    }
}