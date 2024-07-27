package selenium.selenium_day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//https://tutorial.techaltum.com/html5-svg.html
public class WebElementExample {
    public static void main(String[] args) throws InterruptedException {
         WebDriver driver;
         driver=new ChromeDriver();
         driver.get("file:///C:/Users/shahn/OneDrive/Desktop/selenium_example_page.html");
         driver.manage().window().maximize();
         Thread.sleep(5000);
         // class strategy
        List<WebElement> elements = driver.findElements(By.className("information"));
        System.out.println(elements.size());
        driver.close();
    }

}
