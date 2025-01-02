package com.qa.turtlemint.pages.manualautoparse;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Locale;

public class TC_1_12 extends TestBase {

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





    @FindBy(xpath = "//input[@id=\"Motor_manualQCStatus\"]")
    WebElement dataQC;

    @FindBy(xpath = "//input[@id=\"Motor_proposer.title\"]")
    WebElement proposertitle;
    @FindBy(xpath = "//input[@name=\"proposer.fName\"]")
    WebElement customerFname;
    @FindBy(xpath = "//input[@name=\"proposer.lName\"]")
    WebElement customerLname;
    @FindBy(xpath = "//input[@id=\"Motor_proposer.mobileNotAvailable\"]//parent::span")
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
    public TC_1_12() {
        PageFactory.initElements(driver, this);
    }

    public void basicDetails(String channelType, String bussinessType, String issuanceDate) {

        TestUtil.click(tmbrokercodecheckboxauto, "Check box selected");

        TestUtil.click(bussinesstype, " Business type dropdown clicked");
        WebElement BT = driver.findElement(By.xpath("//div[@title='" + bussinessType + "']"));
        TestUtil.click(BT, bussinessType + " Business type selected");

        TestUtil.click(channeltype, " Channel type dropdown clicked");
        WebElement CT = driver.findElement(By.xpath("//div[@title='" + channelType + "']"));
        TestUtil.click(CT, channelType + " Channel type selected");

        TestUtil.sendKeys(PIdate, issuanceDate, issuanceDate + " Issuance date Entered");
        PIdate.sendKeys(Keys.ENTER);
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);

    }

    public void generalDetails(String bussinessType, String issuanceDate) {

        TestUtil.click(tmbrokercodecheckboxmanual, "Check box selected");
        TestUtil.sendKeys(policynumber, "988822211", "policy number entered");

        TestUtil.click(bussinesstypemanual, " Business type dropdown clicked");
        WebElement BT = driver.findElement(By.xpath("//div[@title='" + bussinessType + "']"));
        TestUtil.click(BT, bussinessType + " Business type selected");

        TestUtil.sendKeys(PIdatemanual, issuanceDate, issuanceDate + " Issuance date Entered");
        PIdatemanual.sendKeys(Keys.ENTER);
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
    }

    public void saleDetails(String salecloseDate) {
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(saleclosedate, salecloseDate, salecloseDate + " Sale close date Entered");
        saleclosedate.sendKeys(Keys.ENTER);
        TestUtil.getScreenShot();

    }
    public void saleDetailsmanual(String salecloseDate) {
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(saleclosedatemanual, salecloseDate, salecloseDate + " Sale close date Entered");
        saleclosedatemanual.sendKeys(Keys.ENTER);
        TestUtil.getScreenShot();

    }

    public void policyDetail() {

       // FileUpload.sendKeys("/Users/nitinrathod/Downloads/Sprint 140.pdf");
        FileUpload.sendKeys("/home/ubuntu/storage/dog.pdf");
        WebCommands.staticSleep(2000);
        TestUtil.click(policytype, "policy pdf uploaded");
        TestUtil.click(okbutton, "Clicked on ok button");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
        TestUtil.click(savebutton, "Clicked on save button");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }

    public void policyDetailmanual() {

       // FileUpload.sendKeys("/Users/nitinrathod/Downloads/Sprint 140.pdf");
        FileUpload.sendKeys("/home/ubuntu/storage/dog.pdf");
        WebCommands.staticSleep(2000);
        TestUtil.click(policytype, "policy pdf uploaded");
        TestUtil.click(okbutton, "Clicked on ok button");
        WebCommands.staticSleep(2000);
        TestUtil.click(savebuttonmanual, "Clicked on save button");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }

    public void proposerDetails(String proposerTitle) {
        WebCommands.staticSleep(2000);
        TestUtil.click(proposertitle, " Proposer title dropdown clicked");
        WebElement PT = driver.findElement(By.xpath("//div[@title='" + proposerTitle + "']"));
        TestUtil.click(PT, proposerTitle + " Business type selected");
        TestUtil.sendKeys(customerFname, "TestF", "First Name entered");
        TestUtil.sendKeys(customerLname, "TestL", "First Name entered");
        TestUtil.click(custMnoNA, "Customer checkbox selected");
        TestUtil.sendKeys(custEmail, "demo@gmail.com", "Customer Email entered");
        TestUtil.sendKeys(regisAddress, "Test building", "Registration address entered");
        TestUtil.sendKeys(regisPincode, "400605", "Registration pincode entered");

        //  TestUtil.sendKeys(regisCity, "Mumbai", "Registration City entered");
        //  TestUtil.sendKeys(regisState, "Maharashtra", "Registration state entered");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
    }

    public void vehicleDetails(String productName) {

        TestUtil.click(productNamedrop, " Product name dropdown clicked");
        WebElement PN = driver.findElement(By.xpath("//div[@title='" + productName + "']"));
        TestUtil.click(PN, productName + " Procduct name selected");
        TestUtil.sendKeys(regisNumber, "MH-03-ZZ-1234", "Registration number entered");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
    }
    public void vehicleDetails1() {

        TestUtil.sendKeys(cubiccapacity, "2500"," Cubic capacity entered");
        TestUtil.sendKeys(fuelType,"Diesel","Diesel fuel type selected");
        TestUtil.sendKeys(manufactureYear,"2012","2012 manufacturing year selected");
        TestUtil.sendKeys(engineNum, "MH-03444-ZZ-1234", "engine number entered");
        TestUtil.sendKeys(chassisNum, "MH-03-ZZ-123448484", "chassis number entered");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
    }
    public void vehicleDetailsPCV(String vehiclestype, String carrierType) {
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(vehiclesubtypedrop, vehiclestype, vehiclestype + " Vehicle type selected");
        vehiclesubtypedrop.sendKeys(Keys.ENTER);
        TestUtil.sendKeys(carriertypedrop, carrierType,carrierType + "Carrier type selected");
        carriertypedrop.sendKeys(Keys.ENTER);
        TestUtil.sendKeys(seatingCapacity, "12", "Seating capacity entered");
        TestUtil.getScreenShot();

    }
    public void premiumDetails() {

        TestUtil.sendKeys(totalodpremium, "2500"," Total OD premium entered");
        TestUtil.sendKeys(totaltppremium,"2500","Total tp premium entered");
        TestUtil.sendKeys(netpremium,"2012","Net premium entered");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
    }

    public void makeModel(){
        TestUtil.click(makemodel, " MakeModel clicked");
        WebCommands.staticSleep(2000);
        new Actions(driver)
                .keyDown(Keys.SHIFT)
                .sendKeys("f")
                .keyUp(Keys.SHIFT)
                .sendKeys("i")
                .perform();
        WebCommands.staticSleep(2000);
        TestUtil.click(fiat_base500, " fiat_base500 selected");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }
    public void variant(){
        Actions builder = new Actions(driver);
        builder.moveToElement( variantdrop ).click( variantdrop);
        WebCommands.staticSleep(2000);
        builder.perform();
        new Actions(driver)
                .sendKeys("s");
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
    public void dateEndorsementDtailsod(String riskstart, String riskend) {
        TestUtil.sendKeys(odriskstartdate, riskstart, riskstart + " Sale close date Entered");
        odriskstartdate.sendKeys(Keys.ENTER);
        TestUtil.sendKeys(odriskenddate, riskend, riskend + " Sale close date Entered");
        odriskenddate.sendKeys(Keys.ENTER);
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
