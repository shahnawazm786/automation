package selenium.selenium_day07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import selenium.selenium_day06.IndexPage;

public class HtmlComponentHandling {
    static WebDriver driver;
    static IndexPage indexPage;
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("file:///C:/weekly-classes/automation/src/main/resources/htmls/index.html");
        Thread.sleep(5000);
        indexPage = new IndexPage(driver);
        indexPage.setDateToCalendar();
        indexPage.enterEmail("Test@gmail.com");
        indexPage.selectFileAttachment("C:\\weekly-classes\\automation\\src\\main\\resources\\htmls\\delay.html");
        indexPage.selectOptions();
        indexPage.setQuantity("5");
        Thread.sleep(5000);
        indexPage.setWeek("35");
        indexPage.setWeek("2024");
        Thread.sleep(5000);
    }
}
