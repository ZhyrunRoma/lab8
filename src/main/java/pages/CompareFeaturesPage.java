package pages;

import org.openqa.selenium.WebDriver;

public class CompareFeaturesPage extends BasePage{
    public CompareFeaturesPage(WebDriver driver) {
        super(driver);
    }
    public String isCompareFeaturePage(){
        return driver.getCurrentUrl();
    }


}