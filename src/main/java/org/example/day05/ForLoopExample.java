package org.example.day05;

public class ForLoopExample {
    // for loop
    // for(intialization; conition; increment/decrement){}
    public static void main(String[] args) {
        System.out.println("For loop execution");
        for(int i=1;i<=10;i=i+1){
            System.out.println("Good morning!!!!");
        }
        System.out.println("For loop execution without intialization and increment decrement segement");
        int num=123;
        for(;(num=num/10)>0;){
            System.out.println(num);
        }
    }
}
