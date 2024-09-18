package com.qa.turtlemint.pages.Ninja_BI_Page;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;


public class BI_Life extends TestBase {

    TestUtil tl = new TestUtil();

    public String mID;

    JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(xpath = "//button[@class='_md-nav-button md-accent md-button md-ink-ripple md-unselected']")
    WebElement ReportASale;

    @FindBy(xpath = "//button[@type='button'][@data-auto='new-branch-button']")
    WebElement Plusbtn;

    @FindBy(xpath = "//md-select[@id='$$vertical']")
    WebElement VerticlDropdown;

    @FindBy(id = "policyIssuanceStatus")
    WebElement PolicyIssuanceDropdown;

    @FindBy(id = "insurer")
    WebElement InsurerDropdown;

    @FindBy(xpath = "//button[contains(text(),'Create Sale')]")
    WebElement CreateSale;

    @FindBy(xpath = "//div/md-datepicker[@id='saleCloseDate']")
    WebElement SaleCloseDatePicker;

    @FindBy(xpath = "//td[@class='md-calendar-date md-calendar-date-today md-focus']")
    WebElement SaleCloseDate;

    @FindBy(id = "policyType")
    WebElement PolicyTypeDropdown;

    @FindBy(id = "partnerName")
    WebElement PartnerName;

    @FindBy(id = "category")
    WebElement category;

    @FindBy(xpath = "//div[text()='Term-Life']")
    WebElement TermLifeselect;

    @FindBy(id = "premiumPaymentFrequency")
    WebElement premiumPaymentTerm;

    @FindBy(xpath = "//md-option[@value=\"YEARLY\"]")
    WebElement Yearly;

    @FindBy(id = "paymentType")
    WebElement paymentType;

    @FindBy(xpath = "//md-option[@value=\"single\"]")
    WebElement Single;

    @FindBy(xpath = "//input[@id=\"premiumPaymentTerm\"]")
    WebElement enterPremiumPayment;

    @FindBy(xpath = "//button[@class='md-icon-button md-button md-ink-ripple']")
    WebElement PolicyFieldSectionArrow;

    @FindBy(id = "proposerFName")
    WebElement FName;

    @FindBy(id = "proposerEmail")
    WebElement emailId;

    @FindBy(id = "proposerLName")
    WebElement LName;

    @FindBy(id = "proposerMobile")
    WebElement Mobile;

    @FindBy(xpath = "//input[@id='pincode']")
    WebElement Pincode;

    @FindBy(xpath = "//md-datepicker[@id=\"proposerDob\"]//parent::div//input")
    WebElement proposerDob;

    @FindBy(xpath = "//md-datepicker[@name='policyStartDate']")
    WebElement StartDatePicker;

    @FindBy(id = "planName")
    WebElement planNameCustom;

    @FindBy(id = "tmPlanId")
    WebElement planName;

    @FindBy(xpath = "//span[text()='Others']")
    WebElement Other;

    @FindBy(id = "policyTerm")
    WebElement policyTerm;

    @FindBy(id = "sumInsured")
    WebElement sumInsured;

    @FindBy(xpath = "//td[@class=\"md-calendar-date md-calendar-date-today md-focus\"]")
    WebElement Today;

    @FindBy(xpath = "//input[@id='netPremium']")
    WebElement NetPremium;

    @FindBy(xpath = "//input[@id='serviceTax']")
    WebElement ServiceTax;

    @FindBy(xpath = "//input[@id='grossPremium']")
    WebElement GrossPremium;

    @FindBy(id = "paymentStatus")
    WebElement PaymentStatus;

    @FindBy(xpath = "//div[text()='Payment Complete']")
    WebElement PaymentStatusValue;

    @FindBy(xpath = "//md-datepicker[(@name='paymentCompleteDate')]/button[@class='md-datepicker-button md-icon-button md-button md-ink-ripple']")
    WebElement PaymentCompleteDatePicker;

    @FindBy(xpath = "//table[@class='md-calendar']/tbody[4]/tr[2]/td[4]/span[@class='md-calendar-date-selection-indicator']")
    WebElement PaymentCompleteDate;

    @FindBy(id = "applicationUrl")
    WebElement ApplicationURKL;

    @FindBy(xpath = "//md-checkbox[@id='paymentVerified']//div[@class='md-container md-ink-ripple']")
    WebElement PaymentVerifiedCheck;

    @FindBy(xpath = "//md-radio-button[@data-auto=\"paymentMode-ONLINE-radio\"]")
    WebElement OnlineClicked;

    @FindBy(xpath = "//md-datepicker[@name='policyIssuanceDate']/button")
    WebElement PolicyIssuanceDatePicker;

    @FindBy(xpath = "//td[@class='md-calendar-date md-calendar-date-today md-focus']")
    WebElement PolicyIssuanceDate;

