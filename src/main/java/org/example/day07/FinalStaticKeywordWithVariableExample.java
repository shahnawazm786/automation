package org.example.day07;

public class FinalStaticKeywordWithVariableExample {
    static double tax_cal_employee=15.66;
    public static void main(String[] args) {
        final double radius = 4.134;
        System.out.println(radius);
        //radius=4.134;
        System.out.println(tax_cal_employee);
    }
}
