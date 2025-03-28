package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.syahdaafia.pages.InventoryPage;

public class InventorySteps {
    private final InventoryPage inventoryPage;

    public InventorySteps(){
        WebDriver driver = Hooks.getDriver();
        this.inventoryPage = new InventoryPage(driver);
    }

    @When("user menekan tombol add to cart pada satu produk")
    public void userMenekanTombolAddToCartPadaSatuProduk() {
        inventoryPage.clickAddCart1();
    }

    @And("user menekan tombol add to cart pada dua produk")
    public void userMenekanTombolAddToCartPadaDuaProduk() {
        inventoryPage.clickAddCart1();
        inventoryPage.clickAddCart2();
    }

    @Then("item pada cart bertambah 1")
    public void itemPadaCartBertambah1() {
        Assert.assertTrue(inventoryPage.cartBadgeCount().contains("1"));
    }

    @Then("item pada cart bertambah 2")
    public void itemPadaCartBertambah2() {
        Assert.assertTrue(inventoryPage.cartBadgeCount().contains("2"));
    }

    @And("user menekan tombol remove")
    public void userMenekanTombolRemove() {
        inventoryPage.removobutton();
    }

    @Then("item pada cart kosong")
    public void itemPadaCartKosong(){
        Assert.assertTrue(inventoryPage.cartBadgeCount().contains("0"));
    }


}
