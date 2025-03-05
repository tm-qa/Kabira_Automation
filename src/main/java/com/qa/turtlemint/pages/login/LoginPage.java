package com.qa.turtlemint.pages.login;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(name = "mobileNumber")
    WebElement MobileNumber;

    @FindBy(xpath = "//span[text()='GET OTP']//parent::button")
    WebElement ContinueBtn;

    @FindBy(xpath = "//input[@class='OTPInput']")
    WebElement OTPField;

    @FindBy(xpath = "//span[text()='Verify OTP']")
    WebElement VerifyOTPBtn;


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void ValidateLogin(String username, String otp) {
        String strUrl = driver.getCurrentUrl();
        LogUtils.info("Opened Website: " + strUrl);
        TestUtil.sendKeys(MobileNumber, username, "Mobile Number Entered");
        TestUtil.click(ContinueBtn, "Continue pressed");
        TestUtil.sendKeys(OTPField, otp, "OTP Entered");
        TestUtil.click(VerifyOTPBtn, "Login Successful");
    }
}
