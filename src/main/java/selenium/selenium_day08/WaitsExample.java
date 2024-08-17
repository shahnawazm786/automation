package selenium.selenium_day08;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class WaitsExample {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://www.pocruises.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        try {
            driver.findElement(By.xpath("//span[text()='Find & Book']")).click();
        }
        catch (ElementClickInterceptedException nse){
            JavascriptExecutor js=(JavascriptExecutor) driver;
            WebElement ele = driver.findElement(By.xpath("//span[text()='Find & Book']"));
            js.executeScript("arguments[0].click();",ele);
            js.executeScript("window.open('#')",true);
            driver.navigate().to("https://www.w3schools.com/jsref/met_win_open.asp");
        }
       // driver.quit();
    }
}
