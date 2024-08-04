package selenium.selenium_day05;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class XpathExample08 {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("file:///C:/weekly-classes/automation/src/main/resources/xpath_example/xpath_02.html");
        System.out.println(driver.findElements(By.xpath("//label[contains(@aria-nav,'first name')]")).get(0).getText());
        System.out.println(driver.findElements(By.xpath("//label[contains(@aria-nav,'name')]")).get(1).getText());
        Thread.sleep(5000);
        driver.quit();
    }
}
