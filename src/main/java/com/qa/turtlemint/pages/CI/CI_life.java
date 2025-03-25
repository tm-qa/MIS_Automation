package com.qa.turtlemint.pages.CI;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;

import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CI_life extends TestBase {
    public String getUrl;
    public String orderID;
    public String reqID;
    public String mintproW;
    public String ninjaW;
    public String ninjasignupW;
    public String p;
    public String c;


    public String mID;

    public CI_life() {
        PageFactory.initElements(driver, this);
    }

    JavascriptExecutor jse = (JavascriptExecutor) driver;

    TestUtil tl = new TestUtil();
    LeadName_Page leadpage = new LeadName_Page();

    @FindBy(xpath = "//label[@id=\"Radio-M\"]")
    WebElement Maleselected;

    @FindBy(xpath = "//label[@id=\"Radio-F\"]")
    WebElement Femaleselected;

    @FindBy(xpath = "//label[@id=\"Radio-true\"]")
    WebElement yes;

    @FindBy(xpath = "//label[@id=\"Radio-false\"]")
    WebElement no;

    @FindBy(xpath = "//span[normalize-space()='Next']")
    WebElement Next;

    @FindBy(xpath = "//input[@name='customerName']")
    WebElement LeadName;

    @FindBy(xpath = "//input[@placeholder='Pincode']")
    WebElement Pincode;

    @FindBy(xpath = "//span[text()='Select Occupation']")
    WebElement SelectOccupation;

    @FindBy(xpath = "//li[text()='Self employed']")
    WebElement Selfemployed;

    @FindBy(xpath = "//span[text()='Select Educational Qualification']")
    WebElement SelectEducationalQualification;

    @FindBy(xpath = "//li[text()='Graduate and above']")
    WebElement Graduateandabove;

    @FindBy(id = "maturityAge")
    WebElement maturityAge;

    @FindBy(xpath = "//a[text()='50 years']")
    WebElement maturityAge_50Yr;







    @FindBy(xpath = "//input[@placeholder=\"Enter Date\"]")
    WebElement calender;

    @FindBy(xpath = "//input[@placeholder=\"Enter Date\"]")
    WebElement calenderchild;

    @FindBy(xpath = "//select[@class='sc-hrWEMg cDlQIW'][1]")
    WebElement yearselect;

    @FindBy(xpath = "//select[@class='sc-hrWEMg cDlQIW'][2]")
    WebElement monthselect;

    @FindBy(xpath = "//div[@aria-label=\"Choose Sunday, December 1st, 1985\"]")
    WebElement dateselect_1Dec;

    @FindBy(xpath = "//span[text()='Next']")
    WebElement next;

    @FindBy(id = "details-page-buy-now-btn")
    WebElement buyNowButton;

    @FindBy(id = "insuredMemberLName")
    WebElement lastname;

    @FindBy(id = "insuredMemberMobile")
    WebElement mobilrNo;

    @FindBy(id = "insuredMemberEmail")
    WebElement emailId;
    @FindBy(xpath = "//input[@id='insuredMemberRegisteredAddress1']")
    WebElement Add1;

    @FindBy(xpath = "//input[@id='insuredMemberRegisteredAddress2']")
    WebElement Add2;

    @FindBy(id = "insuredMemberMaritalStatus-uiSelect")
    WebElement maritalstatusDropdown;

    @FindBy(xpath = "//span[text()='Married']")
    WebElement married;

    @FindBy(xpath = "//button[@data-auto=\"Continue\"]")
    WebElement continu;

    @FindBy(xpath = "//button[contains(@data-auto,'viewdetail-BAJAJLI-Smart Protect')]")
    WebElement BajajAllianz;

    @FindBy(xpath = "//*[@id=\"listItem-P85-viewDetails\"]/span")
    WebElement TataAIA;
    @FindBy(xpath = "//p[text()='Term Insurance']")
    WebElement termLifeButton;;

    @FindBy(xpath = "//div[text()='Health Insurance']//parent::div")
    WebElement healthInsureButton;
    @FindBy(xpath = "//span[text()='Life']")
    WebElement term_life;

    @FindBy(xpath = "//span[text()='Health']")
    WebElement health;

    @FindBy(xpath = "//p[text()='Quotes & BI']")
    WebElement QuotesAndBI;

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

    @FindBy(xpath = "//span[@title=\"Sampoorna Raksha Supreme \"]")//
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

    @FindBy(xpath = "//input[@id='txnNo']")//
    WebElement transctnNumber;

    @FindBy(xpath = "//md-select[@id='paymentStatus']")//
    WebElement paymentStatus;

    @FindBy(xpath = "//div[text()='Payment Complete']")//
    WebElement paymentStatusComplete;

    @FindBy(xpath = "//md-datepicker[@name=\"paymentCompleteDate\"]//parent::div//input")//
    WebElement paymentDateDrpdwn;

    @FindBy(xpath = "//td[@class=\"md-calendar-date md-calendar-date-today md-focus\"]")//
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

    @FindBy(xpath = "//md-select[@data-auto=\"typeOfBusiness-select\"]")
    WebElement typeofbus;

    @FindBy(xpath = "//md-select[@id=\"businessType\"]")
    WebElement typeofbusHealth;

    @FindBy(xpath = "//md-option[@value=\"NEW\"]")
    WebElement NEW;

    @FindBy(xpath = "//md-option[@value=\"KEYMAN\"]")
    WebElement KEYMAN;

    @FindBy(xpath = "//md-checkbox[@id='paymentVerified']//div[@class='md-container md-ink-ripple']")
    WebElement PaymentVerifiedCheck;

    @FindBy(xpath = "//md-radio-button[@data-auto=\"paymentMode-CHEQUE-radio\"]")
    WebElement ChequeClicked;

    @FindBy(xpath = "//textarea[@id=\"chequeDetails\"]")
    WebElement chequeDetail;

    @FindBy(xpath = "//md-select[@name=\"healthIssuanceSubStatus\"]")
    WebElement issuanceSubStatus;

    @FindBy(xpath = "//md-option[@value=\"SCHEDULED\"]")
    WebElement SCHEDULED;

    @FindBy(xpath = "//input[@id=\"$$loadingPremium\"]")
    WebElement loadingprem;

    @FindBy(xpath = "//md-select[@name=\"policyIssuanceStatus\"]")
    WebElement policyIssuanceStatus;

    @FindBy(xpath = "//md-option[@data-auto=\"policyIssuanceStatus-CANCELLED-select\"]")
    WebElement cancelled;

    @FindBy(xpath = "//textarea[@placeholder=\"Reason for Cancellation\"]")
    WebElement ReasonsforCancellation;

    @FindBy(xpath = "//td[text()='CANCELLED']")
    WebElement CANCELLED;

    @FindBy(xpath = "//md-select[@id=\"policyIssuanceStatus\"]")
    WebElement policystatus;

    @FindBy(xpath = "//md-option[@data-auto=\"policyIssuanceStatus-CANCELLED-select\"]")
    WebElement Canceeled;
    @FindBy(xpath = "//span[.='Get Payment Link']")
    WebElement Submit;
    @FindBy(xpath = "//textarea[@id=\"cancellationReason\"]")
    WebElement cancelledReson;
    @FindBy(xpath = "//div[@aria-label=\"Choose Wednesday, August 5th, 1992\"]")
    WebElement dateselect_5Aug;

    @FindBy(xpath = "//button[@data-auto=\"close-pi-button\"]")
    WebElement closeButton;
    @FindBy(xpath = "//span[@data-auto='tmPlanId-others-autocomplete']")//
    WebElement SelectPlanName;

    @FindBy(xpath = "//input[@type=\"email\"]")
    WebElement emailgoogle;
    @FindBy(xpath = "//input[@type=\"password\"]")
    WebElement passworgoogle;


    @FindBy(xpath = "//md-select[@id='issuanceSubStatus']")
    WebElement issuancesub;

    @FindBy(xpath = "//md-option[@data-auto=\"issuanceSubStatus-INFORCE-select\"]")//
    WebElement INFORCE;


    @FindBy(xpath = "//md-option[@data-auto=\"issuanceSubStatus-PENDING-select\"]")//
    WebElement Pending;

    @FindBy(xpath = "//button[text()='Assign Owner']")
    WebElement assignOwner;

    @FindBy(id = "assignOwner")
    WebElement assignOwnertext;

    @FindBy(xpath = "//button[text()='Save']")
    WebElement savebutton;
    @FindBy(xpath = "//button[@id=\"listItem-P31-viewDetails\"]")
    WebElement Etouch;

    @FindBy(xpath = "//tr[@role=\"button\"]")
    WebElement action;
    @FindBy(xpath = "//span[text()='Edit']")
    WebElement modify;


    JavascriptExecutor js = (JavascriptExecutor) driver;


    public void ValidateLifeClick() throws InterruptedException {
        TestUtil.click(term_life, "Life button Click");
        WebCommands.staticSleep(5000);
    }

    public void GenderButtonClick(String Gender) {
        WebCommands.staticSleep(1000);
        if (Gender == "male") {
            TestUtil.click(Maleselected, "Male Gender Selected");
        } else
            TestUtil.click(Femaleselected, "Female Gender Selected");
    }

    public void TermLifeClick() throws InterruptedException {
        WebCommands.staticSleep(2000);
        TestUtil.click(termLifeButton, "Clicked on Term Life Option");
    }
    public void TataSRSLifeProfilePage() throws InterruptedException, IOException {
        GenderButtonClick("male");
        smoke_chewTobaco("no");
        datepicker("1992", "Aug", dateselect_5Aug);
        TestUtil.sendKeys(Pincode, "400065", "Pincode Entered");
        WebCommands.staticSleep(2000);
        TestUtil.click(next, "next button click");
        TestUtil.click(SelectOccupation, "SelectOccupation");
        TestUtil.click(Selfemployed, "Selfemployed");
        TestUtil.click(SelectEducationalQualification, "SelectEducationalQualification");
        TestUtil.click(Graduateandabove, "Graduateandabove");
        WebCommands.staticSleep(2000);
        TestUtil.click(next, "next button click");
        WebCommands.staticSleep(2000);
        leadpage.SaveLead(tl.NameGenerator());
        WebCommands.staticSleep(3000);

    }

    public void smoke_chewTobaco(String yesNo) {
        WebCommands.staticSleep(500);
        if (yesNo == "yes") {
            TestUtil.click(yes, "Yes Selected");
        } else
            TestUtil.click(no, "No Selected");
    }

    public void datepicker(String year, String Month, WebElement Date) {
        TestUtil.click(calender, "caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue(year);
        WebCommands.staticSleep(1000);
        Select monthSelect = new Select(monthselect);
        monthSelect.selectByVisibleText(Month);
        WebCommands.staticSleep(1000);
        TestUtil.click(Date, "5 aug date select");
        WebCommands.staticSleep(1000);
    }

    public void checkout() {
        TestUtil.sendKeys(lastname, "test", "last name entered");
        TestUtil.sendKeys(mobilrNo, "6888812345", "Mobile No entered");
        TestUtil.sendKeys(emailId, "automationtesting@turtlemint.com", "Email Id entered");
        TestUtil.sendKeys(Add1, "Shivaji nagar pune", "Email Id entered");
        TestUtil.sendKeys(Add2, "Kondhva  near surya gympune", "Email Id entered");
    }

    public void checkmarks() {
        WebCommands.staticSleep(3000);
        List<WebElement> AllCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        int size = AllCheckboxes.size();
        for (int i = 0; i < size; i++) {
            WebCommands.staticSleep(2000);
            AllCheckboxes.get(i).click();
        }
        try {
            TestUtil.click(continu, "continye clicked");
        } catch (Exception e) {
            TestUtil.click(Submit, "continye clicked");
        }
        WebCommands.staticSleep(10000);

        TestUtil.getScreenShot();
    }

    public static void JsClick(WebElement element, String msg)
    {
        WebCommands.staticSleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",element );
        LogUtils.info(msg);

    }
    public void modifylow() {
        JsClick(modify, "modify clicked");
        TestUtil.click(next, "next button click");
        TestUtil.click(next, "next button click");
        TestUtil.click(next, "next button click");
        WebCommands.staticSleep(7000);
    }

    public void EtouchResult() throws InterruptedException, IOException {
        leadpage.GotItButton();
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(2000);
        JsClick(Etouch, "view button etouch click");
        // GetPaymentLinkCTA();
        js.executeScript("arguments[0].click();", buyNowButton);
        TestUtil.getFullPageScreenShot();
    }

    public String getUniqueID() throws InterruptedException {
        getUrl = driver.getCurrentUrl();
        System.out.println(getUrl);
        String[] result = getUrl.split("results/");
        System.out.println("Order ID = " + result[1]);
        orderID = result[1];
        WebCommands.staticSleep(2000);
        return orderID;

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


    public void NinjaLoginH(String NinjaEmail, String NinjaPassword) throws Exception {
        WebCommands.staticSleep(500);
        driver.get("https://accounts.google.com/");
        WebCommands.staticSleep(3000);
        System.out.println("test");
        TestUtil.sendKeys(emailgoogle, "automationtesting@turtlemint.com", "email Id entered");
        TestUtil.sendKeys(emailgoogle, String.valueOf(Keys.RETURN), "email Id entered");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(passworgoogle, "Turtle@2023", "Password entered");
        TestUtil.sendKeys(passworgoogle, String.valueOf(Keys.RETURN), "Password entered");
        WebCommands.staticSleep(9000);
        TestUtil.getScreenShot();
        driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
        WebCommands.staticSleep(5000);
        driver.get(System.getProperty("ninjaurl"));
//       driver.get(prop.getProperty("url"));
        TestUtil.click(SignInbtn, "Sign in button clicked");
        WebCommands.staticSleep(10000);
        TestUtil.getScreenShot();

    }

    public void issuedPolicyThroughNinja(String u_ID) throws Exception {
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(2000);
        NinjaLoginH(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
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

        TestUtil.click(typeofbusHealth, "Type of Business drop down");
        TestUtil.click(NEW, "NEW Type of Business Selected");

        TestUtil.click(issuancesub,"");
        TestUtil.click(Pending,"Pending selected");

        TestUtil.click(saveissuance, "Click on Save Issuance");

        Thread.sleep(2000);
        TestUtil.click(assignOwner, "assign Owner tag clicked");
        Thread.sleep(4000);
        TestUtil.getScreenShot();

        TestUtil.sendKeys(assignOwnertext, "automationtest", "automation test entered in text field");
        assignOwnertext.sendKeys(Keys.ARROW_DOWN);
        assignOwnertext.sendKeys(Keys.RETURN);
        TestUtil.click(savebutton, "save button clicked ");

        TestUtil.click(SearchBar,"Search Clicked");
        // SearchBar.click();
        WebCommands.staticSleep(1000);
        SearchBar.sendKeys(u_ID);
        LogUtils.info("Clicked on Searchbar and put unique ID");
        Thread.sleep(2000);
        SearchBar.sendKeys(Keys.RETURN);
        LogUtils.info("Enter on Search bar");
        WebCommands.staticSleep(4000);
        TestUtil.click(action, "Clicked On action required after change owner");


        WebCommands.staticSleep(10000);
        reqID = reqid.getAttribute("value");
        WebCommands.staticSleep(4000);
        TestUtil.click(typeofbusHealth, "Type of Business drop down");
        TestUtil.click(NEW, "NEW Type of Business Selected");

        TestUtil.click(drpdwn, "");
        WebCommands.staticSleep(1000);
        TestUtil.click(proposerTitle, "");//
        TestUtil.click(mrProposerTitle, "Mr. Title selected");//
        TestUtil.sendKeys(enterPincode, "400001", "Entered Pin Code");//
        TestUtil.click(genederSelect, "Selecting Proposer Gender");//
        TestUtil.click(genederMaleSelect, "Proposer Gender Male Selected");//

        TestUtil.click(typeofbus, "Type of Business drop down");
        TestUtil.click(KEYMAN, "KEYMAN Type of Business Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(planNameDrpDwn,"select plan type drop down");
        TestUtil.click(planNameOther, "PlanName Other Selected");//
        WebCommands.staticSleep(2000);
        WebCommands.staticSleep(2000);

        js.executeScript("arguments[0].click()", saveissuance);//

        WebCommands.staticSleep(5000);
        TestUtil.sendKeys(transctnNumber, "ABCD123456", "Clicked on InspectionStatus DrpDwn");//
        TestUtil.click(paymentStatus, "Clicked on PaymentStatus DrpDwn");//
        TestUtil.click(paymentStatusComplete, "PaymentStatus Complete Selected");//
        WebCommands.staticSleep(3000);
        js.executeScript("arguments[0].click()", paymentDateDrpdwn);
        paymentDateDrpdwn.sendKeys(Keys.ESCAPE);
        WebCommands.staticSleep(2000);
        paymentDateDrpdwn.sendKeys(ninjaPresentDate());
        WebCommands.staticSleep(2000);
        paymentDateDrpdwn.sendKeys(Keys.RETURN);
        WebCommands.staticSleep(2000);

        js.executeScript("arguments[0].click()", paymentVerifyChkBox);
        LogUtils.info("Payment Verify CheckBox Tick");
        TestUtil.click(apaplictnStsDrpdwn, "Clicked on ApplicationStatus Dropdown");
        TestUtil.click(apaplictnStsComplete, "ApplicationStatus Complete Selected");//
        TestUtil.sendKeys(apaplictnURL, "test@test.com", "Application URL Entered");//
        WebCommands.staticSleep(3000);
        TestUtil.click(issuanceStsDrpdwn, "Click on Issuance Status Dropdown");//
        TestUtil.click(issuanceStatus, "Issuance Status Issued Selected");//
        TestUtil.click(issuancesub,"");
        TestUtil.click(INFORCE,"INFORCE selected");


        TestUtil.click(issuanceDate, "");//
        TestUtil.click(issuanceDateSlct, "Issuance Date Selected");//
        WebCommands.staticSleep(3000);
        TestUtil.sendKeys(enterPolicyNumber, TestUtil.generateRandomPolicyNo(7), "Policy Number Entered");//
        TestUtil.sendKeys(enterApplicationNumber, TestUtil.generateRandomPolicyNo(6), "Policy Number Entered");//
        TestUtil.click(saveissuance, "Click on Save Issuance");//
        WebCommands.staticSleep(5000);
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

        TestUtil.sendKeys(benefiitTerm, "1", "Benefit Payout Term 1 given");//
        TestUtil.sendKeys(commentBox, "Testing", "Entered Comment");//

        js.executeScript("arguments[0].click()", policyStatusMis);//
        js.executeScript("arguments[0].click()", junkPolicyStatus);//

        js.executeScript("arguments[0].click()", saveSaleButton);//
        js.executeScript("arguments[0].click()", yesButton);//

        Assert.assertTrue(policyJunkMark.isDisplayed());
        TestUtil.getScreenShot();
        LogUtils.info("Policy Junk Marked Successfully");
    }

    public static String ninjaPresentDate() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        return dateTimeFormatter.format(currentDateTime);
    }
    public void NinjaHealth(String u_ID) throws Exception {
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
        WebCommands.staticSleep(10000);
//
        TestUtil.click(typeofbusHealth, "Type of Business drop down");
        TestUtil.click(NEW, "NEW Type of Business Selected");


        TestUtil.click(ChequeClicked, "Cheque Clicked");
        TestUtil.sendKeys(chequeDetail,"Automation Test testing","cheque Detail type");

        TestUtil.click(paymentStatus, "Clicked on PaymentStatus DrpDwn");//
        TestUtil.click(paymentStatusComplete, "PaymentStatus Complete Selected");//
        WebCommands.staticSleep(5000);
        js.executeScript("arguments[0].click();", PaymentVerifiedCheck);

        WebCommands.staticSleep(3000);
        js.executeScript("arguments[0].click()", paymentDateDrpdwn);
        paymentDateDrpdwn.sendKeys(Keys.ESCAPE);
        WebCommands.staticSleep(2000);
        paymentDateDrpdwn.sendKeys(ninjaPresentDate());
        WebCommands.staticSleep(2000);
        paymentDateDrpdwn.sendKeys(Keys.RETURN);
        WebCommands.staticSleep(2000);

        TestUtil.click(policyIssuanceStatus,"");
        TestUtil.click(cancelled,"cancelled select");
        TestUtil.sendKeys(ReasonsforCancellation,"Automation testing for cancelled","Reason entered");
        TestUtil.click(saveissuance, "Click on Save Issuance");
        WebCommands.staticSleep(5000);
        js.executeScript("arguments[0].scrollIntoView(true);", loadingprem);
        TestUtil.sendKeys(loadingprem,"1000","loading amount ");
        WebCommands.staticSleep(5000);
        TestUtil.click(saveissuance, "Click on Save Issuance");
        WebCommands.staticSleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true);", misID);
        WebCommands.staticSleep(2000);
        mID = misID.getAttribute("value");
        System.out.println("MIS ID : " + mID);
        TestUtil.getScreenShot();
        LogUtils.info("Policy Issued Successfully");

    }



    public void cancelPolicyThroughNinja(String u_ID) throws Exception   {
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
        try {
            CANCELLED.isDisplayed();
            Assert.assertEquals(CANCELLED.getText(),"CANCELLED");
        }
        catch (Exception e){
            WebCommands.staticSleep(2000);
            TestUtil.click(ActionReq, "Clicked On action required for own");
            TestUtil.click(OWNbtn, "Clicked on OWN button");
            WebCommands.staticSleep(30000);
            String currUrl = driver.getCurrentUrl();
            WebCommands.staticSleep(2000);
            reqID = reqid.getAttribute("value");
            TestUtil.click(policystatus, "policy status click");
            TestUtil.click(Canceeled, "Cancelled selected");
            WebCommands.staticSleep(2000);
            TestUtil.sendKeys(cancelledReson, "Policy cancelled by Auomation Testing", "Cancelled");
            WebCommands.staticSleep(1000);
            TestUtil.click(saveissuance, "Save successfully");//
            WebCommands.staticSleep(3000);
            js.executeScript("arguments[0].click()",paymentFreq);//
            TestUtil.click(selectPaymentFreq,"Select Monthly Payment Frequency");//
            WebCommands.staticSleep(2000);
            //TestUtil.click(planNameDrpDwn,"Click on Plan Name Dropdown");//
            WebCommands.staticSleep(1000);//
            // TestUtil.clickByJS(planNameDrpDwn,"Click on Plan Name Dropdown");//
            planNameDrpDwn.clear();
            TestUtil.sendKeys(planNameDrpDwn, "ot", "Entered ot in Dropdown");//
            WebCommands.staticSleep(2000);
            js.executeScript("arguments[0].click();",SelectPlanName);//
            WebCommands.staticSleep(1000);
            TestUtil.sendKeys(planNameCuctom,"test test","Custom Plan Name Entered");//
            TestUtil.click(saveissuance, "Save successfully for inspection");
            WebCommands.staticSleep(2000);
            TestUtil.click(closeButton, "close button clicked");
            WebCommands.staticSleep(2000);
        }

    }
}
