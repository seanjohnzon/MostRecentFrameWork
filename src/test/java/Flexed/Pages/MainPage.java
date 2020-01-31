package Flexed.Pages;

import Flexed.Utilities.BasePage;
import Flexed.Utilities.ConfigurationReader;
import Flexed.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    @FindBy(xpath = "//*[@class = 'mainbody']/ul/li[5]/a")
    public WebElement chapter8;

    public void goToLandingPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
}
