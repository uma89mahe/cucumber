package cucumberTwo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Requirements", glue = "stepDefinitions", dryRun = false ,
format = {"pretty", "html:TestResults/report/cucumber"},tags = {"@RegressionTest"}, monochrome = true)

public class TestRunner {

}
