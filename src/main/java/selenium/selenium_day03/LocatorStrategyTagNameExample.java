package selenium.selenium_day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class LocatorStrategyTagNameExample {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        //options.addArguments("--maximize");
        driver=new ChromeDriver(options);
        driver.get("file:///C:/Users/shahn/OneDrive/Desktop/selenium_example_page.html");
        List<WebElement> element = driver.findElements(By.tagName("input"));
        System.out.println("Input element=>\t"+element.size());
        element = driver.findElements(By.tagName("label"));
        System.out.println("Label element=>\t"+element.size());
        driver.quit();
    }
}
