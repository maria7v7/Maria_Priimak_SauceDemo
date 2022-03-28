package saucedemo.com.step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Fakat;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import saucedemo.com.pages.CheckOutPage;
import saucedemo.com.pages.ProductsPage;
import saucedemo.com.pages.ShoppingCartPage;
import saucedemo.com.utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class CheckoutStepDef {

    ShoppingCartPage shoppingCart = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    ProductsPage productsPage = new ProductsPage();
    Faker faker = new Faker();


    @Given("User is on the Shopping Cart page")
    public void user_is_on_the_shopping_cart_page() {
        productsPage.shoppingCartBtn.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("cart"));
    }
    @When("User clicks checkout button")
    public void user_clicks_checkout_button() {
        productsPage.shoppingCartBtn.click();
        shoppingCart.checkOutBtn.click();
    }
    @When("User enters his first name and last name and zipcode")
    public void user_enters_his_first_name_and_last_name_and_zipcode() {
        checkOutPage.firstNameField.sendKeys(faker.name().firstName());
        checkOutPage.lastNameField.sendKeys(faker.name().lastName());
        checkOutPage.zipCodeField.sendKeys(faker.address().zipCode());
    }
    @When("User clicks on continue button")
    public void user_clicks_on_continue_button() {
        checkOutPage.continueBtnCheckOut.click();
    }
    @When("User clicks on the finish button")
    public void user_clicks_on_the_finish_button() {
        checkOutPage.finishCheckOut.click();
    }
    @Then("User should be able to see confirmation message")
    public void user_should_be_able_to_see_confirmation_message() {
        Assert.assertTrue(checkOutPage.message.getText().contains("THANK YOU FOR YOUR ORDER"));
    }

}
