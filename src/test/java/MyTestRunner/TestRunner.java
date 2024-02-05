package MyTestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\Feature\\Hooks.feature", //the path of the feature files
        glue = {"StepDefinitions"}, // the path of the step definitions
        format = {"pretty", "html:test-outout", "json:report_json/cucumber.json", "junit:report_xml/cucumber.xml"},
        dryRun = false,
        monochrome = true,
        strict = true
        //tags = {"@SmokeTest"}
)

public class TestRunner {
}
