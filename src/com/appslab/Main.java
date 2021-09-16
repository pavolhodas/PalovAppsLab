package com.appslab;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        whoWins("rock", "paper");
        whoWins("paper", "paper");
    }

    private static void whoWins(String str01, String str02) {

        if (str01.equals("rock") && str02.equals("paper") || str01.equals("scissors") && str02.equals("rock") || str01.equals("paper") && str02.equals("scissors")) {
            System.out.println("Player 2 wins!!!");
        } else if (str01.equals("scissors") && str02.equals("paper") || str01.equals("rock") && str02.equals("scissors") || str01.equals("paper") && str02.equals("rock")) {
            System.out.println("Player 1 wins!!!");
        } else{
            System.out.println("TIE");
        }
    }
}

