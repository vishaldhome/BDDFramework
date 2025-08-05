package stepDefinition;

import Pages.LoginPage;
import Pages.UniversalSearchPage;
import Reusable.Base;
import Reusable.TestContext;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class DashboardStepDef extends Base {


    WebDriver driver;
    UniversalSearchPage usp;
    SoftAssert s;

    public DashboardStepDef (TestContext context){
        driver=context.getWebdriver();
        usp = new UniversalSearchPage(driver);
         s = new SoftAssert();
    }

    @Given("User is on main page")
    public void validateDashboard(){
     WaitforVisibilityofEle(usp.searchtxt, driver);
    }

    @And("User validate search fields on the page")
    public void userValidateSearchFieldsOnThePage() {
        String txt = usp.searchtxt.getText().trim();
        s.assertEquals(txt, "Search");
        System.out.println("Before assert");
        System.out.println("New Line added");
      //  Assert.assertEquals(1,4);
    }

    @And("Complete assert")
    public void completeAssert() {
        s.assertAll();
    }
}
