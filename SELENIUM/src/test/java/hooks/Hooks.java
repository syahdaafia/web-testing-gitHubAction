package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    private static WebDriver driver;
    private static final String BASE_URL = "https://www.saucedemo.com/";

    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @After
    public void tearDown (){
        if (driver != null){
            driver.quit();
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
