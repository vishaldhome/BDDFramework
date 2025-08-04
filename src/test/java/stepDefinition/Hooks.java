package stepDefinition;

import Reusable.Base;
import Reusable.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks extends Base {


    TestContext testContext;

    public Hooks(TestContext context){
        System.out.println("Hooks Created");
        testContext=context;
    }



    @Before
    public void beforeSetup(Scenario scenario){
        testContext.scenario=scenario;
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            attachScreenshot(testContext.getWebdriver(), scenario);
        }
System.out.println("Driver Quite....");
        testContext.getWebdriver().quit();
    }



}
