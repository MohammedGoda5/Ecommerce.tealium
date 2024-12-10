package StepDefiniation;

import com.shaft.driver.SHAFT;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P02_login;


public class D02_loginStepDef {
    P02_login login = new P02_login();
    SHAFT.TestData.JSON testData=new SHAFT.TestData.JSON("TestData.json");
    @When("user open login page")
    public void openLoginPage() {
        login.clickOnAccountInHeader();
        login.openLoginPage();
    }

    @And("user adds valid Email")
    public void email() {
        login.addEmail(testData.getTestData("loginMail"));
    }

    @And("user adds valid password")
    public void password() {
        login.addPassword(testData.getTestData("loginPass"));
    }

    @And("user clicks on login button")
    public void login_button() {
        login.clickOnLoginButton();

    }

    @Then("user login to the system successfully")
    public void login_successfully() {
        login.login_success(testData.getTestData("successfulLoginMsg"));
    }


    @When("user opens login page")
    public void open_login_page() {
        login.clickOnAccountInHeader();
        login.openLoginPage();
    }

    @And("user adds invalid Email")
    public void addEmail() {
        login.addEmail(testData.getTestData("invalidMail"));
    }

    @And("user adds invalid password")
    public void addPassword() {
        login.addPassword(testData.getTestData("invalidPassword"));
    }

    @And("user clicks login button")
    public void loginButton() {
        login.clickOnLoginButton();

    }

    @Then("user can't login using invalid credentials")
    public void failLogin() {
        login.login_failed(testData.getTestData("failLoginMsg"));
    }
}
