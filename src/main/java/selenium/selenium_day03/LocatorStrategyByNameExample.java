package selenium.selenium_day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorStrategyByNameExample {
    static WebDriver driver;

    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        //options.addArguments("--maximize");
        driver=new ChromeDriver(options);
        driver.get("file:///C:/Users/shahn/OneDrive/Desktop/selenium_example_page.html");
        String value=driver.findElement(By.name("fname")).getAttribute("value");
        System.out.println(value);
        driver.quit();
    }
}
