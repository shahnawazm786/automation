package org.example.day09.abstraction;

public interface IExample {
    double tax=10.5;
    void tax_cal();//declare // abstract public
    default void show(){
        System.out.println("Default method");
    }
    static void show1(){
        System.out.println("Static method..");
    }
}
