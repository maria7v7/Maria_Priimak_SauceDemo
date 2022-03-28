package saucedemo.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage{
    @FindBy(id = "first-name")
    public WebElement firstNameField;

    @FindBy(id = "last-name")
    public WebElement lastNameField;

    @FindBy(id = "postal-code")
    public WebElement zipCodeField;

    @FindBy(id = "continue")
    public WebElement continueBtnCheckOut;

    @FindBy(id = "finish")
    public WebElement finishCheckOut;

    @FindBy(className = "complete-header")
    public WebElement message;
}
