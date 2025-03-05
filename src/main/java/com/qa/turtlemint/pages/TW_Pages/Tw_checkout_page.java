package com.qa.turtlemint.pages.TW_Pages;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.ArrayList;


public class Tw_checkout_page extends TestBase {


    public Tw_checkout_page() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='title-uiSelect']")
    WebElement ClickOntitle;

    @FindBy(xpath = "//span[text()='Mr']")
    WebElement SelectTitle;

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstname;

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastname;

    @FindBy(xpath = "//input[@id='email']")
    WebElement email;

    @FindBy(xpath = "//input[@name='mobile']")
    WebElement mobile;

    @FindBy(xpath = "//input[@id='alternateMobile']")
    WebElement scroll;
    @FindBy(xpath = "//div[@id='registeredPincode-uiSelect']")
    WebElement pin;
    @FindBy(xpath = "//div[@id='registeredPincode-uiSelect']/input")
    WebElement Pincode;
    @FindBy(xpath = "//span[text()='400065']")
    WebElement SelectPincode;
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement ConBtn;
    @FindBy(xpath = "//input[@name='nomineeName']")
    WebElement NomineeName;
    @FindBy(xpath = "//div[text()='Nominee Details']")
    WebElement clickOutSide;
    @FindBy(xpath = "//input[@name='nomineeDOB-datepicker']")
    WebElement NomineeDOB;
    @FindBy(xpath = "//div[@id='nomineeRel-uiSelect']")
    WebElement Nominee;
    @FindBy(xpath = "//span[text()='Mother']")
    WebElement SelectNomineeRelation;
    @FindBy(xpath = "//span[text()='Nominee Date of Birth']")
    WebElement dob;
    @FindBy(xpath = "//div[@id='page']/div")
    WebElement Outside;

    @FindBy(xpath = "//input[@name='engineNum']")
    WebElement EngineNum;

    @FindBy(xpath = "//input[@name='chassisNum']")
    WebElement ChNum;
    @FindBy(xpath = "//span[text()='Online']")
    WebElement SelPayOpt;
    @FindBy(xpath = "//button[text()='Make Payment']")
    WebElement MakePay;
    @FindBy(xpath = "//input[@id=\"email\"]")
    WebElement Email;
    @FindBy(xpath = "//input[@id=\"mobile\"]")
    WebElement Mobile;
    @FindBy(xpath = "//button[text()='Share Payment Link']")
    WebElement Sharepayment;
    @FindBy(xpath = "//span[text()=\" Copy link\"]")
    WebElement copylink;
    @FindBy(xpath = "//button[@class=\"close ng-click-active\"]")
    WebElement closecrossbutton;
    @FindBy(xpath = "//input[@id=\"copytxtInput\"]")
    WebElement Input;
    @FindBy(xpath = "//p[@ng-repeat=\"declaration in customerDeclaration\"]")
    WebElement Checkmark;
    @FindBy(xpath = "//button[text()=' Approve and make payment ']")
    WebElement Approve;


    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void scroll() {
        js.executeScript("arguments[0].scrollIntoView();", scroll);
    }

    public void contactDetailsKycDigit(String fname, String lname) throws Exception { //For Kyc Digit
        WebCommands.staticSleep(5000);
        TestUtil.click(ClickOntitle, "Clicked on title");
        TestUtil.click(SelectTitle, "Title selected");
        String FstName = firstname.getAttribute("value");
        String LstName = lastname.getAttribute("value");
        String Emailid = email.getAttribute("value");
        String MobileNo = mobile.getAttribute("value");
        if (FstName.isEmpty()) {
            TestUtil.sendKeys(firstname, fname, "First name is filled..");
        }
        if (LstName.isEmpty()) {
            TestUtil.sendKeys(lastname, lname, "Last Name is filled..");
        }
        if (Emailid.isEmpty()) {
            TestUtil.sendKeys(email, "test@example.com", "Email-id is Entered...");
        }
        if (MobileNo.isEmpty()) {
            TestUtil.sendKeys(mobile, "6999912345", "Mobile Number is Entered...");
        }
        scroll();
        WebCommands.staticSleep(2000);
    }
    public void Mobile_details(){
        TestUtil.sendKeys(Email,"Automationtesting@gmail.com","entering mail");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(Mobile,"6999912345","entering mobile number");
    }
    public void share_payment_link() throws IOException {
        WebCommands.staticSleep(3000);
        TestUtil.waitUntilVisibilityOfElement(copylink);

        TestUtil.click(copylink, "Copy link clicked");
        String copiedText = Input.getAttribute("value");
        LogUtils.info("Copyed link");
        WebCommands.staticSleep(2000);
        TestUtil.click(closecrossbutton, "close share window button");
        WebCommands.staticSleep(2000);
        System.out.println("copied link is " + copiedText);
        WebCommands.staticSleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        LogUtils.info("Open new tab");
        WebCommands.staticSleep(1500);
        driver.get(copiedText);
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();

    }
    public void reviewpage() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(Checkmark,"clicked check mark");
        WebCommands.staticSleep(2000);
        TestUtil.click(Approve,"clicked approved");
        TestUtil.getFullPageScreenShot();

    }

    public void Digit_Pin() throws Exception {
        WebCommands.staticSleep(3000);
        {
            TestUtil.click(pin, "Clecik on pin....");
            TestUtil.click(pin, "Clecik on pin....");
            TestUtil.sendKeys(Pincode, "400065", "Pincode is Entered....");
            TestUtil.click(SelectPincode, "Select the pincode....");
        }
    }

    public void ContinueButton() {
        LogUtils.info("Continue button is Clickable.....");
        WebCommands.staticSleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", ConBtn);
        LogUtils.info("Clicked on continue button");
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
    }


    public void personalDetailsDBO() throws InterruptedException {   // ICIC, BAJAJ no Gender asked
        TestUtil.waitUntilVisibilityOfElement(NomineeName);  // new added
        TestUtil.moveToElement(clickOutSide);
        String Nomineename = NomineeName.getAttribute("value");
        String NomineedOB = NomineeDOB.getAttribute("value");
        if (Nomineename.isEmpty() && NomineedOB.isEmpty()) {
            TestUtil.moveToElement(Nominee);
            LogUtils.info("DOB Selected!");
            TestUtil.click(SelectNomineeRelation, "Clicked on SelectNomineeRelation");
            TestUtil.waitUntilVisibilityOfElement(NomineeName);
            TestUtil.sendKeys(NomineeName, "Mother Test", "Nominee name is filled..");
            TestUtil.waitUntilVisibilityOfElement(NomineeDOB);
            TestUtil.sendKeys(NomineeDOB, "12/02/1958", "D.O.B is filled..");
            TestUtil.click(dob, "dob is clicked..");
            LogUtils.info("Nominee Details Filled!");
            TestUtil.click(Outside, "Clicked outside");
            Thread.sleep(2000);
        }
        ConBtn.click();
    }

    public void newVehicleDetail() throws Exception { // Chola, Bajaj, Digit, HDFC
        TestUtil.sendKeys(EngineNum, "230620221135YES", "Enginenumber is filled...");
        TestUtil.sendKeys(ChNum, "230620221135YESOK", "Chaisis number is filled..");
        TestUtil.waitUntilVisibilityOfElement(ConBtn);
        TestUtil.click(ConBtn, "Clicked on Continue Button..");
        WebCommands.staticSleep(5000);

    }


    public void paymentSlide() throws Exception { // All insurer except HDFC
        TestUtil.click(SelPayOpt, "Payment Option is selected");
        TestUtil.getScreenShot();
    }
    public void sharepayment(){
        TestUtil.click(Sharepayment, "Payment Option is selected");
        TestUtil.getScreenShot();
    }

    public void makePayment() throws Exception {
        TestUtil.click(MakePay, "Make Payment Clicked and Flow Complete!");
        WebCommands.staticSleep(10000);
        TestUtil.getScreenShot();
    }

        public void Icici_NewBusiness_Tp (String fname , String lname  ) throws Exception
        {
            contactDetailsKycDigit(fname, lname);
            ContinueButton();
            personalDetailsDBO();  // Explicit wait added.....
            newVehicleDetail();    // Explicit wait added.....
            WebCommands.staticSleep(2000);
            paymentSlide();
            sharepayment();
            share_payment_link();
            reviewpage();

        }
    public void Icici_NewBusiness_Tp_Make (String fname , String lname  ) throws Exception
    {
        contactDetailsKycDigit(fname, lname);
        ContinueButton();
        personalDetailsDBO();  // Explicit wait added.....
        newVehicleDetail();    // Explicit wait added.....
        WebCommands.staticSleep(2000);
        paymentSlide();
        makePayment();

    }
    }

