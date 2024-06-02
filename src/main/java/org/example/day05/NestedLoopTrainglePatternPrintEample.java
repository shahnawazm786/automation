package org.example.day05;

public class NestedLoopTrainglePatternPrintEample {
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    public static void main(String[] args) {
        for(int coulmn=1;coulmn<=4;coulmn++){
            for(int row=1;row<=coulmn;row++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
