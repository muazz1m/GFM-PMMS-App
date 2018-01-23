package com.kuhosu.mobilepreventativemaintenance;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int[] dataX = {5, 9, 2, 3,};
    String[] dayName ={"Completed", "Open", "Delayed", "Rejected"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        setupPieChart();

    }

    private void setupPieChart(){

        Integer colorWhite = Color.parseColor("#ffffff");

        List<PieEntry> pieEntries = new ArrayList<>();
        for (int i = 0; i < dataX.length; i++){
            pieEntries.add(new PieEntry(dataX[i], dayName[i]));
        }

        PieDataSet dataSet = new PieDataSet(pieEntries, "Work Order Status");
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        PieData data = new PieData(dataSet);
        data.setValueTextColor(colorWhite);
        data.setValueTextSize(20);
        data.setValueFormatter(new PercentFormatter());

        PieChart pieChart = (PieChart) findViewById(R.id.chart);
        pieChart.setUsePercentValues(true);
        pieChart.setEntryLabelTextSize(0);
        pieChart.setHoleRadius(0);
        pieChart.setTransparentCircleRadius(0);
        pieChart.setData(data);
        pieChart.animateY(1000);
        pieChart.invalidate();
    }

}
