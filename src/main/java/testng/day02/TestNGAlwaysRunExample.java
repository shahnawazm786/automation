package testng.day02;

import org.testng.annotations.Test;

public class TestNGAlwaysRunExample {
    @Test(dependsOnMethods = "testTwo",alwaysRun = true)
    public void testOne(){
        System.out.println("Test One");
    }
    @Test
    public void testTwo(){
        System.out.println("Test Two");
        throw new IndexOutOfBoundsException("Exception");

    }
}
