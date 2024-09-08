package testng.day02;

import org.openqa.selenium.NoSuchElementException;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGPassandFailedandSkippedTest {
    @Test
    public void testCase1(){
        System.out.println("Passed from sysout");
    }
    @Test
    public void testCase2()
    {
        System.out.println("Skipped from sysout");
        throw new SkipException("Test Skipped exception");
    }
    @Test
    public void testCase3(){
        System.out.println("Failed from sysout");
        throw  new NoSuchElementException("Element not found exception");
    }
    @Test
    public void testCase4(){
        System.out.println("Failed from sysout");
        throw  new NoSuchElementException("Element not found exception");
    }
}
