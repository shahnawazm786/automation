package org.example.day03;

public class Session_01_03 {
    public static void main(String[] args) {


        // conditional operator
        // if - else
        // loop - repeatative work
        // while ,  do - while, for and for - object
        // switch - case - fixed
        // condition - > condition & logical operator

        // if(condition or value ) { expre }
        // if (condition or value) {expre} else {expre}
        // if (condition or value) {expre} else if (condition) {exp} else if (condition) {exp}
        // else {expr}

        int sal = 10000;
        if(sal>5000) {
            System.out.println("Yes my salary is more than 5000");

        }
        else{
            System.out.println("No my salary is not more than 5000");
        }
        sal=4000;
        boolean result=sal>5000;
        System.out.println("Result\t "+result);
        if(result) {
            System.out.println("Yes my salary is more than 5000");

        }
        else{
            System.out.println("No my salary is not more than 5000");
        }
    }
}
