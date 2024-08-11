package selenium.selenium_day07;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import selenium.selenium_day06.IndexPage;

import java.time.Duration;

public class BootStrapDropDownExample {

    static WebDriver driver;
    static BootStrapPage bootStrapPage;
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
        Thread.sleep(5000);
        bootStrapPage=new BootStrapPage(driver);
        try{bootStrapPage.clickOnDropDownMenu();}catch (ElementClickInterceptedException ie){
            bootStrapPage.clickOnDropDownMenu();
        }
        Thread.sleep(5000);
        bootStrapPage.selectOptions();

    }

}
