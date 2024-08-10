package selenium.selenium_day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndexPage {
    private WebDriver driver;
    public IndexPage(WebDriver driver){
        this.driver=driver;
    }
    /**
     * Components
     */
    //WebElement paragraph=driver.findElement(By.tagName("p"));
    By paragraph=By.tagName("p"); // text
    By division=By.tagName("div");// text
    public String getText(){
        WebElement element = driver.findElement(paragraph);
        String text=element.getText();
        return text;
    }


}
