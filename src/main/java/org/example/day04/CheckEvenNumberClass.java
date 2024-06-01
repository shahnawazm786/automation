package org.example.day04;

import java.util.Scanner;

public class CheckEvenNumberClass {
    // 2==0
    // Ex - 2,4,6,8,10 .....
    // Ternery operator  // if - else
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        System.out.println((num%2==0) ? num+"\tis Even Number and Reminder\t" + num%2 : num+"\t is not Even Number and Reminder"+num%2);
        String expr=(num%2==0) ? num+"\tis Even Number and Reminder\t" + num%2 : num+"\t is not Even Number and Reminder"+num%2;
        System.out.println("Capture in expr variable");
        System.out.println(expr);
    }
}
