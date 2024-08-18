package selenium.selenium_day09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import selenium.util.CommonMethod;

import java.time.Duration;

public class PopupWaitExample {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("file:///C:/weekly-classes/automation/src/main/resources/htmls/buttons.html");
        driver.findElement(By.id("button1")).click();
        CommonMethod.waitForPopupDisplay(driver,5);
        driver.switchTo().alert().accept();


    }
}
