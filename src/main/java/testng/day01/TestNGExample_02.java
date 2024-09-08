package testng.day01;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGExample_02 {
    @Test
    public void firstTest(){
        System.out.println("Passed");
    }
    @Test
    public void secondTest(){
        System.out.println("Skipped");
        throw new SkipException("Skipped");
    }
    @Test
    public void thirdTest(){
        throw new NoSuchElementException("Failed");
    }
    @Test(expectedExceptions = {NoSuchElementException.class, ElementClickInterceptedException.class})
    public void expectedTest(){
        System.out.println("Expected condition handling");
        throw new NoSuchElementException("No such element exception");
    }
}
