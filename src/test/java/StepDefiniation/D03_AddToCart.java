package StepDefiniation;

import com.shaft.driver.SHAFT;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.P02_login;
import pages.P03_AddToCart;

public class D03_AddToCart {
    P02_login log = new P02_login(Hooks.driver);
    P03_AddToCart addToCart = new P03_AddToCart(Hooks.driver);
    SHAFT.TestData.JSON testData = new SHAFT.TestData.JSON("TestData.json");


    @When("user is logged in to tealium website")
    public void loginToTealium() {
        log.clickOnAccountInHeader();
        log.openLoginPage();
        log.addEmail(testData.getTestData("loginMail"));
        log.addPassword(testData.getTestData("loginPass"));
        addToCart = log.clickOnLoginButton();
    }

    @And("user hover on accessories category")
    public void hoverOnAccessoriesCategory() {
        addToCart.hoverOnAccessories();
    }

    @And("user select shoes subcategory")
    public void selectShoesSubcategory() {
        addToCart.clickOnShoes();
    }

    @And("user filter shoes by price")
    public void filterShoesByPrice() {
        addToCart.clickOnFilter();
        addToCart.selectPriceOption();
    }

    @And("user view the details for selected shoes")
    public void viewDetailsForSelectedShoes() {
        addToCart.viewDetailsFirstShoes();
    }

    @And("user select color and size")
    public void selectColorAndSize() {
        addToCart.selectColor();
        addToCart.selectSize();
    }

    @And("add the selected shoes to cart")
    public void addShoesToCart() {
        addToCart.addShoesToCart();
    }
}
