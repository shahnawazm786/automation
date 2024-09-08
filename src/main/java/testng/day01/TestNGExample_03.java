package testng.day01;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;

public class TestNGExample_03 extends TestListenerAdapter {

    public void onStart(ITestContext context) {
        System.out.println("Test Start");
        System.out.println(context.getName());
        System.out.println(context.getHost());
    }

    @Test
    public void listenerTest(){
        System.out.println("Test Method passed");
    }
}
