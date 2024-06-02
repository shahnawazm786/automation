package org.example.day05;

public class DowhileLoopClass {
    // do while your steps of initialization condition and increment/decrement (step) are wrong
    // though it will be executed once
    //do{block / statement increment }while(condintion);
    public static void main(String[] args) {
        int steps=100;
        do{
            System.out.println("Good morning!!!!");
            steps=steps+1;
            System.out.println(steps);
            System.out.println(steps<=10);
        }while(steps<=10);
    }
}
