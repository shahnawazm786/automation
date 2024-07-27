package selenium.selenium_day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class LocatorStrategyCSSClassExample {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new FirefoxDriver(); // we create session of the browser here
        driver.get("file:///C:/Users/shahn/OneDrive/Desktop/selenium_example_page.html");
        List<WebElement> elements = driver.findElements(By.cssSelector(".information"));
        System.out.println(elements.size());
        driver.close();

    }

}
