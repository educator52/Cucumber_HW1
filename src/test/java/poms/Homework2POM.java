package poms;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Homework2POM extends Homework1POM{

    public Homework2POM(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#add_to_cart button")
    public WebElement addToCardButton;

    @FindBy(css = "[title=\"Proceed to checkout\"] span")
    public WebElement proceedToCheckoutButton_1;

    @FindBy(css = "p a[title=\"Proceed to checkout\"]")
    public WebElement proceedToCheckoutButton_2;

    @FindBy(css = "[name=\"processAddress\"]")
    public WebElement proceedToCheckoutButton_3;

    @FindBy(css = "[name=\"processCarrier\"]")
    public WebElement proceedToCheckoutButton_4;

    @FindBy(id = "total_product")
    public WebElement totalProductsTextBox;

    @FindBy(id = "total_shipping")
    public WebElement totalShippingTextBox;

    @FindBy(id = "total_price_without_tax")
    public WebElement totalWithoutTaxTextBox;

    @FindBy(id = "cgv")
    public WebElement iAgreeCheckBox;

    @FindBy(className = "bankwire")
    public WebElement payByBankWireButton;

    @FindBy(css = "#cart_navigation button")
    public WebElement confirmOrderButton;

    @FindBy(css = ".cheque-indent strong")
    public WebElement orderConfirmationText;

    @FindBy(id = "firstname")
    public WebElement firstnameTextBox;

    @FindBy(id = "lastname")
    public WebElement lastnameTextBox;

    @FindBy(id = "address1")
    public WebElement address1TextBox;

    @FindBy(id = "city")
    public WebElement cityTextBox;

    @FindBy(id = "id_state")
    public WebElement stateDropDown;

    @FindBy(id = "postcode")
    public WebElement postcodeTextBox;

    @FindBy(id = "phone")
    public WebElement phoneTextBox;

    @FindBy(id = "submitAddress")
    public WebElement submitAddressButton;

    @FindBy(css = "#block_top_menu > ul > li:nth-child(2)")
    public WebElement dressesButton;

    @FindBy(css = "[itemprop=\"name\"] a")
    public List<WebElement> itemsInDresses;

    @FindBy(css = "[itemprop=\"name\"]")
    public List<WebElement> productNames;

}
