package com.qa.turtlemint.pages.TW_Pages;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.List;

import static com.qa.turtlemint.util.TestUtil.waitUntilTextToPresent;

public class Tw_Results_page extends TestBase {



    @FindBy(xpath = "//a[@data-auto= 'ICICILOMBARD-web']")
    WebElement SelectICICIPlan;
    @FindBy(xpath = "//button[text()='Confirm']")
    WebElement Confirm;
    @FindBy(xpath = "//input[@placeholder='Enter Your Name']")
    WebElement NamePan;
    @FindBy(xpath = "//input[@id='kyc-form_dob']")
    WebElement kycdob;
    @FindBy(xpath = "//td[@title='1997-12-24']")
    WebElement selectDateNew;
    @FindBy(xpath = "//input[@id='kyc-form_pan']")
    WebElement pancardDetails;
    @FindBy(xpath = "//span[normalize-space()='Individual']")
    WebElement individual;
    @FindBy(xpath = "(//span[contains(text(),'Continue')])[1]")
    WebElement continuebtn;
    @FindBy(xpath = "//span[text()='Confirm']")
    WebElement verifybtn;

    @FindBy(xpath = "//span[@class='set-title'][text()='PA Owner Driver']")
    WebElement PA_Addon;
    @FindBy(xpath = "//span[@class='set-title'][text()=' Zero Depreciation ']")
    WebElement Zer_Addon;
    @FindBy(xpath = "//span[@class='set-title'][text()='Consumable']")
    WebElement Con;
    @FindBy(xpath = "//span[@class='set-title'][text()='Return to Invoice']")
    WebElement Ret;
    @FindBy(xpath = "//span[@class='set-title'][text()='Paid Driver Legal Liability']")
    WebElement Paid;
    @FindBy(xpath = "//span[@class='set-title'][text()='Employee Legal Liability']")
    WebElement Emp;
    @FindBy(xpath = "(//span[@class='ant-radio'])[2]")
    WebElement radioBT2;
    @FindBy(xpath = "//mat-form-field[@appearance=\"outline\"]")
    WebElement Selectdropdown;
    @FindBy(xpath = "(//button[@type='button'])[1]")
    WebElement yesBT;
    @FindBy(xpath = "(//button[@type='button'])[2]")
    WebElement SubmittedBT;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement ContinueBt2;
    @FindBy(xpath = "//span[@class='mat-option-text']")
    List<WebElement> FecthDropdown;
    @FindBy(xpath = "//span[text()='Proceed to verify']")
    WebElement Proceedtoverify;
    @FindBy(xpath = "//button[@type='button']")
    WebElement confirmBt;
    @FindBy(xpath = "//a[text()='Details']")
    WebElement ViewDetails;
    @FindBy(xpath = "//a[@id=\"buyPolicybtn\"]")
    WebElement BuyNow;
    @FindBy(xpath = "//span[text()='Share Results']")
    WebElement Share;
    @FindBy(xpath = "//input[@placeholder=\"Enter Mobile No\"]")
    WebElement Mobileno;
    @FindBy(xpath = "//input[@id=\"mobileSubmit\"]")
    WebElement SendPH;
    @FindBy(xpath = "//input[@placeholder=\"Enter Email\"]")
    WebElement Email;
    @FindBy(xpath = "//input[@id=\"emailSubmit\"]")
    WebElement EmailSend;
    @FindBy(xpath = "//span[@class='set-title'][text()=' Rodent Cover ']")
    WebElement Rodent;
    @FindBy(xpath = "//span[@class='set-title'][text()=' Rim Protect ']")
    WebElement Rim;
    @FindBy(xpath = "//span[@class='set-title'][text()=' Battery & Charger Protect ']")
    WebElement Battery;
    @FindBy(xpath = "//a[text()=' Update Results']")
    WebElement Updates;
    @FindBy(xpath = "//p[text()='PAN Number not available?']")
    WebElement PanNotAvailable;








    JavascriptExecutor js = (JavascriptExecutor) driver;
    public void ShareDetails() throws IOException {
        TestUtil.click(Share,"clikced share CTA.....");
        TestUtil.getFullPageScreenShot();
        TestUtil.sendKeys(Mobileno,"9676843227","entering Mobile number");
        TestUtil.click(SendPH,"clikced send for phone number");
        TestUtil.sendKeys(Email,"vijaykumar.katari@turtlemint.com","entering email...");
        TestUtil.click(EmailSend, "Send CTA is clikced");
    }

