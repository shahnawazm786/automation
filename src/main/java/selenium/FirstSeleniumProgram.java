package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstSeleniumProgram {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("--allow-remote=*");
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chrome\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.selenium.dev/");
        //driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.quit();
    }
}
