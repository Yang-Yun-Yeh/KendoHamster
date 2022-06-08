package com.ncumis.kendohamster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;

import java.util.ArrayList;

public class DrawPictureTry extends AppCompatActivity {
    LineChartData lineChartData;
    LineChart lineChart;
    ArrayList<String> xData = new ArrayList<>(); //放X軸的資料
    //ArrayList<Entry> yData = new ArrayList<>(); //entry是設置x軸和y軸點
    ArrayList<Entry> entries = new ArrayList<>(); //entry是設置x軸和y軸點

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_picture_try);

        lineChart = findViewById(R.id.lineChart);
        lineChartData = new LineChartData(lineChart,this);

        for(int i = 1;i<10;i++){
            xData.add("" + i + "");
            //yData.add(new Entry(i-1, i));
            entries.add(new Entry(i-1, i));
        }
        lineChartData.initX(xData);
        lineChartData.initY(0F,10F);
        //lineChartData.initDataSet(yData);
        lineChartData.initDataSet(entries);

    }
}