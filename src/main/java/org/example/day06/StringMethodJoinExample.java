package org.example.day06;

import java.util.Arrays;

public class StringMethodJoinExample {
    public static void main(String[] args) {
        String []words="java is a programming language".split(" ");
        System.out.println(words);
        Arrays.stream(words).forEach(x-> System.out.println(x));
        String wrods="java";
        String words1="oracle";
        System.out.println(wrods.join(","));

    }
}
