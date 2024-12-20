package pages;



import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P03_AddToCart {
    // Declaration for the driver
    public SHAFT.GUI.WebDriver driver;


    /*             Locators                      */
    By accessoriesCategory = By.xpath("//*[@id='nav']/ol/li[3]/a");
    By shoesSubcategory = By.linkText("Shoes");
    By filterLoc = By.xpath("//*[@id='top']/body/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/select");
    By priceFilter = By.xpath("//*[@id='top']/body/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/select/option[3]");
    By firstShoesLoc = By.xpath("//*[@id='top']/body/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/ul/li[1]/div/div[2]/a");
    By colorLoc = By.id("option17");
    By sizeLoc = By.id("option99");
    By checkoutPageLoc=By.xpath("//li[@class='success-msg']");
    public P03_AddToCart(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public void hoverOnAccessories() {
        driver.element().hover(accessoriesCategory);
    }

    public void clickOnShoes() {
        driver.element().click(shoesSubcategory);
    }

    public void clickOnFilter() {
        driver.element().click(filterLoc);
    }

    public void selectPriceOption() {
        driver.element().click(priceFilter);
    }

    public void viewDetailsFirstShoes() {
        driver.element().click(firstShoesLoc);
    }

    public void selectColor() {
        driver.element().click(colorLoc);
    }

    public void selectSize() {
        driver.element().click(sizeLoc);
    }

    public void addShoesToCart() {
        driver.element().click(By.xpath("//button[@onclick='productAddToCartForm.submit(this)']"));
    }

public void assertCheckoutPageAppears(String assertCheckoutPage){
        driver.element().assertThat(checkoutPageLoc).text().contains(assertCheckoutPage);
}

}
