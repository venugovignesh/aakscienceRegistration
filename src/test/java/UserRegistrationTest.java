import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserRegistrationTest extends BaseTest{

    @Test (dataProvider = "formDetails", description = "To validate the user registration")
    public void userSignUp(final String firstName,
                           final String lastName, final String userName,
                           final String country, final String emailId,
                           final String password, final String confirmPassword){
        Assert.assertTrue(getSignUpPage().waitAndCheckResearchOptionIsDisplayed(),
                "Research option does not displayed.");
        getSignUpPage().clickResearcherOption();
        Assert.assertTrue(getRegistrationFormPage().waitAndCheckFirstNameFieldIsDisplayed(),
                "First Name does not displayed.");
        getRegistrationFormPage().enterFirstName(firstName);
        getRegistrationFormPage().enterLastName(lastName);
        getRegistrationFormPage().enterUserName(userName);
        getRegistrationFormPage().enterCountryInfo(country);
        getRegistrationFormPage().enterEmailId(emailId);
        getRegistrationFormPage().enterPassword(password);
        getRegistrationFormPage().enterConfirmPassword(confirmPassword);
        getRegistrationFormPage().clickGdprCheckBox();
        Assert.assertTrue(getRegistrationFormPage().isGdprChecked(), "GDPR checkbox is not selected.");
        getRegistrationFormPage().clickTermsAndConditionCheckBox();
        Assert.assertTrue(getRegistrationFormPage().isTermsAndConditionsChecked(),
                "Terms and Conditions Checkbox is not selected.");
        getRegistrationFormPage().clickRegisterAccount();
        Assert.assertTrue(getVerificationPage().waitAndCheckVerifyEmailContextIsDisplayed(),
                "Account creation failed.");
    }

    /**
     * Provides data
     * @return Array of Objects
     */
    @DataProvider(name = "formDetails")
    public Object[][] formData(){
        return  new Object[][]{
                { "Vignesh" , "Venu", "vignesh" + generateRandomValue(), "India", "test" + generateRandomValue() + "@gmail.com", "password123", "password123"}
        };
    }

    /**
     * Generate today date and time.
     * (The method is written to concat the value with email to generate unique email id).
     *
     * @return String
     */
    private String generateRandomValue() {
        LocalDateTime timeCheck = LocalDateTime.now();
        DateTimeFormatter todaysDate = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
        return todaysDate.format(timeCheck);
    }
}
