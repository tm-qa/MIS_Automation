package com.qa.turtlemint.pages.CI;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class CI_fw_pages extends TestBase {
    public CI_fw_pages() {
        PageFactory.initElements(driver, this);
    }

    public String reg;
    public String regisNo;
    public String getUrl;
    public String orderID;
    public String p;
    public String c;
    public String mintproW;
    public String ninjaW;
    public String ninjasignupW;
    public String reqID;

    public String mID;

    Actions act = new Actions(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    TestUtil tl = new TestUtil();

    @FindBy(name = "mobileNumber")
    WebElement MobileNumber;

    @FindBy(xpath = "//span[text()='Continue']")
    WebElement ContinueBtn;

    @FindBy(xpath = "//input[@class='OTPInput']")
    WebElement OTPField;
    @FindBy(xpath = "//span[text()='Verify OTP']")
    WebElement VerifyOTPBtn;
    @FindBy(xpath = "//span[text()='Sell']")
    WebElement SellBtn;
    @FindBy(xpath = "//span[text()='Car']")
    WebElement fw;
    @FindBy(xpath = "//input[@type='text']")
    WebElement EnterRegNum;
    @FindBy(xpath = "//button[@ng-click='withVehicleNumber(registrationNumber)']")
    WebElement ClickGetQuote;
    @FindBy(id = "container-next-btn")
    WebElement NextButton;
    @FindBy(xpath = "//input[@name='registrationDate-datepicker']")
    WebElement SelectDate;
    @FindBy(xpath = "//div[@class='flex layout-column layout-align-top-center tm-profile-img hidden-xs']")
    WebElement CloseDatePicker;
    @FindBy(xpath = "//p[text()='Your Car detail']")
    WebElement Carlbl;
    @FindBy(xpath = "//input[@type='search']")
    WebElement CarModel;
    @FindBy(xpath = "//span[text()='Hyundai I20 Active']")
    WebElement SelectModel;
    @FindBy(xpath = "//span[text()='2022'] | //span[text()='2021'] | //span[text()='2020'] | //span[text()='2023']")
    WebElement RollRegYear;
    @FindBy(xpath = "//span[text()='Diesel']")
    WebElement FuelType;
    @FindBy(id = "variant-uiSelect")
    WebElement ClickVariant;
    @FindBy(xpath = "//span[text()='Sx (1400 CC)'] | //span[text()='Base (1396 CC)']|//span[text()='S (1200 CC)'] | //span[text()='Base (1400 CC)']")
    WebElement SelectVariant;

    @FindBy(xpath = "//div[@id='title-uiSelect']")
    WebElement ClickOntitle;

    @FindBy(xpath = "//span[text()='Mr']")
    WebElement SelectTitle;

    @FindBy(xpath = "//button[@data-auto='goback-button']")//
    WebElement backButton;

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstname;

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastname;

    @FindBy(xpath = "//input[@id='email']")
    WebElement email;

    @FindBy(xpath = "//input[@name='mobile']")
    WebElement mobile;

    @FindBy(xpath = "//div[@id='registeredState-uiSelect']")
    WebElement ClickState;

    @FindBy(xpath = "//span[text()='Enter State']//parent::span")
    WebElement ClickStateForInspection;

    @FindBy(xpath = "//input[@placeholder=\"Enter State\"]")
    WebElement StateInspection;

    @FindBy(xpath = "//span[text()='Enter City']//parent::span")
    WebElement ClickCityForInspection;

    @FindBy(xpath = "//input[@placeholder=\"Enter City\"]")
    WebElement CityInspection;

    @FindBy(xpath = "//input[@name='inspectionAddressLine1']")
    WebElement AddressLine1ForInspection;

    @FindBy(xpath = "//input[@name='inspectionAddressLine2']")
    WebElement AddressLine2ForInspection;
    @FindBy(xpath = "//span[text()='Maharashtra']")
    WebElement SelectState;

    @FindBy(xpath = "//span[text()='MUMBAI']")
    WebElement SelectCity;

    @FindBy(xpath = "//div[@id='registeredPincode-uiSelect']")
    WebElement pin;

    @FindBy(xpath = "//div[@id='registeredPincode-uiSelect']/input")
    WebElement Pincode;

    @FindBy(xpath = "//span[text()='400065']")
    WebElement SelectPincode;

    @FindBy(xpath = "//input[@id='alternateMobile']")
    WebElement scroll;

    @FindBy(xpath = "//input[@name='registeredAddressLine1']")
    WebElement addressLine1;

    @FindBy(xpath = "//input[@name='registeredAddressLine2']")
    WebElement addressLine2;

    @FindBy(xpath = "//button[text()='Continue']")
    WebElement ConBtn;

    @FindBy(xpath = "//div[@id='nomineeRel-uiSelect']")
    WebElement Nominee;

    @FindBy(xpath = "//span[text()='Mother']")
    WebElement SelectNomineeRelation;

    @FindBy(xpath = "//input[@name='nomineeName']")
    WebElement NomineeName;

    @FindBy(xpath = "//input[@name='nomineeDOB-datepicker']")
    WebElement NomineeDOB;

    @FindBy(xpath = "//input[@placeholder='Enter engine number']")
    WebElement EngineNum;

    @FindBy(xpath = "//input[@name='chassisNum']")
    WebElement ChNum;
    @FindBy(xpath = "//div[text()='Nominee Details']")
    WebElement clickOutSide;

    @FindBy(xpath = "//span[text()='Nominee Date of Birth']")
    WebElement dob;

    @FindBy(xpath = "//div[@id=\"inspectionMode-uiSelect\"]")
    WebElement InspectionMode;

    @FindBy(xpath = "//label[text()='Policy expired more than 90 days ago']")
    WebElement policyExpired90DaysAgo;

    @FindBy(xpath = "//button[text()='Initiate Inspection']")
    WebElement initiateInspection;

    @FindBy(xpath = "//input[@name='inspectionMobile']")
    WebElement inspectionMobile;

    @FindBy(xpath = "//button[text()='Request Inspection']")
    WebElement requestInspectionBtn;

    @FindBy(xpath = "//input[@id='previousPolicyNumber']")
    WebElement prevPolicyNumber;

    @FindBy(xpath = "//button[text()='×']")
    WebElement closeButton;


    @FindBy(xpath = "//span[normalize-space()='Individual']")
    WebElement individual;

    @FindBy(xpath = "//input[@id='kyc-form_dob']")
    WebElement kycdob;

    @FindBy(xpath = "//input[@id='kyc-form_pan']")
    WebElement pancardDetails;

    @FindBy(xpath = "(//span[contains(text(),'Continue')])[1]")
    WebElement continuebtn;

    @FindBy(xpath = "//span[text()='Confirm']")
    WebElement verifybtn;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement ContinueBt2;

    @FindBy(xpath = "(//span[@class='ant-radio'])[2]")
    WebElement radioBT2;

    @FindBy(xpath = "//mat-form-field[@appearance=\"outline\"]")
    WebElement Selectdropdown;

    @FindBy(xpath = "(//button[@type='button'])[1]")
    WebElement yesBT;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    WebElement SubmittedBT;

    @FindBy(xpath = "//span[text()='Proceed to verify']")
    WebElement Proceedtoverify;

    @FindBy(xpath = "//span[@class='mat-option-text']")
    List<WebElement> FecthDropdown;

    @FindBy(xpath = "//button[@type='button']")
    WebElement confirmBt;

    @FindBy(xpath = "//div[text()='Got It!']")
    WebElement GotItBtn;

    @FindBy(xpath = "//input[@name=\"expiryDate-datepicker\"]")
    WebElement expiryDate;

    @FindBy(xpath = "//span[text()='Expiry date']")
    WebElement clickoutsidde;

    @FindBy(xpath = "//span[text()='Comprehensive']")
    WebElement Comprehensive;

    @FindBy(id = "container-next-btn")
    WebElement next;

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

    @FindBy(xpath = "//td[text()='Action Reqd'] | //td[text()='ICICILOMBARD']")
    WebElement ActionReq;

    @FindBy(xpath = "//td[text()='Required'] | //td[text()='ICICILOMBARD']")
    WebElement required;

    @FindBy(xpath = "//button[text()='OWN']")
    WebElement OWNbtn;

    @FindBy(xpath = "//button[@data-auto=\"schedule-inspection-button\"]")
    WebElement manualBtn;

    @FindBy(xpath = "//button[text()='OK']")
    WebElement okBtn;

    @FindBy(xpath = "//button[text()='Close']")
    WebElement closelead;

    @FindBy(xpath = "//td[@data-auto=\"inspection0-attempts\"]")
    WebElement Clickoninspection;

    @FindBy(xpath = "//*[@class=\"md-padding _md\"]//input[@placeholder=\"Enter date\"]")
    WebElement dateenter;

    @FindBy(xpath = "//md-select[@name=\"fromTime\"]")
    WebElement fromTime;

    @FindBy(xpath = "//md-option[@data-auto=\"fromTime-10:00AM-select\"]")
    WebElement select10;

    @FindBy(xpath = "//md-select[@name=\"toTime\"]")
    WebElement toTime;

    @FindBy(xpath = "//md-option[@data-auto=\"toTime-11:00AM-select\"]")
    WebElement select11;

    @FindBy(xpath = "//input[@id=\"agencyName\"]")
    WebElement agencyName;

    @FindBy(xpath = "//input[@id=\"agencyContact\"]")
    WebElement agencyContact;

    @FindBy(xpath = "//button[@data-auto=\"save-inspection-button\"]")
    WebElement savebutton;

    @FindBy(xpath = "//md-select[@id=\"inspectionStatus\"]")
    WebElement statuspending;

    @FindBy(xpath = "//div[text()='Recommended']")
    WebElement selectRecommended;

    @FindBy(xpath = "//input[@id=\"paymentLink\"]")
    WebElement enterPaymentLink;

    @FindBy(xpath = "//td[@class=\"md-calendar-date md-calendar-date-today md-focus\"]")
    WebElement currentdate;

    @FindBy(xpath = "//button[normalize-space()='Save Issuance']")
    WebElement saveissuance;

    @FindBy(xpath = "//md-datepicker[@id=\"policyStartDate\"]")
    WebElement riskStartDate;

    @FindBy(xpath = "//td[@class=\"md-calendar-date md-calendar-date-today md-focus\"]")
    WebElement selectriskStartDat;

    @FindBy(xpath = "//md-datepicker[@id=\"policyEndDate\"]//div//input[@aria-label=\"Enter date\"]")
    WebElement riskEndDate;

    @FindBy(xpath = "//md-select[@id=\"paymentStatus\"]")
    WebElement paymentStatus;

    @FindBy(xpath = "//div[text()='Payment Complete']")
    WebElement PaymentComplete;

    @FindBy(xpath = "//md-datepicker[@id='paymentCompleteDate']")
    WebElement paymentCompleteDate;

    @FindBy(xpath = "//td[@class=\"md-calendar-date md-calendar-date-today md-focus\"]")
    WebElement completedateselect;

    @FindBy(xpath = "//md-checkbox[@id=\"paymentVerified\"]")
    WebElement paymentVerifiedclick;

    @FindBy(xpath = "//input[@id=\"txnNo\"]")
    WebElement txnNo;

    @FindBy(xpath = "//input[@id=\"policyNumber\"]")
    WebElement policyNO;

    @FindBy(xpath = "//md-select[@id=\"policyIssuanceStatus\"]")
    WebElement policystatus;

    @FindBy(xpath = "//md-option[@data-auto=\"policyIssuanceStatus-CANCELLED-select\"]")
    WebElement Canceeled;

    @FindBy(xpath = "//textarea[@id=\"cancellationReason\"]")
    WebElement cancelledReson;

    @FindBy(xpath = "//md-option[@data-auto=\"policyIssuanceStatus-ISSUED-select\"]")
    WebElement issuedSelect;

    @FindBy(xpath = "//md-datepicker[@id=\"policyIssuanceDate\"]")
    WebElement policyIssuanceDate;

    @FindBy(xpath = "//td[@class=\"md-calendar-date md-calendar-date-today md-focus\"]")
    WebElement policyIssuanceDateSelect;
    @FindBy(xpath = "//span[@ng-if=\"field.hintText\"]")
    WebElement Pteviouspp;
    @FindBy(xpath = "//span[text()='Select  Insurer']")
    WebElement selectInsurer;
    @FindBy(xpath = "//span[text()='Bajaj Allianz']")
    WebElement prevbajajAllianz;

    @FindBy(xpath = "//md-icon[@class=\"ng-scope rotate\"]")
    WebElement clicktoOpenField;
    @FindBy(xpath = "//span[text()='Self Inspection']")
    WebElement SelfInspection;
    @FindBy(xpath = "//span[@class='checkmark']")
    WebElement Checkmark;

    @FindBy(xpath = "//md-radio-button[@data-auto='POLICY-tag-radio']")
    WebElement uploadPolicyBtn;
    @FindBy(xpath = "//*[text()='State']")
    WebElement StateDisplay;

    @FindBy(xpath = "//button[@data-auto='done-tag-button']")
    WebElement done;

    @FindBy(xpath = "//input[@id=\"requestId\"]")
    WebElement reqid;

    @FindBy(xpath = "//button[text()='View Log']")
    WebElement ViewLog;

    @FindBy(xpath = "//button[@type='button']//md-icon[@aria-label='Close dialog']")
    WebElement close;

    @FindBy(xpath = "//button[@source='commentSource']")
    WebElement chat;

    @FindBy(xpath = "//span[text()='Click Here To Download']")
    WebElement chatfiledownload;

    @FindBy(xpath = "//md-icon[@md-svg-icon='/images/common/close.svg']")
    WebElement CloseChat;

    @FindBy(xpath = "//input[@name='policyDetailsId']")
    WebElement misID;

    @FindBy(xpath = "//input[@id='customerName']")
    WebElement name;

    @FindBy(xpath = "//a[@ng-click='sidemenu = !sidemenu']")//
    WebElement sideMenuButton;

    @FindBy(xpath = "//span[text()='MIS']")//
    WebElement misModule;

    @FindBy(xpath = "//input[@type='search']")//
    WebElement searchBarMIS;

    @FindBy(xpath = "//tr[@md-select='policy']")//
    WebElement selectPolicy;
    @FindBy(xpath = "//div[@id='page']/div")
    WebElement Pageadd;

    @FindBy(xpath = "(//button[@class='md-icon-button hover-btn md-button'])[1]")//
    WebElement editButton;

    @FindBy(xpath = "//md-select[@id='policyStatus']")
    WebElement policyStatusMis;

    @FindBy(xpath = "//div[text()='Junk']")
    WebElement junkPolicyStatus;

    @FindBy(xpath = "//button[text()='Save Sale']")//
    WebElement saveSaleButton;

    @FindBy(xpath = "//input[@id='comments']")
    WebElement closecomment;
    @FindBy(xpath = "//span[text()=' Without Pay as you Drive discount ']//following::a[@data-auto=\"ICICILOMBARD-web\"]")
    WebElement SelectICICIPlanOnly;
    @FindBy(xpath = "//button[text()='Confirm']")
    WebElement Confirm;
    @FindBy(xpath = "//td[@title='1998-01-01']")
    WebElement selectDate1;

    public void ValidateLogin(String username, String otp) {
        String strUrl = driver.getCurrentUrl();
        LogUtils.info("Opened Website: " + strUrl);
        Actions ac =new Actions(driver);
        TestUtil.sendKeys(MobileNumber, username, "Mobile Number Entered");
        TestUtil.click(ContinueBtn, "Continue pressed");
        TestUtil.sendKeys(OTPField, otp, "OTP Entered");
        TestUtil.click(VerifyOTPBtn, "Login Successful");

    }
    public void ValidateSellButton() {

        TestUtil.click(SellBtn , "click on sell button");
    }

    public String CreateQuoteWithRegNumber() {
        tl.GenerateRegNo();
        TestUtil.sendKeys(EnterRegNum, tl.RegNo, "Reg number entered");
        regisNo = tl.RegNo;
        TestUtil.click(ClickGetQuote, "Get Quote button clicked");
        WebCommands.staticSleep(6000);
        return regisNo;
    }

    public void SelectRegDate() {
        TestUtil.sendKeys(SelectDate, TestUtil.PastDate(548), "Date selected");
        WebCommands.staticSleep(4000);
        act.moveToElement(CloseDatePicker).click().perform();
        WebCommands.staticSleep(2000);
        TestUtil.click(NextButton, "Next Button Pressed");
        WebCommands.staticSleep(4000);
    }

    public void SaveCarDetails(String CarName) throws Exception {

        TestUtil.waitUntilVisibilityOfElement(Carlbl);
        Carlbl.isDisplayed();
        LogUtils.info("Car Details Entering Started");
        TestUtil.sendKeys(CarModel, CarName, "Car Name Entered");
        TestUtil.waitUntilVisibilityOfElement(SelectModel);
        TestUtil.click(SelectModel, "Model Selected");
        TestUtil.waitUntilVisibilityOfElement(RollRegYear);
        js.executeScript("arguments[0].click();", RollRegYear);
        LogUtils.info("Year Selected");
        TestUtil.waitUntilVisibilityOfElement(FuelType);
        js.executeScript("arguments[0].click();", FuelType);
        LogUtils.info("Fuel Type selected");
        TestUtil.waitUntilVisibilityOfElement(ClickVariant);
        TestUtil.click(ClickVariant, "Car variant Selection is in process");
        TestUtil.getScreenShot();
        js.executeScript("window.scrollBy(0,-700)");
        TestUtil.getScreenShot();
        TestUtil.waitUntilVisibilityOfElement(SelectVariant);
        TestUtil.click(SelectVariant,"Car Variant Selected");
        TestUtil.waitUntilVisibilityOfElement(NextButton);
        js.executeScript("arguments[0].click();", NextButton);

    }

    public void scroll() {
        js.executeScript("arguments[0].scrollIntoView();", scroll);
    }


    public void GotIT() {
        TestUtil.click(GotItBtn, "Got It Clicked !");
        WebCommands.staticSleep(20000);
    }

    public void ovdKyc () {
        WebCommands.staticSleep(3000);
        TestUtil.click(radioBT2, "Clicked on radio button");
        WebCommands.staticSleep(5000);
        TestUtil.click(ContinueBt2, "Clicked on Continue Button");
        WebCommands.staticSleep(6000);
        TestUtil.click(Selectdropdown, "selected decoments");
        WebCommands.staticSleep(6000);
        for (WebElement dropdownresult : FecthDropdown) {
            if (dropdownresult.getText().equals("Aadhaar")) {
                System.out.println("We are inside loop:" + dropdownresult);
                dropdownresult.click();
                break;
            }
        }
        WebCommands.staticSleep(2000);
        try {
            TestUtil.click(yesBT, "clicked yes Bt");
        } catch (Exception e) {
            LogUtils.info("Aadhar is By Default selected");
        }
        WebCommands.staticSleep(2000);
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("/home/ubuntu/storage/Aadharfront.jpg");
        //    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("/Users/hemantpatil/Desktop/Aadharfront.jpg");
        LogUtils.info("Aadhar fornt page uploaded");
        WebCommands.staticSleep(6000);
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("/home/ubuntu/storage/Aadharback.jpg");
        //  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("/Users/hemantpatil/Desktop/Aadharback.jpg");
        LogUtils.info("Aadhar Back page uploaded");
        WebCommands.staticSleep(30000);
        TestUtil.getScreenShot();
        TestUtil.click(SubmittedBT, "clicked submitted");
        WebCommands.staticSleep(15000);
        try {
            driver.findElement(By.xpath("//input[@type='file']")).sendKeys("/home/ubuntu/storage/images.jpg");
            //   driver.findElement(By.xpath("//input[@type='file']")).sendKeys("/Users/hemantpatil/Desktop/Aadharback.jpg");
            LogUtils.info("Image uploaded");
            WebCommands.staticSleep(8000);
            TestUtil.click(Proceedtoverify, "Proceed to verify");
        } catch (Exception e) {
            LogUtils.info("Image upload not required");
        }
        WebCommands.staticSleep(10000);
        TestUtil.click(confirmBt, "Confirm");
    }
    @FindBy(xpath = "//span[text()='Third Party']")
    WebElement ThirdParty;

    public void thirdPartySelect() throws InterruptedException {
        TestUtil.click(ThirdParty, "ThirdParty Selected");
        TestUtil.click(next, "Clicked Next Button");
    }

    public void Expired_less_than_90_days_ago() throws InterruptedException {
        TestUtil.sendKeys(expiryDate, TestUtil.PastDate(30), "Less than 90 Date Selected");
        act.moveToElement(clickoutsidde).click().perform();
        WebCommands.staticSleep(2000);
    }

    public void comprehensiveSelect() {
        WebCommands.staticSleep(4000);
        TestUtil.click(Comprehensive, "Comprehensive Selected");
        try {
            next.click();
            LogUtils.info("Clicked Next Button");
        } catch (Exception e) {
            System.out.println("Next Button Not Found: " + e);
        }
    }

    public String getUniqueID() {
        getUrl = driver.getCurrentUrl();
        System.out.println(getUrl);
        String[] result = getUrl.split("results/");
        System.out.println("Order ID = " + result[1]);
        orderID = result[1];
        WebCommands.staticSleep(2000);
        return orderID;
    }

    public void inspectionRequest(){
        TestUtil.click(requestInspectionBtn,"Request Inspection");
        WebCommands.staticSleep(15000);
    }
    public void SaveLead(String LeadName) {
        name.sendKeys(LeadName);
        LogUtils.info("All Details Filled and Lead Name Entered");
        NextButton.click();
        WebCommands.staticSleep(2000);
    }

    public void NinjaLogin(String NinjaEmail, String NinjaPassword) {
        WebCommands.staticSleep(4000);
        LogUtils.info("Ninja Website Opened");
        String strUrl = driver.getCurrentUrl();
        SignInbtn.click();
        LogUtils.info("Clicked on Sign In with Google Button");

        Set<String> allWindowHandles = driver.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<String>(allWindowHandles);
        System.out.println("No. of tabs: " + tabs.size());

        if (tabs.size() <= 2) {
            Set<String> windows = driver.getWindowHandles();
            Iterator<String> it = windows.iterator();
            p = it.next();
            c = it.next();
            driver.switchTo().window(c);
        } else {
            Set<String> windows = driver.getWindowHandles();
            Iterator<String> it = windows.iterator();
            mintproW = it.next();
            ninjaW = it.next();
            ninjasignupW = it.next();
            driver.switchTo().window(ninjasignupW);
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

    public void ninjaInspectionPCV(String u_ID) throws Exception {
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://ninja.sanity.turtle-feature.com/");
        //driver.get("https://ninja.turtlemint.com/login");
        NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        WebCommands.staticSleep(3000);
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
        WebCommands.staticSleep(5000);
        TestUtil.click(ActionReq, "Clicked On action required for own");
        TestUtil.click(OWNbtn, "Clicked on OWN button");
        WebCommands.staticSleep(3000);
        String currUrl = driver.getCurrentUrl();
        System.out.println(currUrl + "This is the current");
        TestUtil.click(manualBtn, "Manual inspection Click");
        WebCommands.staticSleep(2000);
        TestUtil.click(okBtn, "ok button clicked");
        WebCommands.staticSleep(5000);
        TestUtil.click(manualBtn, "Manual inspection Click");
        WebCommands.staticSleep(2000);
        TestUtil.click(okBtn, "ok button clicked");
        Thread.sleep(2000);
        TestUtil.click(closelead, "Policy closed");
        Thread.sleep(3000);
        SearchBar.click();
        WebCommands.staticSleep(1000);
        SearchBar.sendKeys(u_ID);
        LogUtils.info("Clicked on Searchbar and put unique ID");
        Thread.sleep(2000);
        SearchBar.sendKeys(Keys.RETURN);
        LogUtils.info("Enter on Search bar");
        Thread.sleep(2000);
        TestUtil.click(required, "Clicked On action required for own");
        Thread.sleep(8000);
        js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@type='file']")));
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("/Users/ambrish.balde/Downloads/dummy_pan.jpeg");
        Thread.sleep(4000);
        TestUtil.click(uploadPolicyBtn, "");
        Thread.sleep(2000);
        TestUtil.click(done, "done");
        WebCommands.staticSleep(1000);
        TestUtil.click(ViewLog, "Clicked on View log button");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
        TestUtil.click(close, "Clicked on close icon");
        WebCommands.staticSleep(2000);
        TestUtil.click(chat, "Clicked on chat option");
        WebCommands.staticSleep(8000);
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(CloseChat, "Chat option is closed");
        WebCommands.staticSleep(5000);
        TestUtil.click(Clickoninspection, "Clicked on inspection");
        WebCommands.staticSleep(3000);
        TestUtil.click(dateenter, "");
        WebCommands.staticSleep(2000);
        TestUtil.click(currentdate, "Present Date Selected");
        WebCommands.staticSleep(5000);
        TestUtil.click(fromTime, "");
        TestUtil.click(select10, "10 AM selected");
        TestUtil.click(toTime, "");
        TestUtil.click(select11, "11 AM selected");
        TestUtil.sendKeys(agencyName, "test Automation", "Agency Name Selected");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(agencyContact, "6999912345", "Agency contact Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(savebutton, "save butoon clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(statuspending, "");
        WebCommands.staticSleep(2000);
        TestUtil.click(selectRecommended, "Recommended selected");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(enterPaymentLink, "pg.com", "Payment Link entered");
        WebCommands.staticSleep(3000);
        TestUtil.click(policystatus, "policy status click");
        WebCommands.staticSleep(2000);
        TestUtil.click(issuedSelect, "ISSUED clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(policyIssuanceDate, "");
        TestUtil.click(policyIssuanceDateSelect, "date selected");
        TestUtil.sendKeys(policyNO, TestUtil.generateRandomPolicyNo(10), "random policy no entered");
        WebCommands.staticSleep(6000);
        js.executeScript("arguments[0].click();", paymentStatus);
        WebCommands.staticSleep(2000);
        TestUtil.click(PaymentComplete, "Payment complete");
        WebCommands.staticSleep(2000);
        TestUtil.click(paymentCompleteDate, "");
        WebCommands.staticSleep(1000);
        TestUtil.click(completedateselect, "Complete date select");
        WebCommands.staticSleep(1000);
        TestUtil.click(paymentVerifiedclick, "payment Verified clicked");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(txnNo, TestUtil.getRandomTransactionNo(), "Random Transaction No entered");
        TestUtil.click(clicktoOpenField, "");
        WebCommands.staticSleep(5000);
        TestUtil.click(riskStartDate, "");
        WebCommands.staticSleep(2000);
        TestUtil.click(selectriskStartDat, "Selected for risk start date");
        WebCommands.staticSleep(3000);
        riskEndDate.click();
        WebCommands.staticSleep(3000);
        riskEndDate.sendKeys(TestUtil.ninjaFutureDate(364));
        System.out.println(TestUtil.ninjaFutureDate(364));
        WebCommands.staticSleep(4000);
        riskEndDate.sendKeys(Keys.RETURN);
        WebCommands.staticSleep(3000);
        TestUtil.click(saveissuance, "Save successfully for inspection");
        WebCommands.staticSleep(5000);
        js.executeScript("arguments[0].scrollIntoView(true);", misID);
        WebCommands.staticSleep(2000);
        mID = misID.getAttribute("value");
        System.out.println("MIS ID : " + mID);
        junkMarkPolicy();
    }

    public void InspectionCancalledGCV(String u_ID) throws Exception {
        driver.switchTo().newWindow(WindowType.WINDOW);
        NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        WebCommands.staticSleep(5000);
        System.out.println(u_ID);
        TestUtil.click(PolicyIssuance,"Clicked on Policy Issuance");
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
        WebCommands.staticSleep(3000);
        String currUrl = driver.getCurrentUrl();
        WebCommands.staticSleep(2000);
        reqID = reqid.getAttribute("value");
        TestUtil.click(policystatus, "policy status click");
        WebCommands.staticSleep(2000);
        TestUtil.click(Canceeled, "Cancelled selected");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(cancelledReson, "Policy cancelled by Automation Testing", "Cancelled");
        WebCommands.staticSleep(3000);
        TestUtil.click(saveissuance, "Save successfully for inspection");
        WebCommands.staticSleep(2000);
        TestUtil.click(closeButton, "close button clicked");
        WebCommands.staticSleep(2000);
    }

    public void junkMarkPolicy() {
        WebCommands.staticSleep(2000);
        TestUtil.click(backButton, "");
        TestUtil.click(sideMenuButton, "");
        TestUtil.click(misModule, "Clicked on MIS Module");
        TestUtil.click(searchBarMIS, "Clicked on Search Bar");
        searchBarMIS.sendKeys(mID);
        searchBarMIS.sendKeys(Keys.RETURN);
        TestUtil.click(selectPolicy, "Policy Selected");
        TestUtil.click(editButton, "Clicked On Pen Edit Button");
        WebCommands.staticSleep(1000);
        TestUtil.click(policyStatusMis, "Clicked on Policy Status DropDown");
        TestUtil.click(junkPolicyStatus, "Junk Selected Policy Status");
        TestUtil.sendKeys(closecomment, "Test Lead", "Comment entered to mark lead junk");
        TestUtil.click(saveSaleButton, "Clicked on Save Sale Button");
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
        LogUtils.info("Policy Junk Marked Successfully");
    }
    public void iciciProceedtoNONPaydBuy() throws InterruptedException {
        TestUtil.click(SelectICICIPlanOnly, "ICIC Clicked on Buy now");
        TestUtil.click(Confirm, "Clicked on confirm");
        WebCommands.staticSleep(3000);
    }
    public void cKyc() {
        WebCommands.staticSleep(4000);
        TestUtil.sendKeys(kycdob, "01/01/1998", "DOB Entered");
        WebCommands.staticSleep(1000);
        TestUtil.click(selectDate1, "DOB Selected");
        TestUtil.sendKeys(pancardDetails, "DDIPP6888K", "Pancard detail Entered");
        WebCommands.staticSleep(1000);
        TestUtil.click(individual, "Clicked on Individual");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.click(continuebtn, "Clicked on continue");
        WebCommands.staticSleep(9000);
        try {
            if (verifybtn.isEnabled()) {
                WebCommands.staticSleep(2800);
                verifybtn.click();
                TestUtil.getScreenShot();
                LogUtils.info("Click on confirm button");
            }
        } catch (NoSuchElementException exception) {
            LogUtils.info("C-kyc has failed and hence going through Ovd flow");
            TestUtil.getScreenShot();
            OVD_FW();

        }

    }

    public static void OvdUploadFile(String YourFileLocationFolder) {
        WebCommands.staticSleep(2000);
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys( YourFileLocationFolder);
        WebCommands.staticSleep(1000);
    }

    public void OVD_FW() {
        TestUtil.click(radioBT2, "Clicked on radio button");
        TestUtil.click(ContinueBt2, "Clicked on Continue Button");
        WebCommands.staticSleep(6000);
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
        WebCommands.staticSleep(3000);
        try{
            TestUtil.click(yesBT, "clicked yes Bt");
        }catch (Exception e){
            LogUtils.info("Aadhar is By Default selected");
        }
        WebCommands.staticSleep(3000);
        //TestUtil.OvdUploadFile("/home/ubuntu/storage/Aadharfront.jpg");
           OvdUploadFile("/Users/vijay/Desktop/AadharFrontSide.png");
        LogUtils.info("Aadhaar Front Page Uploaded");

        //  WebCommands.staticSleep(6000);
       // TestUtil.OvdUploadFile("/home/ubuntu/storage/Aadharback.jpg");
           OvdUploadFile("/Users/vijay/Desktop/AadharBackSide.png");
        LogUtils.info("Aadhaar Back page uploaded");

        TestUtil.getScreenShot();
        TestUtil.click(SubmittedBT,"clicked submitted");
        WebCommands.staticSleep(5000);
        try {
            WebCommands.staticSleep(8000);
            OvdUploadFile("/home/ubuntu/storage/images.jpg");
            //    TestUtil.OvdUploadFile("/Users/hemantpatil/Desktop/Test.png");
            LogUtils.info("Image uploaded");
            WebCommands.staticSleep(5000);
            TestUtil.click(Proceedtoverify,"Proceed to verify");
        }catch (Exception e){
            LogUtils.info("Image upload not required");
        }
        WebCommands.staticSleep(5000);
        TestUtil.click(confirmBt,"Confirm");
    }


    public void contactDetails(String fname, String lname) { //All insurer except HDFC and NINA
        TestUtil.waitElementToBeClickable(ClickOntitle);
        TestUtil.click(ClickOntitle, "Clicked on Title...");
        TestUtil.waitElementToBeClickable(SelectTitle);
        TestUtil.click(SelectTitle, "Title is Selected...");
        String FstName = firstname.getAttribute("value");
        String LstName = lastname.getAttribute("value");
        String Emailid = email.getAttribute("value");
        String MobileNo = mobile.getAttribute("value");
        if (FstName.isEmpty()) {
            TestUtil.waitUntilVisibilityOfElement(firstname);
            TestUtil.sendKeys(firstname, fname, "First Name Filled!");
        }
        if (LstName.isEmpty()) {
            TestUtil.waitUntilVisibilityOfElement(lastname);
            TestUtil.sendKeys(lastname, lname, "Last NameFilled!");
        }
        if (Emailid.isEmpty()) {
            TestUtil.waitUntilVisibilityOfElement(email);
            TestUtil.sendKeys(email, "test@yopmail.com", "Email Filled!");
        }
        if (MobileNo.isEmpty()) {
            TestUtil.waitUntilVisibilityOfElement(mobile);
            TestUtil.sendKeys(mobile, "6999912345", "Mobile Number Filled!");
        }
        WebCommands.staticSleep(2000);
    }


    public void Digit_Pin() throws Exception {
        WebCommands.staticSleep(3000);
        if (StateDisplay.isDisplayed()) {
            TestUtil.waitElementToBeClickable(pin);
            TestUtil.click(pin, "Clecik on pin....");
            TestUtil.click(pin, "Clecik on pin....");
            TestUtil.waitUntilVisibilityOfElement(Pincode);
            TestUtil.sendKeys(Pincode, "400065", "Pincode is Entered....");
            TestUtil.waitElementToBeClickable(SelectPincode);
            TestUtil.click(SelectPincode, "Select the pincode....");
        }
    }
    public void commonAddressLine() throws Exception {
        if (addressLine1.isEnabled())
        {
            TestUtil.waitUntilVisibilityOfElement(addressLine1);
            TestUtil.sendKeys(addressLine1, "Saki Vihar Road", "Address line 1 is Entered....");
            TestUtil.waitUntilVisibilityOfElement(addressLine2);
            TestUtil.sendKeys(addressLine2, "Saki Naka Metro Station", "Address line 2 is Entered....");
        }
    }
    public void ContinueButton() {
        TestUtil.waitElementToBeClickable(ConBtn);
        LogUtils.info("Continue button is Clickable.....");
        WebCommands.staticSleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", ConBtn);
        LogUtils.info("Clicked on continue button");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
    }
    public static void moveToElement(WebElement element) {

        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();

    }

    public void personalDetailsKyc() {
        TestUtil.waitUntilVisibilityOfElement(NomineeName);
        moveToElement(clickOutSide);
        moveToElement(Nominee);
        LogUtils.info("DOB Selected!");
        TestUtil.waitElementToBeClickable(SelectNomineeRelation);
        TestUtil.click(SelectNomineeRelation, "Clicked on Nominee Relation..");
        TestUtil.waitUntilVisibilityOfElement(NomineeName);
        TestUtil.sendKeys(NomineeName, "Mother Test", "Nominee Name is Enter...");
        TestUtil.waitUntilVisibilityOfElement(NomineeDOB);
        TestUtil.sendKeys(NomineeDOB, "12/02/1958", "Nominee DOB Is Entered...");
        TestUtil.waitElementToBeClickable(dob);
        TestUtil.click(dob, "DOB is Selected...");
        LogUtils.info("Nominee Details Filled!");
        TestUtil.click(Pageadd, "Clicked outside..");
    }
    public void vehicleDetail() throws Exception { // Chola, Bajaj, Digit, HDFC
        String engineNum = EngineNum.getAttribute("value");
        String chNum = ChNum.getAttribute("value");
        if (engineNum.isEmpty() && chNum.isEmpty()) {
            TestUtil.waitUntilVisibilityOfElement(EngineNum);
            TestUtil.sendKeys(EngineNum, "L12B42010335", "Engine Number is Entered...");
            TestUtil.waitUntilVisibilityOfElement(ChNum);
            TestUtil.sendKeys(ChNum, "MAKGK77BJG4102480", "Chassis number filled!");
            WebCommands.staticSleep(1000);
        }
    }

    public void PolicyNoWithInsurerAndExpired90Day() {
        try {
            if (Pteviouspp.isDisplayed()) {
                TestUtil.waitUntilVisibilityOfElement(prevPolicyNumber);
                TestUtil.sendKeys(prevPolicyNumber, "5544321488585855", "Previous policy no is enter");
                TestUtil.click(selectInsurer, "Select the insurer....");
                TestUtil.click(prevbajajAllianz, "Clicked on prevbajajAllianz");
                WebCommands.staticSleep(2000);
            }
        } catch (Exception e) {
            TestUtil.click(policyExpired90DaysAgo, "policyExpired90DaysAgo clicked");
        }
    }

    public void InspectionContactandPersonaldetail(String fname, String lname) throws Exception {
        contactDetails(fname, lname);
        Digit_Pin();
        commonAddressLine();
        ContinueButton();
        personalDetailsKyc();
        ContinueButton();
        vehicleDetail();
        ContinueButton();
    }

    public void iciciAddressDetailsForInspection() {
        TestUtil.waitUntilVisibilityOfElement(ClickStateForInspection);
        TestUtil.click(ClickStateForInspection, "Clicked on State..");
        TestUtil.waitUntilVisibilityOfElement(StateInspection);
        TestUtil.sendKeys(StateInspection, "Maharashtra", "State Name is filled..");
        TestUtil.waitElementToBeClickable(SelectState);
        TestUtil.click(SelectState, "State is Selected..");
        TestUtil.waitElementToBeClickable(ClickCityForInspection);
        TestUtil.click(ClickCityForInspection, "Clicked on city..");
        TestUtil.waitUntilVisibilityOfElement(CityInspection);
        TestUtil.sendKeys(CityInspection, "Mumbai", "City Name is entered");
        TestUtil.waitElementToBeClickable(SelectCity);
        TestUtil.click(SelectCity, "City is selected...");
    }
    public void commonAddressLineForInspection() {
        TestUtil.waitUntilVisibilityOfElement(AddressLine1ForInspection);
        TestUtil.sendKeys(AddressLine1ForInspection, "Saki Vihar Road", "AddressLine1ForInspection is Entered..");
        TestUtil.waitUntilVisibilityOfElement(AddressLine2ForInspection);
        TestUtil.sendKeys(AddressLine2ForInspection, "Saki Naka Metro Station", "AddressLine2ForInspection is Ent..");

    }

    public void InspectionInitiation() throws InterruptedException {
        TestUtil.waitUntilVisibilityOfElement(initiateInspection);
        TestUtil.click(initiateInspection, "Clicked on iniate inspection...");
        TestUtil.waitUntilVisibilityOfElement(InspectionMode);
        TestUtil.waitElementToBeClickable(InspectionMode);
        TestUtil.click(InspectionMode, "Clicked on inspection mode..");
        TestUtil.click(SelfInspection, "Clicked on self Inspection...");
        TestUtil.waitUntilVisibilityOfElement(inspectionMobile);
        TestUtil.sendKeys(inspectionMobile, "6999912345", "Mobile No is enter");
        iciciAddressDetailsForInspection();
        commonAddressLineForInspection();
        TestUtil.click(Checkmark,"Click on Check-Mark..");
        WebCommands.staticSleep(2000);
        try {
            inspectionRequest();
        } catch (Exception e) {
            System.out.println("Inspection Request Timeout " + e);
        }
        //   shareInspectionLink();
    }


    public void ICICIinspectionTpToCP(String fname, String lname) throws Exception {
        WebCommands.staticSleep(2000);
        InspectionContactandPersonaldetail(fname, lname);
        PolicyNoWithInsurerAndExpired90Day();
        ContinueButton();
        InspectionInitiation();
    }


}
