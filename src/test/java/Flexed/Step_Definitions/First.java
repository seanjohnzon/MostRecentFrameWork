package Flexed.Step_Definitions;

import Flexed.Utilities.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class First {
    @Then("page title is {string}")
    public void pageTitleIs(String expectedTitle) {
       String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
