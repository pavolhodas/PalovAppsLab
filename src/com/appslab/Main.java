package com.appslab;


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
                return false;
        }
}