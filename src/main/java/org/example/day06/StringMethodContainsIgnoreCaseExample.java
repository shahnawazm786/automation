package org.example.day06;

public class StringMethodContainsIgnoreCaseExample {
    public static void main(String[] args) {
        String str="Java is high level language";
        System.out.println(str.contains("high"));//true
        System.out.println(str.contains("High".toLowerCase()));//false
    }
}
