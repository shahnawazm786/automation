package org.example.day06;

public class StringMethodEqualExample {
    public static void main(String[] args) {
        String expr="Java";
        String expr1="Java";
        System.out.println(expr1.equals(expr)); // true
        System.out.println(expr1.equals("JaVa")); // false
        System.out.println(expr1.equals("JAva")); // false
        System.out.println(expr1.equals("Jaa")); // false
        System.out.println(expr1.equals("jaVa")); // false
        System.out.println(expr1==expr);//object
        expr1=new String("Java");
        System.out.println(expr1==expr);//false

    }
}
