package selenium.selenium_day07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import selenium.selenium_day06.IndexPage;

public class BootStrapDropDownExample {

    static WebDriver driver;
    static IndexPage indexPage;
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
        Thread.sleep(5000);
    }

}
