package Reusable;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Base {

    public void launchBrowser(WebDriver driver){
        driver.get("https://adactinhotelapp.com/");
    }

}
