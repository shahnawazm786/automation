package org.example.day05;

public class NestedForLoopExample {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            System.out.println("Upper loop Value of I \t"+i);
            for(int j=1; j<=5;j++){
                System.out.println("Upper loop Value of J \t"+j);
            }
        }
    }
}
