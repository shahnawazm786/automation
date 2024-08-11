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
    By dropdownMenuButton=By.xpath("//button[@id='dropdownMenuButton']");
    By dropOptions=By.xpath("(//a[@class='dropdown-item' and text()='Action'])[1]");
    public  void clickOnDropDownMenu() throws InterruptedException{
        CommonMethod.scrollTOView(driver,dropdownMenuButton);
        Thread.sleep(2000);
        CommonMethod.waitTillElementClickable(driver,dropdownMenuButton,20);
        //driver.findElement(dropdownMenuButton).click();
        CommonMethod.clcikJS(driver,dropdownMenuButton);
    }
    public void selectOptions(){
        CommonMethod.scrollTOView(driver,dropOptions);
        CommonMethod.clcikJS(driver,dropOptions);
        //driver.findElement(dropOptions).click();
    }
}
