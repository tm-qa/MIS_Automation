package com.qa.turtlemint.pages.BI;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import com.qa.turtlemint.util.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Locale;

public class BI_pages extends TestBase {

    @FindBy(xpath = "//input[@id=\"registrationNumber\"]")
    WebElement regNo;

    @FindBy(xpath = "//md-datepicker[@name=\"saleCloseDate\"]//input")
    WebElement saleClosedate;

    @FindBy(xpath = "//td[@class=\"md-calendar-date md-calendar-date-today md-focus\"]")
    WebElement todayDate;

    @FindBy(xpath = "//input[@id=\"partnerName\"]")
    WebElement PartnerName;

    @FindBy(xpath = "//li[@aria-setsize=\"1\"]")
    WebElement select1st;

    @FindBy(xpath = "//input[@name=\"proposerMobile\"]")
    WebElement proposalPhone;

    @FindBy(xpath = "//input[@name=\"proposerEmail\"]")
    WebElement proposalEmail;

    @FindBy(xpath = "//input[@name=\"policyNumber\"]")
    WebElement proposalNo;

    @FindBy(xpath = "//md-datepicker[@id=\"policyIssuanceDate\"]")
    WebElement issuanceDate;

    @FindBy(xpath = "//td[@class=\"md-calendar-date md-calendar-date-today md-focus\"]")
    WebElement select1date;

    @FindBy(xpath = "//input[@name=\"rtoLocation\"]")
    WebElement rtoLocatio;

    @FindBy(xpath = "//span[@title=\"MH-01-Tardeo\"]")
    WebElement tardevMH01;

    @FindBy(xpath = "//md-datepicker[@name=\"policyStartDate\"]")
    WebElement riskstartDate;

    @FindBy(xpath = "//md-datepicker[@name=\"policyEndDate\"]")
    WebElement riskEndDate;

    @FindBy(xpath = "//input[@name=\"netPremium\"]")
    WebElement netPremium;

    @FindBy(id = "serviceTax")
    WebElement serviceTax;

    @FindBy(id = "grossPremium")
    WebElement grossPremium;

    @FindBy(xpath = "//md-radio-button[@aria-label=\"Policy\"]")
    WebElement policyClicked;

    @FindBy(xpath = "//md-radio-button[@aria-label=\"Payment Proof\"]")
    WebElement PaymentProof;

    @FindBy(xpath = "//button[@aria-label=\"Done\"]")
    WebElement done;

    @FindBy(xpath = "//button[text()='Save Issuance']")
    WebElement save;

    @FindBy(xpath = "//input[@id=\"applicationNumber\"]")
    WebElement applicationNo;

    @FindBy(id = "policyType")
    WebElement policyType;

    @FindBy(id = "proposerTitle")
    WebElement proposerTitle;

    @FindBy(xpath = "//md-option[@value=\"mr\"]")
    WebElement mr;

    @FindBy(xpath = "//md-option[@value=\"TERM\"]")
    WebElement Term;

    @FindBy(id = "proposerFName")
    WebElement proposerFName;

    @FindBy(id = "proposerLName")
    WebElement proposerLName;

    @FindBy(id = "typeOfBusiness")
    WebElement typeOfBusiness;

    @FindBy(xpath = "//md-option[@value=\"KEYMAN\"]")
    WebElement KEYMAN;

    @FindBy(id = "proposerDob")
    WebElement proposerDob;

    @FindBy(id = "proposerGender")
    WebElement proposerGender;

    @FindBy(xpath = "//md-option[@value=\"Male\"]")
    WebElement Male;

    @FindBy(id = "premiumPaymentFrequency")
    WebElement premiumPaymentFrequency;

    @FindBy(xpath = "//md-option[@value=\"SINGLE\"]")
    WebElement SINGLE;

    @FindBy(id = "modalPremium")
    WebElement modalPremium;

    @FindBy(id = "modalGst")
    WebElement modalGst;

    @FindBy(id = "policyTerm")
    WebElement policyTerm;

    @FindBy(id = "premiumPaymentTerm")
    WebElement premiumPaymentTerm;

    @FindBy(id = "sumInsured")
    WebElement sumInsured;

    @FindBy(id = "income")
    WebElement income;

    @FindBy(id = "maritalStatus")
    WebElement maritalStatus;

    @FindBy(id = "tmPlanId")
    WebElement tmPlanId;

    @FindBy(xpath = "//li[@aria-setsize=\"12\"]")
    WebElement select1stplaneName;

