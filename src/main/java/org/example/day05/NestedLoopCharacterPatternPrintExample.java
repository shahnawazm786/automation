package org.example.day05;

public class NestedLoopCharacterPatternPrintExample {
    // A
    // A B
    // A B C
    // A B C D
    public static void main(String[] args) {
        for(char c='A'; c<='D';c++){
            for(char d='A';d<=c;d++){
                System.out.print(d+" ");
            }
            System.out.println();
        }
    }
}
