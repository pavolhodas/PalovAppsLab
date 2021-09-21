package com.appslab;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
         String name = "John";
         int studentNumber = 12345;

        Student student =  new Student();
        System.out.println(Student.getName(name) + ": " + Student.getStudentNumber(studentNumber));
    }

}

