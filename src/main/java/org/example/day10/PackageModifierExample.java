package org.example.day10;

public class PackageModifierExample {
    protected void disp(){
        System.out.println("Disp method inside package day10");
    }
    void show(){ // package level modifier -> this method is not accessible in subclass within same pacakge
        System.out.println("Show method inside package day10");
    }
}
