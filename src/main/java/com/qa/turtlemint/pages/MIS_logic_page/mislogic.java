package com.qa.turtlemint.pages.MIS_logic_page;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class mislogic extends TestBase {

    public mislogic() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id=\"Life_salesDetail.saleClosedDate\"]")
    WebElement saleClosedDate;

    @FindBy(xpath = "//input[@name=\"applicationNumber\"]")
    WebElement applicationNumber;

    @FindBy(xpath = "//input[@name=\"policyNumber\"]")
    WebElement policyNumber;

    @FindBy(xpath = "//input[@id=\"Life_issuanceDate\"]")
    WebElement Life_issuanceDate;

    @FindBy(xpath = "//input[@id=\"Life_subStatus\"]//..//..")
    WebElement Life_subStatus;

    @FindBy(xpath = "//input[@id=\"Life_subStatus\"]")
    WebElement Life_subStatuss;

    @FindBy(xpath = "//div[@title=\"In force\"]")
    WebElement inforce;

    @FindBy(xpath = "//input[@id=\"Life_category\"]//..//..")
    WebElement Life_category;

    @FindBy(xpath = "//input[@id=\"Life_category\"]")
    WebElement Life_categoryy;

    @FindBy(xpath = "//div[text()=\"Term-Life\"]")
    WebElement termLife;

    @FindBy(xpath = "//input[@id=\"Life_planType\"]//..//..")
    WebElement Life_planType;

    @FindBy(xpath = "//input[@id=\"Life_planType\"]")
    WebElement Life_planTypee;

    @FindBy(xpath = "//div[text()=\"Term\"]")
    WebElement Term;

    @FindBy(xpath = "//input[@id=\"Life_tmPlanId\"]//..//..")
    WebElement Life_tmPlanId;

    @FindBy(xpath = "//input[@id=\"Life_tmPlanId\"]")
    WebElement Life_tmPlanIdd;

    @FindBy(xpath = "//div[text()='Smart Protection Goal']")
    WebElement Smartplan;

    @FindBy(xpath = "//input[@id=\"Life_startDate\"]")
    WebElement startdate;

    @FindBy(xpath = "//input[@id=\"Life_endDate\"]")
    WebElement enddate;

    @FindBy(xpath = "//input[@id=\"Life_typeOfBusiness\"]//..//..")
    WebElement Life_typeOfBusiness; //enter

    @FindBy(xpath = "//input[@id=\"Life_typeOfBusiness\"]")
    WebElement Life_typeOfBusinesss;

    @FindBy(xpath = "//input[@id=\"Life_proposer.title\"]//..//..")
    WebElement Life_proposer; //enter

    @FindBy(xpath = "//input[@id=\"Life_proposer.title\"]")
    WebElement Life_proposerr;

    @FindBy(xpath = "//input[@name=\"proposer.fName\"]")
    WebElement Life_proposername;

    @FindBy(xpath = "//input[@id=\"Life_proposer.gender\"]//..//..")
    WebElement gender; //enter

    @FindBy(xpath = "//input[@id=\"Life_proposer.gender\"]")
    WebElement genderr;

    @FindBy(xpath = "//input[@id=\"Life_proposer.dob\"]")
    WebElement Life_proposerdob;

    @FindBy(xpath = "//input[@name=\"proposer.mobile\"]")
    WebElement mobile;

    @FindBy(xpath = "//input[@name=\"proposer.email\"]")
    WebElement email;

    @FindBy(xpath = "//input[@name=\"proposer.address\"]")
    WebElement address;

    @FindBy(xpath = "//input[@name=\"Registration Pincode\"]")
    WebElement Pincode;

    @FindBy(xpath = "//input[@name=\"proposer.currentAddress\"]")
    WebElement currentAddress;

    @FindBy(xpath = "//input[@name=\"Current Pincode\"]")
    WebElement CurrentPincode;

    @FindBy(xpath = "//input[@id=\"Life_payment.paymentFrequency\"]//..//..")
    WebElement paymentFrequency;

    @FindBy(xpath = "//div[text()='Monthly']")
    WebElement Monthly;

    @FindBy(xpath = "//input[@name='Premium Payment Term (in years)']")
    WebElement PaymentTerminyears;  //4

    @FindBy(xpath = "//input[@name='Policy Term (in years)']")
    WebElement PolicyTerminyears;  //4

    @FindBy(xpath = "//input[@name='policyRisk.benefitPayoutTerm']")
    WebElement benefitPayoutTerm;

    @FindBy(xpath = "//input[@name='Modal Premium (without GST)']")
    WebElement ModalPremium; //100

    @FindBy(xpath = "//input[@name='Modal GST']")
    WebElement Modalgst;

    @FindBy(xpath = "//input[@name='Sum Insured']")
    WebElement SumInsured;

    @FindBy(xpath = "//input[@name=\"premiumDetails.renewalGST\"]")
    WebElement renewalGST;

    @FindBy(xpath = "//input[@id='Life_payment.paymentMode']//..//..")
    WebElement Life_paymentpaymentmode;

    @FindBy(xpath = "//input[@name=\"Net Premium\"]")
    WebElement netprem;

    @FindBy(xpath = "//input[@name=\"Service Tax / GST\"]")
    WebElement servicetax;

    @FindBy(xpath = "//input[@name=\"Gross Premium\"]")
    WebElement grossPrem;

    @FindBy(xpath = "//div[text()='Online']")
    WebElement Online;

    @FindBy(xpath = "//input[@id='Life_channelType']//..//..")
    WebElement Life_channelType; //enter

    @FindBy(xpath = "//input[@id='Life_channelType']")
    WebElement Life_channelTypee;

    @FindBy(xpath = "//input[@id='Life_manualQCStatus']")
    WebElement Life_manualQCStatus;

    @FindBy(xpath = "//input[@id='Life_manualQCStatus']//..//following-sibling::span")
    WebElement Life_manualQCStatuss;

    @FindBy(xpath = "//div[text()='Ready']")
    WebElement Ready;

    @FindBy(xpath = "//div[text()='Done']")
    WebElement Done;

    @FindBy(xpath = "//button[text()='Yes']")
    WebElement yes;

    @FindBy(xpath = "//input[@id=\"Life_dataQCDoneDate\"]")
    WebElement dateDATAQC;

    @FindBy(xpath = "//button[text()='Payment Schedule']")
    WebElement PaymentSchedule;

    @FindBy(xpath = "//button[text()='Save Sale']")
    WebElement Save;

    @FindBy(xpath = "//label[text()='Premium Payment Term (in years)']//..//following-sibling::div//input")
    WebElement PremiumPaymentTerminyears;

    @FindBy(xpath = "//label[text()='Policy Term (in years)']//..//following-sibling::div//input")
    WebElement PolicytermTerminyears;

    @FindBy(xpath = "//label[text()='Net Premium']//..//following-sibling::div//input")
    WebElement netPremium;

    @FindBy(xpath = "//label[text()='Payment Frequency']//..//following-sibling::div//span[@title=\"MONTHLY\"]")
    WebElement PaymentFrequency;

    @FindBy(xpath = "//label[text()='MIS ID']//..//following-sibling::div//input")
    public WebElement MisID;

    @FindBy(xpath = "//label[text()='Amount Due']//..//following-sibling::div//input")
    WebElement AmountDue;

    @FindBy(xpath = "//label[text()='Paid To Date']//..//following-sibling::div//input")
    WebElement PaidToDate;

    @FindBy(xpath = "//label[text()='No of installments due']//..//following-sibling::div//input")
    WebElement Noofinstallmentsdue;

    @FindBy(xpath = "//label[text()='Installment Amount']//..//following-sibling::div//input")
    WebElement InstallmentAmount;

    @FindBy(xpath = "//th[text()='Action']//..//..//..//td")
    WebElement installment48;

    @FindBy(xpath = "(//td[text()='1']//following::td)[2]")
    WebElement riststartDtaeof1stinstallment;

    @FindBy(xpath = "//input[@id=\"Life_payment.policyPaymentType\"]//..//following-sibling::span")
    WebElement paymentTypeCheck;

    JavascriptExecutor js = (JavascriptExecutor) driver;



    public void PolicyDetails(String sale, String endDate) {

        TestUtil.sendKeys(saleClosedDate, sale, sale + " sale close date select");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(saleClosedDate, String.valueOf(Keys.RETURN), "sale close date select");
        TestUtil.sendKeys(applicationNumber, TestUtil.getRandomTransactionNo(), "application Number Entered");
        TestUtil.sendKeys(policyNumber, TestUtil.generateRandomPolicyNo(7), "policy Number Entered");
        TestUtil.sendKeys(Life_issuanceDate, sale, sale + " Life_issuance Date select");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(Life_issuanceDate, String.valueOf(Keys.RETURN), "sale close date select");
        WebCommands.staticSleep(1000);
        //  Life_subStatus.click();
        TestUtil.click(Life_subStatus, "");
        TestUtil.sendKeys(Life_subStatuss, String.valueOf(Keys.RETURN), "Life_sub Status select");
        WebCommands.staticSleep(1000);
        TestUtil.click(Life_category, "");
        TestUtil.sendKeys(Life_categoryy, String.valueOf(Keys.RETURN), "Life_categorys select");
        WebCommands.staticSleep(1000);
        TestUtil.click(Life_planType, "");
        TestUtil.sendKeys(Life_planTypee, String.valueOf(Keys.RETURN), "Life_planType select");
        WebCommands.staticSleep(1000);
        TestUtil.click(Life_tmPlanId, "");
        TestUtil.sendKeys(Life_tmPlanIdd, String.valueOf(Keys.RETURN), "Life_tmPlanId select");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(startdate, sale, sale + " start Date select");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(startdate, String.valueOf(Keys.RETURN), "start date select");
        TestUtil.sendKeys(enddate, endDate, endDate + " Start Date select");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(enddate, String.valueOf(Keys.RETURN), "end Date select");
    }

    public void PolicyHolderDetails(String dob, int PPT,int PT,String paymentType) throws IOException {
        TestUtil.click(Life_typeOfBusiness, "");
        TestUtil.sendKeys(Life_typeOfBusinesss, String.valueOf(Keys.RETURN), "Life_typeOfBusiness clicked");
        TestUtil.click(Life_proposer, "");
        TestUtil.sendKeys(Life_proposerr, String.valueOf(Keys.RETURN), "Life_proposer clicked");
        TestUtil.sendKeys(Life_proposername, "test automation", "nbame entered");
        TestUtil.click(gender, "");
        TestUtil.sendKeys(genderr, String.valueOf(Keys.RETURN), "Life_proposer clicked");
        TestUtil.sendKeys(Life_proposerdob, dob, dob + " Life_proposerdob select");
        TestUtil.sendKeys(Life_proposerdob, String.valueOf(Keys.RETURN), "Life_proposerdob date select");
        TestUtil.sendKeys(mobile, "6999912345", "mobile entered");
        TestUtil.sendKeys(email, "test@test.com", "email entered");
        TestUtil.sendKeys(address, "test adress", "address entered");
        TestUtil.sendKeys(Pincode, "400011", "Pincode entered");
        TestUtil.sendKeys(currentAddress, "current adress", "current Address entered");
        TestUtil.sendKeys(CurrentPincode, "400011", "Current Pincode entered");
        TestUtil.click(paymentFrequency, "");
        TestUtil.click(Monthly, "Monthly selected");
        TestUtil.sendKeys(PaymentTerminyears, String.valueOf(PPT), "Payment Term in years 4");
        TestUtil.sendKeys(PolicyTerminyears, String.valueOf(PT), "Policy Term in years 4");
        TestUtil.sendKeys(benefitPayoutTerm, "4", "benefit Payout Term in years 4");
        Assert.assertEquals(paymentTypeCheck.getText(),paymentType);
        TestUtil.getFullPageScreenShot();
        TestUtil.sendKeys(ModalPremium, "100", "ModalPremium 100");
        TestUtil.sendKeys(Modalgst, "100", "Modalgst");
        TestUtil.sendKeys(SumInsured, "1", "SumInsured");
        TestUtil.sendKeys(renewalGST, "100", "renewalGST");

        Assert.assertEquals(netprem.getAttribute("value"),"1200");
        Assert.assertEquals(servicetax.getAttribute("value"),"1200");
        Assert.assertEquals(grossPrem.getAttribute("value"),"2400");
        TestUtil.getFullPageScreenShot();

        TestUtil.click(Life_paymentpaymentmode, "Life_payment payment mode");
        TestUtil.click(Online, "online click");
        TestUtil.click(Life_channelType, "");
        TestUtil.sendKeys(Life_channelTypee, String.valueOf(Keys.RETURN), "Life_channelTypee select");
        TestUtil.click(Life_manualQCStatus, "");
        WebCommands.staticSleep(1000);
        TestUtil.click(Done, "Done select");
        WebCommands.staticSleep(1000);
        TestUtil.click(yes, "yes select");
        WebCommands.staticSleep(2000);
        String currentDate = TestUtil.PresentDate();
        TestUtil.getFullPageScreenShot();
        Assert.assertEquals(dateDATAQC.getAttribute("value"),currentDate);
        System.out.println(currentDate+" Current Date verify");
        WebCommands.staticSleep(2000);

        TestUtil.click(Life_manualQCStatuss, "yes select");
      //  js.executeScript("arguments[0].click();", Life_manualQCStatuss);
        TestUtil.click(Ready, "Ready select");
        TestUtil.click(Save, "Save select");

    }

    public void verify(String rsikStartdate) throws IOException {
        TestUtil.click(PaymentSchedule, "Payment Schedule Clicked");
     //   System.out.println(" ****************** MIS ID "+ MisID.getAttribute("value")+ "  ****************");
        Assert.assertEquals(PaymentFrequency.getText(),"MONTHLY");
        Assert.assertEquals(PremiumPaymentTerminyears.getAttribute("value"),"4");
        Assert.assertEquals(PolicytermTerminyears.getAttribute("value"),"4");
        Assert.assertEquals(netPremium.getAttribute("value"),"1200");
        TestUtil.getFullPageScreenShot();
        Assert.assertEquals(AmountDue.getAttribute("value"),"9400");
        Assert.assertEquals(Noofinstallmentsdue.getAttribute("value"),"47");
        Assert.assertEquals(InstallmentAmount.getAttribute("value"),"200");
        Assert.assertEquals(PaidToDate.getAttribute("value"),"10-11-2019");
        Assert.assertEquals(installment48.getText(),"48");
        Assert.assertEquals(riststartDtaeof1stinstallment.getText(),rsikStartdate);
        TestUtil.getFullPageScreenShot();
    }
}
