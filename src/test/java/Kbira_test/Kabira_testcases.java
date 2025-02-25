package Kbira_test;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.Sell.GrowPageSellButton;
import com.qa.turtlemint.pages.TW_Pages.*;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.*;
import util.RetryAnalyser;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"Full_suite"})
public class Kabira_testcases extends TestBase {
    public Kabira_testcases() {
        super();
    }

    LoginPage Loginpage;
    Tw_Bike_Registration reg;
    Tw_Bikedetails be;
    Tw_Savelead lead;
    TestUtil tl;
    Tw_Results_page Rel;
    Tw_checkout_page checkout;
    Tw_Homepage Tw;
    GrowPageSellButton Go;


    @BeforeMethod()
    public void loginTest() throws InterruptedException {
          initialization();
         Tw = new Tw_Homepage();
         reg = new Tw_Bike_Registration();
         be = new Tw_Bikedetails();
         lead = new Tw_Savelead();
         Rel = new Tw_Results_page();
         checkout = new Tw_checkout_page();
         Go = new GrowPageSellButton();
         Loginpage = new LoginPage();
         tl = new TestUtil();

        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        Go.ValidateSellButton();
        Tw.ValidateMotorTWClick();

    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TW_NEW_BUSINESS_SharePayment_ICICI() throws Exception
    {
        reg.CreateQuoteWithoutRegNumber();
        be.SelectRegistrationLocation(prop.getProperty("registrationlocation"));
        be.SaveBikeDetails(prop.getProperty("TW_Model"));
        lead.SaveLead(tl.NameGenerator());
        Rel.iciciProceedtoBuy();
        Rel.cKyc();
        tl.NameGenerator();
        checkout.Icici_NewBusiness_Tp(tl.firstname, tl.lastname);
    }

    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void TW_NEW_BUSINESS_OVD_ICICI() throws Exception
    {
        reg.CreateQuoteWithoutRegNumber();
        be.SelectRegistrationLocation(prop.getProperty("registrationlocation"));
        be.SaveBikeDetails(prop.getProperty("TW_Model"));
        lead.SaveLead(tl.NameGenerator());
        Rel.iciciProceedtoBuy();
        Rel.OVD_TW_case();
        tl.NameGenerator();
        checkout.Icici_NewBusiness_Tp(tl.firstname, tl.lastname);
    }

    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void TW_NEW_BUSINESS_SharePayment_ICICI_WithOutPAN() throws Exception
    {
        reg.CreateQuoteWithoutRegNumber();
        be.SelectRegistrationLocation(prop.getProperty("registrationlocation"));
        be.SaveBikeDetails(prop.getProperty("TW_Model"));
        lead.SaveLead(tl.NameGenerator());
        tl.NameGenerator();
        Rel.iciciProceedtoBuy();
        Rel.panNotAvailable();
        Rel.OVD_TW_case();
        tl.NameGenerator();
        checkout.Icici_NewBusiness_Tp(tl.firstname, tl.lastname);
    }
    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void TW_NEW_BUSINESS_SharePayment_ICICI_With_ViewDetails() throws Exception
    {
        reg.CreateQuoteWithoutRegNumber();
        be.SelectRegistrationLocation(prop.getProperty("registrationlocation"));
        be.SaveBikeDetails(prop.getProperty("TW_Model"));
        lead.SaveLead(tl.NameGenerator());
        tl.NameGenerator();
        Rel.iciciProceedtoBuy();
        Rel.cKyc();
        tl.NameGenerator();
        checkout.Icici_NewBusiness_Tp(tl.firstname, tl.lastname);
    }
    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void TW_NEW_BUSINESS_MakePayment_ICICI() throws Exception
    {
        reg.CreateQuoteWithoutRegNumber();
        be.SelectRegistrationLocation(prop.getProperty("registrationlocation"));
        be.SaveBikeDetails(prop.getProperty("TW_Model"));
        lead.SaveLead(tl.NameGenerator());
        tl.NameGenerator();
        Rel.iciciProceedtoBuy();
        Rel.cKyc();
        tl.NameGenerator();
        checkout.Icici_NewBusiness_Tp_Make(tl.firstname, tl.lastname);
    }

    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void TW_NEW_BUSINESS_With_Addons_ICICI() throws Exception
    {
        reg.CreateQuoteWithoutRegNumber();
        be.SelectRegistrationLocation(prop.getProperty("registrationlocation"));
        be.SaveBikeDetails(prop.getProperty("TW_Model"));
        lead.SaveLead(tl.NameGenerator());
        tl.NameGenerator();
        Rel.All_Addons();
        Rel.iciciProceedtoBuy();
        Rel.cKyc();
        tl.NameGenerator();
        checkout.Icici_NewBusiness_Tp(tl.firstname, tl.lastname);
    }
    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void TW_NEW_BUSINESS_With_3New_Addons_ICICI() throws Exception
    {
        reg.CreateQuoteWithoutRegNumber();
        be.SelectRegistrationLocation(prop.getProperty("registrationlocation"));
        be.SaveBikeDetails(prop.getProperty("TW_Model"));
        lead.SaveLead(tl.NameGenerator());
        tl.NameGenerator();
        Rel.OEM_Addons();
        Rel.iciciProceedtoBuy();
        Rel.cKyc();
        tl.NameGenerator();
        checkout.Icici_NewBusiness_Tp(tl.firstname, tl.lastname);
    }

    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void TW_NEW_BUSINESS_Sharefunctionality_ICICI() throws Exception
    {
        reg.CreateQuoteWithoutRegNumber();
        be.SelectRegistrationLocation(prop.getProperty("registrationlocation"));
        be.SaveBikeDetails(prop.getProperty("TW_Model"));
        lead.SaveLead(tl.NameGenerator());
        tl.NameGenerator();
        Rel.ShareDetails();

    }


    @AfterMethod
    public void Close() {
        driver.quit();
    }
}


