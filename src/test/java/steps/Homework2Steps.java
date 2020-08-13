package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import poms.Homework1POM;
import poms.Homework2POM;
import utils.BaseDriver;

public class Homework2Steps extends BaseDriver {

    Homework2POM pom = new Homework2POM(driver);

    @When("^I click on the Dresses button\\.$")
    public void i_click_on_the_Dresses_button() {
        // Click on dresses
        waitAndClick(pom.dressesButton);
    }


    @And("^I added an item to card\\.$")
    public void iAddedAnItemToCard() {

        // Click on the any item from the page
        pom.itemsInDresses.get(0).click();
        String selectedProductName = pom.productNames.get(0).getText();

        // Click on the add to cart
        waitAndClick(pom.addToCardButton);
        //wait loader
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".disabled")));
        // Click on the proceed to checkout button
        waitAndClick(pom.proceedToCheckoutButton_1);
    }

    @Then("^I checked Total products \\+ Total shipping = Total\\.$")
    public void iCheckedTotalProductsTotalShippingTotal() {
        double totalProduct = Double.parseDouble(pom.totalProductsTextBox.getText().replaceAll("[^\\d.]", ""));
        double totalShipping = Double.parseDouble(pom.totalShippingTextBox.getText().replaceAll("[^\\d.]", ""));
        double total = Double.parseDouble(pom.totalWithoutTaxTextBox.getText().replaceAll("[^\\d.]", ""));
        System.out.println(total);
        Assert.assertEquals(total,totalProduct+totalShipping);

    }

    @And("^I click Proceed to Checkout button$")
    public void iClickProceedToCheckoutButton() {
        pom.proceedToCheckoutButton_2.click();
    }

    @Then("^I generate the shipping address if I didn't before than Click on the proceed to checkout button\\.$")
    public void iGenerateTheShippingAddressIfIDidnTBefore() {
        try{
            clearTextBoxAndSendKeys(pom.firstnameTextBox, "Group");
            clearTextBoxAndSendKeys(pom.lastnameTextBox, "Two");
            clearTextBoxAndSendKeys(pom.address1TextBox, "Bahnhofstr. 30");
            clearTextBoxAndSendKeys(pom.cityTextBox, "Weissenthurm");
            Select categories = new Select(pom.stateDropDown);
            categories.selectByIndex(random.nextInt(categories.getOptions().size()));
            clearTextBoxAndSendKeys(pom.postcodeTextBox,"12345");
            clearTextBoxAndSendKeys(pom.phoneTextBox,"1234567890");

            // Click on save button
            pom.submitAddressButton.click();

            //Click on the proceed to checkout button
            pom.proceedToCheckoutButton_3.click();

        } catch (Exception e){
            //Click on the proceed to checkout button
            pom.proceedToCheckoutButton_3.click();
        }
    }

    @And("^I click on the -I agree\\.\\.\\.\\.- and the proceed to checkout button\\.$")
    public void iClickOnTheIAgreeAndTheProceedToCheckoutButton() {
        pom.iAgreeCheckBox.click();
        pom.proceedToCheckoutButton_4.click();

    }

    @Then("^I click on the Pay by bank wire\\.$")
    public void iClickOnThePayByBankWire() {
        waitAndClick(pom.payByBankWireButton);
    }

    @And("^I click on the I confirm my order button\\.$")
    public void iClickOnTheIConfirmMyOrderButton() {
        waitAndClick(pom.confirmOrderButton);
    }


    @Then("^I successfully Order my product\\.$")
    public void iSuccessfulyOrderMyProduct() {
        String confirmationText = pom.orderConfirmationText.getText();

        Assert.assertEquals("Your order on My Store is complete.", confirmationText);

        driver.quit();

    }
}
