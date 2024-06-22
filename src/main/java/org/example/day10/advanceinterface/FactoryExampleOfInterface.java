package org.example.day10.advanceinterface;

public class FactoryExampleOfInterface {
    public static void main(String[] args) {
        IBrowser browser=new ChromeDriver();
        browser.browser();
        browser.inspect();
        browser.navigate();

        IBrowser firefox=new FireFoxDriver();
        firefox.browser();
        firefox.inspect();
        firefox.maximize();
        firefox.navigate();

    }
}
