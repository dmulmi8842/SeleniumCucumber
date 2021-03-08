package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//Diwash PC//IdeaProjects//SeleniumCucumber//Features//OrangeHRM.feature",
        glue= "stepDefinitions"
)
public class TestRunner {
}
