package org.example.day05;

public class NestedLoopTrainglePatternPrintEample2 {
    //1
    //2 1
    //3 2 1
    //4 3 2 1
    public static void main(String[] args) {
        for(int x=1;x<=4;x++){
            for(int y=x;y>=1;y--){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
