package org.example.day04;

public class FindAllEvenNumberClass {
    // find all the even number between 1 and 100.
    // a number divided by 2 and has no reminder
    // % reminder operator
    // number%2==0
    public static void main(String[] args) {
        int number=60;
        while (number<=100){
            //System.out.print(number+"\t");
            if(number%2==0){
                System.out.print(number+"\t");
            }
            number++;
        }
    }
}
