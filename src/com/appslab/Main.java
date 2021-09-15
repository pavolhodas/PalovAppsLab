package com.appslab;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int a[]={5,32,-12,4,-50,35};
        int b[]={15,9,45,-8,4,5,2};

        System.out.println("Difference is " + differenceMaxMin( a,6));
        System.out.println("Difference is " + differenceMaxMin(b,7));
    }

    private static int differenceMaxMin(int[] a, int total) {
        Arrays.sort(a);
        return a[total-1]-a[0];
    }
}
