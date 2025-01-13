package com.qa.turtlemint.pages.TW_Pages;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.qa.turtlemint.util.TestUtil.waitUntilTextToPresent;

public class Tw_Bike_Registration extends TestBase {

    public Tw_Bike_Registration() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type='search']")
    WebElement Search;

    @FindBy(xpath = "//input[@id='calendarCheckbox']")
    WebElement CheckBox;

    @FindBy(id = "container-next-btn")
    WebElement NextButton;
    @FindBy(xpath = "//div[text()='Quote without vehicle number']")
    WebElement WithoutRegNumberLink;

    @FindBy(xpath = "//span[text()='MH-01-Tardeo']")
    WebElement SelectRegLocation;


    public void SelectRegistrationLocation(String no) {
        Search.sendKeys(no);
        WebCommands.staticSleep(3000);
//        SelectRegLocation.click();
//        act.moveToElement(CheckBox).click().perform();
        NextButton.click();
    }
    public void CreateQuoteWithoutRegNumber()
    {
        TestUtil.click(WithoutRegNumberLink,"Clicked on Quote without RegNo....");

    }
}
