package web;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by user on 7/29/16.
 */
public class LogInTest {

    @Test
    public void startWebDriver() {

        WebDriver driver = new FirefoxDriver();

        /**
         * Log into LINKEDIN
         */
        driver.navigate().to("https://www.linkedin.com/");

        String loginEmail = "";
        String loginPassword = "";

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-password")));

        driver.findElement(By.id("login-email")).sendKeys(loginEmail);
        driver.findElement(By.id("login-password")).sendKeys(loginPassword);

        WebElement singIn = driver.findElement(By.name("submit"));
        singIn.click();

        driver.close();
    }

}
