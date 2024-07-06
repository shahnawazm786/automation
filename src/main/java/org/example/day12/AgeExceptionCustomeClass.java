package org.example.day12;

public class AgeExceptionCustomeClass extends RuntimeException{
    public AgeExceptionCustomeClass(String msg){
        super(msg);
    }
    public AgeExceptionCustomeClass(int age){
        if(age<17){
            System.out.println("Age is less than 17");
        }
    }
}
