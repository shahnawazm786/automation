package selenium.selenium_day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationSeleniumDriverExample {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new FirefoxDriver(); // we create session of the browser here
        driver.get("https://www.selenium.dev");
        Thread.sleep(3000);
        driver.navigate().to("https://www.google.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
    }
}
