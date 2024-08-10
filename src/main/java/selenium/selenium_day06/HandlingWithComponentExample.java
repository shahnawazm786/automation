package selenium.selenium_day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingWithComponentExample {
    static WebDriver driver;
    static IndexPage indexPage;
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("file:///C:/weekly-classes/automation/src/main/resources/htmls/index.html");
        Thread.sleep(5000);
        indexPage=new IndexPage(driver);
        System.out.println(indexPage.getText());
        Thread.sleep(5000);
        driver.quit();
    }
}
