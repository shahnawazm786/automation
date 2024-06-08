package org.example.day06;

import java.util.Arrays;

public class StringMethodSplitExample {
    public static void main(String[] args) {
        String str="java is programming language";
        System.out.println(str.split(" "));
        String[] words=str.split(" ");
        Arrays.stream(words).forEach(x-> System.out.println(x));
        str="java|is|programming|language";

    }
}
