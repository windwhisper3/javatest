package com.example.javatest.demo.test;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Mytest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<String> strings1 = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings1.add("a");
        strings1.add("c");
        strings1.add("b");
        for (String str :
                strings) {
            System.out.print(str+" ");
        }
           for (String str :
                strings1) {
            System.out.print(str+" ");
        }

        System.out.println(strings.contains(strings1));

        System.out.println(strings.retainAll(strings1)
        );
        System.out.println("========");
        System.out.println(strings.contains("a"));
    }
}
