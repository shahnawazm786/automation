package org.example.day12;

public class ExceptionsExample {
    public static void main(String[] args) {
        System.out.println("Good morning");
        System.out.println("Good morning");
        System.out.println("Good morning");
        System.out.println("Good morning");
        try{
            try{}catch (Exception e){}
            System.out.println(10/0); // exception line
        }
        catch (ArithmeticException ae){ // Runtime exception
            System.out.println("Exception raised and handled ....");
            try{}catch (Exception e){}
        }

        catch(Exception ex){

        }
        finally {
            System.out.println("finally ... executed");
            try{}catch (Exception e){}
        }
        System.out.println("Good morning");
        System.out.println("Good morning");
    }
}
