package Grow;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.CRM.CRM_Page;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.*;
import util.RetryAnalyser;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"crm", "mintpro"})
public class CRM_Test extends TestBase {


    LoginPage Loginpage;
    GrowPageSellButton growPage;
    CRM_Page CRM;
    TestUtil tl = new TestUtil();


    public CRM_Test() {
        super();
    }

    @BeforeClass()
    public void start() {
        initialization();
        Loginpage = new LoginPage();
        growPage = new GrowPageSellButton();
        CRM = new CRM_Page();
        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        WebCommands.staticSleep(2000);
    }

    @BeforeMethod
    public void less() {
        TestUtil.LoginLess();
        CRM.VerifyCustomerDetailsPage();

    }

    @Test(priority = 1, retryAnalyzer = RetryAnalyser.class)
    public void Add_customer() {
        CRM.VerifyAddCustomer();
    }

    @Test(priority = 2, retryAnalyzer = RetryAnalyser.class)
    public void Edit_customer() {
        CRM.VerifyEditCustomer(tl.NameGenerator());
    }

    @Test(priority = 3, retryAnalyzer = RetryAnalyser.class)
    public void Add_Note() {
        CRM.VerifyAddNote();
    }

    @Test(priority = 4, retryAnalyzer = RetryAnalyser.class)
    public void Edit_Note() {
        CRM.VerifyEditNote();
    }

    @Test(priority = 5, retryAnalyzer = RetryAnalyser.class)
    public void AddFile() {
        CRM.VerifyAddFile();
    }

    @Test(priority = 6, retryAnalyzer = RetryAnalyser.class)
    public void EditFile() {
        CRM.VerifyEditFile();
    }

    @Test(priority = 7, retryAnalyzer = RetryAnalyser.class)
    public void greeting_through_customer_listing_page() {
        CRM.Verify_greeting_through_customer_Listing_Page();
    }

    @Test(priority = 8, retryAnalyzer = RetryAnalyser.class)
    public void greeting_through_customer_details_page() {
        CRM.Verify_greeting_through_customer_details_Page();
    }

    @Test (priority = 9,retryAnalyzer = RetryAnalyser.class)
    public void VerifyAddEventFromCustomerDetailsPage()
    {
        CRM.VerifyAddEventFromCustomerDetailsPage();
    }
    @Test (priority = 10,retryAnalyzer = RetryAnalyser.class)
    public void VerifyAddEventFromCustomerlistingPage()
    {
        CRM.VerifyAddEventFromCustomerlistingPage();
    }
    @Test (priority = 11,retryAnalyzer = RetryAnalyser.class)
    public void VerifyAddEventFromgreetingsPage()
    {
        CRM.VerifyAddEventFromgreetingsPage();
    }

    @Test(priority = 9, retryAnalyzer = RetryAnalyser.class)
    public void delete_customer() {
        CRM.Verify_delete_customer();
    }
    @Test(priority = 10, retryAnalyzer = RetryAnalyser.class)
    public void Bulk_Upload() {
        CRM.bulk_upload();
    }

    @AfterClass
    public void Close() {
        driver.quit();
    }
}
