package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)


@CucumberOptions(
        plugin = {"pretty",
                "json:target/json-report/cucumber.json",
                "html:target/cucumber-reports.json",
                "junit:target/cucumber-reports/Cucumber.xml",
                },

        features = "C:\\Users\\90542\\IdeaProjects\\Last Probel\\src\\test\\resources",
        glue = "stepdefinitions",
        tags = " @e_test2",
        dryRun = false

)
public class Runner {





}
