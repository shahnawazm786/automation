package org.example.day07;

public class IntegerArraysExample {
    public static void main(String[] args) {
        int age=50;
        age=40;
        String name="Kareem";
        name="Abdul";
        // Array - > Contineous memory allocation in the computer
        // -> it stores more than one data which similar
        // -> it never shrink and grows at runtime
        // - Array's data accessed by index and index start from 0
        // {18,19,20,21}
        // [] - is significant of array
        // when you initialize the array you must provide the size
        int []age1=new int[4];
        age1[0]=18;
        age1[1]=19;
        age1[2]=20;
        age1[3]=21;
        System.out.println(age1[0]);
        System.out.println(age1[1]);
        System.out.println(age1[2]);
        System.out.println(age1[3]);
        int []age2={10,20,31,41};
        System.out.println(age2[0]);
        System.out.println(age2[1]);
        System.out.println(age2[2]);
        System.out.println(age2[3]);
        //
        System.out.println(age2[-1]); // ArrayIndexOutOfBoundException
    }
}
