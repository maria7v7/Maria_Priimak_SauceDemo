package saucedemo.com.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import saucedemo.com.pages.LoginPage;
import saucedemo.com.utilities.ConfigurationReader;
import saucedemo.com.utilities.Driver;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();

    @Given("User on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("sauce.url"));
    }
    @When("User enters valid  {string} and {string}")
    public void user_enters_valid_and(String login, String password) {
        loginPage.usernameFiled.sendKeys(login);
        loginPage.passwordFiled.sendKeys(password);
    }
    @When("User clicks on Sign In button")
    public void user_clicks_on_sign_in_button() {
        loginPage.signInBtn.click();
    }
    @Then("url should contain inventory word")
    public void url_should_contain_inventory_word() {
        String expectedUrl = "inventory";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }
}
