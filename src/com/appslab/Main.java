package com.appslab;


public class Main {
    public static void main(String[] args) {
        String newLine = System.getProperty("line.separator");

        System.out.print(canCapture("A8", "F8") + newLine);
        System.out.print(canCapture("A8", "A7") + newLine);
        System.out.print(canCapture("B8", "A7") + newLine);
    }

    static boolean canCapture(String s1, String s2) {

        if(s1.charAt(0) == s2.charAt(0) || s1.charAt(1) == s2.charAt(1))
        {
            return true;
        }
        return false;
        }
}