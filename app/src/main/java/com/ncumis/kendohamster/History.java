package com.ncumis.kendohamster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

import java.text.SimpleDateFormat;

public class History extends AppCompatActivity {
    CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        calendarView = findViewById(R.id.calendarView);
        /*calendarView.getDate();
        calendarView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                Toast.makeText(this,sdf.format(calendarView.getDate()),Toast.LENGTH_SHORT).show();
            }
        });*/

    }
}