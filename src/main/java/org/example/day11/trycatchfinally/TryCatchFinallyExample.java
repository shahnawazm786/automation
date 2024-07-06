package org.example.day11.trycatchfinally;

import com.sun.security.jgss.GSSUtil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        int x,y=0;
        String a=null;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        x=scanner.nextInt();
        System.out.println("Enter second number");

        try {
            y=scanner.nextInt();
            System.out.println(a.length());
            System.out.println("X is divided by Y \t =>" + (x / y));
        }

        catch (InputMismatchException in){
            System.out.println("Input mis match "+in.getMessage());
            System.out.println("First value\t" +x+"\t and second value"+y );
        }
        catch (ArithmeticException ae){
            System.out.println("user try to divide a number by zero"+ae.getMessage());
            System.out.println("First value\t" +x+"\t and second value"+y );
        }
        catch (Exception ex){
            System.out.println("Exception raised\n " +ex.getMessage());
            ex.printStackTrace();
        }

        System.out.println("Program ended....");

    }
}
