package stepdefiniations;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.Driver;

import java.io.IOException;

public class Hooks {


    @Before
    public void setUp(Scenario scenario) {

        System.out.println("scenario started");
       // System.out.println("scenario id =" + scenario.getId());
        System.out.println("scenario name =" + scenario.getName());

    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", "Screenshots");

        }
        //Driver.closeDriver();
    }
}
