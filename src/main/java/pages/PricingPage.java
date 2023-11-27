package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PricingPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(), 'Compare all features')]")
    private WebElement compareLink;
    public PricingPage(WebDriver driver) {
        super(driver);
    }

    public CompareFeaturesPage selectCompareLink(){
        waitForElementToAppear(compareLink);
        compareLink.click();
        return new CompareFeaturesPage(driver);
    }

}

