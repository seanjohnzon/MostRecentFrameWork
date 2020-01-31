package Flexed.Pages;

import Flexed.Utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Chapter8Page extends BasePage {
    @FindBy(id = "secondCookie")
    public WebElement secondCookie;
}
