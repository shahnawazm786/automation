package selenium.selenium_day09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Set;

public class WindowsHandler {
    static WebDriver driver;

    public static void main(String[] args) {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("file:///C:/weekly-classes/automation/src/main/resources/htmls/iframes.html");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.open('https://www.google.com')",true);
        Set<String> handler = driver.getWindowHandles();
        for (String str:handler){
            driver.switchTo().window(str);
            driver.switchTo().frame("frame1");
            driver.findElement(By.id("button1")).click();
        }

//        driver.findElement(By.id("APjFqb")).sendKeys("KAZ automation"+ Keys.ENTER);

    }
}
