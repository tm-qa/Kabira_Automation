package com.qa.turtlemint.pages.TW_Pages;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.qa.turtlemint.util.TestUtil.waitUntilTextToPresent;

public class Tw_Homepage extends TestBase {

    @FindBy(xpath = "//span[text()='Bike']")
    WebElement tw;
    public Tw_Homepage() {
        PageFactory.initElements(driver, this);
    }


    public void ValidateMotorTWClick() throws InterruptedException {
        TestUtil.waitElementToBeClickable(tw);
        TestUtil.click(tw,"Clicked on Tw..");
    }
}
