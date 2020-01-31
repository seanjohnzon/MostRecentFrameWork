package Flexed.Step_Definitions;

import Flexed.Pages.MainPage;
import Flexed.Utilities.BrowserUtils;
import Flexed.Utilities.Driver;
import Flexed.Utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.Cookies;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Chapter8 {
    Pages pages = new Pages();
    @Then("user creates a second cookie")
    public void userCreatesASecondCookie() {
        Driver.getDriver().manage().deleteAllCookies();
        BrowserUtils.waitForClickablility(pages.getChapter8Page().secondCookie, 5);
        pages.getChapter8Page().secondCookie.click();
        Set<Cookie> cookie = Driver.getDriver().manage().getCookies();
        System.out.println(cookie);
        Assert.assertTrue(cookie.size()>0);
    }

    @When("User navigates to the eigth chapter")
    public void userNavigatesToTheEigthChapter() {
        BrowserUtils.waitForClickablility(pages.getMainPage().chapter8, 5);
        pages.getMainPage().chapter8.click();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "http://book.theautomatedtester.co.uk/chapter8";
        Assert.assertEquals(actualUrl, expectedUrl);
    }
}
