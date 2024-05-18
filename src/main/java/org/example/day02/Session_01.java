package org.example.day02;

public class Session_01 {
    public static void main(String[] args) {
        // variable
       // int,float,double,char,long
        // String, Integer, Double, char
        int age; // >=5 <=200
        age=50;
        // message + value
        System.out.println("Customer age is "+age); // concatenation operator
        String first_name="coding";
        String last_name="maktab";
        int pen_price=100;
        int book_price=200;
        int total_price=pen_price + book_price; // Addition
        String customer_name=first_name +"\t" +last_name ; // concatenation
        System.out.println("Total price of item\t"+total_price); // operator overloading
        System.out.println("Customer name\t"+customer_name);

    }
}
