package com.appslab;

public class Main {

    public static void main(String[] args) {
        int first = 4;
        int second = 2;
        int third = 1;

        if(first == second && third == second)
        {
            System.out.println(3);
        }
        else if(first == second || second == third || third == first)
        {
            System.out.println(2);
        }
        else
        {
            System.out.println(0);
        }
    }
}
