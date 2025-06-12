package com.qa.turtlemint.pages.manualautoparse;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.common.Mis_newSale;
import com.qa.turtlemint.pages.common.junk;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
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

    @FindBy(xpath = "//div[@id=\"Motor_makemodel\"]//input")
    WebElement makemodel;

    @FindBy(xpath = "//div[text()=\"Fidato Easy Go\"]")
    WebElement fiat_base500;

    @FindBy(xpath = "//div[text()=\"Fiat Base 500\"]")
    WebElement fiat_base50;

    @FindBy(xpath = "(//div[@title=\"Sports (1248 CC)\"])")
    WebElement sports;


    @FindBy(xpath = "//input[@id=\"Motor_policyRisk.variant\"]//parent::span//parent::span")
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
    public WebElement savebuttonmanual;
    @FindBy(xpath = "//input[@name=\"policyNumber\"]")
    WebElement policynumber;

    @FindBy(xpath = "//*[@data-icon=\"arrow-left\"]")
    public WebElement backArrow;

    @FindBy(xpath = "//p[text()=\"Warning! Duplicate Policy Detected\"]")
    public WebElement warning;

    @FindBy(xpath = "//label[@title ='Channel Type']//parent::div//following-sibling::div")
    WebElement ChannelType;
    @FindBy(xpath = "//div[text()='Website']")
    WebElement website;

    @FindBy(xpath = "//div[text()='Partner']")
    WebElement partner;

    @FindBy(xpath = "//*[@data-icon=\"close\"]")
    WebElement dublocatePopup;

    @FindBy(xpath = "//input[@name=\"Seating Capacity\"]")
    WebElement getSeatingcapacity;

    @FindBy(xpath = "//input[contains(@id,\"businessType\")]//parent::span//parent::div")
    WebElement businessTypeHealth;

    @FindBy(id = "Health_issuanceDate")
    WebElement healthIssuanceDate;

    @FindBy(xpath = "//div[text()=\"(View Mode)\"]")
    WebElement viewMode;

    @FindBy(xpath = "//div[@id=\"Motor_salesDetail.intermediaryName\"]//input")
    WebElement dpName ;


    @FindBy(xpath = "//div[text()=\"test for selling gi/ li - [DP-1585975]\"]")
    WebElement selectDp ;

    @FindBy(xpath = "//div[text()=\"mis life partner - [DP-2237558]\"]")
    WebElement selectDpProd ;

    @FindBy(xpath = "//span[@title=\"Posp\"]")
    WebElement sourceOfSale ;

    @FindBy(xpath = "//span[text()='Junk']")
    WebElement junkassert;


    @FindBy(xpath = "//label[@title=\"Policy Status\"]//..//..//following-sibling::div")
    WebElement getPolicyStatus;

    @FindBy(xpath = "//input[@name=\"opsDetail.comments\"]")
    WebElement comentforJunk;

    @FindBy(xpath = "//button[text()='Save Sale']")
    WebElement SaveSale;

    @FindBy(xpath = "//div[text()='Junk']")
    WebElement junk;

    @FindBy(xpath = "//img[@alt=\"Edit\"]")
    WebElement Edit;

    @FindBy(xpath = "//input[@id=\"Motor_multiyear\"]")
    public WebElement multiyearCheckBox ;

    @FindBy(xpath = "//input[@id=\"Motor_odRiskStartDate\"]")
    WebElement odRiskStartDate;

    @FindBy(xpath = "//input[@id=\"Motor_odRiskEndDate\"]")
    WebElement odRiskEndDate;

    @FindBy(xpath = "//input[@id=\"Motor_tpRiskStartDate\"]")
    WebElement tpRiskStartDate;

    @FindBy(xpath = "//input[@id=\"Motor_tpRiskEndDate\"]")
    WebElement tpRiskEndDate;

    public TC_1_12() {
        PageFactory.initElements(driver, this);
    }


    public void multiYear(String CuurentDate , String dateFur ){

        Assert.assertTrue(multiyearCheckBox.isSelected());
        String odRiskStartDate1 = odRiskStartDate.getAttribute("value");
        String odRiskEndDate2 = odRiskEndDate.getAttribute("value");
        Assert.assertEquals(odRiskStartDate1 , CuurentDate);
        WebCommands.staticSleep(2000);
        Assert.assertEquals(odRiskEndDate2 , dateFur);


    }


    public void salesOfSales() throws IOException {
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(2000);
        String sourceOfSaleType = sourceOfSale.getText();
        Assert.assertEquals(sourceOfSaleType , "Posp");
        WebCommands.staticSleep(5000);
        TestUtil.click(Edit, "Edit button clicked");
        WebCommands.staticSleep(1000);
        TestUtil.click(getPolicyStatus, "policy Status clicked");
        WebCommands.staticSleep(1000);
        TestUtil.click(junk, "junk selected");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(comentforJunk, "Dummy policy for Automation Test", "comment entered");
        TestUtil.click(SaveSale, "Save sale clicked");
        WebCommands.staticSleep(2000);
        Assert.assertEquals(junkassert.getText(), "Junk");
        TestUtil.getFullPageScreenShot();
        System.out.println("Policy Successfully junked");

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

    public void tmbrokercodecheckboxmanual() {

        TestUtil.click(tmbrokercodecheckboxmanual, "Check box selected");
        TestUtil.click(savebuttonmanual , "");
        WebCommands.staticSleep(4000);
        String viewModeText = viewMode.getText();
        Assert.assertEquals(viewModeText , "(View Mode)");
        System.out.println("Entry saved" + viewModeText);
    }



    public void generalDetails(String bussinessType, String issuanceDate) {


        TestUtil.click(tmbrokercodecheckboxmanual, "Check box selected");
        TestUtil.sendKeys(policynumber, TestUtil.generateRandomPolicyNo(8), "policy number entered");
        TestUtil.click(bussinesstypemanual, " Business type dropdown clicked");
        WebElement BT = driver.findElement(By.xpath("//div[@title='" + bussinessType + "']"));
        TestUtil.click(BT, bussinessType + " Business type selected");

        TestUtil.sendKeys(PIdatemanual, issuanceDate, issuanceDate + " Issuance date Entered");
        PIdatemanual.sendKeys(Keys.ENTER);
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
    }


    public void generalDetailsHealth(String bussinessType, String issuanceDate) {


        TestUtil.click(tmbrokercodecheckboxmanual, "Check box selected");
        TestUtil.sendKeys(policynumber, TestUtil.generateRandomPolicyNo(8), "policy number entered");

        TestUtil.click(businessTypeHealth, " Business type dropdown clicked");
        WebElement BT = driver.findElement(By.xpath("//div[@title='" + bussinessType + "']"));
        TestUtil.click(BT, bussinessType + " Business type selected");

        TestUtil.sendKeys(healthIssuanceDate, issuanceDate, issuanceDate + " Issuance date Entered");
        healthIssuanceDate.sendKeys(Keys.ENTER);
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

        TestUtil.click(ChannelType, " Channel Type selected");
        TestUtil.click(website, " website selected from channel type dropdown");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(saleclosedatemanual, salecloseDate, salecloseDate + " Sale close date Entered");
        saleclosedatemanual.sendKeys(Keys.ENTER);
        TestUtil.getScreenShot();

    }

    public void saleDetailsmanualPartner(String salecloseDate) {

        TestUtil.click(ChannelType, " Channel Type selected");
        TestUtil.click(partner, " website selected from channel type dropdown");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(saleclosedatemanual, salecloseDate, salecloseDate + " Sale close date Entered");
        saleclosedatemanual.sendKeys(Keys.ENTER);
        TestUtil.getScreenShot();

        String currentUrl = driver.getCurrentUrl();
        String baseUrl = currentUrl.split(".com")[0] + ".com";
        System.out.println("Base URL: " + baseUrl);
        if (baseUrl.equals("https://ninja.sanity.turtle-feature.com")) {

            TestUtil.sendKeys(dpName, "selling gi" , "");
            WebCommands.staticSleep(2000);
            TestUtil.click(selectDp , "");
        }

        else {

            TestUtil.sendKeys(dpName, "mis life partn" , "");
            TestUtil.click(selectDpProd , "");
        }
    }

    public void saleDetailsmanualRenewals(String salecloseDate) {

        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(saleclosedatemanual, salecloseDate, salecloseDate + " Sale close date Entered");
        saleclosedatemanual.sendKeys(Keys.ENTER);
        TestUtil.getScreenShot();

    }

    public void policyDetail() {

//     FileUpload.sendKeys("/Users/sayali/Desktop/abcd.pdf");
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

    public void policyDetailmanual1() throws IOException {
//        FileUpload.sendKeys("/Users/sayali/Desktop/abcd.pdf");
        FileUpload.sendKeys("/home/ubuntu/storage/dog.pdf");
        WebCommands.staticSleep(2000);
        TestUtil.click(policytype, "policy pdf uploaded");
        TestUtil.click(okbutton, "Clicked on ok button");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();

    }

    public void policyDetailmanual() throws IOException {

//      FileUpload.sendKeys("/Users/sayali/Desktop/abcd.pdf");
      FileUpload.sendKeys("/home/ubuntu/storage/dog.pdf");
        WebCommands.staticSleep(2000);
        TestUtil.click(policytype, "policy pdf uploaded");
        TestUtil.click(okbutton, "Clicked on ok button");
        WebCommands.staticSleep(2000);
        TestUtil.click(savebuttonmanual, "Clicked on save button");
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }
    public void policyDetailmanualSecond() {

//        FileUpload.sendKeys("/Users/sayali/Desktop/abcd.pdf");
       FileUpload.sendKeys("/home/ubuntu/storage/dog.pdf");
        WebCommands.staticSleep(2000);
        TestUtil.click(policytype, "policy pdf uploaded");
        TestUtil.click(okbutton, "Clicked on ok button");
        WebCommands.staticSleep(2000);
        TestUtil.click(savebuttonmanual, "Clicked on save button");
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
        TestUtil.click(dublocatePopup , "click on close");
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
        String regN  = TestUtil.getRandomTransactionNo();
        String registrationNumber  = "MH-03-ZZ-"+regN;
        TestUtil.click(productNamedrop, " Product name dropdown clicked");
        WebElement PN = driver.findElement(By.xpath("//div[@title='" + productName + "']"));
        TestUtil.click(PN, productName + " Procduct name selected");
        TestUtil.sendKeys(regisNumber, registrationNumber, "Registration number entered");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
    }


    public void vehicleDetailsMultiYear(String productName ) throws InterruptedException {
        WebCommands.staticSleep(2000);
        TestUtil.click(productNamedrop, " Product name dropdown clicked");
        WebElement PN = driver.findElement(By.xpath("//div[@title='" + productName + "']"));
        TestUtil.click(PN, productName + " Procduct name selected");
        WebCommands.staticSleep(2000);

    }

    public void vehicleDetailsRenewals(String productName , String regiNumber,String makeModel , String variant, String vehiclestype ) throws InterruptedException {
        String regN  = TestUtil.getRandomTransactionNo();
        String registrationNumber  = "MH-03-ZZ-"+regN;
        TestUtil.click(productNamedrop, " Product name dropdown clicked");
        WebElement PN = driver.findElement(By.xpath("//div[@title='" + productName + "']"));
        TestUtil.click(PN, productName + " Procduct name selected");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(vehiclesubtypedrop, vehiclestype, vehiclestype + " Vehicle type selected");
        vehiclesubtypedrop.sendKeys(Keys.ENTER);
        TestUtil.sendKeys(regisNumber, regiNumber, "Registration number entered");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
        makeModelMotor(makeModel);
        addVariant(variant);
        TestUtil.sendKeys(cubiccapacity, "2500"," Cubic capacity entered");
        TestUtil.sendKeys(fuelType,"Diesel","Diesel fuel type selected");
        TestUtil.sendKeys(manufactureYear,"2012","2012 manufacturing year selected");
        TestUtil.sendKeys(engineNum, "14101", "engine number entered");
        TestUtil.sendKeys(chassisNum, "14101", "chassis number entered");
        TestUtil.getScreenShot();

        if(vehiclestype=="Scooter"){
            TestUtil.sendKeys(getSeatingcapacity , "2","enter seating capacity");
        }
        else {
            System.out.println( "vehicle type is motor");
        }
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

    public void premiumDetailsTw() {
        TestUtil.sendKeys(totalodpremium, "2500"," Total OD premium entered");
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

    public void makeModelMotor(String makeModel){
        TestUtil.click(makemodel, " MakeModel clicked");
        WebCommands.staticSleep(2000);
        new Actions(driver)
                .keyDown(Keys.SHIFT)
                .sendKeys("f")
                .keyUp(Keys.SHIFT)
                .sendKeys("i")
                .perform();
        WebCommands.staticSleep(2000);
        WebElement getMakeModel = driver.findElement(By.xpath("//div[@title='"+makeModel+"' ]"));
        TestUtil.click(getMakeModel, " fiat_base500 selected");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
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
    public void addVariant(String variant) throws InterruptedException {
        Thread.sleep(2000);
        TestUtil.click(variantdrop , "click on varient dp");
        WebElement getVariant = driver.findElement(By.xpath("//div[@title= '"+ variant +"' ]"));
        System.out.println( getVariant);
        TestUtil.click(getVariant , "select varient");

        Actions builder = new Actions(driver);
        builder.moveToElement( variantdrop ).click( variantdrop);
        builder.perform();
        new Actions(driver).click(getVariant);

        TestUtil.getScreenShot();
    }

    public void dateEndorsementDtailsTp(String riskstart, String riskend) {
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(tpRiskStartDate, riskstart, riskstart + " Sale close date Entered");
        tpRiskStartDate.sendKeys(Keys.ENTER);
        TestUtil.sendKeys(tpRiskEndDate, riskend, riskend + " Sale close date Entered");
        tpRiskEndDate.sendKeys(Keys.ENTER);
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
    }

    public void dateEndorsementDtails(String riskstart, String riskend) {
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(riskstartdate, riskstart, riskstart + " Sale close date Entered");
        riskstartdate.sendKeys(Keys.ENTER);
        TestUtil.sendKeys(riskenddate, riskend, riskend + " Sale close date Entered");
        riskstartdate.sendKeys(Keys.ENTER);
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
    }

    public void dateEndorsementDtailssecondPolicy(String riskstart, String riskend) {
        TestUtil.sendKeys(riskstartdate, riskstart, riskstart + " Sale close date Entered");
        riskstartdate.sendKeys(Keys.ENTER);
        TestUtil.sendKeys(riskenddate, riskend, riskend + " Sale close date Entered");
        riskstartdate.sendKeys(Keys.ENTER);
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
        TestUtil.click(dublocatePopup , "click on clise");
    }
    public void dateEndorsementDtailsod(String riskstart, String riskend) {
        WebCommands.staticSleep(2000);
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
