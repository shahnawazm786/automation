package org.example.day03;

public class Session_01_02 {
    public static void main(String[] args) {
        boolean a=(500>100)?true:false;
        System.out.println(a);
        double sal= 100000;
        String exp=(sal>10000)? "salaired employee" : "Contract";
        System.out.println(exp);
        int x=1000;
        int y=200;

        String exp1=(x>y)? "X is greater" : "Y is greater";
        System.out.println(exp1);

        int z=600;
        String exp2=(x>y & x>z)? "X is greater" : (y>z)? "Y is greater" : "Z is greater";
        System.out.println(exp2);

        // calculation



    }
}
