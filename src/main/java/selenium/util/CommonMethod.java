package selenium.util;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CommonMethod {
    static WebDriverWait wait;
    static JavascriptExecutor js;
    /**
     *
     * @param element - pass the elements
     * @return - text of the element
     */

    public static String getText(WebElement element){
        return element.getText();
    }

    /**
     *
     * @param driver - driver required
     * @param locator - pass the by
     * @return - text of the locator
     */
    public static String getText(WebDriver driver, By locator){
        return driver.findElement(locator).getText();
    }
    public static void enterText(WebDriver driver,By locator,String text){
        clear(driver,locator);
        driver.findElement(locator).sendKeys(text);
    }
    private static void clear(WebDriver driver,By locator){
        driver.findElement(locator).clear();
    }
    public static List<WebElement> getRadioButton(WebDriver driver,By locator){
        return driver.findElements(locator);
    }
    public static void sendKeys(WebDriver driver, By locator,String text,long time ){
        driver.findElement(locator).sendKeys(text);
    }
    public static  void scrollTOView(WebDriver driver,By locator){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement element=driver.findElement(locator);
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }
    public static void waitTillElementClickable(WebDriver driver,By locator,long duration){
        //checking dom 500 milli second
        wait=new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.elementToBeClickable(findElement(driver,locator)));
    }
    public static void waitTillElementVisible(WebDriver driver,By locator,long duration){
        //checking dom 500 milli second
        wait=new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.visibilityOf(findElement(driver,locator)));
    }
    public static void waitTillElementDisplayed(WebDriver driver,By locator,long duration){
        //checking dom 500 milli second
        // lambda function
        wait=new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(d->d.findElement(locator).isDisplayed());
    }
    private static WebElement findElement(WebDriver driver,By locator){
        return driver.findElement(locator);
    }
    public static void clcikJS(WebDriver driver,By locator){
        js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",findElement(driver,locator));
    }

    public static void fluentWait(WebDriver driver,By locator){
        wait = (WebDriverWait) new FluentWait<>(driver).
                withTimeout(Duration.ofSeconds(2)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(ElementNotInteractableException.class);

        wait.until(
                d -> {
                    findElement(d,locator).sendKeys("Displayed");
                    return true;
                });
    }

    public static void waitTillVisiblity(WebDriver driver, By locator,long duration){
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
    }
    public static void waitForPopupDisplay(WebDriver driver,long duration){
        wait=new WebDriverWait(driver,Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.alertIsPresent());
    }


}