    @FindBy(xpath = "//md-radio-button[@data-auto=\"paymentMode-ONLINE-radio\"]")
    WebElement online;

    @FindBy(id = "paymentStatus")
    WebElement paymentStatus;

    @FindBy(xpath = "//md-option[@data-auto=\"paymentStatus-COMPLETED-select\"]")
    WebElement Complete;

    @FindBy(id = "policyIssuanceStatus")
    WebElement policyIssuanceStatus;

    @FindBy(xpath = "//md-option[@data-auto=\"policyIssuanceStatus-ISSUED-select\"]")
    WebElement Issued;

    @FindBy(xpath = "//md-datepicker[@name=\"policyIssuanceDate\"]")
    WebElement policyIssuanceDate;

    @FindBy(id = "issuanceSubStatus")
    WebElement issuanceSubStatus;

    @FindBy(xpath = "//md-option[@data-auto=\"issuanceSubStatus-INFORCE-select\"]")
    WebElement Inforce;

    @FindBy(id= "policyNumber")
    WebElement policyNumber;





    TestUtil ut = new TestUtil();


    public void PolicyCreateForBI(String TW_FW) {
        TestUtil.sendKeys(regNo, ut.GenerateRegNo(), "Reg no entered");
        TestUtil.click(saleClosedate, "");
        WebCommands.staticSleep(2000);
        TestUtil.click(todayDate, "Date select today");
        TestUtil.sendKeys(PartnerName, "mr automation", "mr automation entered");
        TestUtil.click(select1st, "1st select");
        TestUtil.sendKeys(proposalPhone, "6999912345", "phone no entered");
        TestUtil.sendKeys(proposalEmail, "test@t.com", "Email entered");
        TestUtil.sendKeys(proposalNo, TestUtil.generateRandomPolicyNo(9), "Policy No entered");
        TestUtil.click(issuanceDate, "");
        WebCommands.staticSleep(2000);
        TestUtil.click(todayDate, "Date select today");
        // TestUtil.sendKeys(rtoLocatio, "MH-01-Tardeo", "rto location clicked");
        //  WebCommands.staticSleep(2000);
        // TestUtil.click(tardevMH01, "MH-01-Tardeo selected");
        TestUtil.click(riskstartDate, "");
        WebCommands.staticSleep(2000);
        TestUtil.click(todayDate, "Date select today");
        WebCommands.staticSleep(1000);
        TestUtil.click(riskEndDate, "");
        WebCommands.staticSleep(2000);
        TestUtil.click(todayDate, "Date select today");
        TestUtil.sendKeys(netPremium, "1", "net premium add");

        if (TW_FW=="FW"){
            TestUtil.sendKeys(serviceTax, "1", "service Tax add");
            TestUtil.sendKeys(grossPremium, "1", "gross Premium add");
        }

    }

    public void PolicyCreateForBI_LIfe() {
        TestUtil.sendKeys(applicationNo, TestUtil.generateRandomPolicyNo(10), "Reg no entered");
        TestUtil.click(saleClosedate, "");
        WebCommands.staticSleep(2000);
        TestUtil.click(todayDate, "Date select today");
        TestUtil.click(policyType, "");
        TestUtil.click(Term, "Term policy type select");
        TestUtil.click(PartnerName, "PartnerName select");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(PartnerName, "mr automation", "mr automation entered");
        WebCommands.staticSleep(2000);
        TestUtil.click(select1st, "1st select");
        WebCommands.staticSleep(2000);
        TestUtil.click(proposerTitle, "");
        WebCommands.staticSleep(1000);
        TestUtil.click(mr, "mr select");
        TestUtil.sendKeys(proposerFName, "Automation", "proposerFName entered");
        TestUtil.sendKeys(proposerLName, "Test", "proposerLName entered");
        TestUtil.sendKeys(proposalPhone, "6999912345", "phone no entered");
        TestUtil.sendKeys(proposalEmail, "test@t.com", "Email entered");
        TestUtil.click(typeOfBusiness,"");
        TestUtil.click(KEYMAN,"KEYMAN slect");
        TestUtil.click(proposerDob,"");
        TestUtil.click(todayDate, "Date select today");
        TestUtil.click(proposerGender,"");
        TestUtil.click(Male,"Male select");
        TestUtil.click(premiumPaymentFrequency,"");
        TestUtil.click(SINGLE,"Single select");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(modalPremium,"1","modalPremium");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(modalGst,"1","modalGst");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(policyTerm,"1","policyTerm");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(premiumPaymentTerm,"1","premiumPaymentTerm");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(sumInsured,"1","sumInsured");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(income,"1","income");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(maritalStatus,"Married","maritalStatus");
        TestUtil.click(tmPlanId,"tmPlanId");
        TestUtil.click(select1stplaneName,"select 1st plane");
        TestUtil.click(online,"online select");
        TestUtil.click(paymentStatus,"");
        TestUtil.click(Complete,"Complete");
        TestUtil.click(policyIssuanceStatus,"policyIssuanceStatus");
        TestUtil.click(Issued,"Issued");
        TestUtil.click(policyIssuanceDate,"Issued");
        TestUtil.click(todayDate, "Date select today");
        TestUtil.click(issuanceSubStatus,"");
        TestUtil.click(Inforce,"Pndig clicked");
        TestUtil.sendKeys(policyNumber,TestUtil.generateRandomPolicyNo(8),"Pndig clicked");
        TestUtil.click(save,"");
        TestUtil.click(riskstartDate, "");
        WebCommands.staticSleep(2000);
        TestUtil.click(todayDate, "Date select today");
    }


