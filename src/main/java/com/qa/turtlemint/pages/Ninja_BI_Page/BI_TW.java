package com.qa.turtlemint.pages.Ninja_BI_Page;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class BI_TW extends TestBase {

    TestUtil tl = new TestUtil();

    @FindBy(xpath = "//button[@class='_md-nav-button md-accent md-button md-ink-ripple md-unselected']")
    WebElement ReportASale;

    @FindBy(xpath = "//button[@type='button'][@data-auto='new-branch-button']")
    WebElement Plusbtn;

    @FindBy(xpath = "//md-select[@id='$$vertical']")
    WebElement VerticlDropdown;

    @FindBy(id = "insurer")
    WebElement InsurerDropdown;

    @FindBy(xpath = "//button[contains(text(),'Create Sale')]")
    WebElement CreateSale;

    @FindBy(name = "registrationNumber")
    WebElement RegNo;

    @FindBy(xpath = "//div/md-datepicker[@id='saleCloseDate']")
    WebElement SaleCloseDatePicker;

    @FindBy(xpath = "//td[@class='md-calendar-date md-calendar-date-today md-focus']")
    WebElement SaleCloseDate;

    @FindBy(id = "partnerName")
    WebElement PartnerName;

    @FindBy(id = "proposerMobile")
    WebElement Mobile;

    @FindBy(id = "proposerEmail")
    WebElement eMail;

    @FindBy(xpath = "//md-datepicker[@name='policyStartDate']")
    WebElement StartDatePicker;

    @FindBy(xpath = "//md-datepicker[@name='policyEndDate']//parent::div//input")
    WebElement EndDatePicker;

    @FindBy(xpath = "//input[@id='netPremium']")
    WebElement NetPremium;

    @FindBy(xpath = "//md-datepicker[@name='policyIssuanceDate']/button")
    WebElement PolicyIssuanceDatePicker;

    @FindBy(xpath = "//td[@class='md-calendar-date md-calendar-date-today md-focus']")
    WebElement PolicyIssuanceDate;

    @FindBy(id = "policyNumber")
    WebElement PolicyNumber;

    @FindBy(xpath = "//input[@type='file']")
    WebElement FileUpload;

    @FindBy(xpath = "//md-radio-button[@value='POLICY']")
    WebElement PolicyTag;

    @FindBy(xpath = "//button[normalize-space()='Done']")
    WebElement FileTagDone;

    @FindBy(xpath = "//button[text()='Save Issuance']")
    WebElement IssuanceSave;

    @FindBy(xpath = "//td[@class=\"md-calendar-date md-calendar-date-today md-focus\"]")
    WebElement Today;

    public BI_TW() {
        PageFactory.initElements(driver, this);
    }


    public void vertical_list() {
        List<WebElement> vertical_menu = driver.findElements(By.xpath("//md-select-menu[contains(@class,'_md md-overflow')]//md-content//md-option"));
        System.out.println("Vertical Menu = " + vertical_menu.size());


        for (int i = 0; i < vertical_menu.size(); i++) {
            System.out.println(vertical_menu.get(i).getText());
            if (vertical_menu.get(i).getText().contains("TW")) {
                vertical_menu.get(i).click();
                break;
            }
        }
    }

    public void insurer_list() {
        List<WebElement> insurerlist = driver.findElements(By.xpath("//li[@class='ng-scope']"));

        System.out.println("Insurer List = " + insurerlist.size());

        for (int k = 0; k < insurerlist.size(); k++) {
            if (insurerlist.get(k).getText().contains("HDFC Ergo")) {
                insurerlist.get(k).click();
            }
        }
    }

    public void NinjaBranchIssuanceFlow() throws InterruptedException, IOException {
        ReportASale.click();
        LogUtils.info("Clicked on ReportSale button");
        Thread.sleep(2000);
        Plusbtn.click();
        Thread.sleep(3000);
        LogUtils.info("Clicked on Branch Issuance button to create entry");
        VerticlDropdown.click();
        Thread.sleep(2000);
        LogUtils.info("Vertical selected");
        vertical_list();
        Thread.sleep(2500);
        InsurerDropdown.click();
        Thread.sleep(500);
        LogUtils.info("Insurer Selected");
        insurer_list();
        LogUtils.info("Showing Insurer list");

        CreateSale.click();
        LogUtils.info("Clicked on Create Sale button");
        tl.GenerateRegNo();
        LogUtils.info("RegNumber Generated");
        System.out.println(tl.RegNo + "----------------");
        RegNo.sendKeys(tl.RegNo);
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

        Mobile.sendKeys("7980000000");
        eMail.sendKeys("automationtesting@turtlemint.com");
        PolicyNumber.sendKeys("prod_car_BI_PO_" + tl.RegNo);
        PolicyIssuanceDatePicker.click();
        PolicyIssuanceDate.click();

        TestUtil.click(StartDatePicker, "");
        WebCommands.staticSleep(2000);
        TestUtil.click(Today, "Selected for risk start date");
        WebCommands.staticSleep(3000);
        EndDatePicker.click();
        WebCommands.staticSleep(5000);

        EndDatePicker.sendKeys(Keys.ESCAPE);
        WebCommands.staticSleep(2000);
        EndDatePicker.sendKeys(TestUtil.ninjaFutureDate(364));
        WebCommands.staticSleep(2000);
        EndDatePicker.sendKeys(Keys.RETURN);
        WebCommands.staticSleep(2000);

        LogUtils.info("End date picker is selected");
        NetPremium.sendKeys("100");
        LogUtils.info("Net premium is set");

        //    FileUpload.sendKeys("/Users/tejasbahadure/Downloads/dog.png");
        FileUpload.sendKeys("/home/ubuntu/storage/dog.png");
        LogUtils.info("Policy copy file uploaded to Server Location --> /home/ubuntu/storage/dog.png");

        Thread.sleep(4000);
        TestUtil.getScreenShot();
        PolicyTag.click();
        LogUtils.info("Policy tag selected");
        FileTagDone.click();
        Thread.sleep(2500);
        TestUtil.getScreenShot();
        LogUtils.info("File Tagging done");
        Thread.sleep(2000);
        IssuanceSave.click();
        LogUtils.info("Details saved successfully");
        LogUtils.info("And now Entry added successfully in system");
        TestUtil.getFullPageScreenShot();
    }
}