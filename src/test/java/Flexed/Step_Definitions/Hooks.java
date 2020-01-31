package Flexed.Step_Definitions;


import Flexed.Utilities.Driver;
import Flexed.Utilities.Pages;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {
    Pages pages = new Pages();
    @Before
    public void before(){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        pages.getMainPage().goToLandingPage();

    }
    @After
    public void after(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenShot, "image/png");
        }
        Driver.closeDriver();
    }

}
