package saucedemo.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement sortContainer;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    public WebElement addBikeLight;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addBackPack;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    public WebElement addOnesie;

    @FindBy(className = "shopping_cart_link")
    public  WebElement shoppingCartBtn;
}
