package com.ncumis.kendohamster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

import java.text.SimpleDateFormat;

public class History extends AppCompatActivity {
    CalendarView calendarView;
    Button btnRecord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        calendarView = findViewById(R.id.calendarView);
        btnRecord = findViewById(R.id.btnRecord);

        /*calendarView.getDate();
        calendarView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                Toast.makeText(this,sdf.format(calendarView.getDate()),Toast.LENGTH_SHORT).show();
            }
        });*/

        btnRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(History.this, HistoryDailyRecord.class);
                startActivity(i);
            }
        });


    }
}