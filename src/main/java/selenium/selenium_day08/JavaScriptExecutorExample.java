package selenium.selenium_day08;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import selenium.selenium_day07.BootStrapPage;

import java.time.Duration;

public class JavaScriptExecutorExample {
    static WebDriver driver;
    static BootStrapPage bootStrapPage;
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("file:///C:/weekly-classes/automation/src/main/resources/htmls/index.html");
        Thread.sleep(1000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement element=driver.findElement(By.xpath("//input[@type='submit']"));
        //js.executeScript("documents[0].scrollIntoView()",element);
        js.executeScript("window.scrollBy(0,750)",true);
        Thread.sleep(5000);
        js.executeScript("document.documentElement.scrollTop = 0;",true);
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0,750)",true); // Horizontal
        //js.executeScript("window.scrollTo(500,0)",true); // vertical
        js.executeScript("document.getElementById('fname').value='KAZ'",true);
        Thread.sleep(1000);
        //js.executeScript("window.scrollBy(0,-750)",true);
        js.executeScript("window.alert('Hello I am java script')",true); // Horizontal
        Thread.sleep(5000);


    }
}
