package web.pageobjectsfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by user on 8/18/16.
 */
public class LoginPageObject {

    private By usernameLocator = By.id("login-email");
    private By passwordLocator = By.id("login-password");
    private By submitLocator = By.name("submit");

    private String loginEmail = "";
    private String loginPassword = "";

    private final WebDriver driver;

    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
        driver.navigate().to("https://www.linkedin.com/");
    }

//    WebDriver driver = new FirefoxDriver();

    public void waitForPageLoad() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-password")));
    }

    public LoginPageObject insertEmail(String loginEmail) {
        driver.findElement(usernameLocator).sendKeys(loginEmail);
        return this;
    }

    public LoginPageObject insertPassword(String loginPassword) {
        driver.findElement(passwordLocator).sendKeys(loginPassword);
        return this;
    }

    public LoginPageObject submitLogin() {
        driver.findElement(submitLocator).submit();
        return this;
    }
}
