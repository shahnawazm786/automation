package org.example.day09.polymorphism;

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        PolyMorphismOverloading p=new PolyMorphismOverloading();
        p.add();
        p.add("String parameter");
        p.add(100);
        p.add(100,200);
        p.add("String parameter",20);
        p.add(100,"String parameter");
    }
}
