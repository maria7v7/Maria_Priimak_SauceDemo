package saucedemo.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{
    @FindBy(id = "remove-sauce-labs-bike-light")
    public WebElement removeBtn;

    @FindBy(id = "continue-shopping")
    public WebElement continueShopBtn;

    @FindBy(id = "checkout")
    public WebElement checkOutBtn;
}
