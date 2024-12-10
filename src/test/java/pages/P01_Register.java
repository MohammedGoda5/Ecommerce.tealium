package pages;

import StepDefiniation.Hooks;
import org.openqa.selenium.By;


public class P01_Register {
    public void clickOnAccountInHeader() {
        Hooks.driver.element().click(By.xpath("//*[@id=\'header\']/div/div[2]/div/a"));
    }

    public void openRegisterPage() {
        Hooks.driver.element().click(By.linkText("Register"));
    }

    public void addFirstName(String firstName) {
        Hooks.driver.element().type(By.id("firstname"),firstName);
    }

    public void addLastName(String lastName) {
        Hooks.driver.element().type(By.id("lastname"), lastName);
    }

    public void addEmail(String email){
        Hooks.driver.element().type(By.id("email_address"),email);
    }

    public void addPassword(String password) {
        Hooks.driver.element().type(By.id("password"),password);
    }
    public void confirmPassword(String confirm){
        Hooks.driver.element().type(By.id("confirmation"),confirm);
    }

    public void clickOnRegisterButton() {
        Hooks.driver.element().click(By.xpath("//*[@id=\'form-validate\']/div[2]/button"));
    }


    //assertion
    public void successRegister(String welcomeMessage) {
        Hooks.driver.element().getText(By.xpath("//li[@class='success-msg']")).equals(welcomeMessage);
    }



}
