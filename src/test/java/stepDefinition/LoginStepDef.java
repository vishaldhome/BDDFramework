package stepDefinition;

import Pages.LoginPage;
import Reusable.Base;
import Reusable.ConfigReader;
import Reusable.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebDriver;

public class LoginStepDef extends Base {

    WebDriver driver;
    LoginPage loginpage;
    ConfigReader configReader;

    public LoginStepDef (TestContext context){
        driver=context.getWebdriver();
        loginpage = new LoginPage(driver);
        configReader = new ConfigReader();

    }

    @Given("User is on login page")
    public void userIsOnLoginPage() throws InterruptedException {
        //  driver.get("https://adactinhotelapp.com/");
        driver.get(configReader.getProperty("url"));
          Thread.sleep(2000);
    }

    @And("User enter username")
    public void enterUsername(){

        loginpage.username.sendKeys(configReader.getProperty("username"));


    }

    @And("User enter password")
    public void enterPass() {
        loginpage.password.sendKeys(configReader.getProperty("password"));
    }

    @Then("User should redirect to postlogin dashboard")
    public void userShouldRedirectToPostloginDashboard() {
        String msg =driver.getTitle();
        System.out.println(msg);

    }

    @And("User clicked on login button")
    public void userClickedOnLoginButton() throws InterruptedException {
        loginpage.loginBtn.click();
        SoftAssert s = new SoftAssert();
       // s.assertEquals("Yes","No");
      //  s.assertAll();
        Thread.sleep(3000);

    }
}
