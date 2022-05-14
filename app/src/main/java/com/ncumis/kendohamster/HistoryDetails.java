package com.ncumis.kendohamster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class HistoryDetails extends AppCompatActivity {

    //要接收HistoryDailyRecord的recyclerView 傳來的 position data
    //並且把接收到的data傳到fragment裡面

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_details);

    }
}