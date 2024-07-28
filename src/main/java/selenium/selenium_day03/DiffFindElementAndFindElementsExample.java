package selenium.selenium_day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiffFindElementAndFindElementsExample {
    static WebDriver driver;

    public static void main(String[] args) {
        driver=new ChromeDriver();
        driver.get("file:///C:/Users/shahn/OneDrive/Desktop/selenium_example_page.html");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//input[@id='information']"));
        driver.findElements(By.xpath("//input[@id='information']"));
        driver.quit();

    }
}
