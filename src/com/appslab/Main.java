package com.appslab;

public class Main {

    public static void main(String[] args) {
        int first = 2;
        int second = 3;
        int third = 4;

        if(first + second > third && third + second > first && first + third > second)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
