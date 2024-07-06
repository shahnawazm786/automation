package org.example.day11.trycatchfinally;

import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args) {
        int age;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age of voter");
        age=scanner.nextInt();
        if(age>=18){

            System.out.println("He can caste the vote");
        }
        else {
            throw  new NullPointerException("Illegal age of voter");
           // System.out.println("He can't caste the vote");
           // System.out.println("He caste the vote for money");
        }
    }
}
