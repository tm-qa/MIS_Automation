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

public class CI_NINJA extends TestBase {



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
    @FindBy(xpath = "//span[text()='Hyundai i20']")
    WebElement SelectModel;
    @FindBy(xpath = "//span[text()='2022'] | //span[text()='2021'] | //span[text()='2020']")
    WebElement RollRegYear;
    @FindBy(xpath = "//span[text()='Diesel']")
    WebElement FuelType;
    @FindBy(id = "variant-uiSelect")
    WebElement ClickVariant;
    @FindBy(xpath = "//span[text()='Asta (1396 CC)'] | //span[text()='Asta (AT) (1396 CC)']|//span[text()='Asta DT (1197 CC)']")
    WebElement SelectVariant;

    @FindBy(xpath = "//a[@data-auto= 'ICICILOMBARD-web']")
    WebElement SelectICICIPlan;

    @FindBy(xpath = "//button[text()='Proceed To Buy']")
    WebElement ProceedtoBuy;

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

    @FindBy(xpath = "//div[@id='registeredState-uiSelect']/input")
    WebElement State;

    @FindBy(xpath = "//span[text()='Maharashtra']")
    WebElement SelectState;

    @FindBy(xpath = "//div[@id='registeredCity-uiSelect']")
    WebElement clickelement;

    @FindBy(xpath = "//div[@id='registeredCity-uiSelect']/input")
    WebElement City;

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

    @FindBy(xpath = "//span[text()='Manual Inspection']")
    WebElement ManualInspection;

    @FindBy(xpath = "//*[@id=\"inspectionPincode-uiSelect\"]")
    WebElement InspectionPincode;

    @FindBy(xpath = "//*[@id=\"inspectionPincode-uiSelect\"]/input[1]")
    WebElement ip;

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

    @FindBy(xpath = "//*[text()='400032']")
    WebElement Inspectioncode;

    @FindBy(xpath = "//span[normalize-space()='Individual']")
    WebElement individual;

    @FindBy(xpath = "//input[@id='kyc-form_dob']")
    WebElement kycdob;

    @FindBy(xpath = "//td[@title='2000-05-02']")
    WebElement selectDate;

    @FindBy(xpath = "//input[@id='kyc-form_pan']")
    WebElement pancardDetails;

    @FindBy(xpath = "(//span[contains(text(),'Continue')])[1]")
    WebElement continuebtn;

    @FindBy(xpath = "//span[text()='Confirm']")
    WebElement verifybtn;
    @FindBy(xpath = "//button[@type='button']")
    WebElement confirmBt;
    @FindBy(xpath = "//h4[text()='Upload Document']//following ::span[text()='Continue'][1]")
    WebElement ContinueBt2;
    @FindBy(xpath = "//h4[text()='Upload Document']")
    WebElement radioBT2;
    @FindBy(xpath = "//mat-form-field[@appearance=\"outline\"]")
    WebElement Selectdropdown;

    @FindBy(xpath = "//span[text()='Yes']//parent::button")
    WebElement yesBT;
    @FindBy(xpath = "//span[text()='Submit']//parent::button")
    WebElement SubmittedBT;
    @FindBy(xpath = "//span[text()='Proceed to verify']")
    WebElement Proceedtoverify;

    @FindBy(xpath = "//span[@class='mat-option-text']")
    List<WebElement> FecthDropdown;

    @FindBy(xpath = "//div[text()='Got It!']")
    WebElement GotItBtn;

    @FindBy(xpath = "//input[@name=\"expiryDate-datepicker\"]")
    WebElement expiryDate;

    @FindBy(xpath = "//span[text()='Expiry date']")
    WebElement clickoutsidde;

    @FindBy(xpath = "//span[text()='No']")
    WebElement NO;

    @FindBy(xpath = "//span[text()='Yes']")
    WebElement Yes;

    @FindBy(xpath = "//span[text()='0%']")
    WebElement ncb_0;

    @FindBy(xpath = "//span[text()='Bajaj Allianz']")
    WebElement Prv_Pol_insur;

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

    @FindBy(xpath = "//td[normalize-space()='partner']")
    WebElement MISEntrySelect;

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

    @FindBy(xpath = "//md-icon[@class=\"ng-scope rotate\"]")
    WebElement clicktoOpenField;

    @FindBy(xpath = "//md-radio-button[@data-auto='POLICY-tag-radio']")
    WebElement uploadPolicyBtn;

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

    public void CI_NINJA() {
        PageFactory.initElements(driver, this);
    }

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

