package org.example.day10.constructoroverride;

public class OverrideExample1 extends OverrideExample {
    public OverrideExample1(){
        super();
        super.learn();
        super.range=500; //
        System.out.println("OverrideExample1");
        System.out.println(super.range);

    }
}
