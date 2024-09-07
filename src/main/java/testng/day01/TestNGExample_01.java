package testng.day01;

import org.testng.annotations.Test;

public class TestNGExample_01 {
    @Test(groups = "sanity")
    public void sanityHomePageTest(){
        System.out.println("Sanity Group");
    }

    @Test(groups = "sanity")
    public void sanityHomePageLinTest(){
        System.out.println("Sanity Group");
    }
    @Test(groups = "sanity")
    public void sanityHomePageButtonTest(){
        System.out.println("Sanity Group");
    }
    @Test(groups = "sanity")
    public void sanityHomePageTextTest(){
        System.out.println("Sanity Group");
    }
    @Test(groups = "regression")
    public void regressionLoginTest(){
        System.out.println("Sanity Group");
    }
    @Test(groups = "regression")
    public void regressionLoginPasswordTest(){
        System.out.println("Sanity Group");
    }
    @Test(groups = "regression")
    public void regressionLoginConfirmPasswordTest(){
        System.out.println("Sanity Group");
    }
    @Test(dependsOnGroups = "sanity")
    public void startTest()
    {
        System.out.println("Test Start");
    }
    @Test
    public void launchApplication(){
        System.out.println("Launch Application");
    }
    @Test(dependsOnMethods = "launchApplication")
    public void LoginTest(){
        System.out.println("Login Test");
    }
    @Test(dependsOnMethods = "launchApplication")
    public void HomeLinkTest(){
        System.out.println("Home link test");
    }
}
