package com.qa.turtlemint.pages.Leads;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Leads extends TestBase {

    @FindBy(xpath = "//span[text()='Leads']")
    WebElement LeadsChips;

  @FindBy(xpath = "(//div[@class='leadCard'])[1]")
  WebElement FirstLead;
    @FindBy(xpath = "(//div[@class='leadCardWrapper'])[1]")
    WebElement FirstLeadclosedfilter;

    @FindBy(xpath = "//button[text()='View Quotes']")
    WebElement QuoteBtn;

    @FindBy(xpath = "//button[@type='button'][contains(text(),'Complete')]")
    WebElement ProposalBtn;

    @FindBy(xpath = "//div[@class='leadName']")
    WebElement Name;

    @FindBy(xpath = "//button[@class='wonBtn']")
    WebElement WonBtn;

    @FindBy(xpath = "//button[@class='lostBtn']")
    WebElement LostBtn;

    @FindBy(xpath = "//span[@class='deleteCta']")
    WebElement DeleteBtn;

    @FindBy(xpath = "(//span[text()='Delete Lead'])[2]")
    WebElement DeleteLead;
    @FindBy(xpath = "//input[@type='text']")
    WebElement EnterPolicyNumber;

    @FindBy(xpath = "//span[text()='Mark as Won']")
    WebElement MarkWon;

    @FindBy(xpath = "//span[text()='Mark as Lost']")
    WebElement MarkLost;

    @FindBy(xpath = "//span[text()='Closed']")
    WebElement ClosedChips;

    @FindBy(xpath = "//span[text()='Won']")
    WebElement LblWon;

    @FindBy(xpath = "//span[text()='Lost']")
    WebElement LblLost;

    @FindBy(xpath = "//input[@value='Customer did not respond']")
    WebElement RejectReason;

    @FindBy(xpath = "//span[@class='twIco'][1]")
    WebElement TwIcon;

    @FindBy(xpath = "//b[text()='Checkout']")
    WebElement CheckOutText;

    @FindBy(xpath = "//h2[text()='Help & Support']")
    WebElement SupportText;

    @FindBy(xpath = "//span[text()= 'Chat with us']")
    WebElement support;

    @FindBy(xpath = "//span[@class='headerLinkTitle'][text()='Help']")
    WebElement help;

    @FindBy(xpath = "//div[@id='chats-container']//div[@class='sc-CtfFt sc-fjmCvl joriYo']")
    WebElement LeadNameInHelp;

    @FindBy(xpath = "//div[text()='Insurance']")
    WebElement insurance;

    @FindBy(xpath = "//div[text()='Mutual Funds']")
    WebElement mf;

    @FindBy(xpath = "//div[text()='Mobile Protection']")
    WebElement MobileProtection;

    @FindBy(xpath = "//div[text()='Something Else']")
    WebElement SomethingElse;

    @FindBy(xpath = "//button[text()='Add Reminder']")
    WebElement AddReminder;
    @FindBy(xpath = "//button[text()='Add More']")
    WebElement AddMore;
    @FindBy(xpath = "//span[text()='Call Client']//parent::label")
    WebElement CallClientReminder;

    @FindBy(xpath = "//input[@id='date_picker']")
    WebElement SetDate;

    @FindBy(xpath = "//span[text()='Unread']")
    WebElement UnreadChips;

    @FindBy(xpath = "//span[text()='Reminders']")
    WebElement RemindersChips;

    @FindBy(xpath = "//div[text()='Renew Now']")
    WebElement RenewalFloatingBanner;

    @FindBy(xpath = "//a[text()='Explore more options']")
    WebElement ExploreMore;

    @FindBy(xpath = "//span[text()='Car']")
    WebElement car;

    @FindBy(xpath = "//span[text()='Bike']")
    WebElement Bike;

    @FindBy(xpath = "//span[text()='Commercial Vehicle']")
    WebElement CV;

    @FindBy(xpath = "//span[text()='Health']")
    WebElement health;

    @FindBy(xpath = "//span[text()='Personal Accident']")
    WebElement PA;
    @FindBy(xpath = "//span[text()='Life']")
    WebElement Life;
    @FindBy(xpath = "//span[text()='Mutual Funds']")
    WebElement MutualFund;
    @FindBy(xpath = "//span[text()='Fire']")
    WebElement Fire;
    @FindBy(xpath = "//span[text()='Marine']")
    WebElement Marine;
    @FindBy(xpath = "//span[text()='Workmen’s Compensation']")
    WebElement Workmens_Compensation;
    @FindBy(xpath = "//span[text()='Credit Card']")
    WebElement Credit_Card;
    @FindBy(xpath = "//span[text()='Roadside Assistance']")
    WebElement Roadside_Assistance;
    @FindBy(xpath = "//span[text()='Active 360']")
    WebElement Active_360;
    @FindBy(xpath = "//span[text()='Personal Loan']")
    WebElement Personal_Loan;
    @FindBy(xpath = "//span[text()='Business Loan']")
    WebElement Business_Loan;
    @FindBy(xpath = "//span[text()='OPD Healthcare+']")
    WebElement OPD_Healthcare;
    @FindBy(xpath = "//span[text()='Loan Against Mutual Fund']")
    WebElement Loan_Against_Mutual_Fund;
    @FindBy(xpath = "//span[text()='Fixed Deposit']")
    WebElement Fixed_Deposit;

    @FindBy(xpath = "//span[text()='Mobile']")
    WebElement Mobile;

    @FindBy(xpath = "//span[text()='Renew Now']")
    WebElement Renew;

    @FindBy(xpath = "//span[text()='OK']")
    WebElement OK;

    @FindBy(xpath = "//span[text()='Set Reminder']")
    WebElement SetReminder;
    
    @FindBy(xpath = "//p[text()='You can have a maximum of 3 reminders at a time. ']")
    WebElement MaxReminderMsg;
    @FindBy(xpath = "(//div[@class='iconStyle'])[1]")
    WebElement DeleteReminder;

    @FindBy(xpath = "//span[text()='Delete reminder']")
    WebElement DeleteConfirmation;

    @FindBy(xpath = "//span[text()='Show All']")
    WebElement ShowAllChip;

    @FindBy(xpath = "//span[text()='Customer Generated']")
    WebElement CustomerGeneratedChip;

    @FindBy(xpath = "//span[text()='Leads']")
    WebElement LeadPage;

    @FindBy(xpath = "//span[text()='My Leads']")
    WebElement MyLeadsTab;

    @FindBy(xpath = "//button[text()='Smart Filters']")
    WebElement SmartFilters;

    @FindBy(xpath = "//button[text()='Apply']")
    WebElement SmartFilterApply;

    @FindBy(id = "F006")
    WebElement CreatedByCustomer;

    @FindBy(xpath = "//label[text()='Renewal Due (Past Customers)']")
    WebElement RenewalDuePastClient;

    @FindBy(xpath = "//label[text()='Closed']")
    WebElement Closed;

    @FindBy(id = "F007")
    WebElement ScheduledReminders;

    @FindBy(xpath = "//button[text()='Clear filters']")
    WebElement ClearFilters;


    @FindBy(xpath = "//button[text()='Product Category']")
    WebElement ProductCategory;

    @FindBy(xpath = "//input[@id='TW-Bike']")
    WebElement ProductCategoryBike;

    @FindBy(xpath = "(//button[text()='Apply'])[2]")
    WebElement ProductCategoryApply;

    @FindBy(xpath = "//input[@id='FW-Car']")
    WebElement ProductCategoryCar;

    @FindBy(xpath = "//input[@id='CV-Commercial Vehicle']")
    WebElement ProductCategoryCommercialVehicle;

    @FindBy(xpath = "//input[@id='HEALTH-Health']")
    WebElement ProductCategoryHealth;

    @FindBy(xpath = "//input[@id='LIFE-Life']")
    WebElement ProductCategoryLife;

    @FindBy(xpath = "//input[@id='PERSONAL_ACCIDENT-Personal Accident']")
    WebElement ProductCategoryPersonalAccident;

    @FindBy(xpath = "//input[@id='personal-loan-Personal Loan']")
    WebElement ProductCategoryPersonalLoan;

    @FindBy(xpath = "//input[@id='business-loans-Business Loans']")
    WebElement ProductCategoryBusinessLoan;

    @FindBy(xpath = "//input[@id='active-360-Active 360']")
    WebElement ProductCategoryActive360;

    @FindBy(xpath = "//input[@id='FIRE-Fire']")
    WebElement ProductCategoryFire;

    @FindBy(xpath = "//input[@id='Credilio-Credit Card']")
    WebElement ProductCategoryCreditCard;

    @FindBy(xpath = "//input[@id='roadside-assistance-Roadside Assistance']")
    WebElement ProductCategoryRoadsideAssistance;

    @FindBy(xpath = "//input[@id='Marine-Marine']")
    WebElement ProductCategoryMarine;

    @FindBy(xpath = "//input[@id='MOBILE-Mobile']")
    WebElement ProductCategoryMobile;

    @FindBy(xpath = "//input[@id='wellness-Wellness']")
    WebElement ProductCategoryWellness;

    @FindBy(xpath = "//input[@id='MF-Mutual Funds']")
    WebElement ProductCategoryMutualFunds;

    @FindBy(xpath = "//input[@id='Workmen Compensation-Workmen Compensation']")
    WebElement ProductCategoryWorkmenCompensation;

    @FindBy(xpath = "//input[@id='consumer-goods-Consumer Goods']")
    WebElement ProductCategoryConsumerGoods;

    @FindBy(xpath = "//input[@id='FD-FD']")
    WebElement ProductCategoryFD;

    @FindBy(xpath = "//input[@id='Loan Against Mutual Fund-Loan Against Mutual Fund']")
    WebElement ProductCategoryLoanAgainstMutualFund;

    @FindBy(xpath = "(//button[text()='Clear filters'])[2]")
    WebElement ProductCategoryClearfilters;


    String resultpageurl;
    String chatpageurl;
    String checkoutpageurl;
    String helpurl;
    boolean url = true;
    String LeadName;
    String LeadNameInClosed;
    String LeadNameInReminder;
    String LName;
    Date myDate;
    String CustGenFirstLead;


    public Leads() {
        PageFactory.initElements(driver, this);
    }

    JavascriptExecutor js = (JavascriptExecutor) driver;
    Actions a = new Actions(driver);

    public void VerifyLeadsChips() {
        LeadsChips.isDisplayed();
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.click(LeadsChips, "Clicked on Leads Chips");
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
    }

    public void VerifyLeadOnDashboard() {
        TestUtil.click(FirstLead, "First displayed lead clicked");
    }

    public void VerticalRedirection() {
        try {
            if (driver.findElement(By.xpath("//button[text()='View Quotes']")).isDisplayed()) {
                TestUtil.click(QuoteBtn, "Quote Button Clicked");
                WebCommands.staticSleep(2000);
                TestUtil.getScreenShot();
                resultpageurl = driver.getCurrentUrl();
                Assert.assertEquals(resultpageurl.contains("results"), url);
            } else if (driver.findElement(By.xpath("//span[text()='Renew Now']")).isDisplayed()) {
                TestUtil.click(Renew, "Renew Button Clicked");
                WebCommands.staticSleep(2000);
                TestUtil.getScreenShot();
                resultpageurl = driver.getCurrentUrl();
                System.out.println(resultpageurl + "result page url");
                Assert.assertEquals(resultpageurl.contains("results"), url);
            }
        } catch (Exception e) {
            TestUtil.click(ProposalBtn, "Proposal Button Clicked");
            WebCommands.staticSleep(2000);
            TestUtil.getScreenShot();
            checkoutpageurl = driver.getCurrentUrl();
            Assert.assertEquals(checkoutpageurl.contains("checkout"), url);
            WebCommands.staticSleep(10000);
        }
    }

    public void DeleteLead() {
        VerifyLeadsChips();
        TestUtil.click(FirstLead, "Clicked on first lead");
        WebCommands.staticSleep(500);
        TestUtil.click(DeleteBtn, "Delete Button clicked");
        TestUtil.click(DeleteLead, "Lead Deleted");
        WebCommands.staticSleep(500);
    }

    public void HelpSectionOnDashboard() {
        TestUtil.click(help, "Help option clicked");
        WebCommands.staticSleep(500);
        insurance.isDisplayed();
        mf.isDisplayed();
        MobileProtection.isDisplayed();
        SomethingElse.isDisplayed();
        WebCommands.staticSleep(500);
        helpurl = driver.getCurrentUrl();
        Assert.assertEquals(helpurl.contains("help-centre"), url);
    }

    public void HelpSection() {
        VerifyLeadsChips();
        TestUtil.click(FirstLead, "Clicked on first lead");
        WebCommands.staticSleep(3000);
        LeadName = Name.getText();
        try {
            if (driver.findElement(By.xpath("//span[@role = 'presentation']")).isDisplayed()) {
                TestUtil.click(support, "In Lead details support Button Clicked");
                WebCommands.staticSleep(5000);
                chatpageurl = driver.getCurrentUrl();
                System.out.println(chatpageurl + "Chat page url");
                WebCommands.staticSleep(5000);
                Assert.assertEquals(chatpageurl.contains("chat"), url);
                WebCommands.staticSleep(2000);
                LName = LeadNameInHelp.getText();
                WebCommands.staticSleep(2000);
                Assert.assertTrue(LeadName.equalsIgnoreCase(LName));
                //        Assert.assertEquals(LeadName, LName);
                WebCommands.staticSleep(5000);
            }
        } catch (Exception e) {
            System.out.println("Buddy!! This is 2w lead so chat option is not Available!!");
        }
    }

    public String FutureDate(int no_of_days) {
        DateFormat dateFormat = new SimpleDateFormat("dd");
        myDate = new Date(System.currentTimeMillis());
        Calendar cal = Calendar.getInstance();
        cal.setTime(myDate);
        cal.add(Calendar.DATE, +no_of_days);
        return (dateFormat.format(cal.getTime()));
    }

    public void AddReminder() {
        VerifyLeadsChips();
        TestUtil.click(FirstLead, "Clicked on first lead");
        WebCommands.staticSleep(5000);
        LeadNameInReminder = Name.getText();
            TestUtil.click(AddReminder, "Add Reminder Clicked");
            WebCommands.staticSleep(2000);
            TestUtil.click(SetDate, "Select date is clicked to set reminder date");
            WebCommands.staticSleep(2000);
             driver.findElement(By.xpath("(//span[text()=" + FutureDate(1) + "])[1]")).click();
            WebCommands.staticSleep(2000);
            TestUtil.click(OK, "Reminder date is selected");
            WebCommands.staticSleep(2000);
            TestUtil.click(OK, "Time is set");
            WebCommands.staticSleep(2000);
            TestUtil.click(CallClientReminder, "Reminder type is selected");
            TestUtil.click(SetReminder, "Reminder is set");
        for (int i = 1; i <= 2; i++) {
            TestUtil.click(AddMore, "Add More Clicked");
            WebCommands.staticSleep(2000);
            TestUtil.click(SetDate, "Select date is clicked to set reminder date");
            WebCommands.staticSleep(2000);
            driver.findElement(By.xpath("(//span[text()=" + FutureDate(1) + "])[1]")).click();
            WebCommands.staticSleep(2000);
            TestUtil.click(OK, "Reminder date is selected");
            WebCommands.staticSleep(2000);
            TestUtil.click(OK, "Time is set");
            WebCommands.staticSleep(2000);
            TestUtil.click(CallClientReminder, "Reminder type is selected");
            TestUtil.click(SetReminder, "Reminder is set");
        }
        WebCommands.staticSleep(2000);
        for (int i = 1; i <= 3; i++) {
            WebCommands.staticSleep(2000);
            TestUtil.click(DeleteReminder, "Delete Reminder Clicked");
            WebCommands.staticSleep(2000);
            TestUtil.click(DeleteConfirmation, "Delete Confirmation Clicked");
        }
        TestUtil.getScreenShot();
        Assert.assertEquals(AddReminder.isDisplayed(), true);
        WebCommands.staticSleep(1000);
        TestUtil.click(AddReminder, "Add Reminder Clicked");
        WebCommands.staticSleep(1000);
        TestUtil.click(SetDate, "Select date is clicked to set reminder date");
        WebCommands.staticSleep(2000);
        driver.findElement(By.xpath("(//span[text()=" + FutureDate(1) + "])[1]")).click();
        WebCommands.staticSleep(2000);
        TestUtil.click(OK, "Reminder date is selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(OK, "Time is set");
        WebCommands.staticSleep(2000);
        TestUtil.click(CallClientReminder, "Reminder type is selected");
        TestUtil.click(SetReminder, "Reminder is set");
        TestUtil.click(LeadsChips, "Clicked on Leads Chips");
        WebCommands.staticSleep(8000);
        TestUtil.click(SmartFilters, "Clicked on SmartFilters");
        WebCommands.staticSleep(2000);
        js.executeScript("arguments[0].click();", ScheduledReminders);
        TestUtil.click(SmartFilterApply, "Clicked on SmartFilterApply");
        WebCommands.staticSleep(2000);

        driver.findElement(By.xpath("//div[text()='" + LeadNameInReminder + "']")).click();
        WebCommands.staticSleep(5000);
        LeadNameInClosed = Name.getText();
        Assert.assertEquals(LeadNameInReminder, LeadNameInClosed);
    }


    public void LeadChipsValidation() {
        VerifyLeadsChips();
        WebCommands.staticSleep(2000);
        ShowAllChip.isDisplayed();
        CustomerGeneratedChip.isDisplayed();
        UnreadChips.isDisplayed();
        RemindersChips.isDisplayed();
        ClosedChips.isDisplayed();
        TestUtil.click(ShowAllChip, "Clicked on Show All Chip");
        WebCommands.staticSleep(2000);
        for (int i = 0; i <= 4; i = i + 1) {
            a.sendKeys(Keys.PAGE_DOWN).build().perform();
            WebCommands.staticSleep(8000);
        }
    }

    public void SmartFiltersAllDefault() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(2000);
        TestUtil.click(SmartFilters, "Clicked on SmartFilters");
        TestUtil.click(SmartFilterApply, "Clicked on SmartFilterApply");
        WebCommands.staticSleep(1000);
        TestUtil.click(FirstLead, "Clicked on FirstLead");
        driver.navigate().back();
        WebCommands.staticSleep(2000);
    }

        public void SmartFiltersCreatedByCustomer() {
            TestUtil.click(LeadPage, "Clicked on LeadsPage");
            WebCommands.staticSleep(3000);
            TestUtil.click(SmartFilters, "Clicked on SmartFilters");
            WebCommands.staticSleep(2000);
            js.executeScript("arguments[0].click();", CreatedByCustomer);
            TestUtil.click(SmartFilterApply, "Clicked on SmartFilterApply");
            WebCommands.staticSleep(2000);
            WebCommands.staticSleep(2000);
            try {
                TestUtil.click(FirstLead, "Clicked on First Lead");
                CustGenFirstLead = Name.getText();
                System.out.println(CustGenFirstLead);
                WebCommands.staticSleep(2000);
                LeadChipsValidation();
                WebCommands.staticSleep(2000);
                WebElement test = driver.findElement(By.xpath("//h3[text()='" + CustGenFirstLead + "']"));
                boolean CustomerGeneratedLeadInShowAll = test.isDisplayed();
                System.out.println(CustomerGeneratedLeadInShowAll);
                Assert.assertEquals(CustomerGeneratedLeadInShowAll, true, "Show All chip Contains All the Leads in Customer Generated Chip ");
            } catch (Exception e) {
                System.out.println("Buddy!! There is no lead in Customer Generated chip");
            }
            WebCommands.staticSleep(1000);
            TestUtil.getScreenShot();
            driver.navigate().back();

        }



    public void SmartFiltersRenewalDuePastClient() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(2000);
        TestUtil.click(SmartFilters, "Clicked on SmartFilters");
        WebCommands.staticSleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", RenewalDuePastClient);
        TestUtil.click(SmartFilterApply, "Clicked on SmartFilterApply");
        WebCommands.staticSleep(1000);
    }

    public void SmartFiltersClosed() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(2000);
        TestUtil.click(SmartFilters, "Clicked on SmartFilters");
        WebCommands.staticSleep(2000);
        js.executeScript("arguments[0].click();", Closed);
        TestUtil.click(SmartFilterApply, "Clicked on SmartFilterApply");
        WebCommands.staticSleep(2000);
        TestUtil.click(FirstLeadclosedfilter, "Clicked on FirstLead");
        driver.navigate().back();
        WebCommands.staticSleep(2000);

    }

    public void SmartFiltersScheduledReminders() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(2000);
        TestUtil.click(SmartFilters, "Clicked on SmartFilters");
        WebCommands.staticSleep(2000);
        js.executeScript("arguments[0].click();", ScheduledReminders);
        TestUtil.click(SmartFilterApply, "Clicked on SmartFilterApply");
        WebCommands.staticSleep(2000);
        try {
            TestUtil.click(FirstLead, "Clicked on FirstLead");

        } catch (Exception e) {
            System.out.println("Buddy!! There is no reminder ");
        }
        WebCommands.staticSleep(2000);
        driver.navigate().back();
        WebCommands.staticSleep(2000);
    }

    public void ProductCategoryProductCategoryBike() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategory, "Clicked on ProductCategory");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategoryBike, "Clicked on ProductCategoryBike");
        TestUtil.click(ProductCategoryApply, "Clicked on ProductCategoryApply");
        WebCommands.staticSleep(4000);
        TestUtil.click(FirstLead, "Clicked on FirstLead");
        WebCommands.staticSleep(2000);
        driver.navigate().back();
        WebCommands.staticSleep(2000);
    }

    public void ProductCategoryProductCategoryCar() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategory, "Clicked on ProductCategory");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategoryCar, "Clicked on ProductCategoryCar");
        TestUtil.click(ProductCategoryApply, "Clicked on ProductCategoryApply");
        WebCommands.staticSleep(2000);
        TestUtil.click(FirstLead, "Clicked on FirstLead");
        WebCommands.staticSleep(2000);
        driver.navigate().back();
        WebCommands.staticSleep(2000);
    }

    public void ProductCategoryProductCategoryCommercialVehicle() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategory, "Clicked on ProductCategory");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategoryCommercialVehicle, "Clicked on ProductCategoryCommercialVehicle");
        TestUtil.click(ProductCategoryApply, "Clicked on ProductCategoryApply");
        WebCommands.staticSleep(2000);
        TestUtil.click(FirstLead, "Clicked on FirstLead");
        WebCommands.staticSleep(2000);
        driver.navigate().back();
        WebCommands.staticSleep(2000);
    }

    public void ProductCategoryProductCategoryHealth() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategory, "Clicked on ProductCategory");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategoryHealth, "Clicked on ProductCategoryHealth");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategoryApply, "Clicked on ProductCategoryApply");
        WebCommands.staticSleep(2000);
        try {
            TestUtil.click(FirstLead, "Clicked on FirstLead");
        } catch (Exception e) {
            System.out.println("Buddy!! There is no lead in health ");
        }
        WebCommands.staticSleep(2000);
        driver.navigate().back();
        WebCommands.staticSleep(2000);
    }

    public void ProductCategoryProductCategoryLife() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(4000);
        TestUtil.click(ProductCategory, "Clicked on ProductCategory");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategoryLife, "Clicked on ProductCategoryLife");
        TestUtil.click(ProductCategoryApply, "Clicked on ProductCategoryApply");
        WebCommands.staticSleep(2000);
        TestUtil.click(FirstLead, "Clicked on FirstLead");
        WebCommands.staticSleep(2000);
        driver.navigate().back();
        WebCommands.staticSleep(2000);
    }

    public void ProductCategoryProductCategoryPersonalAccident() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategory, "Clicked on ProductCategory");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategoryPersonalAccident, "Clicked on ProductCategoryPersonalAccident");
        TestUtil.click(ProductCategoryApply, "Clicked on ProductCategoryApply");
        WebCommands.staticSleep(2000);
    }

    public void ProductCategoryProductCategoryPersonalLoan() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategory, "Clicked on ProductCategory");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategoryPersonalLoan, "Clicked on ProductCategoryPersonalLoan");
        TestUtil.click(ProductCategoryApply, "Clicked on ProductCategoryApply");
        WebCommands.staticSleep(2000);
        TestUtil.click(FirstLead, "Clicked on FirstLead");
        WebCommands.staticSleep(2000);
        driver.navigate().back();
        WebCommands.staticSleep(2000);
    }

    public void ProductCategoryProductCategoryBusinessLoan() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategory, "Clicked on ProductCategory");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategoryBusinessLoan, "Clicked on ProductCategoryBusinessLoan");
        TestUtil.click(ProductCategoryApply, "Clicked on ProductCategoryApply");
        WebCommands.staticSleep(2000);
        TestUtil.click(FirstLead, "Clicked on FirstLead");
        WebCommands.staticSleep(2000);
        driver.navigate().back();
        WebCommands.staticSleep(2000);
    }

    public void ProductCategoryProductCategoryActive360() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategory, "Clicked on ProductCategory");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategoryActive360, "Clicked on ProductCategoryActive360");
        TestUtil.click(ProductCategoryApply, "Clicked on ProductCategoryApply");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }

    public void ProductCategoryProductCategoryFire() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategory, "Clicked on ProductCategory");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategoryFire, "Clicked on ProductCategoryFire");
        TestUtil.click(ProductCategoryApply, "Clicked on ProductCategoryApply");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();

    }

    public void ProductCategoryProductCategoryCreditCard() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategory, "Clicked on ProductCategory");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategoryCreditCard, "Clicked on ProductCategoryCreditCard");
        TestUtil.click(ProductCategoryApply, "Clicked on ProductCategoryApply");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();

    }

    public void ProductCategoryProductCategoryRoadsideAssistance() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategory, "Clicked on ProductCategory");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategoryRoadsideAssistance, "Clicked on ProductCategoryRoadsideAssistance");
        TestUtil.click(ProductCategoryApply, "Clicked on ProductCategoryApply");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();

    }

    public void ProductCategoryProductCategoryMarine() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(4000);
        TestUtil.click(ProductCategory, "Clicked on ProductCategory");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategoryMarine, "Clicked on ProductCategoryMarine");
        TestUtil.click(ProductCategoryApply, "Clicked on ProductCategoryApply");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();

    }

    public void ProductCategoryProductCategoryMobile() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategory, "Clicked on ProductCategory");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategoryMobile, "Clicked on ProductCategoryMobile");
        TestUtil.click(ProductCategoryApply, "Clicked on ProductCategoryApply");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();

    }

    public void ProductCategoryProductCategoryWellness() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategory, "Clicked on ProductCategory");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategoryWellness, "Clicked on ProductCategoryWellness");
        TestUtil.click(ProductCategoryApply, "Clicked on ProductCategoryApply");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();

    }

    public void ProductCategoryProductCategoryMutualFunds() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(4000);
        TestUtil.click(ProductCategory, "Clicked on ProductCategory");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategoryMutualFunds, "Clicked on ProductCategoryMutualFunds");
        TestUtil.click(ProductCategoryApply, "Clicked on ProductCategoryApply");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();

    }

    public void ProductCategoryProductCategoryWorkmenCompensation() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategory, "Clicked on ProductCategory");
        WebCommands.staticSleep(4000);
        TestUtil.click(ProductCategoryWorkmenCompensation, "Clicked on ProductCategoryWorkmenCompensation");
        TestUtil.click(ProductCategoryApply, "Clicked on ProductCategoryApply");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();

    }

    public void ProductCategoryProductCategoryConsumerGoods() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategory, "Clicked on ProductCategory");
        WebCommands.staticSleep(4000);
        TestUtil.click(ProductCategoryConsumerGoods, "Clicked on ProductCategoryConsumerGoods");
        TestUtil.click(ProductCategoryApply, "Clicked on ProductCategoryApply");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();

    }

    public void ProductCategoryProductCategoryFD() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategory, "Clicked on ProductCategory");
        TestUtil.click(ProductCategoryFD, "Clicked on ProductCategoryFD");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategoryApply, "Clicked on ProductCategoryApply");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();

    }

    public void ProductCategoryProductCategoryLoanAgainstMutualFund() {
        TestUtil.click(LeadPage, "Clicked on LeadsPage");
        WebCommands.staticSleep(4000);
        TestUtil.click(ProductCategory, "Clicked on ProductCategory");
        WebCommands.staticSleep(2000);
        TestUtil.click(ProductCategoryLoanAgainstMutualFund, "Clicked on ProductCategoryLoanAgainstMutualFund");
        TestUtil.click(ProductCategoryApply, "Clicked on ProductCategoryApply");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();

    }

//        List<WebElement> ShowAllLeadListSize = driver.findElements(By.xpath("//h3[@class='title']"));
//        System.out.println(ShowAllLeadListSize.size());
//        String LeadsName = "";
//            for (WebElement ShowAllLeads : ShowAllLeadListSize) {
//                LeadsName = ShowAllLeads.getText();
// //               System.out.print(LeadsName);
//            }
//            System.out.print(LeadsName);
//                WebCommands.staticSleep(2000);
//                TestUtil.click(CustomerGeneratedChip, "Clicked on Customer Generated Chip");
//                WebCommands.staticSleep(2000);
//                try {
//                    String CustGenFirstLead = FirstLead.getText();
//                    WebCommands.staticSleep(2000);
//                    System.out.println(LeadsName.contains(CustGenFirstLead));
//                    Assert.assertEquals(LeadsName.contains(CustGenFirstLead), true, "Show All chip Contains All the Leads in Customer Generated Chip ");
//                } catch (Exception e) {
//                    System.out.println("Buddy!! There is no lead in Customer Generated chip");
//                }
//        WebCommands.staticSleep(1000);
//        TestUtil.getScreenShot();
//    }
}


