package pages;

import StepDefiniation.Hooks;

import org.openqa.selenium.By;

public class P03_AddToCart {
    public void hoverOnAccessories(){
        Hooks.driver.element().hover(By.linkText("Accessories"));
    }
    public void clickOnShoes(){
        Hooks.driver.element().click(By.linkText("Shoes"));
    }
    public void clickOnFilter(){
        Hooks.driver.element().click(By.xpath("//*[@id='top']/body/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/select"));
    }
    public void selectPriceOption(){
        Hooks.driver.element().click(By.xpath("//*[@id='top']/body/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/select/option[3]"));
    }
    public void viewDetailsFirstShoes(){
        Hooks.driver.element().click(By.xpath("//*[@id='top']/body/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/ul/li[1]/div/div[2]/a"));
    }
    public void selectColor(){
        Hooks.driver.element().click(By.id("option27"));
    }
    public void selectSize(){
        Hooks.driver.element().click(By.id("option99"));
    }
    public void addShoesToCart(){
        Hooks.driver.element().click(By.xpath("//button[@onclick='productAddToCartForm.submit(this)']"));
    }


}
