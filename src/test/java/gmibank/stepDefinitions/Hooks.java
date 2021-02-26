package gmibank.stepDefinitions;

import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    @Before
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("GMI_Url"));
    }
    @After
    public void tearDown(Scenario scenario){
      final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if(scenario.isFailed()){
         scenario.embed(screenshot , "image/png");
        }
        Driver.closeDriver();
    }
}
