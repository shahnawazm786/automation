package org.example.day09.polymorphism;

public class PolyMorphismOverloading {
    void add(){
        System.out.println("Add method which has no parameter");
    }
    void add(String name){
        System.out.println("Add method with one  parameter type String"+name);
    }
    void add(int age){
        System.out.println("Add method with one  parameter type int"+age);
    }
    void add(int age,int age2){
        System.out.println("Add method with two  parameter type int"+age + "\t "+age2);
    }
    void add(String age,int age2) {
        System.out.println("Add method with two  parameter type is String and int" + age + "\t " + age2);
    }
    void add(int age,String age2) {
        System.out.println("Add method with two  parameter type is int and String" + age + "\t " + age2);
    }
}
