package StepDefiniation;

import com.shaft.driver.SHAFT;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P02_login;


public class D02_loginStepDef {
    P02_login login = new P02_login(Hooks.driver);

    SHAFT.TestData.JSON testData = new SHAFT.TestData.JSON("TestData.json");

    @When("user open login page")
    public void openLoginPage() {
        login.clickOnAccountInHeader();
        login.openLoginPage();
    }

    @And("user fills login form with {string} , {string}")
    public void fillsLoginForm(String email, String password) {
        login.addEmail(testData.getTestData(email));
        login.addPassword(testData.getTestData(password));
    }


    @And("user clicks on login button")
    public void login_button() {
        login.clickOnLoginButton();

    }

    @Then("user login to the system successfully")
    public void login_successfully() {
        login.login_success(testData.getTestData("successfulLoginMsg"));
    }


    @Then("user can't login using invalid credentials")
    public void failLogin() {
        login.login_failed(testData.getTestData("failLoginMsg"));
    }
}
