package com.qa.turtlemint.pages.CI;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CI_health extends TestBase {
    public CI_health() {
        PageFactory.initElements(driver, this);
    }
    String currentWindow;
    @FindBy(xpath = "//span[text()='Health']")
    WebElement health;
    @FindBy(xpath = "//div[text()='Health Insurance']//parent::div")
    WebElement healthInsureButton;
    @FindBy(xpath = "//span[text()='Male']")
    WebElement Maleselected;

    @FindBy(xpath = "//span[text()='Female']")
    WebElement Femaleselected;

    @FindBy(xpath = "//span[text()='Self']")
    WebElement SelfTick;

    @FindBy(xpath = "//span[text()='Next']//parent::button")
    WebElement NextButton;

    @FindBy(xpath = "//span[text()='Next']")
    WebElement NextButtonforAge;

    @FindBy(xpath = "//input[@class=\"ant-select-selection-search-input\"]//following::span[@class=\"ant-select-selection-placeholder\"]")
    WebElement SelfAgeDD;
    @FindBy(xpath = "//span[text()='Buy Now']")
    WebElement BuyNow;

    @FindBy(xpath = "//span[@class=\"ant-select-selection-placeholder\"]//parent::div//input")
    WebElement SearchAge;
    @FindBy(xpath = "//span[text()='Yes']")
    WebElement YesClick;
    @FindBy(xpath = "//span[text()='Self']//parent::div/parent::div//span[text()='No Disease']")
    WebElement diseasedrop;
    @FindBy(xpath = "//span[text()='Hypertension/ High BP/ High Cholesterol']")
    WebElement DP_Selected;
    @FindBy(xpath = "//span[text()='Done']//parent::button")
    WebElement Done2;
    @FindBy(xpath = "//span[text()='Done']//parent::button")
    WebElement Done;
    @FindBy(xpath = "//input[@inputmode=\"numeric\"]")
    WebElement EnterMyPin;
    @FindBy(xpath = "//input[@id='kyc-form_dob']")
    WebElement KYCdateselect;
    @FindBy(xpath = "//input[@id='kyc-form_pan']")
    WebElement Enterpancardnumber;
    @FindBy(xpath = "//button[@id=\"web-submit-btn\"]")
    WebElement ContinueBT;
    @FindBy(xpath = "//button[@type='button']")
    WebElement confirmBt;
    @FindBy(xpath = "//h4[text()='Upload Document']//following ::span[text()='Continue'][1]")
    WebElement ContinueBt2;
    @FindBy(xpath = "//h4[text()='Upload Document']")
    WebElement radioBT2;
    @FindBy(xpath = "//mat-form-field[@appearance=\"outline\"]")
    WebElement Selectdropdown;
    @FindBy(xpath = "//span[@class='mat-option-text']")
    List<WebElement> FecthDropdown;
    @FindBy(xpath = "//span[text()='Submit']//parent::button")
    WebElement SubmittedBT;
    @FindBy(xpath = "//span[text()='Proceed to verify']")
    WebElement Proceedtoverify;
    @FindBy(xpath = "//input[@placeholder=\"Enter mobile number\"]")
    WebElement MobileNo;

    @FindBy(xpath = "//input[@placeholder=\"Enter Email Id\"]")
    WebElement Mailid;

    @FindBy(xpath = "//button[@id=\"continue-button-active\"]")
    WebElement Continue;


    @FindBy(xpath = "//input[@id=\"insuredMembers.0.height_feet\"]")
    WebElement feet;


    @FindBy(xpath = "//input[@id='insuredMembers.0.height_inches']")
    WebElement inch;


    @FindBy(xpath = "//input[@id=\"insuredMembers.0.weight\"]")
    WebElement Weight;


    @FindBy(xpath = "//input[@id=\"insuredMembers.0.occupation\"]")
    WebElement occupationdropdown;


    @FindBy(xpath = "//input[@id=\"proposer.nomineeName\"]")
    WebElement nomineenamedetail;


    @FindBy(xpath = "//input[@id=\"proposer.nomineeRelation\"]")
    WebElement nomineeisMy;


    @FindBy(xpath = "//input[@id=\"proposer.nomineeDob\"]")
    WebElement dobdetails;

    @FindBy(xpath = "//input[@id=\"addrLine1\"]")
    WebElement Address1;

    @FindBy(xpath = "//input[@id=\"addrLine2\"]")
    WebElement Address2;
    @FindBy(xpath = "//span[text()=\"Online\"]")
    WebElement online;

    @FindBy(xpath = "//article[text()=\"Copy Link\"]")
    WebElement copylink;

    @FindBy(xpath = "//input[@class=\"ant-checkbox-input\"]")
    WebElement checkmark;

    @FindBy(xpath = "//span[text()=\"Approve\"]/parent::button")
    WebElement Approve;

    @FindBy(xpath = "//span[text()=\"Reject\"]/parent::button")
    WebElement Reject;

    @FindBy(xpath = "//input[@placeholder=\"1234\"]")
    WebElement otp;

    @FindBy(xpath = "//span[text()=\"Verify\"]/parent::button")
    WebElement verifyotp;


    @FindBy(xpath = "//span[text()=\"Select Option\"]/parent::div")
    WebElement reasondropdown;

    @FindBy(xpath = "//div[@title=\"I found a better deal\"]")
    WebElement reasonselect;

    @FindBy(xpath = "//button[@aria-label=\"Close\"and @class=\"ant-modal-close\"]")
    WebElement closecrossbutton;

    @FindBy(xpath = "//span[text()=\"Submit\"]/parent::button")
    WebElement RejectSubmitButton;

    @FindBy(xpath = "//input[@id=\"proposer.nomineeAddressCheck\"]")
    WebElement checkmarkReilence;

    @FindBy(xpath = "//div[@id=\"medicalHistory.PREEXIST1.answer\"]//span[text()=\"Yes\"]")
    WebElement ReliancePreExistingQuestionYes;

    @FindBy(xpath = "//div[@id=\"medicalHistory.PEDRE60.answer\"]//span[text()=\"Yes\"]")
    WebElement RelianceHypertensionYes;

    @FindBy(xpath = "//input[@id=\"medicalHistory.PEDRE60.members.SELF.subQuestion.SufferingSince60.answer\"]")
    WebElement SufferingFromDate;

    @FindBy(xpath = "//div[text()=\"Jan\"]")
    WebElement SelectJanMonth;

    @FindBy(xpath = "//input[@id=\"medicalHistory.PEDRE60.members.SELF.subQuestion.OtherDisease60.answer\"]")
    WebElement InputQue2;

    @FindBy(xpath = "//input[@id=\"medicalHistory.PEDRE60.members.SELF.subQuestion.TreatmentTaken60.answer\"]")
    WebElement InputQue3;

    @FindBy(xpath = "//input[@id=\"medicalHistory.PEDRE60.members.SELF.subQuestion.ExactDiagnosis60.answer\"]")
    WebElement InputQue4;

    @FindBy(xpath = "//input[@id=\"medicalHistory.PEDRE60.members.SELF.subQuestion.DiagnosisDate60.answer\"]")
    WebElement DiagnosisDate;


    @FindBy(xpath = "//input[@id=\"medicalHistory.PEDRE60.members.SELF.subQuestion.ConsultationDate60.answer\"]")
    WebElement ConsultationDate;

    @FindBy(xpath = "//input[@id=\"medicalHistory.PEDRE60.members.SELF.subQuestion.HospitalName60.answer\"]")
    WebElement HospitalName;
    @FindBy(xpath = "//span[text()='PAN No.']")
    WebElement pan1;
    @FindBy(xpath = "//input[@id=\"proposer.education\"]")
    WebElement education;
    @FindBy(xpath = "//div[@title=\"Graduate\"]")
    WebElement graduate;
    @FindBy(xpath = "//input[@id=\"insuredMembers.0.education\"]")
    WebElement education1;

    @FindBy(xpath = "//input[@id=\"insuredMembers.1.name\"]")
    WebElement Spousename;

    @FindBy(xpath = "//input[@id=\"insuredMembers.1.height_feet\"]")
    WebElement feet2;

    @FindBy(xpath = "//input[@id='insuredMembers.1.height_inches']")
    WebElement inch2;

    @FindBy(xpath = "//input[@id=\"insuredMembers.1.weight\"]")
    WebElement Weight2;
    @FindBy(xpath = "//input[@id=\"insuredMembers.1.dob\"]")
    WebElement DOB2;
    @FindBy(xpath = "//input[@id=\"insuredMembers.1.education\"]")
    WebElement education2;
    @FindBy(xpath = "//input[@id=\"proposer.nomineeTitle\"]")
    WebElement NomineeTitle;
    @FindBy(xpath = "(//input[@type=\"file\"])[2]")
    WebElement Chequeupload;
    @FindBy(xpath = "//span[text()='Cheque']")
    WebElement Cheque;
    @FindBy(xpath = "//span[text()='Done']//parent::button")
    WebElement done;
    @FindBy(xpath = "(//input[@type=\"file\"])[3]")
    WebElement IDUpload;
    @FindBy(xpath = "//span[text()='Car']")
    WebElement fw;

    @FindBy(xpath = "//div[text()='Got It!']")
    WebElement GotItBtn;
    Actions act = new Actions(driver);



    JavascriptExecutor js = (JavascriptExecutor) driver;


    public void HealthInsuranceClick() throws InterruptedException {
        WebCommands.staticSleep(2500);
        TestUtil.click(healthInsureButton, "Clicked on Health Insurance Button");
        WebCommands.staticSleep(1000);
    }
    public void ValidateHealthClick() throws InterruptedException {
        WebCommands.staticSleep(4000);
        TestUtil.click(health, "health button Click");
    }

    public void ValidateMotorFWClick() {
        fw.click();
        WebCommands.staticSleep(10000);
    }
    public void GenderButtonClick(String Gender) {
        WebCommands.staticSleep(1000);
        if (Gender == "male") {
            TestUtil.click(Maleselected, "Male Gender Selected");
            WebCommands.staticSleep(1000);
        } else
            TestUtil.click(Femaleselected, "Female Gender Selected");
        WebCommands.staticSleep(1000);
    }

    public void SelectAge(String age) {
        js.executeScript("arguments[0].click()", SelfAgeDD);
        LogUtils.info("Clicked on Select age Button");
        TestUtil.sendKeys(SearchAge, age, age + " Entered");
        SearchAge.sendKeys(Keys.ENTER);
    }

    public void SelfMemberSelect() {
        TestUtil.click(SelfTick, "Clicked on Self Button");
        TestUtil.click(NextButton, "Clicked on next Button");
    }


    public void NextButtonforAge() {
        TestUtil.waitElementToBeClickable(NextButtonforAge);
        TestUtil.click(NextButtonforAge, "Clicked on next Button");
    }

    public void DiseaseSelection(String Disease, WebElement selectDisease) {
        if (Disease == "Yes") {
            TestUtil.click(YesClick, "Yes clicked");
            TestUtil.click(diseasedrop, "Dropdown of Disease");
            TestUtil.click(selectDisease, "Blood pressure Selected");
            TestUtil.click(Done, "done clicked");
            TestUtil.click(NextButton, "Clicked on next Button");
        } else
            TestUtil.click(NextButton, "Clicked on next Button");
    }


    public void MyPincode(String pincode) {
        TestUtil.sendKeys(EnterMyPin, pincode, "Pincode Entered ");
        WebCommands.staticSleep(1000);
        TestUtil.click(NextButton, "Clicked on next Button");
        WebCommands.staticSleep(1000);

    }
    public void Profile_page_Individual(String gender, String selfage, String pincode) {
        GenderButtonClick(gender);
        SelfMemberSelect();
        SelectAge(selfage);
        NextButtonforAge();
        DiseaseSelection("Yes", DP_Selected);
        MyPincode(pincode);
    }
    public void VewDetaisandBuynow(String planename) throws IOException {
        WebCommands.staticSleep(2000);
        WebElement Button = driver.findElement(By.xpath("//h5[text()='" + planename + "']//parent::div//parent::div/parent::div//span[text()='View Details']"));

        if (Button.isDisplayed()){
            Button.click();
            WebCommands.staticSleep(2000);
            LogUtils.info("Clicked View details Button");
            TestUtil.getFullPageScreenShot();
            TestUtil.click(BuyNow,"Clicked buynow button");
        } else {
            WebCommands.staticSleep(2000);
            WebElement Button2 = driver.findElement(By.xpath("//h5[text()='" + planename + "']//parent::div//parent::div/parent::div//span[text()='Buy Now']"));
            Button2.click();
            WebCommands.staticSleep(2000);
            LogUtils.info("Clicked Buy now Button");

        }
    }



    public void CKYCdetails(String ovd) {
        WebCommands.staticSleep(4000);
        KYCdateselect.sendKeys("24/12/1997");
        KYCdateselect.sendKeys(Keys.ENTER);
        TestUtil.sendKeys(Enterpancardnumber, "BKGPC8713D", "pan entering");
        TestUtil.getScreenShot();
        TestUtil.click(ContinueBT, "Enter contiune");
        WebCommands.staticSleep(10000);
        try {
            TestUtil.waitUntilVisibilityOfElement(confirmBt);
            TestUtil.click(confirmBt, "Confirm");
            TestUtil.getScreenShot();
        } catch (Exception e) {
            LogUtils.info("C-kyc has failed sogoing through ovd");
            TestUtil.getScreenShot();
            if (ovd == "icici") {
                OVDdetailsdocumentsIcici();
            }
        }

    }

    public void GotIT() {
        TestUtil.click(GotItBtn, "Got It Clicked !");
        WebCommands.staticSleep(20000);
    }

    public static void OvdUploadFile(String YourFileLocationFolder) {
        WebCommands.staticSleep(2000);
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys( YourFileLocationFolder);
        WebCommands.staticSleep(1000);
    }

    public void OVDdetailsdocumentsIcici() {
        WebCommands.staticSleep(2000);
        TestUtil.click(radioBT2, "Clicked on radio button");
        WebCommands.staticSleep(1000);
        TestUtil.click(ContinueBt2, "Clicked on Continue Button");
        WebCommands.staticSleep(3000);
        TestUtil.click(Selectdropdown, "selected decoments");
        WebCommands.staticSleep(3000);
        for (WebElement dropdownresult : FecthDropdown) {
            if (dropdownresult.getText().equals("Aadhaar")) {
                System.out.println("We are inside loop:" + dropdownresult);
                dropdownresult.click();
                System.out.println("We are in if section");
                break;
            }
        }
        WebCommands.staticSleep(3000);
        OvdUploadFile("/home/ubuntu/storage/Aadharfront.jpg");
        //TestUtil.OvdUploadFile("/Users/vijay/Aadharfront.jpg");
        WebCommands.staticSleep(10000);
        LogUtils.info("Aadhar fornt page uploaded");
        OvdUploadFile("/home/ubuntu/storage/Aadharback.jpg");
        //TestUtil.OvdUploadFile("/Users/vijay/Aadharback.jpg");
        LogUtils.info("Aadhar Back page uploaded");
        WebCommands.staticSleep(30000);
        TestUtil.getScreenShot();
        // TestUtil.click30(SubmittedBT, "clicked submitted");
        TestUtil.click(SubmittedBT, "clicked submitted");
        WebCommands.staticSleep(6000);
        OvdUploadFile("/home/ubuntu/storage/images.jpg");
        //   TestUtil.OvdUploadFile("/Users/vijay/Dog.png");
        LogUtils.info("profile photo uploaded");
        WebCommands.staticSleep(1000);
        TestUtil.click(Proceedtoverify, "PROCEEDTO VERIFY");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.click(confirmBt, "Confirm");
    }

    public void commonContactDetails_All() {
        TestUtil.sendKeys(MobileNo, "6999912345", "mobile enered");
        TestUtil.sendKeys(Mailid, "automationtesting@turtlemint.com", "mail enered");
        TestUtil.sendKeys(Address1, "adressAutomaation", "Adress line 1 entered");
        TestUtil.sendKeys(Address2, "adressAutomaation", "Adress line 2 entered");
        TestUtil.click(Continue, "continue clicked");
    }
    public void selfDetailsRelience() {
        act.moveToElement(feet).click().perform();
        TestUtil.sendKeys(feet, "5", "self feet enteerd");
        TestUtil.sendKeys(inch, "5", "self inch entered");
        TestUtil.sendKeys(Weight, "56", "self Wt entered");
        TestUtil.sendKeys(occupationdropdown, "self" + Keys.ENTER, "Self employed occupation entered");
        WebCommands.staticSleep(1000);
    }
    public void ReilencefinalNomineeDetails() {
        TestUtil.sendKeys(nomineeisMy, "son" + Keys.ENTER, "Nominee selected");
        TestUtil.sendKeys(nomineenamedetail, "auto test", "name entered");
        TestUtil.sendKeys(dobdetails, "11/01/2006" + Keys.ENTER, "DOB entered");
        js.executeScript("arguments[0].click();", checkmarkReilence);
        LogUtils.info("clicked checkmar...");
        TestUtil.click(Continue, "continue");
        WebCommands.staticSleep(2000);
    }
    public void RelianceMedicalHistoryYes(){
        TestUtil.click(ReliancePreExistingQuestionYes,"Clicked on Yes");
        TestUtil.click(RelianceHypertensionYes,"Reliance Hypertension selected as Yes ");
        TestUtil.click(SufferingFromDate,"Clicked on Suffering from Date");
        TestUtil.click(SelectJanMonth,"Selecting January Month");
        TestUtil.sendKeys(InputQue2,"ABCD ABCD","Entering Other diseases");
        TestUtil.sendKeys(InputQue3, "None", "Entering treatment taken");
        TestUtil.sendKeys(InputQue4,"EFGHIJK","Entering exact diagnosis");
        TestUtil.sendKeys(DiagnosisDate,"10/2023","Entering Diagnosis Date");
        DiagnosisDate.sendKeys(Keys.RETURN);
        TestUtil.sendKeys(ConsultationDate,"11/2023","Entering Consultation Date");
        ConsultationDate.sendKeys(Keys.RETURN);
        TestUtil.sendKeys(HospitalName,"ABC Hospital", "Entering hospital name");
        TestUtil.click(Continue, "continue");
        WebCommands.staticSleep(2000);
        js.executeScript("arguments[0].click();", Continue);
        LogUtils.info("Clicked continue button");
    }
    public void paymentDetails() {
        LogUtils.info("payment page open...");
        WebCommands.staticSleep(2000);
        TestUtil.click(online, "Online clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(Continue, "Share payment clicked");
        TestUtil.getScreenShot();
        currentWindow = driver.getWindowHandle();
    }
    public void share_payment_link() {
        WebCommands.staticSleep(3000);
        TestUtil.waitUntilVisibilityOfElement(copylink);
        String copiedText = copylink.getAttribute("data-test-value");
        TestUtil.click(copylink, "Copy link clicked");
        LogUtils.info("Copyed link");
        WebCommands.staticSleep(2000);
        TestUtil.click(closecrossbutton, "close share window button");
        WebCommands.staticSleep(2000);
        System.out.println("copied link is " + copiedText);
        WebCommands.staticSleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        LogUtils.info("Open new tab");
        WebCommands.staticSleep(1500);
        driver.get(copiedText);
        WebCommands.staticSleep(2000);
    }


    public void do_payment(String Approved_OR_reject) {
        act.moveToElement(checkmark).click().build().perform();
        if (Approved_OR_reject == "A") {
            WebCommands.staticSleep(2000);
            act.moveToElement(Approve).click().build().perform();
            LogUtils.info("Approve clicked");
            WebCommands.staticSleep(3000);
            TestUtil.sendKeys(otp, "1234", "OTP entered");
            TestUtil.click(verifyotp, "verify OTP");
            WebCommands.staticSleep(3000);
            TestUtil.getScreenShot();

        } else {
            act.moveToElement(Reject).click().build().perform();
            LogUtils.info("Reject clicked");
            TestUtil.click(reasondropdown, "dropdown reson");
            TestUtil.click(reasonselect, "");
            TestUtil.click(RejectSubmitButton, "Submit btn pressed");
            TestUtil.getScreenShot();
        }
    }


    public void spouseEducationSelect() {
        TestUtil.sendKeys(education2, "Graduate"+Keys.ENTER, "Graduate entered");

    }
    public void educationSelect() {
        TestUtil.getScreenShot();
        TestUtil.sendKeys(education1, "Graduate"+Keys.ENTER, "Graduate entered");
    }
    public void selfInsuredDetails() {
        TestUtil.sendKeys(feet, "5", "feet enteerd");
        TestUtil.sendKeys(inch, "9", "inch entered");
        TestUtil.sendKeys(Weight, "72", "Wt entered");
    }
    public void spouseInsuredDetails() {
        TestUtil.sendKeys(Spousename, "Chanda mohan", "Spouse name entered");
        TestUtil.sendKeys(DOB2, "20/01/1999" + Keys.ENTER, "DOB entered for spouse");
        act.moveToElement(feet2).click().perform();
        TestUtil.sendKeys(feet2, "4", " spouse feet enteerd...");
        TestUtil.sendKeys(inch2, "4", "spouse inch entered...");
        TestUtil.sendKeys(Weight2, "44", "spouse Wt entered...");
    }
    public void finalNomineeDetailswithoutMobileNumber() {
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(nomineeisMy, "Mother" + Keys.ENTER, "mother name selected");
        dobdetails.sendKeys("01/12/2005");
        dobdetails.sendKeys(Keys.ENTER);
        TestUtil.sendKeys(NomineeTitle, "Mr" + Keys.ENTER, "Title selected");
        TestUtil.sendKeys(nomineenamedetail, "auto test", "mominee name entered.....");
        TestUtil.click(Continue, "clicked continue......");
        WebCommands.staticSleep(2000);
    }
    public void medicalHistoryQuestions() {
        TestUtil.click(Continue, "continue");
        WebCommands.staticSleep(2000);
        js.executeScript("arguments[0].click();", Continue);
        LogUtils.info("Clicked continue button");
    }
    public void ChequepaymentDetails() {
        TestUtil.click(Cheque, "Online clicked");
        TestUtil.click(Continue, "Continue clicked");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(5000);
    }

    public void Documents() {
        //Chequeupload.sendKeys("/home/ubuntu/storage/dog.png");
         Chequeupload.sendKeys("/Users/vijay/PHOTO 1.jpg");
        TestUtil.click(done, "Clicked on Done");
        driver.switchTo().defaultContent();
        WebCommands.staticSleep(2000);
        //IDUpload.sendKeys("/home/ubuntu/storage/dog.png");
         IDUpload.sendKeys("/Users/vijay/PHOTO 1.jpg");
        TestUtil.click(done, "Clicked on Done");
        driver.switchTo().defaultContent();
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(Continue, "Continue clicked");
        TestUtil.getScreenShot();
    }

    public void CheckoutCompairPlan() {
        commonContactDetails_All();
        act.moveToElement(pan1).build().perform();
        WebCommands.staticSleep(5000);
        TestUtil.click(education, "Education Dropdown opened");
        TestUtil.click(graduate, "Graduate Selected");
        selfInsuredDetails();
        educationSelect();
        WebCommands.staticSleep(1000);
        finalNomineeDetailswithoutMobileNumber();
        medicalHistoryQuestions();
        WebCommands.staticSleep(3000);
        TestUtil.click(Continue, "continue clicked");
        WebCommands.staticSleep(2000);
        ChequepaymentDetails();
        Documents();
    }



}
