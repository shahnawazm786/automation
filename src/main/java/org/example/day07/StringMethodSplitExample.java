package org.example.day07;

public class StringMethodSplitExample {
    public static void main(String[] args) {
        // This is my example
        // This,is,my,example
        // This#is#my#example

        String []expr1="This is my example".split(" ");
        for(String s:expr1){
            System.out.println(s);
        }
        String []expr2="This#is#my#example".split("#");
        for(String s:expr2){
            System.out.println(s);
        }
        String []expr3="This,is,my,example".split(",");
        for(String s:expr3){
            System.out.println(s);
        }
    }
}