    public void OEM_Addons() throws IOException {
        TestUtil.click(Rodent,"cliked rodent addon...");
        TestUtil.click(Rim,"Clikced RIM addon");
        TestUtil.click(Battery,"clikced battery ...");
        TestUtil.click(Updates,"Clicked updates ..");
        TestUtil.getFullPageScreenShot();
    }

    public void All_Addons() throws IOException {
        TestUtil.click(PA_Addon,"Clicked PA addon...");
        TestUtil.click(Zer_Addon,"Clicked zer addon...");
        TestUtil.click(Con,"Clikced con..");
        TestUtil.click(Ret,"Clicked ret addon");
        TestUtil.click(Paid,"Clokced paid addon....");
        TestUtil.click(Emp,"clicked emp..");
        TestUtil.getFullPageScreenShot();
    }

    public void iciciProceedtoBuy() throws InterruptedException {
        TestUtil.click(SelectICICIPlan, "ICIC Clicked on Buy now");
        TestUtil.click(Confirm, "Clicked on confirm");
        WebCommands.staticSleep(3000);
    }
    public void View_Details(){
        TestUtil.click(ViewDetails,"Clikced view details..");
        TestUtil.click(BuyNow,"Clicked buy now cta");
        TestUtil.click(Confirm, "Clicked on confirm");

    }

    public void panNotAvailable () {
        WebCommands.staticSleep(4000);
        TestUtil.click(PanNotAvailable, "Clicked on Pan Card Not available");
    }

    public void cKyc() {
        WebCommands.staticSleep(12000);
        TestUtil.sendKeys(kycdob, "24/12/1997", "DOB Entered");
        WebCommands.staticSleep(3000);
        TestUtil.click(selectDateNew, "DOB Selected");
        WebCommands.staticSleep(3000);
        TestUtil.sendKeys(pancardDetails, "BKGPC8713D", "Pancard detail entered");
        WebCommands.staticSleep(3000);
        TestUtil.click(individual, "Clicked on Individual");
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
        TestUtil.click(continuebtn, "Clicked on continue");
        WebCommands.staticSleep(10000);
        WebCommands.staticSleep(15000);
        try {
            if(verifybtn.isEnabled()) {
                WebCommands.staticSleep(2800);
                verifybtn.click();
                TestUtil.getScreenShot();
                LogUtils.info("Click on confirm button");
            }
        } catch (NoSuchElementException e) {
            LogUtils.info("C-kyc has failed and hence going through Ovd flow");
            TestUtil.getScreenShot();
        }

    }


    public void OVD_TW() {
        TestUtil.click(radioBT2, "Clicked on radio button");
        TestUtil.click(ContinueBt2, "Clicked on Continue Button");
        WebCommands.staticSleep(1000);
        TestUtil.click(Selectdropdown, "Click on select dropdown");
        WebCommands.staticSleep(3000);
        for(WebElement dropdownresult:FecthDropdown)
        {
            if(dropdownresult.getText().equals("Aadhaar"))
            {
                System.out.println("We are inside loop:"+dropdownresult);
                dropdownresult.click();
                break;
            }
        }
        WebCommands.staticSleep(2000);
        try{
            TestUtil.click(yesBT, "clicked yes Bt");
        }catch (Exception e){
            LogUtils.info("Aadhar is By Default selected");
        }
        TestUtil.OvdUploadFile("/home/ubuntu/storage/AadharFrontMotor.png");
        //  TestUtil.OvdUploadFile("/Users/hemantpatil/Desktop/Aadharfront.jpg");
        LogUtils.info("Aadhaar Front Page Uploaded");
        TestUtil.OvdUploadFile("/home/ubuntu/storage/AadharBackMotor.png");
        //  TestUtil.OvdUploadFile("/Users/hemantpatil/Desktop/Aadharback.jpg");
        LogUtils.info("Aadhaar Back page uploaded");
        TestUtil.getScreenShot();
        TestUtil.click(SubmittedBT,"clicked submitted");
        WebCommands.staticSleep(5000);
        try {
            WebCommands.staticSleep(8000);
            TestUtil.OvdUploadFile("/home/ubuntu/storage/images.jpg");
            //  TestUtil.OvdUploadFile("/Users/hemantpatil/Desktop/Aadharback.jpg");
            LogUtils.info("Image uploaded");
            WebCommands.staticSleep(5100);
            TestUtil.click(Proceedtoverify,"Proceed to verify");
        }catch (Exception e){
            LogUtils.info("Image upload not required");
        }
        WebCommands.staticSleep(4000);
        TestUtil.click(confirmBt,"Confirm");
    }
}
