package browserstack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackExample {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability("os","Windows");
        cap.setCapability("os_version","10");
        cap.setCapability("browser","Chrome");
        cap.setCapability("browser_Version","80");
        //WebDriver driver = new ChromeDriver();
        WebDriver driver=new RemoteWebDriver(new URL(""),cap);


    }
}
