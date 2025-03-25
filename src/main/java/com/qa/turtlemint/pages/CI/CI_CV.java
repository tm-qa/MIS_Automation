package com.qa.turtlemint.pages.CI;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class CI_CV extends TestBase {

    @FindBy(xpath = "//span[text()='Trailer']//following::span[text()='No']")
    WebElement no;
    @FindBy(xpath = "//label[text()='Previous policy expired more than 90 days ago']")
    WebElement Expired_more_than_90_days_ago;

    @FindBy(xpath = "//span[text()='Commercial Vehicle']")
    WebElement cv;

    @FindBy(xpath = "//div[text()='Goods Carrying Vehicles']")
    WebElement GCV_Category;

    @FindBy(xpath = "//input[@name='registrationDate-datepicker']")
    WebElement RegistrationDate;

    @FindBy(id = "container-next-btn")
    WebElement NextButton;
    @FindBy(xpath = "//span[text()='Comprehensive']")
    WebElement Comprehensive;
    @FindBy(id = "container-next-btn")
    WebElement next;
    @FindBy(xpath = "//span[text()='Digit General Insurance'] | //span[text()='Digit']")
    WebElement Digit_Insur;

    @FindBy(xpath = "//span[text()='Public']")
    WebElement Public;
    @FindBy(xpath = "//*[@class=\"ui-select-no-choice\"]//parent::div//input")
    WebElement model;

    @FindBy(xpath = "//span[text()='ASHOK LEYLAND']")
    WebElement gcvsel;
    @FindBy(xpath = "//*[text()=\"2023\"]//parent::span//span")
    WebElement s2023;
    @FindBy(xpath = "//span[text()='Diesel']")
    WebElement diesel;

    @FindBy(xpath = "//input[@placeholder='Eg. Truck']")
    WebElement BodyTypeEnter;

    @FindBy(xpath = "//div[@id='vehicleBodyType-uiSelect']")
    WebElement VehicleBodyType;

    @FindBy(xpath = "//span[text()='DOST FE MS BSVI, GVW: 2545']")
    WebElement Variantslt;
    @FindBy(xpath = "//input[@placeholder='Type name and select']")
    WebElement VariantTap;

    @FindBy(xpath = "//span[text()='Vehicle will be used to carry Hazardous material?']//following::span[text()='No'][1]")
    WebElement HazardousNo;
    @FindBy(xpath = "//span[text()=' Without Pay as you Drive discount ']//following::a[@data-auto=\"DIGIT-web\"]")
    WebElement Select_NON_Pay_D_DIGIT_Plan;
    @FindBy(xpath = "//span[text()='Truck']")
    WebElement BodyTruck;
    @FindBy(xpath = "//button[text()='Confirm']")
    WebElement Confirm;
    @FindBy(xpath = "//div[@id='title-uiSelect']")
    WebElement ClickOntitle;

    @FindBy(xpath = "//span[text()='Mr']")
    WebElement SelectTitle;

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstname;

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastname;

    @FindBy(xpath = "//input[@id='email']")
    WebElement email;

    @FindBy(xpath = "//input[@name='mobile']")
    WebElement mobile;

    @FindBy(xpath = "//*[text()='State']")
    WebElement StateDisplay;

    @FindBy(xpath = "//div[@id='registeredPincode-uiSelect']")
    WebElement pin;

    @FindBy(xpath = "//div[@id='registeredPincode-uiSelect']/input")
    WebElement Pincode;
    @FindBy(xpath = "//span[text()='401207']")
    WebElement SelectPIN;

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

    @FindBy(xpath = "//span[text()='Male']")
    WebElement SelectGender;

    @FindBy(xpath = "//input[@name='dob-datepicker']")
    WebElement SelectDOB;

    @FindBy(xpath = "//input[@name='engineNum']")
    WebElement EngineNum;

    @FindBy(xpath = "//input[@name='chassisNum']")
    WebElement ChNum;

    @FindBy(xpath = "//label[text()='Policy expired more than 90 days ago']")
    WebElement policyExpired90DaysAgo;

    @FindBy(xpath = "//button[text()='Initiate Inspection']")
    WebElement initiateInspection;

    @FindBy(xpath = "//input[@name='inspectionMobile']")
    WebElement inspectionMobile;

    @FindBy(xpath = "//button[text()='Request Inspection']")
    WebElement requestInspectionBtn;

    @FindBy(xpath = "//button[text()='Share Inspection Details']")
    WebElement shareInspectionDetailsBtn;

    @FindBy(xpath = "//span[text()='Email']")
    WebElement emailoption;

    @FindBy(xpath = "//input[@name='paidUserEmail']")
    WebElement useremail;

    @FindBy(xpath = "//input[@id='previousPolicyNumber']")
    WebElement prevPolicyNumber;

    @FindBy(xpath = "//span[text()='Select  Insurer']")
    WebElement selectInsurer;

    @FindBy(xpath = "//span[text()='Bajaj Allianz']")
    WebElement prevbajajAllianz;

    @FindBy(xpath = "//a[text()='12']")
    WebElement DateSelect;


    JavascriptExecutor js = (JavascriptExecutor) driver;
    public void scroll() {
        js.executeScript("arguments[0].scrollIntoView();", scroll);
    }


    public void ValidateMotorCVClick() throws InterruptedException {
        WebCommands.staticSleep(4000);
        TestUtil.waitElementToBeClickable(cv);
        TestUtil.click(cv,"Clicked on cv..");

    }

    public void Select_Category()
    {
        WebCommands.staticSleep(3000);
        TestUtil.click(GCV_Category,"Select GCV Category");
    }
    public static void moveToElement(WebElement element) {

        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();

    }


    public void RolloverCVRegLocPublic() {

        TestUtil.sendKeys(RegistrationDate,TestUtil.PastDate(345),"Registration Date is Entered");
        moveToElement(NextButton);
        TestUtil.click(Public,"Clicked on public Radio button");
        TestUtil.click(NextButton, "Next Button Pressed");

    }
    public void comprehensiveSelect() throws InterruptedException {
        TestUtil.waitUntilVisibilityOfElement(Comprehensive);
        TestUtil.waitElementToBeClickable(Comprehensive);
        TestUtil.click(Comprehensive, "Comprehensive Selected");
        try {
            TestUtil.click(next,"Clicked on Next Button....");
            LogUtils.info("Clicked Next Button");
        } catch (Exception e) {
            System.out.println("Next Button Not Found: " + e);
        }
    }
    public void Expired_more_than_90_days_ago() {
        TestUtil.waitUntilVisibilityOfElement(Expired_more_than_90_days_ago);
        TestUtil.click(Expired_more_than_90_days_ago, "Expired more than 90 days ago");
        TestUtil.click(next, "Clicked Next Button");

    }
    public void DIGIT_Insurer_Select()
    {
        TestUtil.click(Digit_Insur,"Clicked on Digit_Insur");
        TestUtil.waitElementToBeClickable(next);
        TestUtil.click(next, "Clicked Next Button");
    }

    public void SaveCVDetailsGCV() throws InterruptedException {
        TestUtil.waitUntilVisibilityOfElement(model);
        TestUtil.sendKeys(model, "Ashok leyland ", "Ashok leyland Dost Typed");
        TestUtil.waitUntilVisibilityOfElement(gcvsel);
        js.executeScript("arguments[0].click();", gcvsel);
        LogUtils.info("Make model selected...");
        WebCommands.staticSleep(3000);
        TestUtil.waitUntilVisibilityOfElement(s2023);
        js.executeScript("arguments[0].click();", s2023);
        WebCommands.staticSleep(4000);
        LogUtils.info("Year Selected..");
        TestUtil.waitUntilVisibilityOfElement(diesel);
        js.executeScript("arguments[0].click();", diesel);
        LogUtils.info("Diesel is selected..");
        TestUtil.waitUntilVisibilityOfElement(VariantTap);
        TestUtil.sendKeys(VariantTap,"DOST FE MS BSVI"," Variant....Name entred");
        TestUtil.waitUntilVisibilityOfElement(Variantslt);
        TestUtil.click(Variantslt,"Variant is selected");
        TestUtil.waitUntilVisibilityOfElement(VehicleBodyType);
        TestUtil.click(VehicleBodyType,"Click on body type");
        TestUtil.waitUntilVisibilityOfElement(BodyTypeEnter);
        TestUtil.sendKeys(BodyTypeEnter,"Truck","Truck body type is Selected...");
        TestUtil.waitElementToBeClickable(BodyTruck);
        TestUtil.click(BodyTruck,"Select body type>>>>>>TRUCK");
        WebCommands.staticSleep(2000);
        TestUtil.waitUntilVisibilityOfElement(HazardousNo);
        js.executeScript("arguments[0].click();", HazardousNo);
        LogUtils.info("Click on HazardousNo");
        TestUtil.waitUntilVisibilityOfElement(no);
        js.executeScript("arguments[0].click();", no);
        LogUtils.info("Click on Not a Trailer");
        WebCommands.staticSleep(2000);
        TestUtil.waitUntilVisibilityOfElement(next);
        TestUtil.click(next, "Clicked Next Button");
    }
    public void DIGITProccedtoBuy() throws Exception {
        WebCommands.staticSleep(4000);
        TestUtil.waitUntilVisibilityOfElement(Select_NON_Pay_D_DIGIT_Plan);
        //    TestUtil.click(SelectDIGITplan, "Clicked Buy Button");
        js.executeScript("arguments[0].click();", Select_NON_Pay_D_DIGIT_Plan);
//        TestUtil.click(ProceedtoBuy, "Clicked Proceed to Buy Button");
        TestUtil.waitUntilVisibilityOfElement(Confirm);
        TestUtil.click(Confirm, "Clicked on confirm");
        WebCommands.staticSleep(3000);
    }


    public void ContinueButton() throws Exception {
        TestUtil.waitElementToBeClickable(ConBtn);
        LogUtils.info("Continue button is Clickable.....");
        WebCommands.staticSleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", ConBtn);
        LogUtils.info("Clicked on continue button");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }

    public void contactDetails(String fname, String lname) throws Exception { //All insurer except HDFC and NINA
        Thread.sleep(2000);
        TestUtil.waitUntilVisibilityOfElement(ClickOntitle);
        TestUtil.click(ClickOntitle, "Clicked on titile");
        TestUtil.waitUntilVisibilityOfElement(SelectTitle);
        TestUtil.click(SelectTitle, "Select the title..");
        String FirstName = firstname.getAttribute("value");
        String LastName = lastname.getAttribute("value");
        if (FirstName.isEmpty() && LastName.isEmpty()) {
            TestUtil.waitUntilVisibilityOfElement(firstname);
            TestUtil.sendKeys(firstname, fname, "First Name is filled");
            TestUtil.waitUntilVisibilityOfElement(lastname);
            TestUtil.sendKeys(lastname, fname, "last Name is filled");
        }
        String Email = email.getAttribute("value");
        String Mobile = mobile.getAttribute("value");
        if (Email.isEmpty()) {
            TestUtil.waitUntilVisibilityOfElement(email);
            TestUtil.sendKeys(email, "test@example.com", "Email Filled!");

        }
        if (Mobile.isEmpty()) {
            TestUtil.waitUntilVisibilityOfElement(mobile);
            TestUtil.sendKeys(mobile, "6999912345", "Mobile Number Filled!");
        }
        WebCommands.staticSleep(3000);
        scroll();
        WebCommands.staticSleep(1000);
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
        String Add1 = addressLine1.getAttribute("value");
        if (Add1.isEmpty()) {
            TestUtil.waitUntilVisibilityOfElement(addressLine1);
            TestUtil.sendKeys(addressLine1, "Saki Vihar Road", "Address line one is Enetred");
            TestUtil.waitUntilVisibilityOfElement(addressLine2);
            TestUtil.sendKeys(addressLine2, "Saki Naka Metro Station", "Address line two is Enetred");
        }
    }

    public void vehicleDetail() throws InterruptedException { // Chola, Bajaj, Digit, HDFC
        String EngineNo = EngineNum.getAttribute("value");
        if (EngineNo.isEmpty()) {
            TestUtil.waitUntilVisibilityOfElement(EngineNum);
            TestUtil.sendKeys(EngineNum, "7654578765678", "Engine number is enetred...");
            TestUtil.waitUntilVisibilityOfElement(ChNum);
            TestUtil.sendKeys(ChNum, "230620221135YESOK", "Chnum number is enetred...");
            //   TestUtil.sendKeys(ChNum, "4567890345", "Chnum number is enetred...");
        }
    }

    public void personalDetailsGenderDOBWithoutAddon() throws Exception { // Digit ONLY when there is no ADDON

        TestUtil.waitUntilVisibilityOfElement(SelectGender);
        moveToElement(SelectGender);
        String Date = SelectDOB.getAttribute("value");
        if (Date.isEmpty()) {
            TestUtil.waitUntilVisibilityOfElement(SelectDOB);
            TestUtil.sendKeys(SelectDOB, "12/02/1988", "Date of birth is entred");
            WebCommands.staticSleep(2000);
            TestUtil.waitUntilVisibilityOfElement(DateSelect);
            TestUtil.click(DateSelect, "Date is selected...");
        }
    }

    //************************************************************************************************//
    public void Modify_Pin() throws Exception {
        WebCommands.staticSleep(6000);
        if (StateDisplay.isDisplayed()) {
            TestUtil.waitElementToBeClickable(pin);
            TestUtil.click(pin, "Clecik on pin....");
            TestUtil.click(pin, "Clecik on pin....");
            TestUtil.waitUntilVisibilityOfElement(Pincode);
            TestUtil.sendKeys(Pincode, "401207", "Pincode is Entered....");
            TestUtil.waitElementToBeClickable(SelectPIN);
            TestUtil.click(SelectPIN, "Select the pincode....");
        }
    }

    public void PolicyNoWithExpired90Day() throws Exception {
        try {
            if (driver.findElement(By.xpath("//span[@ng-if=\"field.hintText\"]")).isDisplayed()) {
                WebCommands.staticSleep(2000);
                prevPolicyNumber.sendKeys("55443214");
            }
        } catch (Exception e) {
            policyExpired90DaysAgo.click();
        }
    }

    public void InspectionStart() {
        WebCommands.staticSleep(10000);
        TestUtil.click(initiateInspection, "Clicked on initiateInspection");
        TestUtil.waitUntilVisibilityOfElement(inspectionMobile);
        TestUtil.sendKeys(inspectionMobile, "6999912345", "Mobile Number Entered");
        TestUtil.waitUntilVisibilityOfElement(requestInspectionBtn);
        TestUtil.click(requestInspectionBtn, "Clicked on requestInspectionBtn");
        TestUtil.waitUntilVisibilityOfElement(shareInspectionDetailsBtn);
        WebCommands.staticSleep(15000);
        TestUtil.click(shareInspectionDetailsBtn, "Clicked on shareInspectionDetailsBtn");
        TestUtil.waitUntilVisibilityOfElement(emailoption);
        TestUtil.click(emailoption, "Clicked on emailoption");
        TestUtil.waitUntilVisibilityOfElement(useremail);
        TestUtil.sendKeys(useremail, "automationtesting@turtlemint.com", "Email-id is Entered..");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(5000);
        LogUtils.info("Detail Entering from App mintpro side Done...");

    }

    public void DigitInspectionMoreThan90(String fname, String lname) throws Exception { // Digit
        contactDetails(fname, lname);
        Digit_Pin();
        commonAddressLine();
        ContinueButton();
        personalDetailsGenderDOBWithoutAddon();
        ContinueButton();
        vehicleDetail();
        ContinueButton();
        PolicyNoWithExpired90Day();
        try {
            selectInsurer.click();
            WebCommands.staticSleep(1000);
            prevbajajAllianz.click();
            WebCommands.staticSleep(2000);
            ContinueButton();
        } catch (Exception e) {
            System.out.println("Previous Policy Not Found " + e);
        }
        WebCommands.staticSleep(2000);
        try {
            ConBtn.click();
            WebCommands.staticSleep(3000);
            ConBtn.click();
            WebCommands.staticSleep(5000);
        } catch (Exception e) {
            System.out.println("Only One continue button");
        }
        InspectionStart();
    }

}