    public void ValidateMotorFWClick() {
        fw.click();
        WebCommands.staticSleep(10000);
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
        Carlbl.isDisplayed();
        LogUtils.info("Car Details Entering Started");
        TestUtil.sendKeys(CarModel, CarName, "Car Name Entered");
        Thread.sleep(2500);
        TestUtil.click(SelectModel, "Model Selected");
        WebCommands.staticSleep(3000);
        WebCommands.staticSleep(2000);
        js.executeScript("arguments[0].click();", RollRegYear);
        LogUtils.info("Year Selected");
        WebCommands.staticSleep(2000);
        js.executeScript("arguments[0].click();", FuelType); //new comment out 9/2/2023
        LogUtils.info("Fuel Type selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(ClickVariant, "Car variant Selection is in process");
        TestUtil.getScreenShot();
        js.executeScript("window.scrollBy(0,-700)");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(4000);
        TestUtil.click(SelectVariant,"Car Variant Selected");
        WebCommands.staticSleep(3000);
        js.executeScript("arguments[0].click();", NextButton);
        WebCommands.staticSleep(1000);
    }

    public void scroll() {
        js.executeScript("arguments[0].scrollIntoView();", scroll);
    }

    public void iciciProceedtoBuy() {
        WebCommands.staticSleep(3000);
        TestUtil.click(SelectICICIPlan, "ICIC Clicked on Buy now");
        TestUtil.click(ProceedtoBuy, "Clicked on Proceed to Buy");
        WebCommands.staticSleep(3000);
    }

    public void GotIT() {
        TestUtil.click(GotItBtn, "Got It Clicked !");
        WebCommands.staticSleep(20000);
    }

    public void cKycFourwheeler() {
        WebCommands.staticSleep(10000);
        TestUtil.sendKeys(kycdob, "02/05/2000", "DOB Entered");
        WebCommands.staticSleep(1000);
        TestUtil.click(selectDate, "DOB Selected");
        TestUtil.sendKeys(pancardDetails, "BNUPT2084B", "Pancard detail entered");
        WebCommands.staticSleep(1000);
        TestUtil.click(individual, "Clicked on Individual");
        WebCommands.staticSleep(1000);
        TestUtil.click(continuebtn, "Clicked on continue");
        WebCommands.staticSleep(20000);
        try {
            WebCommands.staticSleep(2000);
            if(verifybtn.isEnabled()) {
                WebCommands.staticSleep(2000);
                verifybtn.click();
                WebCommands.staticSleep(18000);
            }
        } catch (Exception e) {
            LogUtils.info("C-kyc has failed and hence going through Ovd flow");
            TestUtil.getScreenShot();
            ovdKyc();
        }
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

    public void Expired_less_than_90_days_ago() throws InterruptedException {
        TestUtil.sendKeys(expiryDate, TestUtil.PastDate(30), "Less than 90 Date Selected");
        act.moveToElement(clickoutsidde).click().perform();
        WebCommands.staticSleep(2000);
    }

    public void claimselect_NCB_IS_Zero(String selector) throws InterruptedException {
        if (selector == "no") {
            TestUtil.click(NO, "No Clicked on - claims in previous year");
            TestUtil.click(ncb_0, "NCB 0% Selected");
        } else {
            TestUtil.click(Yes, "No Clicked on - claims in previous year");
            TestUtil.click(next, "Clicked Next Button");
        }
    }

    public void previousPolicyInsurerSelect() {
        TestUtil.click(Prv_Pol_insur, "Bajaj Allianz selected");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(3000);
    }

    public void TurtlemintPreviousPolicy() {
        WebCommands.staticSleep(3000);
        TestUtil.click(NO, "Previous policy from turtlemint Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(next, "Clicked Next Button");
        LogUtils.info("Comprehensive Profile Done");
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

    public void ICICIinspectionCP(String fname, String lname) throws Exception {
        InspectionContactandPersonaldetail(fname, lname);
        PolicyNoWithExpired90Day();
        WebCommands.staticSleep(2000);
        ConBtn.click();
        WebCommands.staticSleep(15000);
        InspectionInitiation();
    }

    public void InspectionInitiation() {
        initiateInspection.click();
        WebCommands.staticSleep(4000);
        InspectionMode.click();
        WebCommands.staticSleep(2000);
        ManualInspection.click();
        WebCommands.staticSleep(1000);
        inspectionMobile.sendKeys("6999912345");
        iciciAddressDetailsForInspection();
        commonAddressLineForInspection();
        WebCommands.staticSleep(2000);
        try {
            inspectionRequest();
        } catch (NoSuchElementException e) {
            System.out.println("Inspection Request Timeout " + e);
        }
    }

    public void inspectionRequest(){
        TestUtil.click(requestInspectionBtn,"Request Inspection");
        WebCommands.staticSleep(15000);
    }

    public void commonAddressLineForInspection() {
        AddressLine1ForInspection.sendKeys("Saki Vihar Road");
        AddressLine2ForInspection.sendKeys("Saki Naka Metro Station");
        LogUtils.info("Address Filled and continue button clicked");
    }

    public void iciciAddressDetailsForInspection() {
        ClickStateForInspection.click();
        StateInspection.sendKeys("Maharashtra");
        SelectState.click();
        ClickCityForInspection.click();
        CityInspection.click();
        CityInspection.sendKeys("Mumbai");
        SelectCity.click();
        InspectionPincode.click();
        WebCommands.staticSleep(3000);
        ip.sendKeys("400032");
        Inspectioncode.click();
        LogUtils.info("State and City entered");
    }

    public void PolicyNoWithExpired90Day() {
        try {
            if (driver.findElement(By.xpath("//span[@ng-if=\"field.hintText\"]")).isDisplayed()) {
                WebCommands.staticSleep(2000);
                prevPolicyNumber.sendKeys("55443214886686868");
            }
        } catch (Exception e) {
            policyExpired90DaysAgo.click();
        }
    }

    public void InspectionContactandPersonaldetail(String fname, String lname) throws Exception {
        contactDetailsKyc(fname,lname);
        ContinueButton();
        personalDetailsKyc();
        ContinueButton();
        vehicleDetail();
        ContinueButton();
    }

    public void contactDetailsKyc(String lname,String fname)throws Exception { //For KYC ICICI and Reliance
        WebCommands.staticSleep(5000);
        ClickOntitle.click();
        SelectTitle.click();
        WebCommands.staticSleep(5000);
        ClickOntitle.click();
        SelectTitle.click();
        String FName= firstname.getAttribute("value");
        String LName= lastname.getAttribute("value");
        if (FName.isEmpty())
        {
            firstname.sendKeys(fname);
            lastname.sendKeys(lname);
            LogUtils.info(" First Name  Filled!");
        }
        if(LName.isEmpty())
        {
            lastname.sendKeys(lname);
            LogUtils.info(" Last Name Filled!");
        }
        String Email= email.getAttribute("value");
        String Mobile= mobile.getAttribute("value");
        if (Email.isEmpty()&&Mobile.isEmpty())
        {
            email.sendKeys("test@example.com");
            LogUtils.info("Email Filled!");
            mobile.sendKeys("6999912345");
            LogUtils.info("Mobile Number Filled!");
        }
        WebCommands.staticSleep(3000);
        scroll();
        String state= State.getAttribute("value");
        String city= City.getAttribute("value");
        Thread.sleep(1500);
        if(State.isEnabled()) {
            ClickState.click();
            State.sendKeys("Maharashtra");
            SelectState.click();
        }
        Thread.sleep(1500);
        if(city.isEmpty())
        {
            clickelement.click();
            City.sendKeys("Mumbai");
            SelectCity.click();
            LogUtils.info("State and City entered");
        }
        String pinCd= Pincode.getAttribute("value");
        String AddressLine= addressLine1.getAttribute("value");
        Thread.sleep(1500);
        if(pinCd.isEmpty()) {
            pin.click();
            Pincode.sendKeys("400065");
            SelectPincode.click();
        }
        Thread.sleep(1500);
        if(AddressLine.isEmpty())
        {
            addressLine1.sendKeys("Saki Vihar Road");
            addressLine2.sendKeys("Saki Naka Metro Station");
        }
        ConBtn.click();
        LogUtils.info("Address Filled and continue button clicked");
        Thread.sleep(2500);
    }
    public void ContinueButton() {
        TestUtil.click(ConBtn,"Clicked on continue Button");
        WebCommands.staticSleep(5000);
    }

    public void personalDetailsKyc()
    {
        Actions act3 = new Actions(driver);
        act3.moveToElement(clickOutSide).click().perform();
        Actions act4 = new Actions(driver);
        act4.moveToElement(Nominee).click().perform();
        LogUtils.info("DOB Selected!");
        SelectNomineeRelation.click();
        NomineeName.sendKeys("Mother Test");
        NomineeDOB.sendKeys("12/02/1958");
        dob.click();
        LogUtils.info("Nominee Details Filled!");
        driver.findElement(By.xpath("//div[@id='page']/div")).click();
        WebCommands.staticSleep(5000);
    }

    public void vehicleDetail() { // Chola, Bajaj, Digit, HDFC
        WebCommands.staticSleep(9000);
        EngineNum.sendKeys("230620221135YES");
        WebCommands.staticSleep(5000);
        ChNum.sendKeys("230620221135YESOK");
        LogUtils.info("Engine and Chassis number filled!");
        WebCommands.staticSleep(4000);
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






}
