package org.example.day09.abstraction;

public abstract class ABank {
    static String account_type="Saving";
    void disp_account(){
        System.out.println(account_type);
        ABank a=new AxisBank();
        a.disp_account();
    }
}
