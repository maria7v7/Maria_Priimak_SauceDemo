package saucedemo.com.step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import saucedemo.com.pages.ProductsPage;
import saucedemo.com.utilities.Driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStepDef {
    ProductsPage productsPage = new ProductsPage();
    Select dropDown = new Select(productsPage.sortContainer);
    List<Double> BeforeFilter = new ArrayList<>();
    List<Double> AfterFilter = new ArrayList<>();

    @Given("User is on product page")
    public void user_is_on_product_page() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("inventory"));
    }
    @Then("User clicks on sort dropdown")
    public void user_clicks_on_sort_dropdown() {
        List<WebElement> pricesBeforeSorting = Driver.getDriver()
                .findElements(By.xpath("//div[@class='inventory_item_price']"));
        for (WebElement eachDouble : pricesBeforeSorting) {
            BeforeFilter.add(Double.valueOf(eachDouble.getText().replace("$", "")));
    }
        productsPage.sortContainer.click();
    }

    @Then("User select price low to high")
    public void user_select_price_low_to_high() {
        dropDown.selectByVisibleText("Price (low to high)");
    }
    @Then("Products price should be sorted low to high")
    public void products_price_should_be_sorted_low_to_high() {
        List<WebElement> pricesAfterSorting = Driver.getDriver().findElements(By.xpath("//div[@class='inventory_item_price']"));
        for (WebElement eachDouble2 : pricesAfterSorting) {
            AfterFilter.add(Double.valueOf(eachDouble2.getText().replace("$", "")));
        }
        Collections.sort(BeforeFilter);
        Assert.assertEquals(BeforeFilter, AfterFilter);
    }
    }
