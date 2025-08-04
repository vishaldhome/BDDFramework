package Reusable;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Base {

    public void launchBrowser(WebDriver driver){
        driver.get("https://adactinhotelapp.com/");
    }

    public void attachScreenshot(WebDriver driver, Scenario scenario){
        final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        System.out.println("printing scenario" +scenario.toString());
        scenario.attach(screenshot, "image/png", "screenshot");

    }

}
