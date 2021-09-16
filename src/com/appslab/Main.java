package com.appslab;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        int a[]={1,2,8,65,9,4};
        warOfNumbers(a);

    }
    private static void warOfNumbers(int[] a) {
        ArrayList<Integer> ar01 = new ArrayList<Integer>();
        ArrayList<Integer> ar02 = new ArrayList<Integer>();

        System.out.println("Odd Numbers");

        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                ar01.add(a[i]);
            }
        }
        System.out.println("Even numbers");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                ar02.add(a[i]);
            }
        }
        for(int i=0;i<ar01.size();i++ )
        {

        }
        System.out.println(ar01);
        System.out.println(ar02);
    }
}

