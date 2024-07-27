package selenium.selenium_day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InteractionSeleniumExample {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException{
        driver=new FirefoxDriver(); // we create session of the browser here
        driver.get("https://www.selenium.dev");
        String title=driver.getTitle();
        System.out.println("Title of the browser->\t"+title);
        Thread.sleep(000);
        driver.navigate().to("https://www.google.com");
        title=driver.getTitle();
        System.out.println("Title of the browser->\t"+title);
        Thread.sleep(5000);
        driver.get("https://www.selenium.dev");
        title=driver.getTitle();
        System.out.println("Title of the browser->\t"+title);
        Thread.sleep(5000);
        driver.close();// driver.quit() // session close
    }
}
