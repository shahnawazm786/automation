package org.example.day12;

import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args) {
        System.out.println("Enter any value");
        int x=new Scanner(System.in).nextInt();
        if(x>0){
            throw new RuntimeException("Value is positive");
        }
    }
}
