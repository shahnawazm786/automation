package org.example.day06;

public class StringMethodReaplaceAndReplaceAllExample {
    public static void main(String[] args) {
        String str="Java is programing language. Java is high level language";
        System.out.println(str.replace("Java","Oracle"));
        System.out.println(str.replace("is","was"));
        System.out.println(str.replaceAll("is","are"));
        System.out.println(str.replaceAll("a","o"));
    }
}
