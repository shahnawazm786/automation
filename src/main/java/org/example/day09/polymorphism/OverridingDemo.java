package org.example.day09.polymorphism;

public class OverridingDemo {
    public static void main(String[] args) {
        ParentClass p=new ParentClass();
        p.overriddingMethod();
        ChildClass c=new ChildClass();
        c.overriddingMethod();
        //Parent class method is overridden by child class
        ParentClass p1=new ChildClass();
        p1.overriddingMethod(); // child class // this run time polymorphism
       // ChildClass c1=(ChildClass) new ParentClass();
       // c1.overriddingMethod();

    }
}
