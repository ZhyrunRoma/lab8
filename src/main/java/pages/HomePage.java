package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    private static final String LOGIN_URL = "https://github.com/login";
    @FindBy(xpath = "//a[contains(text(),'Sign in')]" )
    private WebElement singUpButton ;
    @FindBy(xpath = "//a[@class = 'mr-lg-3 color-fg-inherit flex-order-2']" )
    private  WebElement logo ;
    @FindBy(xpath = "//a[contains(text(), 'Pricing')]" )
    private WebElement PricingMenu;

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public LoginPage clickOnsingUpButton()  {
        singUpButton.click();
        driver.navigate().to(LOGIN_URL);
        return new LoginPage(driver);
    }
    public boolean hasLogo(){
        implicitWait();
        return logo.isDisplayed();
    }
    public PricingPage selectPricingMenu(){
        PricingMenu.click();
        return new PricingPage(driver);
    }

}
