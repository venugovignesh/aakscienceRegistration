import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.RegistrationFormPage;
import org.example.SignUpPage;
import org.example.VerificationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected WebDriver driver;

    /**
     * To set up Driver and browser.
     */
    @BeforeTest
    public void browserSetUp() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://dev.aakscience.com/sign-up");
            driver.manage().window().maximize();
        }
    }

    /**
     * SignUp Page.
     * @return Instance of SignUp page
     */
    public SignUpPage getSignUpPage() {
        return new SignUpPage(driver);
    }

    /**
     * Registration Page.
     * @return Instance of Registration page
     */
    public RegistrationFormPage getRegistrationFormPage() {
        return new RegistrationFormPage(driver);
    }

    /**
     * Verification Page.
     * @return Instance of Verification page
     */
    public VerificationPage getVerificationPage() {
        return new VerificationPage(driver);
    }

    /**
     * To tear down the browser and driver.
     */
    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
