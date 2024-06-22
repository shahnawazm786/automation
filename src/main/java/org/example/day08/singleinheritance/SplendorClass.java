package org.example.day08.singleinheritance;

public class SplendorClass {
    public static void main(String[] args) {
        BikeClass b=new BikeClass();
        b.Start();
        b.Break(10);
        System.out.println(b.Speed());
        MarutiClass marutiClass=new MarutiClass();
        marutiClass.Start();
        System.out.println("Start speed ----------");
        System.out.println(marutiClass.Speed());
        System.out.println("Excelrate");
        System.out.println(marutiClass.Eclerate(100));
        System.out.println(marutiClass.Speed());
    }
}
