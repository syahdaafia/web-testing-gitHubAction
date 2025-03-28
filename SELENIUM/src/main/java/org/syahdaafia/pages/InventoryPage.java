package org.syahdaafia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    private final WebDriver driver;

    public InventoryPage(WebDriver driver){
        this.driver = driver;
    }

    private final By addtocartbutton1 = By.id("add-to-cart-sauce-labs-backpack");
    private final By addtocartbutton2 = By.id("add-to-cart-sauce-labs-bike-light");
    private final By removeButton = By.id("remove-sauce-labs-backpack");
    private final By cartbadge = By.xpath("//span[@data-test='shopping-cart-badge']");

    public void clickAddCart1(){
        driver.findElement(addtocartbutton1).click();
    }

    public void clickAddCart2(){
        driver.findElement(addtocartbutton2).click();
    }

    public void removobutton(){
        driver.findElement(removeButton).click();
    }

    public String cartBadgeCount() {
        try {
            return driver.findElement(cartbadge).getText();
        } catch (NoSuchElementException e) {
            return "0"; // J
        }
    }
}
