package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginSuccessPage extends BasePage{
  private  WebElement actualMessage = driver.findElement(By.xpath("//p[contains(text(), 'We just sent your authentication code')]"));

        public LoginSuccessPage(WebDriver driver) {
            super(driver);
        }
        public String getActualMessage(){
            //waitForElementToAppear(actualMessage);
            return actualMessage.getText();
        }

    }


