package org.syahdaafia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    private final By usernamefield = By.id("user-name");
    private final By passwordfield = By.id("password");
    private final By loginbutton = By.id("login-button");
    private final By errorMessage =  By.xpath("//h3[@data-test='error']");

    public void enterUsername(String username){
        driver.findElement(usernamefield).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passwordfield).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginbutton).click();
    }

    public String getErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }
}
