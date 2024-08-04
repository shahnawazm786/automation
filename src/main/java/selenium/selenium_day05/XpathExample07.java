package selenium.selenium_day05;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class XpathExample07 {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("file:///C:/weekly-classes/automation/src/main/resources/xpath_example/xpath_02.html");
        Thread.sleep(5000);
        boolean flag;
        /*try {
             flag= driver.findElement(By.xpath("//p[@id='p2']")).isDisplayed();
        }catch (NoSuchElementException nse){
            flag=false;
        }*/
        List<WebElement> elements=new ArrayList<>();
        try {
            elements  = driver.findElements(By.xpath("//label[contains(text(),'Name')]"));
            // if element found then extract the paragraph text

        }catch (NoSuchElementException nse){
            flag=false;
        }
        for(WebElement el:elements){
            System.out.println("Extracting text of each paragraph "+ el.getText());
        }
        System.out.println(driver.findElement(By.xpath("//label[contains(text(),'First')]")).getText());
        driver.quit();
    }
}
