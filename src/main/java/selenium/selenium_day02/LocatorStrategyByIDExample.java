package selenium.selenium_day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategyByIDExample {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {


        driver = new ChromeDriver();
        driver.get("file:///C:/Users/shahn/OneDrive/Desktop/selenium_example_page.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.id("fname"));
        System.out.println(element.getAttribute("value"));
        driver.close();
    }
}
