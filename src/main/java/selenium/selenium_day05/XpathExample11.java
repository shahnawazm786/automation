package selenium.selenium_day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class XpathExample11 {
    //
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("file:///C:/weekly-classes/automation/src/main/resources/xpath_example/xpath_03.html");
        List<WebElement> element =driver.findElements(By.xpath("//form//label//following::input"));
        System.out.println("inputs are \t"+element.size());
        Thread.sleep(5000);
        driver.quit();
    }
}
