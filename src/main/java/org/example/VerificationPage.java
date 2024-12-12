package org.example;

import org.openqa.selenium.WebDriver;
public class VerificationPage extends BasePage{

    /**
     * Constructor for the BasePage.
     *
     * @param driver The WebDriver instance
     */
    public VerificationPage(WebDriver driver) {
        super(driver);
    }

    final String verifyEmailBy = "//div[text()='Please, verify your account on email.']";
    /**
     * It waits for the element presence and checks whether it is displayed.
     * @return boolean
     */
    public boolean waitAndCheckVerifyEmailContextIsDisplayed() {
        return isPresenceOfElementLocatedByXpath(verifyEmailBy);
    }
}
