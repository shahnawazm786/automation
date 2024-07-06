package org.example.day11.trycatchfinally;

import java.util.Scanner;

public class TryCatchFinally01 {
    public static void main(String[] args) {
        int x,y=0;
        String a=null;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        x=scanner.nextInt();
        System.out.println("Enter second number");
        y= scanner.nextInt();
        try{
            System.out.println(x/y);
        }
        catch (ArithmeticException ne){
            System.out.println("Exception catched");
        }
        finally {
            System.out.println("Program closed");
        }
        System.out.println("Program ended .....");
    }
}
