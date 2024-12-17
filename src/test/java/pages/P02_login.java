package pages;

import StepDefiniation.Hooks;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;


public class P02_login {
    // Declaration for the driver
    public SHAFT.GUI.WebDriver driver;

    // Constructor
    public P02_login(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By account = By.xpath("//*[@id='header']/div/div[2]/div/a");
    By loginPage = By.linkText("Log In");
    By passwordField = By.id("pass");
    By emailField = By.id("email");
    By rememberMe = By.id("remember_meRAKnadBmqB");
    By loginButton = By.id("send2");
    By welcomeMessageLoc = By.xpath("//p[@class='welcome-msg']");
    By errorMessageLoc = By.xpath("//li[@class='error-msg']");

    //Actions
    public void clickOnAccountInHeader() {
        Hooks.driver.element().click(account);
    }

    public void openLoginPage() {
        Hooks.driver.element().click(loginPage);
    }

    public void addEmail(String email) {
        Hooks.driver.element().type(emailField, email);
    }

    public void addPassword(String password) {
        Hooks.driver.element().type(passwordField, password);
    }

    public void RememberMe() {
        Hooks.driver.element().click(rememberMe);
    }

    public P03_AddToCart clickOnLoginButton() {
        Hooks.driver.element().click(loginButton);
        return new P03_AddToCart(Hooks.driver);
    }


    //assertion
    public void login_success(String welcomeMessage) {
        Hooks.driver.element().assertThat(welcomeMessageLoc).text().contains(welcomeMessage);
    }

    public void login_failed(String errorMessage) {
        Hooks.driver.element().assertThat(errorMessageLoc).text().contains(errorMessage);    }


}