    public void PolicyUploadforBI() {
        FileUpload.sendKeys("/Users/tejasbahadure/Downloads/dog.pdf");
        // FileUpload.sendKeys("/home/ubuntu/storage/dog.pdf");
        WebCommands.staticSleep(2000);
        TestUtil.click(policyClicked, "policy pdf uploaded");
        TestUtil.click(done, "Clicked on ok button");
        WebCommands.staticSleep(2000);
      //  TestUtil.click(save, "Clicked on save button");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }

    public void PolicyUploadforBILIFE() {
        FileUpload.sendKeys("/Users/tejasbahadure/Downloads/dog.pdf");
        // FileUpload.sendKeys("/home/ubuntu/storage/dog.pdf");
        WebCommands.staticSleep(3000);
        TestUtil.click(PaymentProof, "PaymentProof pdf uploaded");
        TestUtil.click(done, "Clicked on ok button");
        WebCommands.staticSleep(2000);
      //     TestUtil.click(save, "Clicked on save button");
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
    }


    @FindBy(xpath = "//input[@name=\"proposer.address\"]")
    WebElement regisAddress;
    @FindBy(xpath = "//input[@name=\"Registration Pincode\"]")
    WebElement regisPincode;
    @FindBy(xpath = "//input[@name=\"proposer.registrationCity\"]")
    WebElement regisCity;
    @FindBy(xpath = "//input[@name=\"proposer.registrationState\"]")
    WebElement regisState;
    @FindBy(xpath = "//input[@id=\"registrationNo\"]")
    WebElement regisNumber;


    @FindBy(xpath = "//td[@class=\"ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today\"]")
    WebElement PIdate;
    @FindBy(xpath = "//input[@id=\"Motor_issuanceDate\"]")
    WebElement PIdatemanual;
    @FindBy(xpath = "//td[@class=\"ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today ant-picker-cell-selected\"]")
    WebElement saleclosedate;
    @FindBy(xpath = "//input[@id=\"Motor_salesDetail.saleClosedDate\"]")
    WebElement saleclosedatemanual;

    @FindBy(xpath = "//input[@id=\"Motor_startDate\"]")
    WebElement riskstartdate;
    @FindBy(xpath = "//input[@id=\"Motor_odRiskStartDate\"]")
    WebElement odriskstartdate;

    @FindBy(xpath = "//input[@id=\"Motor_endDate\"]")
    WebElement riskenddate;
    @FindBy(xpath = "//input[@id=\"Motor_odRiskEndDate\"]")
    WebElement odriskenddate;

    @FindBy(xpath = "//input[@id=\"rc_select_12\"]")
    WebElement makemodel;

    @FindBy(xpath = "//div[text()=\"Fiat Base 500\"]")
    WebElement fiat_base500;
    @FindBy(xpath = "(//div[text()=\"Sports (1248 CC)\"])[2]")
    WebElement sports;


    @FindBy(xpath = "//input[@id=\"Motor_policyRisk.variant\"]")
    WebElement variantdrop;
    @FindBy(xpath = "//input[@id=\"cubicCapacity\"]")
    WebElement cubiccapacity;
    @FindBy(xpath = "//input[@id=\"fuelType\"]")
    WebElement fuelType;

    @FindBy(xpath = "//input[@id=\"manufactureYear\"]")
    WebElement manufactureYear;
    @FindBy(xpath = "//input[@id=\"engineNo\"]")
    WebElement engineNum;
    @FindBy(xpath = "//input[@id=\"chassisNo\"]")
    WebElement chassisNum;
    @FindBy(xpath = "//input[@id=\"seatingCapacity\"]")
    WebElement seatingCapacity;
    @FindBy(xpath = "//input[@id=\"Total OD Premium\"]")
    WebElement totalodpremium;
    @FindBy(xpath = "//input[@id=\"TotalTPPremium\"]")
    WebElement totaltppremium;
    @FindBy(xpath = "//input[@id=\"NetPremium\"]")
    WebElement netpremium;


    @FindBy(xpath = "//*[@data-icon=\"close\"]")
    WebElement closeButton;

    @FindBy(xpath = "//img[@alt=\"Edit\"]")
    WebElement Edit;

    @FindBy(xpath = "//input[@id=\"Motor_status\"]//parent::span//parent::div")
    WebElement policyStatus;

    @FindBy(xpath = "//div[text()='Junk']")
    WebElement junk;

    @FindBy(xpath = "//input[@id=\"opsDetail.comments\"]")
    WebElement comentforJunk;

    @FindBy(xpath = "//button[text()='Save Sale']")
    WebElement SaveSale;

    @FindBy(xpath = "//span[text()='Junk']")
    WebElement junkassert;

    @FindBy(xpath = "//input[@placeholder=\"Search by Policy No. or Registration No. (min. 4 chars)\"]")
    WebElement search;

    @FindBy(xpath = "//div[@class=\"sc-fHjqPf iFCspv\"]")
    public WebElement policyCkicked;

    @FindBy(xpath = "//td[@class=\"ant-table-cell\"]//span")
    WebElement status;

    @FindBy(xpath = "(//td[@class=\"ant-table-cell\"]//p)[4]")
    WebElement creatiosource;


    @FindBy(xpath = "//div[text()=\"14\"]")
    WebElement date;
    @FindBy(xpath = "//input[@id=\"AutoParsing_turtlemintBrokerCode\"]//parent::span")
    WebElement tmbrokercodecheckboxauto;
    @FindBy(xpath = "//input[@id=\"Motor_turtlemintBrokerCode\"]//parent::span")
    WebElement tmbrokercodecheckboxmanual;
    @FindBy(xpath = "//input[@type='file']")
    WebElement FileUpload;
    @FindBy(xpath = "//button[text()=\"OK\"]//parent::div")
    WebElement okbutton;
    @FindBy(xpath = "//input[@value=\"POLICY\"]//parent::span")
    WebElement policytype;
    @FindBy(xpath = "//input[@name=\"_id\"]")
    WebElement misID;
    @FindBy(xpath = "//button[text()=\"Parse & Save Sale\"]//parent::div")
    WebElement savebutton;
    @FindBy(xpath = "//button[text()=\"Save Sale\"]//parent::div")
    WebElement savebuttonmanual;
    @FindBy(xpath = "//input[@name=\"policyNumber\"]")
    WebElement policynumber;

    public BI_pages() {
        PageFactory.initElements(driver, this);
    }


    public void PolicySearch(String misID) {
        TestUtil.sendKeys(search, misID, "search policy entered");
        TestUtil.sendKeys(search, String.valueOf(Keys.RETURN), "entered");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
        String sstatus = status.getText();
        Assert.assertEquals(sstatus, " PENDING");
        String creationstatus = creatiosource.getText();
        Assert.assertEquals(creationstatus, "opsupload");

        TestUtil.click(policyCkicked, "clicked on policy");


        try {
            TestUtil.click(closeButton, "click on close button");
            TestUtil.click(Edit, "Edit button clicked");
        } catch (Exception e) {
            TestUtil.click(Edit, "Edit button clicked");
        }
        WebCommands.staticSleep(2000);
        TestUtil.click(policyStatus, "policy Status clicked");
        WebCommands.staticSleep(1000);
        TestUtil.click(junk, "junk selected");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(comentforJunk, "Dummy policy for Automation Test", "comment entered");
        TestUtil.click(SaveSale, "Save sale clicked");
        WebCommands.staticSleep(2000);
        Assert.assertEquals(junkassert.getText(), "Junk");
        System.out.println("Policy " + misID + " Successfully junked");
    }

}
