package StepDefiniation;

import com.shaft.driver.SHAFT;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P01_Register;

public class D01_RegisterStepDef {
    P01_Register register = new P01_Register(Hooks.driver);
    SHAFT.TestData.JSON testData = new SHAFT.TestData.JSON("TestData.json");

    @When("user opens register page")
    public void openRegisterPage() {
        register.clickOnAccountInHeader();
        register.openRegisterPage();
    }

    @And("user fills registration form with {string}, {string}, {string}, {string}")
    public void fillRegistrationForm(String firstName, String lastName, String email, String password) {
        register.addFirstName(testData.getTestData(firstName));
        register.addLastName(testData.getTestData(lastName));
        register.addEmail(testData.getTestData(email));
        register.addPassword(testData.getTestData(password));
        register.confirmPassword(testData.getTestData(password));
    }




    @And("user clicks on register button")
    public void clickRegisterButton() {
        register.clickOnRegisterButton();
    }

    @Then("system registers the user successfully")
    public void successfulRegistration() {
        register.successRegister(testData.getTestData("successfulRegisterMsg"));
    }

    @Then("system shows an error message for already registered email")
    public void registrationFailsDueToDuplicateEmail() {
        register.failRegister(testData.getTestData("alreadyRegisterMsg"));
    }
}
