package org.example.day07;

import java.util.Scanner;

public class AddValueIntoTheArrayExample {
    public static void main(String[] args) {
        int []marks=new int[100];
        int j;
        Scanner sc=new Scanner(System.in);
        System.out.println("How many data you want to enter");
        j=sc.nextInt();
        int num;
        for(int k=0;k<j;k++){
            System.out.println("How your data");
            num=sc.nextInt();
            marks[k]=num;
        }
        for(int k=0;k<j;k++){
            System.out.println("Number at ["+k +"]\tindex\t"+ marks[k]);
        }
    }
}
