package org.example.day12;

import java.util.Scanner;

public class AgeExceptionHandle {
    public static void main(String[] args) {
        System.out.println("Enter voter age...");
        int age=new Scanner(System.in).nextInt();
        RuntimeException r;
        if(age<18){
            r=new RuntimeException("Voter age is less than 18");
            throw r;
           //throw  new RuntimeException("Voter age is less than 18"); // constructor
        }else {
            System.out.println("You can vote");
        }
    }
}
