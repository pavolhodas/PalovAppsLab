package com.appslab;

import sun.security.util.Password;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
      static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        String fileName = "E://pavol//appslab2021//input.txt";

        String[] parts;
        String aa;
        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            //1. filter line 3
            //2. convert all content to upper case
            //3. convert it into a List
            list = stream
                    .filter(line -> !line.startsWith("line3"))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        int r = 0;
        int numOfTree = 0;
        password p = new password(".#.#....#......#....##.........");

        for(int i=1;i<list.size();i++)
        {
            System.out.println(list.get(i));
            r = r+3;
            if(r==33)
            {
                r=r-30;
            }

            System.out.println(list.get(i).charAt(r) + "  -   "+ r);
            if(String.valueOf(list.get(i).charAt(r)).equals("#")){
                numOfTree++;
            }

        }
        System.out.println(numOfTree);
    }
}

