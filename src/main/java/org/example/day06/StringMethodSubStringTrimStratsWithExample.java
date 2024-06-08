package org.example.day06;

public class StringMethodSubStringTrimStratsWithExample {
    public static void main(String[] args) {
        //startWith()
        System.out.println("java".startsWith("ja"));//true
        System.out.println("java".startsWith("a"));//false

        String str="   java is   programming   language   ";
        System.out.println(str.trim());

        String str1="java is programming language";
        System.out.println(str1.substring(0,4)); // java
        System.out.println(str1.substring(8));
        System.out.println(str1.substring(8,13));
    }
}
