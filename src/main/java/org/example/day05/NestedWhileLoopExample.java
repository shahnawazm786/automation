package org.example.day05;

public class NestedWhileLoopExample {
    // Loop within the loop is called nested loop
    public static void main(String[] args) {
        int a=1;
        int b=1;
        //(3*3) = 9
        // 3*5 = 15
        while(a<=3){
           // System.out.println("Value of A \t"+a);
            b=1;
            System.out.println("Upper loop Value of A \t"+a);
            while(b<=3){

               System.out.println("Inside loop Value of B \t"+b);
                //System.out.println("Good morning!!!!");
                b++;
            }
            a++;
        }
    }
}
