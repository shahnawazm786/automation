package selenium.selenium_day06;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
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
    By email=By.id("email");
    By attachmentFile=By.id("myfile");

    By quantity=By.id("quantity");
    By week=By.id("week");
    By listBox=By.xpath("//select[@name='Name_of_list_box']");
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
    public void setDateToCalendar(){
        driver.findElement(calendar).sendKeys("11-08-1978");
        //driver.findElement(calendar).sendKeys(Keys.ENTER);
    }
    public void enterEmail(String emailID){
    CommonMethod.sendKeys(driver,email,emailID,0);
    }
    public void selectFileAttachment(String path){
        CommonMethod.sendKeys(driver,attachmentFile,path,0);
    }
    public void selectOptions() throws InterruptedException{
        Select select=new Select(driver.findElement(listBox));
        select.selectByVisibleText("List item 1");
        Thread.sleep(2000);
        select.selectByIndex(1);
        Thread.sleep(2000);
        select.selectByValue("listN");
        Thread.sleep(2000);
    }
    public void setQuantity(String qty){
        CommonMethod.sendKeys(driver,quantity,qty,0);
    }
    public void setWeek(String wk){
        CommonMethod.sendKeys(driver,week,wk,0);
    }
}
