package selenium.selenium_day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathExample10 {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("file:///C:/weekly-classes/automation/src/main/resources/xpath_example/xpath_03.html");
        WebElement element =driver.findElement(By.xpath("//p"));
        WebElement ele=element.findElement(By.xpath("//b"));
        System.out.println(ele.getText());
        WebElement ele1=driver.findElement(By.xpath("//span[contains(.,'This')]"));
        System.out.println(ele1.getText());
        //System.out.println(driver.findElements(By.xpath("//label[ends-with(@aria-nav,'name')]")).get(1).getText());
        Thread.sleep(5000);
        driver.quit();
    }
}
