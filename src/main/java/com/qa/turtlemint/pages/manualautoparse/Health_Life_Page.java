package com.qa.turtlemint.pages.manualautoparse;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.AddHasCasting;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class Health_Life_Page extends TestBase {

    @FindBy(xpath = "//input[@id=\"AutoParsing_channelType\"]//parent::span")
    WebElement channeltype;
    @FindBy(xpath = "//input[@id=\"AutoParsing_businessType\"]//parent::span")
    WebElement bussinesstype;
    @FindBy(xpath = "//input[@id=\"Motor_businessType\"]")
    WebElement bussinesstypemanual;
    @FindBy(xpath = "//input[@id=\"Motor_productName\"]")
    WebElement productNamedrop;
    @FindBy(xpath = "//input[@id=\"Motor_vehicleSubType\"]")
    WebElement vehiclesubtypedrop;
    @FindBy(xpath = "//input[@id=\"Motor_carrierType\"]")
    WebElement carriertypedrop;
    @FindBy(xpath = "//input[@id=\"seatingCapacity\"]")
    WebElement seatingcapacity;
    @FindBy(xpath = "//input[@id=\"gvw\"]")
    WebElement gvw;
    @FindBy(xpath = "//input[@id=\"NCB\"]")
    WebElement NCB;

    @FindBy(xpath = "//input[@id=\"Health_manualQCStatus\"]//parent::span//parent::*")
    WebElement dataQC;

    @FindBy(xpath = "//input[@id=\"Health_proposer.title\"]//parent::span//parent::*")
    WebElement proposertitle;
    @FindBy(xpath = "//input[@name=\"proposer.fName\"]")
    WebElement customerFname;
    @FindBy(xpath = "//input[@name=\"proposer.lName\"]")
    WebElement customerLname;
    @FindBy(xpath = "//input[@id=\"Health_proposer.mobileNotAvailable\"]//parent::span")
    WebElement custMnoNA;
    @FindBy(xpath = "//input[@name=\"proposer.email\"]")
    WebElement custEmail;
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


    @FindBy(xpath = "//input[@id=\"AutoParsing_issuanceDate\"]")
    WebElement PIdate;
    @FindBy(xpath = "//input[@id=\"Motor_issuanceDate\"]")
    WebElement PIdatemanual;
    @FindBy(xpath = "//input[@id=\"AutoParsing_salesDetail.saleClosedDate\"]")
    WebElement saleclosedate;
    @FindBy(xpath = "//input[@id=\"Health_salesDetail.saleClosedDate\"]")
    WebElement saleclosedatemanual;

    @FindBy(xpath = "//input[@id=\"Health_startDate\"]")
    WebElement riskstartdate;
    @FindBy(xpath = "//input[@id=\"Motor_odRiskStartDate\"]")
    WebElement odriskstartdate;

    @FindBy(xpath = "//input[@id=\"Health_endDate\"]")
    WebElement riskenddate;
    @FindBy(xpath = "//input[@id=\"Motor_odRiskEndDate\"]")
    WebElement odriskenddate;

    @FindBy(xpath = "//div[@id=\"Motor_makemodel\"]//input")
    WebElement makemodel;

    @FindBy(xpath = "//div[text()=\"Fidato Easy Go\"]")
    WebElement fiat_base500;

    @FindBy(xpath = "//div[text()=\"Fiat Base 500\"]")
    WebElement fiat_base50;

    @FindBy(xpath = "(//div[@title=\"Sports (1248 CC)\"])")
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



    @FindBy(xpath = "//input[@id=\"AutoParsing_turtlemintBrokerCode\"]//parent::span")
    WebElement tmbrokercodecheckboxauto;
    @FindBy(xpath = "//input[contains(@id,'turtlemintBrokerCode')]//parent::span")
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

    @FindBy(xpath = "//*[@data-icon=\"arrow-left\"]")
    public WebElement backArrow;

    @FindBy(xpath = "//p[text()=\"Warning! Duplicate Policy Detected\"]")
    public WebElement warning;

    @FindBy(xpath = "//input[@id=\"Health_channelType\"]//parent::span//parent::*")
    WebElement ChannelType;
    @FindBy(xpath = "//div[text()='Website']")
    WebElement website;

    @FindBy(xpath = "//*[@data-icon=\"close\"]")
    WebElement dublocatePopup;

    @FindBy(xpath = "//input[@name=\"Seating Capacity\"]")
    WebElement getSeatingcapacity;

    @FindBy(xpath = "//input[contains(@id,\"businessType\")]//parent::span//parent::span")
    WebElement businessTypeHealth;

    @FindBy(id = "Health_issuanceDate")
    WebElement healthIssuanceDate;

    @FindBy(xpath = "//*[@data-icon=\"plus-circle\"]")
    WebElement addMemberButton;

    @FindBy(xpath = "(//div[@class=\"ant-modal-body\"]//input[1]//parent::span)[1]")
    WebElement addSelf;

    @FindBy(xpath = "//button[text()=\"Add\"]")
    WebElement getAddMemberButton;

    @FindBy(xpath = "//input[@id=\"Health_payment.paymentFrequency\"]//parent::span//parent::*")
    WebElement paymentFrequency ;
    @FindBy(xpath = "//div[text()=\"Single\"]")
    WebElement paymentFrequencyType;
    @FindBy(xpath = "//input[@id=\"NetPremium\"]")
    WebElement netpremium;
    @FindBy(xpath = "//input[@id=\"ServiceTax\"]")
    WebElement serviceTax;
    @FindBy(xpath = "//input[@id=\"GrossPremium\"]")
    WebElement grossPremium;

    @FindBy(xpath = "//input[@id=\"Health_payment.paymentStatus\"]//parent::span//parent::*")
    WebElement paymentStatus ;
    @FindBy(xpath = "//div[text()=\"Completed\"]")
    WebElement paymentStatusType;

    @FindBy(xpath = "//input[@id=\"Health_proposer.gender\"]//parent::span//parent::*")
    WebElement gender ;
    @FindBy(xpath = "//div[text()=\"Male\"]")
    WebElement genderType ;
    @FindBy(xpath = "//input[@id=\"Health_proposer.dob\"]")
    WebElement proposerDob ;


    @FindBy(xpath = "//input[contains(@id , \"Health_policyRisk.members_0_SELF_0_gender\")]")
    WebElement memberDob ;


    @FindBy(xpath = "//input[@id=\"Health_coverType\"]//parent::span//parent::*")
    WebElement coverType ;
    @FindBy(xpath = "//div[text()=\"Individual\"]")
    WebElement coverTypeSelect ;

    @FindBy(xpath = "//input[@id=\"Health_tmPlanId\"]//parent::span/parent::*")
    WebElement tmPlanId;
     @FindBy(xpath = "//div[@title=\"Corona Kavach\"]")
     WebElement tmPlanIdType;
     @FindBy(xpath = "//input[@name=\"Sum Insured\"]")
     WebElement sumInsured ;
     @FindBy(xpath = "//input[@id=\"Health_planType\"]//parent::span//parent::*")
     WebElement planType ;
     @FindBy(xpath = "//div[text()=\"Basic\"]")
     WebElement planTypeSelect ;

     @FindBy(xpath = "//input[@id=\"Health_proposer.dob\"]//parent::div")
     WebElement dob;

     @FindBy(xpath = "//input[@name=\"optionName\"]")
     WebElement optionName ;

     @FindBy(xpath = "//input[@id=\"duplicateRemark\"]")
     WebElement duplicateRemark ;

     @FindBy(xpath = "//button[text()=\"Yes\"]")
     WebElement yesButton ;

     @FindBy(xpath = "//span[text()=\"Renewal\"]")
     WebElement renewal ;


    public Health_Life_Page() {
        PageFactory.initElements(driver, this);
    }

    public void potentialDuplicate() throws IOException {
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(yesButton);
        WebCommands.staticSleep(1000);
        TestUtil.click(yesButton , "");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(duplicateRemark , " duplicate entry" , "");
        WebCommands.staticSleep(2000);
        String Renewal = renewal.getText();
        Assert.assertEquals(Renewal , "Renewal");
        System.out.println(Renewal);
        TestUtil.click(savebuttonmanual, "Clicked on save button");
        TestUtil.getFullPageScreenShot();
    }

    public void policyDetails (){
        WebCommands.staticSleep(2000);
        TestUtil.click(coverType , "");
        WebCommands.staticSleep(1000);
        TestUtil.click(coverTypeSelect , "");
        TestUtil.click(tmPlanId , "");
        WebCommands.staticSleep(500);
        TestUtil.click(tmPlanIdType , "");
        TestUtil.sendKeys(optionName , "test new" , "");
        WebCommands.staticSleep(500);
        TestUtil.sendKeys(sumInsured , "1" , "");
        TestUtil.click(planType , "");
        WebCommands.staticSleep(500);
        TestUtil.click(planTypeSelect , "");


    }

    public void premiumAndayment (){
        WebCommands.staticSleep(2000);
        TestUtil.click(paymentFrequency , "");
        WebCommands.staticSleep(2000);
        TestUtil.click(paymentFrequencyType , "");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(netpremium , "1" , "");
        TestUtil.sendKeys(serviceTax , "1", " ");
        TestUtil.sendKeys(grossPremium , " 1","");
        TestUtil.click(paymentStatus , "");
        WebCommands.staticSleep(2000);
        TestUtil.click(paymentStatusType , "");
    }

    public void addMember(){
        TestUtil.click(addMemberButton , "click on add member");
        WebCommands.staticSleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        TestUtil.click(addSelf,"jhagef");

        TestUtil.click(getAddMemberButton, " click on add member");

    }


    public void generalDetailsHealth(String bussinessType, String issuanceDate) {


        TestUtil.click(tmbrokercodecheckboxmanual, "Check box selected");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(policynumber, TestUtil.generateRandomPolicyNo(8), "policy number entered");
        WebCommands.staticSleep(2000);
        TestUtil.click(businessTypeHealth, " Business type dropdown clicked");
        WebElement BT = driver.findElement(By.xpath("//div[@title='" + bussinessType + "']"));
        TestUtil.click(BT, bussinessType + " Business type selected");

        TestUtil.sendKeys(healthIssuanceDate, issuanceDate, issuanceDate + " Issuance date Entered");
        healthIssuanceDate.sendKeys(Keys.ENTER);
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
    }
    public void saleDetailsmanual(String salecloseDate) {

        TestUtil.click(ChannelType, " Channel Type selected");
        TestUtil.click(website, " website selected from channel type dropdown");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(saleclosedatemanual, salecloseDate, salecloseDate + " Sale close date Entered");
        saleclosedatemanual.sendKeys(Keys.ENTER);
        TestUtil.getScreenShot();

    }

    public void proposerDetails(String proposerTitle) {
        WebCommands.staticSleep(2000);
        TestUtil.click(proposertitle, " Proposer title dropdown clicked");
        WebElement PT = driver.findElement(By.xpath("//div[@title='" + proposerTitle + "']"));
        TestUtil.click(PT, proposerTitle + " Business type selected");
        TestUtil.sendKeys(customerFname, "TestF", "First Name entered");
        TestUtil.sendKeys(customerLname, "TestL", "First Name entered");
        WebCommands.staticSleep(2000);
        TestUtil.click(gender , "");
        WebCommands.staticSleep(1000);
        TestUtil.click(genderType , " ");
        TestUtil.click(dob , "");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(proposerDob , "01-06-2000" , "");
        proposerDob.sendKeys(Keys.ENTER);
        WebCommands.staticSleep(1000);
        TestUtil.click(custMnoNA, "Customer checkbox selected");
        TestUtil.sendKeys(custEmail, "demo@gmail.com", "Customer Email entered");
        TestUtil.sendKeys(regisAddress, "Test building", "Registration address entered");
        TestUtil.sendKeys(regisPincode, "400605", "Registration pincode entered");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
    }



    public void variant(){
        Actions builder = new Actions(driver);
        builder.moveToElement( variantdrop ).click( variantdrop);
        WebCommands.staticSleep(2000);
        builder.perform();
        new Actions(driver)
                .sendKeys("l");
        TestUtil.click(sports,"variant selected");
        TestUtil.getScreenShot();
    }




    public void dateEndorsementDtails(String riskstart, String riskend) {
        TestUtil.sendKeys(riskstartdate, riskstart, riskstart + " Sale close date Entered");
        riskstartdate.sendKeys(Keys.ENTER);
        TestUtil.sendKeys(riskenddate, riskend, riskend + " Sale close date Entered");
        riskstartdate.sendKeys(Keys.ENTER);
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
    }

    public void qcDtails(String DataQC) {

        TestUtil.click(dataQC, " Data QC dropdown clicked");
        WebElement DQ = driver.findElement(By.xpath("//div[@title='" + DataQC + "']"));
        TestUtil.click(DQ, DataQC + " Data QC selected");
        TestUtil.getScreenShot();
    }

}
