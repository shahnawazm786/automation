package selenium.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CommonMethod {
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
}
