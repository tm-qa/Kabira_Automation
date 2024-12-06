package Grow;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.CRM.CRM_Page;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.grow.GrowPage;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.*;
import util.RetryAnalyser;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"grow","mintpro"})
public class Grow_Page_Verified_Test extends TestBase {
    LoginPage Loginpage;
    GrowPage Growpage;
    CRM_Page CRM;
    TestUtil tl = new TestUtil();


    public Grow_Page_Verified_Test() {super();}

    @BeforeClass()
    public void start() throws InterruptedException {
        initialization();

        Loginpage = new LoginPage();
        Growpage = new GrowPage();
        CRM = new CRM_Page();
        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        Growpage.grow_page();
    }

    @BeforeMethod
    public void less(){
        TestUtil.LoginLess();
        Growpage.grow_page();

    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void growPagquickLinksTest(){Growpage.quickLinks();}


    @Test(retryAnalyzer = RetryAnalyser.class)
    public void Recommended_Posters() {
        Growpage.Recommended_Posters();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void share_your_personal_website_Verified(){Growpage.share_your_personal_website_Verified();}

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void growPageallSeemoreTest(){Growpage.allSeemore();}


    @Test(priority = 1, retryAnalyzer = RetryAnalyser.class)
    public void Add_customer() {
        CRM.VerifyCustomerDetailsPage();
        CRM.VerifyAddCustomer();
    }


    @Test(priority = 2, retryAnalyzer = RetryAnalyser.class)
    public void Edit_customer() {
        CRM.VerifyCustomerDetailsPage();
        CRM.VerifyEditCustomer(tl.NameGenerator());
    }

    @Test(priority = 3, retryAnalyzer = RetryAnalyser.class)
    public void Add_Note() {
        CRM.VerifyCustomerDetailsPage();
        CRM.VerifyAddNote();
    }

    @Test(priority = 4, retryAnalyzer = RetryAnalyser.class)
    public void Edit_Note() {
        CRM.VerifyCustomerDetailsPage();
        CRM.VerifyEditNote();
    }

    @Test(priority = 5, retryAnalyzer = RetryAnalyser.class)
    public void AddFile() {

        CRM.VerifyCustomerDetailsPage();
        CRM.VerifyAddFile();
    }

    @Test(priority = 6, retryAnalyzer = RetryAnalyser.class)
    public void EditFile() {
        CRM.VerifyCustomerDetailsPage();
        CRM.VerifyEditFile();
    }

    @Test(priority = 7, retryAnalyzer = RetryAnalyser.class)
    public void greeting_through_customer_listing_page() {

        CRM.VerifyCustomerDetailsPage();
        CRM.Verify_greeting_through_customer_Listing_Page();
    }

    @Test(priority = 8, retryAnalyzer = RetryAnalyser.class)
    public void greeting_through_customer_details_page() {
        CRM.VerifyCustomerDetailsPage();
        CRM.Verify_greeting_through_customer_details_Page();
    }

    @Test(priority = 22, retryAnalyzer = RetryAnalyser.class)
    public void delete_customer() {
        CRM.VerifyCustomerDetailsPage();
        CRM.Verify_delete_customer();
    }
    @Test(priority = 12, retryAnalyzer = RetryAnalyser.class)
    public void Bulk_Upload() {
        CRM.VerifyCustomerDetailsPage();
        CRM.bulk_upload();
    }

    @Test(priority = 9,retryAnalyzer = RetryAnalyser.class)
    public void VerifyAddEventFromCustomerDetailsPage()
    {
        CRM.VerifyCustomerDetailsPage();
        CRM.VerifyAddEventFromCustomerDetailsPage();
    }
    @Test(priority = 10,retryAnalyzer = RetryAnalyser.class)
    public void VerifyAddEventFromCustomerlistingPage()
    {
        CRM.VerifyCustomerDetailsPage();
        CRM.VerifyAddEventFromCustomerlistingPage();
    }
    @Test (priority = 11,retryAnalyzer = RetryAnalyser.class)
    public void VerifyAddEventFromgreetingsPage()
    {
        CRM.VerifyCustomerDetailsPage();
        CRM.VerifyAddEventFromgreetingsPage();
    }

    @AfterClass
    public void Close() {
       driver.quit();
    }

}
