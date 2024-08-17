package selenium.selenium_day08;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import selenium.selenium_day07.BootStrapPage;

import java.time.Duration;

public class AlertHandlerExample {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("file:///C:/weekly-classes/automation/src/main/resources/htmls/index.html");
        Thread.sleep(1000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        Thread.sleep(1000);
        //js.executeScript("window.scrollBy(0,-750)",true);
        js.executeScript("window.alert('Hello I am java script')",true); // Horizontal
        Thread.sleep(1000);
        Alert alert=driver.switchTo().alert();
        alert.accept(); //OK
        Thread.sleep(1000);
        js.executeScript("window.prompt('Hello I am java script','Prompt Me')",true); // Horizontal
        alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept(); //OK
        Thread.sleep(2000);
        js.executeScript("window.prompt('Hello I am java script','Prompt Me')",true); // Horizontal
        alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss(); //Cancel
        Thread.sleep(5000);
        js.executeScript("confirm('Press a button!');");
        Thread.sleep(1000);
        alert=driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
        js.executeScript("window.prompt('Hello I am java script','Prompt Me')",true); // Horizontal
        Thread.sleep(2000);
        alert=driver.switchTo().alert();
        alert.sendKeys("2000");
        Thread.sleep(2000);
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(2000);

    }
}
