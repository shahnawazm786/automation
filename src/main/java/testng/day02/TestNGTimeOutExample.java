package testng.day02;

import org.testng.annotations.Test;

public class TestNGTimeOutExample {
    @Test(timeOut = 5500,alwaysRun = true)
    public void testOne() throws InterruptedException{
        Thread.sleep(5000);
        System.out.println("Test Completed");
    }
    @Test(dependsOnMethods = "testOne",invocationTimeOut = 2)
    public void testTwo(){
        System.out.println("Test Completed");
    }
    @Test(invocationTimeOut = 1000)
    public void testZero(){
        System.out.println("Test Completed");
    }
}
