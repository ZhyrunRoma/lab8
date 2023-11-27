package tests;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class BaseTest {
    WebDriver driver;
    private static final String OSCOMMERCE_URL = "https://github.com/";

    @BeforeTest
    public void createDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(OSCOMMERCE_URL);
    }

    @AfterTest
   public void closeDriver(){
        driver.quit();
    }
}

