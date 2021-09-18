package com.appslab;

public class Main {
    public static void main(String[] args)
    {
        totalDistance(0.3, 0.2, 25.0);
    }
    private static void totalDistance(double heightOfStep, double lenghtOfStep, double towerHeight)
    {
        System.out.println(((towerHeight/heightOfStep)*lenghtOfStep)+towerHeight);
    }
}
