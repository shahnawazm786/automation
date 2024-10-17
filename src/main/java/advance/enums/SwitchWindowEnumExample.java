package advance.enums;

import org.apache.commons.io.build.AbstractOrigin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collection;
import java.util.Set;

public class SwitchWindowEnumExample {
    public static void main(String[] args) {
        System.out.println(EWindows.valueOf("Main"));
        System.out.println(EWindows.valueOf("First").ordinal());
        try {
            System.out.println(EWindows.valueOf("Last").ordinal());
        }catch (IllegalArgumentException ile){
            System.out.println(EWindows.valueOf("Main").ordinal());
        }
        WebDriver driver=new ChromeDriver(new ChromeOptions());
        Set<String> windonws = driver.getWindowHandles();
    }
}

