package gmibank.stepDefinitions;

import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

    
    // TestNG'deki @BeforeMethod gibi çalışır.
    // Her senaryodan önce çalışır.
    @Before
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @After
    public void tearDown(Scenario scenario){
      /*final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if(scenario.isFailed()){
         scenario.embed(screenshot , "image/png");
        }*/
        Driver.closeDriver();
    }
} //    System.out.println("setUp Çalıştı.");
