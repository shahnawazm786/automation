package org.example.day06;

public class StringMethodEndsWithExample {
    public static void main(String[] args) {
        String exp="Java is high language";
        System.out.println(exp.endsWith("language")); // true
        System.out.println(exp.endsWith("age")); // true
        System.out.println(exp.endsWith("e")); // true
        System.out.println(exp.endsWith("lang")); // false
    }
}
