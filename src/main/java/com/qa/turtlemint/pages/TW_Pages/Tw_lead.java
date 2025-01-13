package com.qa.turtlemint.pages.TW_Pages;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tw_lead extends TestBase {
    public Tw_lead() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='customerName']")
    WebElement name;

    @FindBy(id = "container-next-btn")
    WebElement NextButton;

    public void SaveLead(String LeadName) throws InterruptedException {
        TestUtil.sendKeys(name,LeadName,"All detail Filled and Lead name Entered");
        TestUtil.waitElementToBeClickable(NextButton);
        TestUtil.click(NextButton,"Next Button is Clicked.........");
    }
}
