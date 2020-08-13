package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import poms.Homework1POM;
import utils.BaseDriver;

public class Homework1Steps extends BaseDriver {


    private Homework1POM pom = new Homework1POM(driver);


    @Given("^I navigate to \"([^\"]*)\"$")
    public void i_navigate_to(String URL) {
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @Then("^I try to login in by email and password\\.$")
    public void i_try_to_login_in_by_email_and_password() {

        // Click on sign in button
        pom.signInButton.click();

        // Enter the email address
        pom.emailBox.sendKeys(email);

        // Enter the password
        pom.passwordBox.sendKeys(password);

        // Click on Sign in button
        pom.submitSignInButton.click();

    }

    @When("^I click on the My personal information.$")
    public void iClickOnTheMyPersonalInformation() {
        pom.myPersonalInformationButton.click();
    }

    @Then("^I try to change password.$")
    public void enterTheCurrentPassword() {
        pom.currentPasswordTextBox.sendKeys(password);
        pom.newPasswordTextBox.sendKeys(password);
        pom.confirmPasswordTextBox.sendKeys(password);
        pom.saveButton.click();
    }

    @And("^I successfuly changed the password\\.$")
    public void iSuccessfulyChangedThePassword() {
        driver.navigate().back();
        String fistName = pom.firstNameTextBox.getAttribute("value");
        driver.navigate().forward();
        String userName = pom.userName.getText();

        Assert.assertTrue(userName.contains(fistName));

        driver.quit();
    }

}
