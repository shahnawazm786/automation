package testng.day01;

import org.testng.annotations.*;

public class TestNGAnnotationExample {
    @BeforeSuite(description = "Before Suite")
    public void BeforeSuite(){
        System.out.println("Before Suite Annotation");
    }
    @BeforeGroups
    public void BeforeGroupAnnotation()
    {
        System.out.println("BeforeGroupAnnotation");
    }
    @BeforeClass
    public void BeforeClass()
    {
        System.out.println("Before Class Annotation");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("Before Test");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Before Method Annotaion");
    }
    @Test
    public void TestAnnotation(){
        System.out.println("Test Annonation");
    }

    @Test
    public void TestAnnotation1(){
        System.out.println("Test Annonation1");
    }
    @Test(groups = "sanity")
    public void sanityHomePageLinTest(){
        System.out.println("Sanity Group");
    }
    @Test(groups = "sanity")
    public void sanityHomePageButtonTest(){
        System.out.println("Sanity Group");
    }
    @Test(dependsOnGroups = "sanity")
    public void TestAnnotation2(){
        System.out.println("Test Annonation1");
    }


}
