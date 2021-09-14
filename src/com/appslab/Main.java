package com.appslab;

public class Main {
    public static void main(String[] args)
    {
        double heightOfStep = 0.3;
        double lenghtOfStep = 0.2;
        double towerHeight = 25.0;

        System.out.println(((towerHeight/heightOfStep)*lenghtOfStep)+towerHeight);
    }

}
