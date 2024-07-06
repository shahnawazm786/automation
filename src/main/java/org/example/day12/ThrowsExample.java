package org.example.day12;

public class ThrowsExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Good morning!!!!");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException ie){
            System.out.println("Checked Exception Example");
        }
        System.out.println("Good noon !!!");
        Thread.sleep(2000);
        System.out.println("Good after noon!!!!");
        Thread.sleep(2000);
        System.out.println("Good evening !!!");
        Thread.sleep(2000);
        System.out.println("Good night !!!");
        Thread.sleep(2000);
    }
}
