package com.qa.turtlemint.pages.TW_Pages;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.Keys;
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

    @FindBy(xpath = "//span[text()='Kabira Mobility Intercity']")
    WebElement SelectTWModel;

    @FindBy(xpath = "//span[text()='2024']|//span[text()='2021']|//span[text()='2018']")
    WebElement RegYear;

    @FindBy(xpath = "//span[text()='Electric']")
    WebElement Tw_FuelType;
    @FindBy(xpath = "//span[text()='Petrol']")
    WebElement Tw_Petrol;
    @FindBy(id = "variant-uiSelect")
    WebElement ClickVariant;
    @FindBy(xpath = "//span[text()='300 (1 CC)']")
    WebElement cc300;
    @FindBy(id = "container-next-btn")
    WebElement NextButton;
    @FindBy(xpath = "//p[text()='Bike registration information']")
    WebElement BikeRegPage;
    @FindBy(xpath = "//input[@type='search']")
    WebElement Search;
    @FindBy(xpath = "//span[text()='MH-01-Tardeo']")
    WebElement SelectRegLocation;
    @FindBy(xpath = "//span[text()='Standard (1222 CC)']")
    WebElement Motohaus_1200;


    public void SaveBikeDetails(String BikeName, String Fuel , String varint) throws InterruptedException
    {

        TestUtil.waitUntilVisibilityOfElement(BikeLbl);
        BikeLbl.isDisplayed();
        TestUtil.waitUntilVisibilityOfElement(BikeModel);
        TestUtil.sendKeys(BikeModel, BikeName, "Bike Model Entered");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(BikeModel, String.valueOf(Keys.ENTER), "Bike Model Entered");
        TestUtil.click(RegYear, "Registration Year Selected");

        if (Fuel == "Petrol"){
            TestUtil.click(Tw_FuelType, "Fuel Type Selected");
        } else {
            TestUtil.click(Tw_Petrol, "Fuel Type Selected");

        }

        TestUtil.click(ClickVariant, "Trying to Select variant...");

        if (varint == "kabira"){
            TestUtil.click(cc300, "CC 300 variant Selected...");
        } else {
            TestUtil.click(Motohaus_1200,"Selected motohuas make");
        }
        TestUtil.click(NextButton, "Clicked on Next Button");

    }
    public void SelectRegistrationLocation(String no) {
        Search.sendKeys(no);
        WebCommands.staticSleep(3000);
        SelectRegLocation.click();
        NextButton.click();
    }
}
