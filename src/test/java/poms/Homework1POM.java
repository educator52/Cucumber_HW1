package poms;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Homework1POM {

    public Homework1POM(WebDriver driver){

        PageFactory.initElements(driver, this);

    }

    @FindBy(css = ".login")
    public WebElement signInButton;

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(id = "passwd")
    public WebElement passwordBox;


    @FindBy(id = "SubmitLogin")
    public WebElement submitSignInButton;

    @FindBy(css = "[title=\"Information\"]")
    public WebElement myPersonalInformationButton;

    @FindBy(id = "old_passwd")
    public WebElement currentPasswordTextBox;

    @FindBy(css = "[name=\"submitIdentity\"]")
    public WebElement saveButton;

    @FindBy(id = "passwd")
    public WebElement newPasswordTextBox;

    @FindBy(id = "confirmation")
    public WebElement confirmPasswordTextBox;

    @FindBy(id = "firstname")
    public WebElement firstNameTextBox;

    @FindBy(css = ".header_user_info span")
    public WebElement userName;

}
