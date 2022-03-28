package saucedemo.com.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt", //store failed scenario
                "json:target/cucumber.json" //generate json  report
        },
        features = "src/test/resources/features",
        glue = "saucedemo/com/step_definitions",
        dryRun = false
)

public class CukesRunner {
}
