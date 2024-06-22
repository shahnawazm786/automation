package org.example.day09.abstraction;

import extra.Interface1;

public class DemoInterface {
    public static void main(String[] args) {
        //IExample.tax=11.0; // not possible because of final
        System.out.println(IExample.tax);
        BankClass b=new BankClass();
        b.setAmount(50000);
        b.tax_cal();
        System.out.println(b.getAmount());
        IExample.show1();
        b.show();

    }
}
