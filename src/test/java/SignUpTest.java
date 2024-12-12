import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignUpTest extends BaseTest{

    @Test
    public void signUpUser(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("researcher-id")));
        driver.findElement(By.id("researcher-id")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("first-name-input")));
        driver.findElement(By.id("first-name-input")).sendKeys("Vignesh");
        driver.findElement(By.id("last-name-input")).sendKeys("Venu");
        driver.findElement(By.id("username-input")).sendKeys("vignesh12");
        driver.findElement(By.id("country-input")).sendKeys("India");
        driver.findElement(By.id("email-input")).sendKeys("testemail@gmail.com");
        driver.findElement(By.id("password-input")).sendKeys("Password123");
        driver.findElement(By.id("confirm-password-input")).sendKeys("Password123");
        driver.findElement(By.id("has-agreed-gdpr-input")).click();
        driver.findElement(By.id("has-agreed-terms-conditions-input")).click();
        driver.findElement(By.xpath("//button[text()='Register Account']")).click();
    }

}
