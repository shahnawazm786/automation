package org.example.day04;

import java.util.Scanner;

public class SwitchCaseExample {
    // customer requirement
    // web application - chrome, edge, safari, firefox
    // mobile - android and iphone
    // iTab -
    // iPad -
    public static void main(String[] args) {
        String browserName;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter browser name");
        browserName=sc.next();
        switch (browserName.toUpperCase()){
            case "CHROME":
                System.out.println("Running automation program on CHROME");
                break;
            case "FIREFOX":
                System.out.println("Running automation program on FIREFOX");
                break;
            case "SAFARI":
                System.out.println("Running automation program on SAFARI");
                break;
            case "EDGE":
                System.out.println("Running automation program on EDGE");
                break;
            default:
                System.out.println("Running automation program on Internet Explorer");
        }
    }

}
