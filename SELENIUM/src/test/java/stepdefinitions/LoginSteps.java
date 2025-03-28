package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.syahdaafia.pages.LoginPage;

import java.util.Objects;

public class LoginSteps {
    private final WebDriver driver;
    private final LoginPage loginPage;

    public LoginSteps(){
        this.driver = Hooks.getDriver();
        this.loginPage = new LoginPage(driver);
    }

    @Given("user membuka halaman login")
    public void userMembukaHalamanLogin() {
        if (!Objects.requireNonNull(driver.getCurrentUrl()).contains("saucedemo.com")){
            throw new IllegalStateException("User tidak berada di halaman login");
        }
        System.out.println("User sudah berada di halaman login");
    }

    @When("user memasukkan {string} dan {string}")
    public void userMemasukkanDan(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("user menekkan tombol login")
    public void userMenekkanTombolLogin() {
        loginPage.clickLoginButton();
    }

    @Then("user mendapatkan {string}")
    public void userMendapatkan(String status) {
        if (status.equals("login success")){
            Assert.assertTrue(Objects.requireNonNull(driver.getCurrentUrl()).contains("inventory.html"));
        } else {
            Assert.assertTrue(loginPage.getErrorMessage().contains("Epic sadface"));
        }
    }
}
