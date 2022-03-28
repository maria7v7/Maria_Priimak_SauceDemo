package saucedemo.com.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import saucedemo.com.utilities.Driver;

public class Hooks {
    @Before()
    public void setUpScenario() {
        System.out.println("setUp method is running before the scenario");
    }

    @After
    public void tearDownScenario(Scenario scenario) {

        if(scenario.isFailed()) {
            byte[] image = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(image, "image/png", scenario.getName());
        }

        System.out.println("tearDown method is running after the scenario:" + scenario.getName());
        //Driver.closeDriver();
    }

}
