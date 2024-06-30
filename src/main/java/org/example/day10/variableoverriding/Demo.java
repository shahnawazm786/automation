package org.example.day10.variableoverriding;

public class Demo {
    public static void main(String[] args) {
        VeriabeOverrideExample p=new VeriabeOverrideExample();
        System.out.println("Gear in parent class -> "+p.gear);
        p.speed();

        ChildClassVariableOverrdingExample c=new ChildClassVariableOverrdingExample();
        System.out.println("Gear in child class ->"+c.gear);
        c.speed();

        VeriabeOverrideExample p1=new ChildClassVariableOverrdingExample();
        System.out.println("Gear in parent class -> "+p1.gear);
        p1.speed();

    }
}
