package io.loop.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.loop.utilities.BrowserUtils;
import io.loop.utilities.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

//va a funcionar como mi before method y after method
    //myescenario es para tomar la foto.

    private static final Logger LOG = LogManager.getLogger();//se pone por cada test
    @Before
    public void setUp(Scenario scenario){
        Driver.getDriver();
        BrowserUtils.myScenario = scenario;
        LOG.info("........START AUTOMATION ................LOOP ACADEMY");

    }

    @After
    public void tearDown(Scenario scenario){
        // only takes a screenshot when scenario is failed
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
         Driver.closeDriver();
        LOG.info("........END AUTOMATION ................LOOP ACADEMY");

    }
//    @AfterStep
    public void screenshot(Scenario scenario){
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());

    }
}