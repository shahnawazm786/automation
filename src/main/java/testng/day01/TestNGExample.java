package testng.day01;

import org.testng.annotations.Test;

// @Test
public class TestNGExample {
    @Test(priority = 1, testName = "HomeTest",
            description = "Regression Test",
            invocationCount = 2)
    public void goToHomeTest(){
        System.out.println("Hello!!!! I am testng");
    }
    @Test(priority = 3,testName = "SearchTest",enabled = false)
    public void searchTextTest(){
        System.out.println("We have search test");
    }
    @Test(priority = 4,testName = "ClickTest")
    public void clickOnSearchTest(){
        System.out.println("Click on Search button");
    }
    @Test(priority = 2,testName = "TextValidation")
    public void zuttonValueValidation(){
        System.out.println("Button text validation");
    }

}
