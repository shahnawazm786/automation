package selenium.selenium_day09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class IframeExample {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("file:///C:/weekly-classes/automation/src/main/resources/htmls/iframes.html");
        driver.switchTo().frame("frame1");
       // driver.switchTo().alert().accept();
        driver.findElement(By.id("button1")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.findElement(By.id("myButton")).click();

    }
}
