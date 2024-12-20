package pages;


import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;


public class P01_Register {
    //Declaration
    public SHAFT.GUI.WebDriver driver;

    // Constructor
    public P01_Register(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    By account = By.xpath("//*[@id='header']/div/div[2]/div/a");
    By registerPage = By.linkText("Register");
    By firstNameField = By.id("firstname");
    By lastNameField = By.id("lastname");
    By emailField = By.id("email_address");
    By passwordField = By.id("password");
    By confirmPassword = By.id("confirmation");
    By registerButton = By.xpath("//*[@id='form-validate']/div[2]/button");
    By welcome_message = By.xpath("//li[@class='success-msg']");
    By alreadyRegisterEmail=By.xpath("//li[@class='error-msg']");
    public void clickOnAccountInHeader() {
        driver.element().click(account);
    }

    public void openRegisterPage() {
        driver.element().click(registerPage);
    }

    public void addFirstName(String firstName) {
        driver.element().type(firstNameField, firstName);
    }

    public void addLastName(String lastName) {
        driver.element().type(lastNameField, lastName);
    }

    public void addEmail(String email) {
        driver.element().type(emailField, email);
    }

    public void addPassword(String password) {
        driver.element().type(passwordField, password);
    }

    public void confirmPassword(String confirm) {
        driver.element().type(confirmPassword, confirm);
    }

    public void clickOnRegisterButton() {
        driver.element().click(registerButton);
    }


    //assertion
    public void successRegister(String welcomeMessage) {
       driver.element().assertThat(welcome_message).text().contains(welcomeMessage);    }

public void failRegister(String failRegisterMsg){
    driver.element().assertThat(alreadyRegisterEmail).text().contains(failRegisterMsg);
}

}
