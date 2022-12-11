package com.example.chartappfire;

public class DataPoint {
    int xValue, yValue;

    public DataPoint() {
    }

    public DataPoint(int xValue, int yValue) {
        this.xValue = xValue;
        this.yValue = yValue;
    }

    public int getxValue() {
        return xValue;
    }

    public int getyValue() {
        return yValue;
    }
}
