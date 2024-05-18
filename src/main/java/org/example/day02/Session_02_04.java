package org.example.day02;

public class Session_02_04 {
    public static void main(String[] args) {
        boolean resutl=100>200;
        System.out.println(resutl); //false
        System.out.println(!resutl); //true
        boolean resutl1=100<200; // true
        System.out.println(resutl1); //true
        System.out.println(!resutl1); //false
        System.out.println(100==100 & 200==200 & 200!=200 & 100>200);
        System.out.println(100==100 & 200==200 & (!true));
        System.out.println(100==100 & 200==200 | (!true));
    }
}
