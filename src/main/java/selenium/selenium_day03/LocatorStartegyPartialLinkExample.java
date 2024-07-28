package selenium.selenium_day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorStartegyPartialLinkExample {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        //options.addArguments("--maximize");
        driver=new ChromeDriver(options);
        driver.get("file:///C:/Users/shahn/OneDrive/Desktop/selenium_example_page.html");
        driver.findElement(By.partialLinkText("Page")).click();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.findElement(By.partialLinkText("Official")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
