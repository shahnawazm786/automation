package testng.day02;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class TestNGExceptionHandlingExample {
    @Test(expectedExceptions = {NoSuchElementException.class})
    public void testOne(){
        System.out.println("Element igonre exception");
        throw new NoSuchElementException("Element not found");
    }
    @Test(expectedExceptions = {NoSuchElementException.class, ElementClickInterceptedException.class})
    public void testTwo(){
        System.out.println("Element igonre exception");
        throw new NoSuchElementException("Element not found");
    }
    @Test(expectedExceptions =
            {NoSuchElementException.class, ElementClickInterceptedException.class},
            expectedExceptionsMessageRegExp = "Element not found"
    )
    public void testThree(){
        throw new NoSuchElementException("Element not found");
    }
}
