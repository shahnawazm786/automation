package org.example.day10.exceptions;

public class ExceptionsDemo {
    public static void main(String[] args) {
        System.out.println(100>500);
        System.out.println(100+500);
        System.out.println(100-500);
        System.out.println(100*50);
        System.out.println(100/50);
        try {
            System.out.println(100 / 0); // abnormal terminate
        }catch (ArithmeticException ae){
            System.out.println("Exception raised "+ ae.getMessage());
        }
        System.out.println(100<500);
        System.out.println(100==500);
        System.out.println(100!=500);
    }
}
