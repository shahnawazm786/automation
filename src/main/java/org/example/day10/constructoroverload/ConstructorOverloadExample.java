package org.example.day10.constructoroverload;

public class ConstructorOverloadExample {
    public ConstructorOverloadExample(){
        System.out.println("Without Parameter constructor");
    }
    public ConstructorOverloadExample(String name){
        System.out.println("Constructor with parameter\t=>"+name);
    }
}
