package saucedemo.com.pages;

import org.openqa.selenium.support.PageFactory;
import saucedemo.com.utilities.Driver;

public class BasePage {
    public BasePage() { PageFactory.initElements(Driver.getDriver(),this);}
}
