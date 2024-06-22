package org.example.day09.abstraction;

public class AxisBank extends ABank{
    double sal=50000;

    void calculate(){

        if(ABank.account_type.equalsIgnoreCase("saving")){
            ABank.account_type="Axis Saving";
            System.out.println(ABank.account_type);
        }
    }

}
