package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;


import java.time.Duration;

public class CheckLogoTest extends BaseTest {
    @Test
        public void checkThatSiteHasLogo(){
            Assert.assertTrue(new HomePage(driver).hasLogo());
        }
    }
