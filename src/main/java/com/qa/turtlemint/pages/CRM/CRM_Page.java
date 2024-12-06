package com.qa.turtlemint.pages.CRM;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class CRM_Page extends TestBase {
    @FindBy(xpath = "//span[text()='Leads']")
    WebElement LeadsChips;
    @FindBy(xpath = "//span[text()='My Customers']")
    WebElement My_customers;
    @FindBy(xpath = "//span[text()='Add a Customer']")
    WebElement Add_A_customers;
    @FindBy(xpath = "//input[@id='standard-dense-firstName']")
    WebElement First_name;

    @FindBy(xpath = "//div[text()='Save']")
    WebElement save;
    @FindBy(xpath = "(//div[text()='Save'])[2]")
    WebElement save_popup;
    @FindBy(xpath = "(//div[text()='AutomationUser'])[1]")
    WebElement customers_name;
    @FindBy(xpath = "//img[@alt='threeDot']")
    WebElement three_dot;
    @FindBy(xpath = "//span[text()='Notes']")
    WebElement Notes;
    @FindBy(xpath = "//span[text()='Edit']")
    WebElement edit;
    @FindBy(xpath = "//input[@id='standard-dense-lastName']")
    WebElement last_name;
    @FindBy(xpath = "(//div[contains(text(), 'AutomationUser')])[1]")
    WebElement Updatedcustomers_name;

    @FindBy(xpath = "//div[text()='Add a Note']")
    WebElement add_note;
    @FindBy(xpath = "//textarea[@id='standard-dense-message']")
    WebElement message;
    @FindBy(xpath = "//span[text()='+ Attach Image']")
    WebElement attach_image;
    @FindBy(xpath = "//div[text()='message for automation customer']")
    WebElement addedNote;
    @FindBy(xpath = "(//div[@role='presentation'])[7]")
    WebElement firstNote;
    @FindBy(xpath = "//textarea[@id='standard-dense-message']")
    WebElement Editmessage;
    @FindBy(xpath = "//div[contains(text(), 'edit')]")
    WebElement editedNote;
    @FindBy(xpath = "//a[@href='/crm/customers']")
    WebElement customer_details;
    @FindBy(xpath = "(//div[@role='presentation'][@class='_leftCard'])[1]")
    WebElement first_customer;
    @FindBy(xpath = "//span[text()='Files']")
    WebElement File;
    @FindBy(xpath = "//div[text()='Add a File']")
    WebElement Add_A_File;
    @FindBy(xpath = "//input[@id='standard-dense-title']")
    WebElement file_name;
    @FindBy(xpath = "//input[@type='file']")
    WebElement Attach_File;
    @FindBy(xpath = "//div[text()='file name']")
    WebElement FileName;
    @FindBy(xpath = "(//div[@role='presentation'])[7]")
    WebElement FirstfileName;
    @FindBy(xpath = "//div[contains(text(), 'edit')] ")
    WebElement EditedFileName;
    @FindBy(xpath = "//span[text()='Set Event Reminder']")
    WebElement Event_remainder;
    @FindBy(xpath = "//div[@role='button']")
    WebElement occasion_dropdown;
    @FindBy(xpath = "//li[@name='Anniversary']")
    WebElement Anniversary;
    @FindBy(xpath = "//input[@value='']")
    WebElement ReminderDate;
    @FindBy(xpath = "//div[text()='Save Reminder']")
    WebElement save_remainder;
    @FindBy(xpath = "//span[text()='Send Personalized Wish']")
    WebElement Send_Personalized_Wish;
    @FindBy(xpath = "(//div[@class='searchElement'])[1]")
    WebElement first_auto_search_customer;
    @FindBy(xpath = "//input[@type='search']")
    WebElement searchWithCustomerName;
    @FindBy(xpath = "//img[@alt='Happy Birthday']")
    WebElement select_first_birthday_greeting;
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement Continue;
    @FindBy(xpath = "//div[text()='Send Wish']")
    WebElement send_wish;
    @FindBy(xpath = "//span[text()='Delete']")
    WebElement delete;
    @FindBy(xpath = "//span[text()='Yes']")
    WebElement Yes;
    @FindBy(xpath = "//span[text()='Set Event Reminder']")
    WebElement Set_Event_Reminder;
    @FindBy(xpath = "//span[text()='Set Reminder']")
    WebElement set_Reminder;
    @FindBy(xpath = "//div[text()='5 Apr']")
    WebElement april;
    @FindBy(xpath = "//div[text()='05 Apr']")
    WebElement april1;
    @FindBy(xpath = "//div[text()='06 Jun']")
    WebElement jun;
    @FindBy(xpath = "//div[text()='07 Jul']")
    WebElement julay;
    @FindBy(xpath = "//img[@src='data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iMTIiIGhlaWdodD0iMTIiIGZpbGw9Im5vbmUiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyI+PHBhdGggZmlsbC1ydWxlPSJldmVub2RkIiBjbGlwLXJ1bGU9ImV2ZW5vZGQiIGQ9Ik0xMC42OSA4LjQ1N0EzLjM0OSAzLjM0OSAwIDAxOS41IDUuODk0VjQuNWEzLjUwMyAzLjUwMyAwIDAwLTMtMy40NlYuNWEuNS41IDAgMTAtMSAwdi41NGMtMS42OTMuMjQ0LTMgMS43LTMgMy40NnYxLjM5NGMwIC45OS0uNDM0IDEuOTI0LTEuMTk0IDIuNTY2QS44NzMuODczIDAgMDAxLjg3NSAxMGg4LjI1YS44NzYuODc2IDAgMDAuNTY1LTEuNTQzek0uNSA0Ljk0YS41LjUgMCAwMDEgMCA1LjIyIDUuMjIgMCAwMTEuNTM3LTMuNzEzLjUuNSAwIDEwLS43MDYtLjcwN0E2LjIxIDYuMjEgMCAwMC41IDQuOTQxem0xMCAwYS41LjUgMCAwMDEgMGMwLTEuNjctLjY1LTMuMjM5LTEuODMtNC40MmEuNS41IDAgMTAtLjcwNy43MDdBNS4yMTcgNS4yMTcgMCAwMTEwLjUgNC45NDF6TTcuODM3IDEwLjVBMS44NzggMS44NzggMCAwMTYgMTJhMS44NzggMS44NzggMCAwMS0xLjgzNy0xLjVoMy42NzR6IiBmaWxsPSIjNDQ0ODQ1Ii8+PC9zdmc+']")
    WebElement see_more_event;
    @FindBy(xpath = "//span[@class='_icon']")
    WebElement upcoming_events;
    @FindBy(xpath = "//span[text()='Customer Bulk Upload']")
    WebElement Customer_Bulk_Upload;
    @FindBy(xpath = "//label[@for='uploadFile']")
    WebElement File_Upload;

    public CRM_Page() {
        PageFactory.initElements(driver, this);
    }

    public void VerifyCustomerDetailsPage() {
        LeadsChips.isDisplayed();
        WebCommands.staticSleep(1000);
        TestUtil.click(LeadsChips, "Clicked on Leads Chips");
        WebCommands.staticSleep(5000);
        TestUtil.click(My_customers, "My_customers tab clicked");
        WebCommands.staticSleep(2000);
    }
    public void VerifyAddCustomer() {
        TestUtil.click(Add_A_customers, "Add_A_customers cta clicked");
        TestUtil.sendKeys(First_name,"AutomationUser","first name entered");
        TestUtil.click(save, "save customer clicked");
        TestUtil.click(save_popup, "save  clicked");
    }
    public void VerifyEditCustomer(String LastName) {
        TestUtil.click(customers_name, "clicked on created customer");
        WebCommands.staticSleep(2000);
        TestUtil.click(three_dot, "clicked on three_dot ");
        TestUtil.click(edit, "clicked on edit ");
        WebCommands.staticSleep(2000);
        TestUtil.click(last_name, "clicked on lastname ");
        WebCommands.staticSleep(2000);
        last_name.sendKeys(LastName);
        WebCommands.staticSleep(3000);
        TestUtil.click(save, "save cta post customer details edit clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(customer_details, "customer_details clicked");
        WebCommands.staticSleep(2000);
        WebElement Updatedcustomer_name=driver.findElement(By.xpath("(//div[contains(text(), '" + LastName + "')])"));
        TestUtil.IsDisplayed(Updatedcustomer_name,"updated name of customer displayed");

    }
    public void VerifyAddNote() {
        //TestUtil.click(My_customers, "My_customers tab clicked");
        TestUtil.click(first_customer, "first customer clicked");
        TestUtil.click(Notes, "Notes  clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(add_note, "clicked on add a note");
        TestUtil.sendKeys(message,"message for automation customer","message entered");
        TestUtil.click(save, "save cta post adding notes clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(Notes, "Notes  clicked");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(addedNote,"added message displayed");
        TestUtil.click(customer_details, "customer_details clicked");

    }

    public void VerifyEditNote() {
        TestUtil.click(first_customer, "first customer clicked");
        TestUtil.click(Notes, "Notes  clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(firstNote, "previously added first note clicked");
        TestUtil.sendKeys(Editmessage,"edit","edited message entered in old notes");
        TestUtil.click(save, "save cta post editing notes clicked");
        TestUtil.click(Notes, "Notes  clicked");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(editedNote,"edited note displayed");
        TestUtil.click(customer_details, "customer_details clicked");

    }

    public void VerifyAddFile() {
        WebCommands.staticSleep(5000);
        TestUtil.click(first_customer, "first customer clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(File, "NoteFiles  clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(Add_A_File, "Add_A_File  clicked");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(file_name,"file name","file name entered");
        WebCommands.staticSleep(5000);
        TestUtil.uploadFile("ubuntu");
       // Attach_File.sendKeys("/Users/bandewadganeshbaiaji/Desktop/abcd.pdf");
        WebCommands.staticSleep(3000);
        TestUtil.click(save, "save cta post uploading file");
        WebCommands.staticSleep(2000);
        TestUtil.click(File, "NoteFiles  clicked");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(FileName,"post uploading file file name displayed");
        TestUtil.click(customer_details, "customer_details clicked");

    }
    public void VerifyEditFile() {
        TestUtil.click(first_customer, "first customer clicked");
        TestUtil.click(File, "NoteFiles  clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(FirstfileName, "old file clicked");
        TestUtil.sendKeys(file_name,"edit","file name entered");
        TestUtil.click(save, "save cta clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(File, "NoteFiles  clicked");
        TestUtil.IsDisplayed(EditedFileName,"EditedFileName displayed");
        TestUtil.click(customer_details, "customer_details clicked");

    }

    public void Verify_greeting_through_customer_Listing_Page() {
        TestUtil.click(Send_Personalized_Wish, "Send_Personalized_Wish on customer listing page clicked");
        WebCommands.staticSleep(3000);
        TestUtil.click(select_first_birthday_greeting, "clicked on first bday_greeting ");
        TestUtil.sendKeys(searchWithCustomerName,"auto","auto name entered");
        TestUtil.click(first_auto_search_customer, "clicked on first_auto_search_customer");
        TestUtil.click(Continue, "clicked on Continue");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();

    }
    public void Verify_greeting_through_customer_details_Page() {
        TestUtil.click(first_customer, "first customer clicked");
        TestUtil.click(send_wish, "send_wish clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(select_first_birthday_greeting, "clicked on first bday greeting ");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }
    public void VerifyAddEventFromCustomerDetailsPage() {
        TestUtil.click(first_customer, "first customer clicked");
        TestUtil.click(three_dot, "clicked on three_dot ");
        TestUtil.click(Event_remainder, "clicked on Event_remainder ");
        TestUtil.click(occasion_dropdown, "clicked on occasion_dropdown ");
        TestUtil.click(Anniversary, "clicked on Anniversary ");
        TestUtil.sendKeys(ReminderDate,"05042025","date entered");
        TestUtil.click(save_remainder, "clicked on save_reminder ");
        WebCommands.staticSleep(2000);
        if(see_more_event.isDisplayed()){
            TestUtil.click(see_more_event,"notification icon clicked to land on event page");
            WebCommands.staticSleep(2000);
            TestUtil.IsDisplayed(april1,"5 april displayed");
        }
        else {
            TestUtil.IsDisplayed(april,"5 april displayed");
        }
    }

    public void VerifyAddEventFromCustomerlistingPage() {
        TestUtil.click(Set_Event_Reminder, "clicked on Set_Event_Reminder ");
        TestUtil.sendKeys(searchWithCustomerName,"auto","auto name entered");
        WebCommands.staticSleep(2000);
        TestUtil.click(first_auto_search_customer, "clicked on first_auto_search_customer");
        TestUtil.click(occasion_dropdown, "clicked on occasion_dropdown ");
        TestUtil.click(Anniversary, "clicked on Anniversary ");
        TestUtil.sendKeys(ReminderDate,"06062025","date entered");
        TestUtil.click(save_remainder, "clicked on save_reminder ");
        WebCommands.staticSleep(2000);
        TestUtil.click(Send_Personalized_Wish, "Send_Personalized_Wish on customer listing page clicked");
        driver.navigate().refresh();
        TestUtil.click(upcoming_events, "clicked on upcoming_events ");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(jun,"6 jun date displayed");

    }
    public void VerifyAddEventFromgreetingsPage() {
        TestUtil.click(first_customer, "first customer clicked");
        TestUtil.click(send_wish, "send_wish clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(set_Reminder, "clicked on set_Reminder ");
        WebCommands.staticSleep(2000);
        TestUtil.click(occasion_dropdown, "clicked on occasion_dropdown ");
        TestUtil.click(Anniversary, "clicked on Anniversary ");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(ReminderDate,"07072025","date entered");
        TestUtil.click(save_remainder, "clicked on save_reminder ");
        WebCommands.staticSleep(2000);
        driver.navigate().refresh();
        TestUtil.click(upcoming_events, "clicked on upcoming_events ");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(julay,"7 julay date displayed");

    }

    public void Verify_delete_customer() {
        TestUtil.click(first_customer, "first customer clicked");
        TestUtil.click(three_dot, "clicked on three_dot ");
        TestUtil.click(delete, "clicked on delete ");
        TestUtil.click(Yes, "clicked on Yes ");

    }
    public void bulk_upload() {
        TestUtil.click(Customer_Bulk_Upload, "clicked on Customer_Bulk_Upload CTA");
        TestUtil.getScreenShot();
        TestUtil.click(File_Upload, "clicked on File_Upload ");
    }

    }
