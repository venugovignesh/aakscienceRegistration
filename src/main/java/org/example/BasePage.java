package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;

    /**
     * Constructor for the BasePage.
     * @param driver The WebDriver instance
     */
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Common Method for WebDriverWait.
     * @return WebDriverWait
     */
    protected WebDriverWait elementWait() {
        return new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    /**
     * Method to check whether the presence of Element is located by Id.
     * @param element String
     * @return boolean
     */
    protected boolean isPresenceOfElementLocatedById(final String element){
       return elementWait().until(ExpectedConditions.presenceOfElementLocated(By.id(element))).isDisplayed();
    }

    /**
     * Method to check whether the presence of Element is located by xpath.
     * @param element String
     * @return boolean
     */
    protected boolean isPresenceOfElementLocatedByXpath(final String element){
        return elementWait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(element))).isDisplayed();
    }

    /**
     * Method to check whether the element is visible and located.
     * @param element WebElement
     * @return boolean
     */
    protected boolean isVisibilityOfElementLocated(WebElement element){
        return elementWait().until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }
}
