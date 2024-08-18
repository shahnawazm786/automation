package selenium.selenium_day09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import selenium.util.CommonMethod;

import java.time.Duration;

public class WaitsExample {
        static WebDriver driver;

        public static void main(String[] args) throws InterruptedException {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.get("https://eviltester.github.io/simpletodolist/todolists.html");
            WebElement btn=driver.findElement(By.xpath("//button[@class='destroy']"));
            btn.click();
            driver.switchTo().alert().accept();
            WebElement input = driver.findElement(By.xpath("//input[@class='new-todo-list']"));
            input.sendKeys("Break Fast");
            input.sendKeys(Keys.ENTER);
            //WebElement div = driver.findElement(By.xpath("//div[@class='view']"));
            CommonMethod.waitTillVisiblity(driver,By.xpath("//label[text()='Break-Fast']"),20);
            WebElement div = driver.findElement(By.xpath("//label[text()='Break-Fast']"));
            String text=div.getText();
            if(text.equalsIgnoreCase("Break-Fast")){
                System.out.println("Test Passed");
            }else{
                System.out.println("Test Failed");
            }
    }
}
