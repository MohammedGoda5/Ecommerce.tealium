package pages;

import StepDefiniation.Hooks;
import org.openqa.selenium.By;


public class P01_login {
    public void clickOnAccountInHeader() {
        Hooks.driver.element().click(By.xpath("//a[@class='skip-link skip-account']"));
    }

    public void openLoginPage() {
        Hooks.driver.element().click(By.linkText("Log In"));
    }

    public void addEmail(String email) {
        Hooks.driver.element().type(By.id("email"), email);
    }

    public void addPassword(String password) {
        Hooks.driver.element().type(By.id("pass"), password);
    }

    public void RememberMe() {
        Hooks.driver.element().click(By.id("remember_meamMt29NQsm"));
    }

    public void clickOnLoginButton() {
        Hooks.driver.element().click(By.id("send2"));
    }


    //assertion
    public void login_success(String welcomeMessage) {
        Hooks.driver.element().getText(By.xpath("//p[@class='welcome-msg']")).equals(welcomeMessage);
    }

    public void login_failed(String errorMessage) {
        Hooks.driver.element().getText(By.xpath("//li[@class='error-msg']")).equals(errorMessage);
    }


}
