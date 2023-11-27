package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PricingPage;
import pages.HomePage;

import java.time.Duration;
public class PricingTest extends BaseTest {
    private static final String COMPARE_FEATURE_PAGE_URL = "https://github.com/pricing#compare-features";
    @Test
    public void checkPricingTest(){
        String compareFeaturePage = new HomePage(driver)
                .selectPricingMenu()
                .selectCompareLink()
                .isCompareFeaturePage();
        Assert.assertTrue(compareFeaturePage.equals(COMPARE_FEATURE_PAGE_URL));
    }
}

