package main;

import chart.BarChart;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
//        BarChart barChart = new BarChart("Task types report", new ArrayList());
        BarChart barChart = new BarChart();

        BarChart taskOne = BarChart.builder()
                .withTitle("title 1")
                .withFontName("Arial")
                .withFontSize(12)
                .withFontColor("Black")
                .withWidth(600)
                .withHeight(600)
                .withBackgroundColor("White")
                .withDisplayTitle(false)
                .withdisplayLegend(true)
                .build();
        System.out.println(taskOne.toString());
    }
}
