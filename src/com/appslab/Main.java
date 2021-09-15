package com.appslab;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.add(2);
        numberList.add(1);
        numberList.add(4);
        numberList.add(7);

        numberList.size();

        for (Integer value : numberList) {
            System.out.println("Value = " + value);
        }

        for (Integer value : numberList) {
            System.out.println("Multiply value = " + value*numberList.size());
        }


    }
}
