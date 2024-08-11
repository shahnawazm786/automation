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
    public  void clickOnDropDownMenu(){

    }
}
