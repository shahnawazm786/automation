package selenium.selenium_day06;

import org.openqa.selenium.*;
import selenium.util.CommonMethod;

import java.util.List;

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
    By firstName=By.id("fname");
    By lastName=By.id("lname");
    By course=By.xpath("//input[@type='radio']");
    By checkBox=By.xpath("//input[@type='checkbox']");
    By calendar=By.id("datemax");
    /*public String getText(){
        WebElement element = driver.findElement(paragraph);
        String text=element.getText();
        return text;
    }*/
    public String getParaText(){
        return CommonMethod.getText(driver,paragraph);
    }
    public String getDivText(){
        return CommonMethod.getText(driver,division);
    }
    public void enterFirestName(String fname){
        CommonMethod.enterText(driver,firstName,fname);
    }
    public void enterLastName(String lname){
        CommonMethod.enterText(driver,lastName,lname);
    }
    public void clickRadioButtonOneByOne() {
        List<WebElement> elements=CommonMethod.getRadioButton(driver,course);
        System.out.println("------------------ Radio button -----------");
        elements.forEach(e->{
            System.out.println(e.isSelected());
        });
        elements.forEach(e->{
            try{
            Thread.sleep(2000);
            e.click();}catch (InterruptedException ie){}
        });
        elements.forEach(e->{
            System.out.println(e.isSelected());
        });
        elements.forEach(e->{
            System.out.println("Displayed \t"+e.isDisplayed() +"\t====\t isEnabled \t"+e.isEnabled());
        });


    }
    public void clickOnCheckBox(){
        System.out.println("------------------ Check box -----------");
        List<WebElement> elements=CommonMethod.getRadioButton(driver,checkBox);
        elements.forEach(e->{
            System.out.println(e.isSelected());
        });
        elements.forEach(e->{
            try{
                Thread.sleep(2000);
                e.click();}catch (InterruptedException ie){}
        });
        elements.forEach(e->{
            System.out.println(e.isSelected());
        });
        elements.forEach(e->{
            System.out.println("Displayed \t"+e.isDisplayed() +"\t====\t isEnabled \t"+e.isEnabled());
        });
    }
    public void clickOnCalendar(){
        //JavascriptExecutor jse=(JavascriptExecutor)driver;
        //jse.executeScript("document.getElementById('datemax').value='11-08-2024'",true);
        driver.findElement(calendar).sendKeys("11-08-1978");
        driver.findElement(calendar).sendKeys(Keys.ENTER);
    }

}
