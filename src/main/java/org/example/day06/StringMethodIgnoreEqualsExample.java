package org.example.day06;

public class StringMethodIgnoreEqualsExample {
    public static void main(String[] args) {
        String str="Java";
        System.out.println(str.equalsIgnoreCase("JAVA"));
        System.out.println(str.equalsIgnoreCase("Java"));
        System.out.println(str.equalsIgnoreCase("oracle"));
    }
}
