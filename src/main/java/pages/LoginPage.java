package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    private static final String USER_LOGIN = "Rostyk232003";
    private static final String USER_PASSWORD = "Vk232003";

    @FindBy(xpath = "//input[@id = 'login_field']")
    private WebElement UserNameField;
    @FindBy(xpath = "//input[@id = 'password']")
    private WebElement PasswordField;
    @FindBy(xpath = "//input[@name = 'commit']")
    private WebElement ButtonSingIn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public LoginPage writeUserNameField(){
        UserNameField.sendKeys(USER_LOGIN);
        return this;
    }
    public LoginPage writeUserPasswordField(){
        PasswordField.sendKeys(USER_PASSWORD);
        return this;
    }
    public LoginSuccessPage selectButtonSingIn(){
        ButtonSingIn.click();
        return new LoginSuccessPage(driver);
    }
}
