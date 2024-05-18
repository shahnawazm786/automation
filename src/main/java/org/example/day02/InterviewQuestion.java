package org.example.day02;

public class InterviewQuestion {
    public static void main(String[] args) {
        // write a program to swap value
        // x=100
        // y=200
        // x=200
        //y=100
        // First way
        //System.out.println("Value of X\t" + x);
        //System.out.println("Value of Y \t"+y);
        int x=100;
        int y=200;
        int z=0;
        System.out.println("X and Y value before swap");
        System.out.println("Value of X\t" + x);
        System.out.println("Value of Y \t"+y);
        z=x;
        x=y;
        y=z;
        z=0;
        System.out.println("X and Y value after swap");
        System.out.println("Value of X\t" + x);
        System.out.println("Value of Y \t"+y);
        // second way without using third container or variable
        int m=500;
        int n=1000;
        System.out.println("M and N value before swap");
        System.out.println("Value of M\t" + m);
        System.out.println("Value of N \t"+n);
        m=m+n; // 500+1000 (BODMAS) m=1500
        n=m-n; //1500 -1000; n=500
        m=m-n; // 1500 - 500 = m=1000
        System.out.println("M and N value before swap");
        System.out.println("Value of M\t" + m);
        System.out.println("Value of N \t"+n);
    }
}
