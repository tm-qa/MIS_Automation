package com.qa.turtlemint.pages.Ninja_BI_Page;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;


public class BI_Motor_AP extends TestBase {

    TestUtil tl = new TestUtil();

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

    @FindBy(id = "partnerName")
    WebElement PartnerName;

    @FindBy(id = "paymentStatus")
    WebElement PaymentStatus;

    @FindBy(xpath = "//md-option[contains(@value,'COMPLETED')]")
    WebElement PaymentStatusValue;

    @FindBy(xpath = "//md-datepicker[(@name='paymentCompleteDate')]/button[@class='md-datepicker-button md-icon-button md-button md-ink-ripple']")
    WebElement PaymentCompleteDatePicker;

    @FindBy(xpath = "//table[@class='md-calendar']/tbody[4]/tr[2]/td[4]/span[@class='md-calendar-date-selection-indicator']")
    WebElement PaymentCompleteDate;

    @FindBy(xpath = "//md-checkbox[@id='paymentVerified']//div[@class='md-container md-ink-ripple']")
    WebElement PaymentVerifiedCheck;

    @FindBy(xpath = "//md-radio-button[@data-auto=\"paymentMode-ONLINE-radio\"]")
    WebElement OnlineClicked;

    @FindBy(xpath = "//md-datepicker[@name='policyIssuanceDate']/button")
    WebElement PolicyIssuanceDatePicker;

    @FindBy(xpath = "//td[@class='md-calendar-date md-calendar-date-today md-focus']")
    WebElement PolicyIssuanceDate;

    @FindBy(xpath = "//input[@type='file']")
    WebElement FileUpload;

    @FindBy(xpath = "//md-radio-button[@value='POLICY']")
    WebElement PolicyTag;

    @FindBy(xpath = "//button[normalize-space()='Done']")
    WebElement FileTagDone;

    @FindBy(xpath = "//div[@class='ng-scope layout-align-center-center layout-column'][1]")
    WebElement IssuanceSave;

    @FindBy(xpath = "//input[@data-auto=\"txnNo-text\"]")
    WebElement TransNumber;

    public BI_Motor_AP() {
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
            if (policy_type.get(l).getText().contains("Comprehensive")) {
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

    public void BI_AP_Flow() throws InterruptedException, IOException {
        LogUtils.info("Clicked on Issuance button");
        TestUtil.click(ReportASale, "Clicked on ReportSale button");
        Plusbtn.click();
        Thread.sleep(3000);
        LogUtils.info("Clicked on Branch Issuance button to create entry");
        VerticlDropdown.click();
        Thread.sleep(2000);
        LogUtils.info("Vertical selected");
        vertical_list("Motor");
        Thread.sleep(2000);
        PolicyIssuanceDropdown.click();
        LogUtils.info("Policy Issuance status selected");
        Thread.sleep(1000);
        InsurerDropdown.click();
        Thread.sleep(500);
        LogUtils.info("Insurer Selected");
        insurer_list("HDFC Ergo");
        LogUtils.info("Showing Insurer list");

        CreateSale.click();
        LogUtils.info("Clicked on Create Sale button");
        tl.GenerateRegNo();
        LogUtils.info("RegNumber Generated");
        System.out.println(tl.RegNo + "----------------");
        // RegNo.sendKeys(tl.RegNo);
        LogUtils.info("RegNumber sent to field");
        Thread.sleep(2000);
        SaleCloseDatePicker.click();
        LogUtils.info("Sale Closer date picker opened");
        Thread.sleep(3000);
        SaleCloseDate.click();
        Thread.sleep(2000);
        PartnerName.sendKeys("Automation test");
        LogUtils.info("Name Sent to field");
        Thread.sleep(2000);
        PartnerName.sendKeys(Keys.ARROW_DOWN);
        PartnerName.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        Thread.sleep(1000);
        PolicyIssuanceDatePicker.click();
        Thread.sleep(1000);
        PolicyIssuanceDate.click();
        Thread.sleep(1000);
        PaymentStatus.click();
        PaymentStatusValue.click();
        Thread.sleep(1000);
        PaymentCompleteDatePicker.click();
        PaymentCompleteDate.click();
        LogUtils.info("Payment Complete Date is selected");
        Thread.sleep(1000);
        LogUtils.info("Now Waiting for payment verified check....");
        PaymentVerifiedCheck.click();
        LogUtils.info("Payment verification check box checked");
        TestUtil.click(OnlineClicked, "Online Clicked");

        //    FileUpload.sendKeys("/Users/tejasbahadure/Downloads/dog.png");
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
        Thread.sleep(2000);
        LogUtils.info("Details saved successfully");
        LogUtils.info("And now Entry added successfully in system");
        TestUtil.getFullPageScreenShot();
    }
}