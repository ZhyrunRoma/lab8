package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginAccountTest extends BaseTest{
  private static final String MESSAGE = "We just sent your authentication code";


  @Test
    public void loginAccountTest(){
      String actualMessage = new HomePage(driver)
              .clickOnsingUpButton()
              .writeUserNameField()
              .writeUserPasswordField()
              .selectButtonSingIn()
              .getActualMessage();
              Assert.assertTrue(actualMessage.contains(MESSAGE));
  }
}

