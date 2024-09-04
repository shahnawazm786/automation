package browserstack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackExample {
    public static void main(String[] args) throws MalformedURLException {
        final String UserName="automationseleni_k7KD4O";
        final String AccessKey="vKYs2WpvYbyby6CYQ7T7";
        //String Url="http://hub.browserstack.com/wd/hub";
        String Url="https://"+UserName+":"+AccessKey+"@hub-cloud.browserstack.com/wd/hub";
        DesiredCapabilities cap=new DesiredCapabilities();
        /*cap.setCapability("browserstack.user",UserName);
        cap.setCapability("browserstack.key",AccessKey);*/
        cap.setCapability("os","Windows");
        cap.setCapability("osVersion","10");
        cap.setCapability("browserName","Chrome");
        cap.setCapability("browserVersion","120.0");
        //WebDriver driver = new ChromeDriver();
        WebDriver driver=new RemoteWebDriver(new URL(Url),cap);
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println("Completed.....");


    }
}
