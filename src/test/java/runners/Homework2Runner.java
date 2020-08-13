package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions( features = {"src\\test\\java\\featureFiles\\homework_2.feature"}, glue = {"steps"})
public class Homework2Runner extends AbstractTestNGCucumberTests {
}
