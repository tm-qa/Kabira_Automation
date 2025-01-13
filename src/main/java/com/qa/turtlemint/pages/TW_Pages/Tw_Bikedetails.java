package com.qa.turtlemint.pages.TW_Pages;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tw_Bikedetails extends TestBase {

    public Tw_Bikedetails() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[text()='Your Bike detail']")
    WebElement BikeLbl;

    @FindBy(xpath = "//input[@type='search']")
    WebElement BikeModel;

    @FindBy(xpath = "//span[text()='Honda Activa']")
    WebElement SelectTWModel;

    @FindBy(xpath = "//span[text()='2023']|//span[text()='2021']|//span[text()='2018']")
    WebElement RegYear;

    @FindBy(xpath = "//span[text()='Petrol']")
    WebElement Tw_FuelType;

    @FindBy(id = "variant-uiSelect")
    WebElement ClickVariant;

    @FindBy(xpath = "//span[text()='3G (110 CC)']")
    WebElement Activa3G;

    @FindBy(id = "container-next-btn")
    WebElement NextButton;
    @FindBy(xpath = "//p[text()='Bike registration information']")
    WebElement BikeRegPage;
    @FindBy(xpath = "//input[@type='search']")
    WebElement Search;
    @FindBy(xpath = "//span[text()='MH-01-Tardeo']")
    WebElement SelectRegLocation;


    public void SaveBikeDetails(String BikeName) throws InterruptedException
    {

        TestUtil.waitUntilVisibilityOfElement(BikeLbl);
        BikeLbl.isDisplayed();
        TestUtil.waitUntilVisibilityOfElement(BikeModel);
        TestUtil.sendKeys(BikeModel, BikeName, "Bike Model Entered");
        TestUtil.waitElementToBeClickable(SelectTWModel);
        TestUtil.click(SelectTWModel, "Selected Honda Activa");
        TestUtil.waitElementToBeClickable(RegYear);
        TestUtil.click(RegYear, "Registration Year Selected");
        TestUtil.waitElementToBeClickable(Tw_FuelType);
        TestUtil.click(Tw_FuelType, "Fuel Type Selected");
        TestUtil.waitElementToBeClickable(ClickVariant);
        TestUtil.click(ClickVariant, "Trying to Select variant...");
        TestUtil.waitElementToBeClickable(Activa3G);
        TestUtil.click(Activa3G, "3G variant Selected...");
        TestUtil.waitElementToBeClickable(NextButton);
        TestUtil.click(NextButton, "Clicked on Next Button");

    }
    public void SelectRegistrationLocation(String no) {
        Search.sendKeys(no);
        WebCommands.staticSleep(3000);
        SelectRegLocation.click();
        NextButton.click();
    }
}
