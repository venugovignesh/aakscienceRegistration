package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationFormPage extends BasePage {

    /**
     * Constructor for the RegistrationForm Page.
     * It also initialises the page elements and also calls the superclass constructor.
     * @param driver The WebDriver instance.
     */
    public RegistrationFormPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "first-name-input")
    private WebElement firstNameTextBox;
    @FindBy(id = "last-name-input")
    private WebElement lastNameTextBox;
    @FindBy(id = "username-input")
    private WebElement userNameTextBox;
    @FindBy(id = "country-input")
    private WebElement countryTextBox;
    @FindBy(id = "email-input")
    private WebElement emailTextBox;
    @FindBy(id = "password-input")
    private WebElement passwordTextBox;
    @FindBy(id = "confirm-password-input")
    private WebElement confirmPasswordTextBox;
    @FindBy(id = "has-agreed-gdpr-input")
    private WebElement gdprCheckBox;
    @FindBy(id = "has-agreed-terms-conditions-input")
    private WebElement termsAndConditionsCheckBox;
    @FindBy(xpath = "//button[text()='Register Account']" )
    private WebElement registerAccountButton;

    final String firstNameBy = "first-name-input";

    public boolean waitAndCheckFirstNameFieldIsDisplayed() {
       return isPresenceOfElementLocatedById(firstNameBy);
    }

    /**
     * Enters the First Name in the text field.
     * @param firstName First Name
     */
    public void enterFirstName(final String firstName) {
        firstNameTextBox.sendKeys(firstName);
    }

    /**
     * Enters the Last Name in the text Field.
     * @param lastName Last Name
     */
    public void enterLastName(final String lastName) {
        lastNameTextBox.sendKeys(lastName);
    }

    /**
     * Enters the UserName in the text Field.
     * @param userName User Name
     */
    public void enterUserName(final String userName) {
        userNameTextBox.sendKeys(userName);
    }

    /**
     * Enters Country Name in the text field.
     * @param countryName Country Name
     */
    public void enterCountryInfo(final String countryName) {
        countryTextBox.sendKeys(countryName);
    }

    /**
     * Enters Email Id in the text field.
     * @param emailId Email ID
     */
    public void enterEmailId(final String emailId) {
        emailTextBox.sendKeys(emailId);
    }

    /**
     * Enters the Password in the text field.
     * @param password Password
     */
    public void enterPassword(final String password) {
        passwordTextBox.sendKeys(password);
    }

    /**
     * Enters the Confirm Password in the text field.
     * @param confirmPassword Confirm Password
     */
    public void enterConfirmPassword(final String confirmPassword) {
        confirmPasswordTextBox.sendKeys(confirmPassword);
    }

    /**
     * Clicks the GDPR check box.
     */
    public void clickGdprCheckBox() {
        gdprCheckBox.click();
    }

    /**
     * Checks whether the GDPR check box is selected.
     * @return boolean
     */
    public boolean isGdprChecked() {
       return gdprCheckBox.isSelected();
    }

    /**
     * Clicks Terms and Conditions Check box.
     */
    public void clickTermsAndConditionCheckBox() {
        termsAndConditionsCheckBox.click();
    }

    /**
     * Checks whether the Terms and Conditions check box is selected.
     * @return boolean
     */
    public boolean isTermsAndConditionsChecked() {
        return termsAndConditionsCheckBox.isSelected();
    }

    /**
     * Clicks Register Account button.
     */
    public void clickRegisterAccount() {
        registerAccountButton.click();
    }
}
