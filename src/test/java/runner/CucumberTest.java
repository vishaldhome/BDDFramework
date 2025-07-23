package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;





@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",       // Path to your .feature files
        glue = "stepDefinition",                       // Package containing step definitions
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // Reporting plugins
        monochrome = true,
        tags = "@smoke"// Better console outpu// Filter by tag if needed
)
public class CucumberTest {

}
