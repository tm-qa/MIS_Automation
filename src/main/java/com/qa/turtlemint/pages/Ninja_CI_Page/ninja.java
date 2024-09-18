package com.qa.turtlemint.pages.Ninja_CI_Page;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.Mintpro_CI_Page.CI_Life;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class ninja extends TestBase {

    public String p;
    public String c;
    public String d;


    public String mintproW;
    public String ninjaW;
    public String ninjasignupW;

    public String nin;

    public String reqID;

    public String mID;

    CI_Life cip = new CI_Life();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    Actions act = new Actions(driver);

    @FindBy(xpath = "//span/a[@id='google-signin-button']")
    WebElement SignInbtn;

    @FindBy(xpath = "//input[@type='email']")
    WebElement Email;

    @FindBy(xpath = "//span[text()='Next']")
    WebElement Nextbtn1;

    @FindBy(xpath = "//div[@id='password']/div/div/div/input[@type='password']")
    WebElement Password;

    @FindBy(xpath = "//div[@id='passwordNext']")
    WebElement Nextbtn2;

    @FindBy(xpath = "//input[@placeholder=\"Search by Reg Number, Customer Name, DP Name, DP Phone Number\"]")
    WebElement SearchBar;

    @FindBy(xpath = "//a[contains(text(),'Policy Issuance')]")
    WebElement PolicyIssuance;

    @FindBy(xpath = "//span[text()='Action Reqd']")
    WebElement ActionReq;

    @FindBy(xpath = "//button[text()='OWN']")
    WebElement OWNbtn;

    @FindBy(xpath = "//button[normalize-space()='Save Issuance']")
    WebElement saveissuance;

    @FindBy(xpath = "//input[@id=\"requestId\"]")
    WebElement reqid;

    @FindBy(xpath = "//md-select[@id='premiumPaymentFrequency']")//
    WebElement paymentFreq;

    @FindBy(xpath = "//div[text()='Yearly']")//
    WebElement selectPaymentFreq;

    @FindBy(xpath = "//input[@id='tmPlanId']")//
    WebElement planNameDrpDwn;

    @FindBy(xpath = "//span[@title='Others']")//
    WebElement planNameOther;

    @FindBy(xpath = "//input[@id='planName']")//
    WebElement planNameCuctom;

    @FindBy(xpath = "//md-select[@id='proposerTitle']")//
    WebElement proposerTitle;

    @FindBy(xpath = "//md-option[@value='mr']")//
    WebElement mrProposerTitle;

    @FindBy(xpath = "//input[@id='pincode']")//
    WebElement enterPincode;

    @FindBy(xpath = "//md-select[@id='proposerGender']")//
    WebElement genederSelect;

    @FindBy(xpath = "//div[text()='Male']")//
    WebElement genederMaleSelect;

    @FindBy(xpath = "//md-select[@id='inspectionStatus']")//
    WebElement inspectionStatus;

    @FindBy(xpath = "(//md-option[@value='SCHEDULED'])[2]")//
    WebElement inspectionStatusScedule;

    @FindBy(xpath = "//md-option[@value='RECOMMENDED']")//
    WebElement inspectionStatusRecommended;

    @FindBy(xpath = "//input[@id='txnNo']")//
    WebElement transctnNumber;

    @FindBy(xpath = "//md-select[@id='paymentStatus']")//
    WebElement paymentStatus;

    @FindBy(xpath = "//div[text()='Payment Complete']")//
    WebElement paymentStatusComplete;

    @FindBy(xpath = "//label[text()='Payment Complete Date *']//parent::div//following-sibling::div/md-datepicker")//
    WebElement paymentDateDrpdwn;

    @FindBy(xpath = "//td[@aria-label='Monday April 10 2023']")//
    WebElement paymentDate;

    @FindBy(xpath = "//md-checkbox[@name='paymentVerified']//child::div[@class='md-icon']")//
    WebElement paymentVerifyChkBox;

    @FindBy(xpath = "//md-select[@id='applicationStatus']")//
    WebElement apaplictnStsDrpdwn;

    @FindBy(xpath = "//div[text()='Completed']")//
    WebElement apaplictnStsComplete;

    @FindBy(xpath = "//input[@id='applicationUrl']")//
    WebElement apaplictnURL;

    @FindBy(xpath = "//md-select[@id='policyIssuanceStatus']")//
    WebElement issuanceStsDrpdwn;

    @FindBy(xpath = "//div[text()='Issued']")//
    WebElement issuanceStatus;

    @FindBy(xpath = "//md-datepicker[@id='policyIssuanceDate']")//
    WebElement issuanceDate;

    @FindBy(xpath = "//td[@class='md-calendar-date md-calendar-date-today md-focus']")//
    WebElement issuanceDateSlct;

    @FindBy(xpath = "//input[@id='policyNumber']")//
    WebElement enterPolicyNumber;

    @FindBy(xpath = "//input[@id='applicationNumber']")//
    WebElement enterApplicationNumber;

    @FindBy(xpath = "//button[@data-auto='open-policy-fields']")//
    WebElement drpdwn;

    //MIS
    @FindBy(xpath = "//button[@data-auto='goback-button']")//
            WebElement backButton;

    @FindBy(xpath = "//a[@ng-click='sidemenu = !sidemenu']")//
    WebElement sideMenuButton;

    @FindBy(xpath = "//span[text()='MIS']")//
    WebElement misModule;

    @FindBy(xpath = "//input[@type='search']")//
    WebElement searchBarMIS;

    @FindBy(xpath = "(//button[@class='md-icon-button hover-btn md-button'])[1]")//
    WebElement editButton;

    @FindBy(xpath = "//md-select[@id='typeOfBusiness']")//
    WebElement clientCategory;

    @FindBy(xpath = "//div[text()='Individual - RI']")//
    WebElement individualRIClient;

    @FindBy(xpath = "//input[@id='benefitPayoutTerm']")//
    WebElement benefiitTerm;

    @FindBy(xpath = "//input[@id='comments']")//
    WebElement commentBox;

    @FindBy(xpath = "//md-select[@id='policyStatus']")
    WebElement policyStatusMis;

    @FindBy(xpath = "//div[text()='Junk']")
    WebElement junkPolicyStatus;

    @FindBy(xpath = "//input[@id='policyDetailsId']")//
    WebElement misID;

    @FindBy(xpath = "//button[text()='Save Sale']")//
    WebElement saveSaleButton;

    @FindBy(xpath = "//button[text()='YES']")//
    WebElement yesButton;

    @FindBy(xpath = "//span[text()='Junk']")//
    WebElement policyJunkMark;

    @FindBy(xpath = "//tr[@md-select='policy']")//
    WebElement selectPolicy;

    @FindBy(xpath = "//md-datepicker[@name='policyStartDate']")
    WebElement StartDatePicker;

    @FindBy(xpath = "//td[@class=\"md-calendar-date md-calendar-date-today md-focus\"]")
    WebElement Today;


    public ninja() {
        PageFactory.initElements(driver, this);
    }

    public void NinjaLogin(String NinjaEmail, String NinjaPassword) throws Exception {
       // driver.get("https://ninja.sanity.turtle-feature.com/login");         ////sanityURL
        //   driver.get("https://ninja.turtlemint.com/login");                      ///PROD
        driver.get(System.getProperty("url"));

        Thread.sleep(2000);
        LogUtils.info("Ninja Website Opened");
        String strUrl = driver.getCurrentUrl();
        LogUtils.info("Opened Website: " + strUrl);
        SignInbtn.click();
        Thread.sleep(4000);
        LogUtils.info("Clicked on Sign In with Google Button");

        Set<String> allWindowHandles = driver.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<String>(allWindowHandles);
        System.out.println("No. of tabs: " + tabs.size());

        if (tabs.size() <= 2) {
            Set<String> window = driver.getWindowHandles();
            Iterator<String> it = window.iterator();
            p = it.next();
            c = it.next();
            driver.switchTo().window(c);
            System.out.println("If code Run");
        } else {
            Set<String> windows = driver.getWindowHandles();
            Iterator<String> it = windows.iterator();
            mintproW = it.next();
            ninjaW = it.next();
            ninjasignupW = it.next();
            driver.switchTo().window(ninjasignupW);
            System.out.println("Else code run");
        }
        LogUtils.info("Switched to child window");
        Email.sendKeys(NinjaEmail);
        LogUtils.info("Email Entered");
        Nextbtn1.click();
        LogUtils.info("Clicked on Next button");
        Password.sendKeys(NinjaPassword);
        LogUtils.info("Password entered");
        Nextbtn2.click();
        LogUtils.info("Clicked on Next button after password");
        if (tabs.size() <= 2) {
            driver.switchTo().window(p);
        } else {
            driver.switchTo().window(ninjaW);
        }
        LogUtils.info("Switched Back to Parent window");
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
    }

    public void issuedPolicyThroughNinja(String u_ID) throws Exception {
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(2000);
        NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        WebCommands.staticSleep(5000);
        System.out.println(u_ID);
        PolicyIssuance.click();
        LogUtils.info("Clicked on PolicyIssuance btn");
        Thread.sleep(3500);
        SearchBar.click();
        WebCommands.staticSleep(1000);
        SearchBar.sendKeys(u_ID);
        LogUtils.info("Clicked on Searchbar and put unique ID");
        Thread.sleep(2000);
        SearchBar.sendKeys(Keys.RETURN);
        LogUtils.info("Enter on Search bar");
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
        TestUtil.click(ActionReq, "Clicked On action required for own");
        TestUtil.click(OWNbtn, "Clicked on OWN button");
        WebCommands.staticSleep(30000);
        reqID = reqid.getAttribute("value");
        WebCommands.staticSleep(4000);
        TestUtil.click(drpdwn, "");
        WebCommands.staticSleep(1000);
        TestUtil.click(proposerTitle, "");//
        TestUtil.click(mrProposerTitle, "Mr. Title selected");//
        TestUtil.sendKeys(enterPincode, "400001", "Entered Pin Code");//
        TestUtil.click(genederSelect, "Selecting Proposer Gender");//
        TestUtil.click(genederMaleSelect, "Proposer Gender Male Selected");//
        js.executeScript("arguments[0].click()", paymentFreq);//
        TestUtil.click(selectPaymentFreq, "Select Yearly Payment Frequency");//
        WebCommands.staticSleep(2000);
        planNameDrpDwn.clear();
        TestUtil.sendKeys(planNameDrpDwn, "ot", "Entered ot in Dropdown");//
        TestUtil.click(planNameOther, "PlanName Other Selected");//
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(planNameCuctom, "CustomPlan Name", "Entered Pin Code");//
        TestUtil.click(inspectionStatus, "Clicked on InspectionStatus DrpDwn");//
        WebCommands.staticSleep(2000);
        TestUtil.click(inspectionStatusScedule, "InspectionStatus Schedule Selected");//
        TestUtil.click(saveissuance, "Click on Save Issuance");//
        WebCommands.staticSleep(5000);
        js.executeScript("arguments[0].click()", inspectionStatus);//
        TestUtil.click(inspectionStatusRecommended, "InspectionStatus Recommended Selected");//
        WebCommands.staticSleep(5000);
        TestUtil.sendKeys(transctnNumber, "ABCD123456", "Clicked on InspectionStatus DrpDwn");//
        TestUtil.click(paymentStatus, "Clicked on PaymentStatus DrpDwn");//
        TestUtil.click(paymentStatusComplete, "PaymentStatus Complete Selected");//
        TestUtil.click(paymentDateDrpdwn, "");//
        TestUtil.click(paymentDate, "Payment Date Selected as 10th Apr 2023");//
        WebCommands.staticSleep(5000);
        js.executeScript("arguments[0].click()", paymentVerifyChkBox);
        LogUtils.info("Payment Verify CheckBox Tick");
        TestUtil.click(apaplictnStsDrpdwn, "Clicked on ApplicationStatus Dropdown");
        TestUtil.click(apaplictnStsComplete, "ApplicationStatus Complete Selected");//
        TestUtil.sendKeys(apaplictnURL, "abc@asd.com", "Application URL Entered");//
        WebCommands.staticSleep(3000);
        TestUtil.click(issuanceStsDrpdwn, "Click on Issuance Status Dropdown");//
        TestUtil.click(issuanceStatus, "Issuance Status Issued Selected");//
        TestUtil.click(issuanceDate, "");//
        TestUtil.click(issuanceDateSlct, "13th April 2023 Issuance Date Selected");//
        WebCommands.staticSleep(3000);
        TestUtil.sendKeys(enterPolicyNumber, TestUtil.generateRandomPolicyNo(7), "Policy Number Entered");//
        TestUtil.sendKeys(enterApplicationNumber, TestUtil.generateRandomPolicyNo(6), "Policy Number Entered");//
        TestUtil.click(saveissuance, "Click on Save Issuance");//
        WebCommands.staticSleep(2000);
        TestUtil.click(StartDatePicker, "");
        WebCommands.staticSleep(2000);
        TestUtil.click(Today, "Selected for risk start date");
        WebCommands.staticSleep(3000);
        TestUtil.click(saveissuance, "Click on Save Issuance");
        WebCommands.staticSleep(5000);
        js.executeScript("arguments[0].scrollIntoView(true);", misID);
        WebCommands.staticSleep(2000);
        mID = misID.getAttribute("value");
        System.out.println("MIS ID : " + mID);
        TestUtil.getScreenShot();
        LogUtils.info("Policy Issued Successfully");

    }

    public void junkMarkPolicy() {
        WebCommands.staticSleep(5000);
        TestUtil.click(backButton, "");
        TestUtil.click(sideMenuButton, "");
        TestUtil.click(misModule, "Clicked on MIS Module");
        TestUtil.click(searchBarMIS, "Clicked on Search Bar");
        searchBarMIS.sendKeys(mID);
        searchBarMIS.sendKeys(Keys.RETURN);
        TestUtil.click(selectPolicy, "Policy Selected");
        TestUtil.click(editButton, "Clicked On Pen Edit Button");
        js.executeScript("arguments[0].click()", clientCategory);//
        js.executeScript("arguments[0].click()", individualRIClient);//


        //  TestUtil.click(clientCategory, "Clicked On Client Category Section");
        // TestUtil.click(individualRIClient, "Individual RI Client Category Selected");
        TestUtil.sendKeys(benefiitTerm, "1", "Benefit Payout Term 1 given");//
        TestUtil.sendKeys(commentBox, "Testing", "Entered Comment");//

        js.executeScript("arguments[0].click()", policyStatusMis);//
        js.executeScript("arguments[0].click()", junkPolicyStatus);//

        js.executeScript("arguments[0].click()", saveSaleButton);//
        js.executeScript("arguments[0].click()", yesButton);//

//        TestUtil.click(policyStatusMis, "Clicked on Policy Status DropDown");
//        TestUtil.click(junkPolicyStatus, "Junk Selected Policy Status");
//        TestUtil.click(saveSaleButton, "Clicked on Save Sale Button");
//        TestUtil.click(yesButton, "Yes Button Clicked");
        Assert.assertTrue(policyJunkMark.isDisplayed());
        TestUtil.getScreenShot();
        LogUtils.info("Policy Junk Marked Successfully");
    }
}
