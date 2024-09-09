package advance.testng;

import advance.testng.utils.BaseTest;
import org.openqa.selenium.NoSuchElementException;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void testPassed(){
        System.out.println("Test Passed");
    }
    @Test
    public void failTest(){
        System.out.println("Test failed");
        throw new NoSuchElementException("Exception raised");
    }
    @Test
    public void skipTest()
    {
        System.out.println("Test Skipped");
        throw new SkipException("Skipped");
    }
}
