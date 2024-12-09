package StepDefiniation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P01_login;


public class D01_loginStepDef {
    P01_login login = new P01_login();

    @When("user open login page")
    public void openLoginPage() {
        login.clickOnAccountInHeader();
        login.openLoginPage();
    }

    @And("user adds valid Email")
    public void email() {
        login.addEmail("mohammed.nabil4004@gmail.com");
    }

    @And("user adds valid password")
    public void password() {
        login.addPassword("123456Mm");
    }

    @And("user clicks on login button")
    public void login_button() {
        login.clickOnLoginButton();

    }

    @Then("user login to the system successfully")
    public void login_successfully() {
        login.login_success("Welcome, Mohamed Goda! ");
    }


    @When("user opens login page")
    public void open_login_page() {
        login.clickOnAccountInHeader();
        login.openLoginPage();
    }

    @And("user adds invalid Email")
    public void addEmail() {
        login.addEmail("mohammed.nabil4004@gmail.com");
    }

    @And("user adds invalid password")
    public void addPassword() {
        login.addPassword("123456");
    }

    @And("user clicks login button")
    public void loginButton() {
        login.clickOnLoginButton();

    }

    @Then("user can't login using invalid credentials")
    public void failLogin() {
        login.login_failed("Invalid login or password.");
    }
}
