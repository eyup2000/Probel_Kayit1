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
//        plugin = {
//                "pretty",
//                "html:target/default-cucumber-reports.html",
//                "json:target/json-reports/cucumber.json",
//                "junit:target/xml-report/cucumber.xml",
//                "rerun:target/failedRerun.txt" ,
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//                //"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
//               // "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
       // },
        features = "src/test/resources",
        glue = "stepdefinitions",
        tags = "@probel_hastaKayit",
        dryRun = false

)
public class Runner {





}
