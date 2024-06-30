package org.example.day10.advanceinterface;

public class FireFoxDriver implements IBrowser{
    @Override
    public void browser() {
        System.out.println("Browser");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate");
    }

    @Override
    public void maximize() {
        System.out.println("Maximize");
    }

    @Override
    public void minimize() {
        System.out.println("Minimize");
    }

    @Override
    public void inspect() {
        System.out.println("Inspect");

    }
    public void settings(){
        System.out.println("Settings");
    }
}
