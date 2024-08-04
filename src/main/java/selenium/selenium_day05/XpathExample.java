package selenium.selenium_day05;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathExample {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("file:///C:/weekly-classes/automation/src/main/resources/xpath_example/xpaths.html");
        Thread.sleep(5000);
        boolean flag;
        /*try {
             flag= driver.findElement(By.xpath("//p[@id='p2']")).isDisplayed();
        }catch (NoSuchElementException nse){
            flag=false;
        }*/
        flag= driver.findElement(By.xpath("//p[@id='p1']")).isDisplayed();
        System.out.println(flag);
        driver.quit();
    }

}
