package selenium.selenium_day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.util.CommonMethod;

public class BootStrapPage {
    //dropdownMenuButton
    WebDriver driver;
    public BootStrapPage(WebDriver driver){
        this.driver=driver;
    }
    By dropdownMenuButton=By.id("dropdownMenuButton");
    By dropOptions=By.xpath("(//a[@class='dropdown-item' and text()='Action'])[1]");
    public  void clickOnDropDownMenu(){
        driver.findElement(dropdownMenuButton).click();
    }
    public void selectOptions(){
        driver.findElement(dropOptions).click();
    }
}
