package selenium.selenium_day04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class SeleniumElementFunctionsExample {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        driver=new ChromeDriver(options);
        driver.get("file:///C:/weekly-classes/automation/src/main/resources/ToDoList/index.html");
        WebElement element = driver.findElement(By.id("task"));
        element.sendKeys("breakfast");
        Thread.sleep(2000);
        WebElement button=driver.findElement(By.tagName("button"));
        button.click();
        Thread.sleep(2000);
        element.sendKeys("Lunch");
        button.click();
        Thread.sleep(2000);
        element.sendKeys("dinner");
        Thread.sleep(2000);
        element.clear();
        Thread.sleep(2000);
        element.sendKeys("dinner");
        element.sendKeys(Keys.HOME);
        for(int i=0;i<"dinner".length();i++) {
            element.sendKeys(Keys.DELETE);
        }
        Thread.sleep(2000);
        List<WebElement> inputs=driver.findElements(By.xpath("//ul//li//input"));
        if(inputs.size()>0){
            System.out.println("Input found");
            for(WebElement element1:inputs){
                System.out.println(element1);
                String text= element1.getText();
                System.out.println(element1.getAttribute("type"));
            }
        }
        Thread.sleep(5000);
        //driver.quit();

    }
}
