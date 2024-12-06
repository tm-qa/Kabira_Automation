package Leads;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.Leads.Leads;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.*;
import util.RetryAnalyser;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"leads","mintpro"})
public class MintproFlowForExistingUserTest extends TestBase {

    public LoginPage Loginpage;
    GrowPageSellButton growPage;
    Leads lead;

    public MintproFlowForExistingUserTest() {
        super();
    }

    @BeforeClass()
    public void start() {
        initialization();
        Loginpage = new LoginPage();
        growPage = new GrowPageSellButton();
        lead = new Leads();

        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        WebCommands.staticSleep(2000);
    }

    @BeforeMethod
    public void less() {
        TestUtil.LoginLess();
    }

     @Test(description = "Add reminder", retryAnalyzer = RetryAnalyser.class)
      public void AddReminder()  {lead.AddReminder();}

      @Test(description = "Delete Lead",retryAnalyzer = RetryAnalyser.class)
      public void DeleteLead() {lead.DeleteLead();}

     @Test(description = "Help and support option from dashboard",retryAnalyzer = RetryAnalyser.class)
     public void HelpOptionDashboard() {lead.HelpSectionOnDashboard();}

    @Test(description = "ProductCategoryProductCategoryActive360",retryAnalyzer = RetryAnalyser.class)
    public void ProductCategoryProductCategoryActive360() {lead.ProductCategoryProductCategoryActive360();}

    @Test(description = "ProductCategoryProductCategoryBike",retryAnalyzer = RetryAnalyser.class)
    public void ProductCategoryProductCategoryBike() {lead.ProductCategoryProductCategoryBike();}

    @Test(description = "ProductCategoryProductCategoryBusinessLoan",retryAnalyzer = RetryAnalyser.class)
    public void ProductCategoryProductCategoryBusinessLoan() {lead.ProductCategoryProductCategoryBusinessLoan();}

    @Test(description = "ProductCategoryProductCategoryCar",retryAnalyzer = RetryAnalyser.class)
    public void ProductCategoryProductCategoryCar() {lead.ProductCategoryProductCategoryCar();}

    @Test(description = "ProductCategoryProductCategoryCommercialVehicle",retryAnalyzer = RetryAnalyser.class)  ////no lead on prod but present on sanity
    public void ProductCategoryProductCategoryCommercialVehicle() {lead.ProductCategoryProductCategoryCommercialVehicle();}

    @Test(description = "ProductCategoryProductCategoryConsumerGoods",retryAnalyzer = RetryAnalyser.class)
    public void ProductCategoryProductCategoryConsumerGoods() {lead.ProductCategoryProductCategoryConsumerGoods();}

    @Test(description = "ProductCategoryProductCategoryCreditCard",retryAnalyzer = RetryAnalyser.class)
    public void ProductCategoryProductCategoryCreditCard() {lead.ProductCategoryProductCategoryCreditCard();}

    @Test(description = "ProductCategoryProductCategoryFD",retryAnalyzer = RetryAnalyser.class)
    public void ProductCategoryProductCategoryFD() {lead.ProductCategoryProductCategoryFD();}

    @Test(description = "ProductCategoryProductCategoryFire",retryAnalyzer = RetryAnalyser.class)
    public void ProductCategoryProductCategoryFire() {lead.ProductCategoryProductCategoryFire();}

    @Test(description = "ProductCategoryProductCategoryHealth",retryAnalyzer = RetryAnalyser.class)
    public void ProductCategoryProductCategoryHealth() {lead.ProductCategoryProductCategoryHealth();}

    @Test(description = "ProductCategoryProductCategoryLife",retryAnalyzer = RetryAnalyser.class)   //no lead on prod but present on sanity
    public void ProductCategoryProductCategoryLife() {lead.ProductCategoryProductCategoryLife();}

    @Test(description = "ProductCategoryProductCategoryLoanAgainstMutualFund",retryAnalyzer = RetryAnalyser.class)
    public void ProductCategoryProductCategoryLoanAgainstMutualFund() {lead.ProductCategoryProductCategoryLoanAgainstMutualFund();}

    @Test(description = "ProductCategoryProductCategoryMarine",retryAnalyzer = RetryAnalyser.class)
    public void ProductCategoryProductCategoryMarine() {lead.ProductCategoryProductCategoryMarine();}

    @Test(description = "ProductCategoryProductCategoryMobile",retryAnalyzer = RetryAnalyser.class)
    public void ProductCategoryProductCategoryMobile() {lead.ProductCategoryProductCategoryMobile();}

    @Test(description = "ProductCategoryProductCategoryMutualFunds",retryAnalyzer = RetryAnalyser.class)
    public void ProductCategoryProductCategoryMutualFunds() {lead.ProductCategoryProductCategoryMutualFunds();}

    @Test(description = "ProductCategoryProductCategoryPersonalAccident",retryAnalyzer = RetryAnalyser.class)  ////no lead on prod but present on sanity
    public void ProductCategoryProductCategoryPersonalAccident() {lead.ProductCategoryProductCategoryPersonalAccident();}

    @Test(description = "ProductCategoryProductCategoryPersonalLoan",retryAnalyzer = RetryAnalyser.class)
    public void ProductCategoryProductCategoryPersonalLoan() {lead.ProductCategoryProductCategoryPersonalLoan();}

    @Test(description = "ProductCategoryProductCategoryRoadsideAssistance",retryAnalyzer = RetryAnalyser.class)
    public void ProductCategoryProductCategoryRoadsideAssistance() {lead.ProductCategoryProductCategoryRoadsideAssistance();}

    @Test(description = "ProductCategoryProductCategoryWellness",retryAnalyzer = RetryAnalyser.class)
    public void ProductCategoryProductCategoryWellness() {lead.ProductCategoryProductCategoryWellness();}

    @Test(description = "ProductCategoryProductCategoryWorkmenCompensation",retryAnalyzer = RetryAnalyser.class)
    public void ProductCategoryProductCategoryWorkmenCompensation() {lead.ProductCategoryProductCategoryWorkmenCompensation();}

    @Test(description = "SmartLeadFilterDefaultTest",retryAnalyzer = RetryAnalyser.class)
    public void SmartFilterAllDefault() {lead.SmartFiltersAllDefault();}

    @Test(description = "SmartLeadFilterClosedTest",retryAnalyzer = RetryAnalyser.class)
    public void SmartFiltersClosed() {lead.SmartFiltersClosed();}

    @Test(description = "SmartLeadFilterCreatedByCustomerTest",retryAnalyzer = RetryAnalyser.class)
    public void SmartFiltersCreatedByCustomer() {lead.SmartFiltersCreatedByCustomer();}

    @Test(description = "SmartLeadFilterPastClientTest",retryAnalyzer = RetryAnalyser.class)
    public void SmartFiltersRenewalDuePastClient() {lead.SmartFiltersRenewalDuePastClient();}

    @Test(description = "SmartLeadFilterScheduledRemindersTest",retryAnalyzer = RetryAnalyser.class)
    public void SmartFiltersScheduledReminders() {lead.SmartFiltersScheduledReminders();}

    @Test(description = "Help and support should display for all leads except TW lead",retryAnalyzer = RetryAnalyser.class)
    public void VerifyHelpAndSupportOption() { lead.HelpSection(); }

    @Test(description = "Lead redirection from dashboard",retryAnalyzer = RetryAnalyser.class)
    public void VerifyLeadRedirection() {
        lead.VerifyLeadsChips();
        lead.VerifyLeadOnDashboard();
        lead.VerticalRedirection();
    }
    @AfterClass()
    public void Close()
    {
        driver.quit();
    }
}