    @FindBy(id = "policyNumber")
    WebElement PolicyNumber;

    @FindBy(id = "applicationNumber")
    WebElement applicationNumber;

    @FindBy(xpath = "//input[@type='file']")
    WebElement FileUpload;

    @FindBy(xpath = "//md-radio-button[@value='POLICY']")
    WebElement PolicyTag;

    @FindBy(xpath = "//button[normalize-space()='Done']")
    WebElement FileTagDone;

    @FindBy(xpath = "//button[text()='Save Issuance']")
    WebElement IssuanceSave;

    @FindBy(xpath = "//input[@data-auto=\"txnNo-text\"]")
    WebElement TransNumber;

    @FindBy(id = "applicationStatus")
    WebElement applicationStatus;

    @FindBy(xpath = "//div[text()='Completed']")
    WebElement completed;

    @FindBy(xpath = "//md-select[@data-auto=\"typeOfBusiness-select\"]")
    WebElement typeofbus;

    @FindBy(xpath = "//md-option[@value=\"KEYMAN\"]")
    WebElement KEYMAN;

    @FindBy(xpath = "//input[@id='policyDetailsId']")//
    WebElement misID;

    public BI_Life() {
        PageFactory.initElements(driver, this);
    }


    public void vertical_list(String vertical) {
        List<WebElement> vertical_menu = driver.findElements(By.xpath("//md-select-menu[contains(@class,'_md md-overflow')]//md-content//md-option"));
        System.out.println("Vertical Menu = " + vertical_menu.size());


        for (int i = 0; i < vertical_menu.size(); i++) {
            System.out.println(vertical_menu.get(i).getText());
            if (vertical_menu.get(i).getText().contains(vertical)) {
                vertical_menu.get(i).click();
                break;
            }
        }
    }

    public void policy_issuance_status() {
        List<WebElement> Issuance_menu = driver.findElements(By.xpath("//div[@class='md-select-menu-container md-active md-clickable']/md-select-menu/md-content/md-option"));
        System.out.println("Issuance Status = " + Issuance_menu.size());

        for (int j = 0; j < Issuance_menu.size(); j++) {
            System.out.println(Issuance_menu.get(j).getText());

            if (Issuance_menu.get(j).getText().contains("Issued")) {
                Issuance_menu.get(j).click();
                break;
            }

        }
    }

    public void insurer_list(String Insurer) {
        List<WebElement> insurerlist = driver.findElements(By.xpath("//li[@class='ng-scope']"));

        System.out.println("Insurer List = " + insurerlist.size());

        for (int k = 0; k < insurerlist.size(); k++) {
            if (insurerlist.get(k).getText().contains(Insurer)) {
                insurerlist.get(k).click();
            }
        }
    }

    public void policy_type() {
        List<WebElement> policy_type = driver.findElements(By.xpath("//div[@class='md-select-menu-container md-active md-clickable']//md-option"));
        System.out.println("Policy Type = " + policy_type.size());

        for (int l = 0; l < policy_type.size(); l++) {
            if (policy_type.get(l).getText().contains("Term")) {
                policy_type.get(l).click();
            }
        }
    }

    public void payment_mode() {
        List<WebElement> payment_mode = driver.findElements(By.xpath("//md-card[@class='issuance-form _md'][4]//md-radio-button"));
        System.out.println("Payment Mode = " + payment_mode.size());

        for (int m = 0; m < payment_mode.size(); m++) {
            if (payment_mode.get(m).getText().contains("Cheque")) {
                payment_mode.get(m).click();
            }
        }
    }


