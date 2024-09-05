package browserstack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.assertEquals;

public class BrowserStackExample {


    @Test (testName ="Demo",description = "Connect to Browser Stack")
    public void DemoTest() throws MalformedURLException{
        final String UserName="automationseleni_k7KD4O";
        final String AccessKey="vKYs2WpvYbyby6CYQ7T7";
        String Url="https://"+UserName+":"+AccessKey+"@hub-cloud.browserstack.com/wd/hub";
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability("browserName","Chrome");
        cap.setCapability("browserVersion","128.0");
        //cap.setCapability("buildName","Demo project");
        //cap.setCapability("projectName","KAZ Automation Classes");
        //cap.setCapability("os","Windows");
        //cap.setCapability("osVersion","10");
        //WebDriver driver = new ChromeDriver();
        WebDriver driver=new RemoteWebDriver(new URL(Url),cap);
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        assertEquals("Google",driver.getTitle());
        if(driver.getTitle().equalsIgnoreCase("Googles")){
            JavascriptExecutor jse=(JavascriptExecutor) driver;
            jse.executeScript(IBrowserStackStatus.STATUS_PASSED_JS,true);
        }
        else {
            JavascriptExecutor jse=(JavascriptExecutor) driver;
            jse.executeScript(IBrowserStackStatus.STATUS_FAILED_JS,true);
        }
        driver.quit();
}
}
