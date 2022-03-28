package saucedemo.com.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import saucedemo.com.pages.ProductsPage;
import saucedemo.com.utilities.Driver;

import java.util.List;

public class AddItemsStepDef {
    ProductsPage productsPage = new ProductsPage();

    @Given("User adds an item to the cart")
    public void user_adds_an_item_to_the_cart() {
        productsPage.addBikeLight.click();
    }
    @Given("User adds on one more item to the cart")
    public void user_adds_on_one_more_item_to_the_cart() {
        productsPage.addBackPack.click();
    }
    @Then("Shopping Cart should show items count {int}")
    public void shopping_cart_should_show_items_count(Integer count) {
        productsPage.shoppingCartBtn.click();
        List<WebElement> actualCartItems = Driver.getDriver().findElements(By.className("inventory_item_name"));
        Integer itemCount = actualCartItems.size();
        Assert.assertEquals(itemCount, count);
    }

}
