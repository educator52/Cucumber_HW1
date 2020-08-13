package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions( features = {"src\\test\\java\\featureFiles\\homework_1.feature"}, glue = {"steps"})
public class Homework1Runner extends AbstractTestNGCucumberTests {
}
