package com.appslab;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome("nitin"));
        System.out.println(isPalindrome("jatin"));
    }
    private static boolean isPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev=sb.toString();
        if(str.equals(rev)){
            return true;
        }else{
            return false;
        }
    }
}
