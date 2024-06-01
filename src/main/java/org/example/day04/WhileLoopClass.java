package org.example.day04;

public class WhileLoopClass {
    // Loop - while, do-while, for,foreach or for object
    // loop is used when the user require to execute particular line of code / block for certain time.
    // Good morning - 2 , 3,5,10
    public static void main(String[] args) {
        // intialization
        // condition
        // increment or decrement (depends on intialization)

        /*System.out.println("Good morning!!!!!");
        System.out.println("Good morning!!!!!");
        System.out.println("Good morning!!!!!");
        System.out.println("Good morning!!!!!");
        System.out.println("Good morning!!!!!");
        System.out.println("Good morning!!!!!");
        System.out.println("Good morning!!!!!");
        System.out.println("Good morning!!!!!");
        System.out.println("Good morning!!!!!");
        System.out.println("Good morning!!!!!");*/

        int counter=1; // initialization
        while(counter<=10){ //condition
            System.out.println( "current value of counter is => "+counter +"and conditions value \tcounter<=10 =>" +(counter<=10));
            System.out.println("Good morning!!!!!");
            counter++; // increment
        }
        System.out.println( "current value of counter is => "+counter +"and conditions value \tcounter<=10 =>" +(counter<=10));
    }
}
