package selenium.selenium_day05;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathExample04 {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("file:///C:/weekly-classes/automation/src/main/resources/xpath_example/xpaths_01.html");
        Thread.sleep(5000);
        boolean flag;
        /*try {
             flag= driver.findElement(By.xpath("//p[@id='p2']")).isDisplayed();
        }catch (NoSuchElementException nse){
            flag=false;
        }*/
        try {
            flag = driver.findElement(By.xpath("//p[@aria-rowindex='1']")).isDisplayed();
            // if element found then extract the paragraph text

        }catch (NoSuchElementException nse){
            flag=false;
        }
        if(flag){
            String text=driver.findElement(By.xpath("//p[@aria-rowindex='1']")).getText();
            System.out.println("Element found and text is ->"+text);
        }
        else{
            System.out.println("Element not found and isDispayed() result ->"+flag);
        }
        driver.quit();
    }
}