    public void BI_Life_flow() throws InterruptedException, IOException {
        LogUtils.info("Clicked on Issuance button");
        TestUtil.click(ReportASale, "Clicked on ReportSale button");
        Plusbtn.click();
        Thread.sleep(3000);
        LogUtils.info("Clicked on Branch Issuance button to create entry");
        VerticlDropdown.click();
        Thread.sleep(2000);
        LogUtils.info("Vertical selected");

        vertical_list("Life");
        Thread.sleep(2000);
        PolicyIssuanceDropdown.click();
        LogUtils.info("Policy Issuance status selected");
        Thread.sleep(500);
        policy_issuance_status();
        Thread.sleep(500);

        InsurerDropdown.click();
        Thread.sleep(500);
        TestUtil.sendKeys(InsurerDropdown, "Bajaj", "");
        LogUtils.info("Insurer Selected");
        insurer_list("Bajaj");
        LogUtils.info("Showing Insurer list");

        CreateSale.click();
        LogUtils.info("Clicked on Create Sale button");
        tl.GenerateRegNo();
        LogUtils.info("RegNumber Generated");
        System.out.println(tl.RegNo + "----------------");
        LogUtils.info("RegNumber sent to field");
        Thread.sleep(2000);
        TestUtil.click(category, " Category clicked");
        TestUtil.click(TermLifeselect, "Term Life select");
        SaleCloseDatePicker.click();
        LogUtils.info("Sale Closer date picker opened");
        Thread.sleep(3000);
        SaleCloseDate.click();
        Thread.sleep(2000);
        PolicyTypeDropdown.click();
        LogUtils.info("Policy Type is selected");
        Thread.sleep(2000);
        policy_type();
        PartnerName.sendKeys("Automation test");
        LogUtils.info("Name Sent to field");
        Thread.sleep(2000);
        PartnerName.sendKeys(Keys.ARROW_DOWN);
        PartnerName.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        PolicyFieldSectionArrow.click();
        LogUtils.info("PolicyFieldSectionArrow selected");
        FName.sendKeys("Automation");
        LName.sendKeys("LifeNinja Test");
        Mobile.sendKeys("7980000000");
        TestUtil.sendKeys(emailId, "test@t.com", "email entered");
        TestUtil.click(typeofbus,"Type of Business drop down");
        TestUtil.click(KEYMAN,"KEYMAN Type of Business Selected");
        Pincode.sendKeys("400001");
        Thread.sleep(1000);
        proposerDob.click();
        WebCommands.staticSleep(5000);

        proposerDob.sendKeys(Keys.ESCAPE);
        WebCommands.staticSleep(2000);
        proposerDob.sendKeys(TestUtil.ninjaPastDate(9000));
        WebCommands.staticSleep(2000);
        proposerDob.sendKeys(Keys.RETURN);
        WebCommands.staticSleep(2000);

        TestUtil.click(premiumPaymentTerm, "");
        TestUtil.click(Yearly, "Yearly Selected");
        TestUtil.sendKeys(enterPremiumPayment, "10", "Premium amount entered");
        TestUtil.click(paymentType, "");
        TestUtil.click(Single, "Single Selected");

        TestUtil.click(StartDatePicker, "");
        WebCommands.staticSleep(2000);
        TestUtil.click(Today, "Selected for risk start date");
        WebCommands.staticSleep(3000);

        TestUtil.sendKeys(sumInsured, "1", "sum Insured entered");
        TestUtil.sendKeys(policyTerm, "10", "policy Term entered");
        TestUtil.click(planName, "plan Name entered");
        TestUtil.click(Other, "Other selected");

        TestUtil.sendKeys(planNameCustom, "Test", "plan Name Custom entered");

        NetPremium.sendKeys("1");
        LogUtils.info("Net premium is set");

        ServiceTax.sendKeys("1");
        LogUtils.info("Service tax is set");

        GrossPremium.sendKeys("2");
        LogUtils.info("Gross premium is set");
        Thread.sleep(1000);
        PolicyIssuanceDatePicker.click();
        Thread.sleep(1000);
        PolicyIssuanceDate.click();
        Thread.sleep(1000);

        TestUtil.sendKeys(PolicyNumber, TestUtil.generateRandomPolicyNo(7), "Policy number entered");
        TestUtil.sendKeys(applicationNumber, TestUtil.generateRandomPolicyNo(5), "Application number entered");
        PaymentStatus.click();
        PaymentStatusValue.click();
        TestUtil.click(applicationStatus, "Application status");
        TestUtil.click(completed, "completed Clicked");
        Thread.sleep(1000);
        PaymentCompleteDatePicker.click();
        PaymentCompleteDate.click();
        LogUtils.info("Payment Complete Date is selected");
        Thread.sleep(1000);
        TestUtil.sendKeys(ApplicationURKL, "www.google.com", "URL entered");
        LogUtils.info("Now Waiting for payment verified check....");
        Thread.sleep(1000);
        PaymentVerifiedCheck.click();
        LogUtils.info("Payment verification check box checked");
        TestUtil.click(OnlineClicked, "Online Clicked");

        //   FileUpload.sendKeys("/Users/tejasbahadure/Downloads/dog.png");
        FileUpload.sendKeys("/home/ubuntu/storage/dog.png");

        LogUtils.info("Policy copy file uploaded to Server Location --> /home/ubuntu/storage/dog.png");
        Thread.sleep(4000);
        TestUtil.getScreenShot();
        PolicyTag.click();
        LogUtils.info("Policy tag selected");
        FileTagDone.click();
        LogUtils.info("File Tagging done");
        Thread.sleep(2000);
        TestUtil.sendKeys(TransNumber, "123456", "Transaction number entered");
        IssuanceSave.click();
        LogUtils.info("Details saved successfully");
        WebCommands.staticSleep(5000);
        js.executeScript("arguments[0].scrollIntoView(true);", misID);
        WebCommands.staticSleep(2000);
        mID = misID.getAttribute("value");
        System.out.println("MIS ID : " + mID);
        TestUtil.getScreenShot();
        TestUtil.getFullPageScreenShot();
    }
}