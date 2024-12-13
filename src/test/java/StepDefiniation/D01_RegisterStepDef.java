package StepDefiniation;

import com.shaft.driver.SHAFT;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P01_Register;


public class D01_RegisterStepDef {
    P01_Register register = new P01_Register(Hooks.driver);
    SHAFT.TestData.JSON testData = new SHAFT.TestData.JSON("TestData.json");

    @When("user open register page")
    public void openLoginPage() {
        register.clickOnAccountInHeader();
        register.openRegisterPage();
    }

    @And("user add valid first name")
    public void addFirstName() {
        register.addFirstName(testData.getTestData("validFirstName"));

    }

    @And("user add valid last name")
    public void addLastName() {
        register.addLastName(testData.getTestData("validLastName"));
    }

    @And("user add valid email")
    public void addValidEmailAddress() {
        register.addEmail(testData.getTestData("register-2"));
    }

    @And("user add password")
    public void addPassword() {
        register.addPassword(testData.getTestData("validPassword"));
    }

    @And("user confirm the password")
    public void confirmTheAddedPass() {
        register.confirmPassword(testData.getTestData("validPassword"));
    }

    @And("user clicks on register button")
    public void register_button() {
        register.clickOnRegisterButton();

    }

    @Then("user register to the system successfully")
    public void successfulRegister() {
        register.successRegister(testData.getTestData("successfulRegisterMsg"));
    }


}


