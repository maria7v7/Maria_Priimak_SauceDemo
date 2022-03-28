package saucedemo.com.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import saucedemo.com.pages.ProductsPage;
import saucedemo.com.pages.ShoppingCartPage;
import saucedemo.com.utilities.Driver;

public class DeleteItemStepDef {
    ShoppingCartPage cartPage = new ShoppingCartPage();
    ProductsPage productsPage = new ProductsPage();

    @Given("User is in the Shopping Cart page")
    public void user_is_in_the_shopping_cart_page() {
        productsPage.shoppingCartBtn.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("cart"));
    }
    @When("User delete an item from the cart")
    public void user_delete_an_item_from_the_cart() {
        cartPage.removeBtn.click();
        cartPage.continueShopBtn.click();
    }
    @Then("User adds one more item to the cart")
    public void user_adds_one_more_item_to_the_cart() {
        productsPage.addOnesie.click();
    }
}
