package saucedemo.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "user-name")
    public WebElement usernameFiled;

    @FindBy(id = "password")
    public WebElement passwordFiled;

    @FindBy(id ="login-button")
    public WebElement signInBtn;

}
