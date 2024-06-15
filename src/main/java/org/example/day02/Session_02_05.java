package org.example.day02;

public class Session_02_05 {
    public static void main(String[] args) {
        // post opetrator ++
        // ++ pre operator
        int x=100;
        System.out.println(x);//100
        // post operator
        int y=x++; // assigment then increment
        System.out.println(x);//101
        System.out.println(y);//100

        // Pre increment
        int z=100;
        System.out.println(z);
        int a=++z;
        System.out.println(z);
        System.out.println(a);
        int b=++z;z++;
        System.out.println(b);
        System.out.println(z);
        int l=1;

    }
}
