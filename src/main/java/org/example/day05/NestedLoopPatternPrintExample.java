package org.example.day05;

public class NestedLoopPatternPrintExample {
    // 1 1 1 1
    // 2 2 2 2
    // 3 3 3 3
    // 4 4 4 4
    public static void main(String[] args) {
        for(int k=1;k<=4;k++){
            for(int l=1;l<=4;l++){
                System.out.print(k +" ");
            }
            System.out.println();
        }
    }
}
