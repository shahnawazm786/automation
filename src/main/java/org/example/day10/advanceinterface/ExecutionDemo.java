package org.example.day10.advanceinterface;

public class ExecutionDemo {
    public static void main(String[] args) {
        ChromeDriver chrome= new ChromeDriver();
        chrome.browser();
        chrome.cdpTool();
        chrome.inspect();



        FireFoxDriver fire= new FireFoxDriver();
        fire.settings();
        fire.browser();
        fire.inspect();
        fire.settings();


    }
}
