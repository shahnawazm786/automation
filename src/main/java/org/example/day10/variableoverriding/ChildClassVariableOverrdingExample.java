package org.example.day10.variableoverriding;

public class ChildClassVariableOverrdingExample extends VeriabeOverrideExample {
    int gear=6;

    //@Override
    void speed(){
        System.out.println("Speed() method in ChildClassVariableOverrdingExample");
    }
}
