package com.appslab;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String a[]={"abc", "cba"};
         System.out.println(endWith(a));
    }

    private static boolean endWith(String[] a) {
        if(a[0].endsWith(a[1]))
        {
            return true;
        }
        else{
            return false;
        }
    }
}

