package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage{

    /**
     * Constructor for the SingUp Page.
     * It also initialises the page elements and also calls the superclass constructor.
     * @param driver The WebDriver instance.
     */
    public SignUpPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "researcher-id")
    private WebElement researcherOption;
    @FindBy(id = "institution-id")
    private WebElement institutionOption;
    @FindBy(id = "investor-id")
    private WebElement ventureOption;
    @FindBy(id = "service-providers-id")
    private WebElement serviceProviderOption;
    @FindBy(xpath = "//a[text()='Sign In']")
    private WebElement signIn;

    /**
     * It waits for the element presence and checks whether it is displayed.
     * @return boolean
     */
    public boolean waitAndCheckResearchOptionIsDisplayed() {
       return isVisibilityOfElementLocated(researcherOption);
    }

    /**
     * Clicks the Researcher Option.
     */
    public void clickResearcherOption() {
        researcherOption.click();
    }

}