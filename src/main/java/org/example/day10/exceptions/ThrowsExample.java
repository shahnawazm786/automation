package org.example.day10.exceptions;

import java.io.FileNotFoundException;

public class ThrowsExample {
    public static void main(String[] args) {
        arithmetic();
        ThrowsException1 te=new ThrowsException1();
        te.arithmetic();
        try {
            te.readFile();
        }catch (FileNotFoundException fe){
            System.out.println("File not found"+fe.getMessage());
        }
    }
    static void arithmetic(){
        try{
            System.out.println(100/0);
        }catch (ArithmeticException ae){
            System.out.println("Exception raised"+ae.getMessage());
        }
    }
}
