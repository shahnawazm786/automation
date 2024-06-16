package org.example.day09.abstraction;

public interface IExampl1 extends IExample{
    default void show2(){
        System.out.println("IExample1 interface .... show2()");
    }
}
