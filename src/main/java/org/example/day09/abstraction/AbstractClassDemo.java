package org.example.day09.abstraction;

public class AbstractClassDemo {
    public static void main(String[] args) {
        //ABank a=new ABank(); Abstract class can't be created as ab object
        AxisBank axisBank=new AxisBank();
        axisBank.disp_account();
        System.out.println(axisBank.sal);
        axisBank.calculate();

    }
}
