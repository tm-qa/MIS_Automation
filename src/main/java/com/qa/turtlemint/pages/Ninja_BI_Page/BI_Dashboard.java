
package com.qa.turtlemint.pages.Ninja_BI_Page;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BI_Dashboard extends TestBase {

    @FindBy(xpath = "//a[contains(text(),'Policy Issuance')]")
    WebElement IssuanceBtn;

    @FindBy(xpath = "//th[@ng-show='selectedColumnList.paymentMode.selected']")
    WebElement paymentModeFilterCTA;

    @FindBy(xpath = "//th[@ng-show='selectedColumnList.owner.selected']")
    WebElement ownerFilterCTA;

    @FindBy(xpath = "//th[@ng-show='selectedColumnList.issuanceStatus.selected']")
    WebElement issuanceStatusFilterCTA;

    @FindBy(xpath = "//th[@ng-show='selectedColumnList.piBranchLocation.selected']")
    WebElement PIbranchFilterCTA;

    @FindBy(xpath = "//th[@ng-show='selectedColumnList.inspectionStatus.selected']")
    WebElement inspectionStatusFilterCTA;

    @FindBy(xpath = "//th[@ng-show='selectedColumnList.inspectionSubStatus.selected']")
    WebElement inspectionSubStatusFilterCTA;

    @FindBy(xpath = "//th[@ng-show='selectedColumnList.inspection.selected']")
    WebElement inspectionFilterCTA;

    @FindBy(xpath = "//th[@ng-show='selectedColumnList.policyType.selected']")
    WebElement ProductTypeFilterCTA;

    @FindBy(xpath = "//input[@type='text']")
    WebElement OwnerTextType;

    @FindBy(xpath = "//span[contains(text(),'ISSUANCE')]")
    WebElement Issuancefield;

    @FindBy(xpath = "//span[contains(text(),'REPORT A SALE')]")
    WebElement ReportASalefield;

    @FindBy(xpath = "//button[@data-auto='new-branch-button']")
    WebElement ReportASale;

    @FindBy(xpath = "//div[@class='md-scroll-mask']//following::button[text()='Apply']")
    WebElement Apply;

    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']//following::div[text()='ADITYA ARORA']")
    WebElement ownerVerify;

    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']//following::div[text()='Pending']")
    WebElement PendingClick;

    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']//following::div[text()='Issued']")
    WebElement IssuedClick;

    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']//following::div[text()='Cancelled']")
    WebElement CancelledClick;

    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']//following::div[text()='Cancelled & Refund Awaited']")
    WebElement Cancelled_Refund_Awaited_Click;

    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']//following::div[text()='Waiting for insurer']")
    WebElement WaitingForInsurerClick;

    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']//following::div[text()='Mumbai']")
    WebElement PIBranchMumbai;

    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']//following::div[text()='Recommended']")
    WebElement InspectionRecommended;

    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']//following::div[text()='Connected']")
    WebElement InspectionSubStatusConnected;

    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']//following::div[text()='Required']")
    WebElement InspectionRequired;

    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']//following::div[text()='Comprehensive']")
    WebElement ProductTypeComprehensive;

    @FindBy(xpath = "//button[@aria-label='More']")
    WebElement MoreOption;

    @FindBy(xpath = "//button[text()=' Clear filters ']")
    WebElement ClearFilterCTA;

    @FindBy(xpath = "//td[@ng-show='selectedColumnList.paymentMode.selected']")
    WebElement CHEQUEverify;

    @FindBy(xpath = "//td[text()='ADITYA ARORA']")
    WebElement OwnerVerify;

    @FindBy(xpath = "//td[text()='PENDING']")
    WebElement PendingVerify;

    @FindBy(xpath = "//td[text()='ISSUED']")
    WebElement IssuedVerify;

    @FindBy(xpath = "//td[text()='CANCELLED']")
    WebElement CancelledVerify;

    @FindBy(xpath = "//td[text()='CANCELLED_REFUND_AWAITED']")
    WebElement CancelledRefundVerify;

    @FindBy(xpath = "//td[text()='WAITING_FOR_INSURER']")
    WebElement WaitingForInsurerVerify;

    @FindBy(xpath = "//td[text()='mumbai']")
    WebElement MumbaiAssert;

    @FindBy(xpath = "//td[text()='RECOMMENDED']")
    WebElement RECOMMENDEDassert;

    @FindBy(xpath = "//td[text()='CONNECTED']")
    WebElement CONNECTEDassert;

    @FindBy(xpath = "//td[text()='Required']")
    WebElement Required;

    @FindBy(xpath = "//td[text()='COMPREHENSIVE']")
    WebElement COMPREHENSIVEassert;

    @FindBy(xpath = "//td[text()='TP']")
    WebElement TPpolicy;

    public BI_Dashboard() {PageFactory.initElements(driver, this);}

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void Issuance() {
        TestUtil.click(IssuanceBtn, "Policy Insuance Selected");
        WebCommands.staticSleep(4000);
        TestUtil.IsDisplayed(Issuancefield, "Issuancefield  displayed");
        TestUtil.getScreenShot();
        TestUtil.click(ReportASalefield, "report a sale Selected");
        WebCommands.staticSleep(4000);
        TestUtil.IsDisplayed(ReportASale, "ReportASale btn displayed at right corner");
        TestUtil.getScreenShot();
    }

    public void Filter_PaymentMode() {
        TestUtil.click(paymentModeFilterCTA, "Payment Mode filter Selected");
        WebCommands.staticSleep(4000);
        driver.findElement(By.xpath("//md-option[@value='CHEQUE']")).click();
        WebCommands.staticSleep(2000);
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(2000);
        String CHEQUEverify1=CHEQUEverify.getText();
        Assert.assertEquals(CHEQUEverify1,"CHEQUE");
        System.out.println("Selected filter Appears");
        WebCommands.staticSleep(2000);
    }

    public void Filter_Owner() {
        TestUtil.click(ownerFilterCTA, "Owner Filter Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(OwnerTextType, "Started inserting text");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(OwnerTextType, "aditya", "Text entered");
        WebCommands.staticSleep(4000);
        TestUtil.click(ownerVerify, "User Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(2000);
        String OwnerVerify1 =OwnerVerify.getText();
        OwnerVerify1.equalsIgnoreCase("ADITYA ARORA");
        System.out.println("Selected filter Appears");
        WebCommands.staticSleep(2000);
    }

    public void Filter_IssuanceStatus() {
        TestUtil.click(issuanceStatusFilterCTA, "Issuance status filter Selected");
        WebCommands.staticSleep(4000);
        js.executeScript("arguments[0].scrollIntoView(true);", PendingClick);
        WebCommands.staticSleep(1000);
        TestUtil.click(PendingClick, "Pending Checkbox Selected");
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(2000);
        String PendingVerify1=PendingVerify.getText();
        WebCommands.staticSleep(1000);
        Assert.assertEquals(PendingVerify1,"PENDING");
        WebCommands.staticSleep(2000);
        TestUtil.click(issuanceStatusFilterCTA, "Issuance status filter Selected");
        WebCommands.staticSleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true);", IssuedClick);
        WebCommands.staticSleep(1000);
        TestUtil.click(IssuedClick, "Issued Checkbox Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(PendingClick, "Pending Checkbox Selected");
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(2000);
        String IssuedVerify1=IssuedVerify.getText();
        WebCommands.staticSleep(1000);
        Assert.assertEquals(IssuedVerify1,"ISSUED");
        WebCommands.staticSleep(2000);
        TestUtil.click(issuanceStatusFilterCTA, "Issuance status filter Selected");
        WebCommands.staticSleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true);", CancelledClick);
        WebCommands.staticSleep(2000);
        TestUtil.click(IssuedClick, "Issued Checkbox Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(CancelledClick, "Cancelled Checkbox Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(2000);
        String CancelledVerify1=CancelledVerify.getText();
        WebCommands.staticSleep(1000);
        Assert.assertEquals(CancelledVerify1,"CANCELLED");
        WebCommands.staticSleep(2000);
        TestUtil.click(issuanceStatusFilterCTA, "Issuance status filter Selected");
        js.executeScript("arguments[0].scrollIntoView(true);", Cancelled_Refund_Awaited_Click);
        WebCommands.staticSleep(1000);
        TestUtil.click(Cancelled_Refund_Awaited_Click, "Cancelled_Refund_Awaited Checkbox Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(CancelledClick, "Cancelled Checkbox Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(2000);
        String CancelledRefundVerify1=CancelledRefundVerify.getText();
        WebCommands.staticSleep(1000);
        Assert.assertEquals(CancelledRefundVerify1,"CANCELLED_REFUND_AWAITED");
        WebCommands.staticSleep(2000);
        TestUtil.click(issuanceStatusFilterCTA, "Issuance status filter Selected");
        WebCommands.staticSleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true);", WaitingForInsurerClick);
        WebCommands.staticSleep(2000);
        TestUtil.click(WaitingForInsurerClick, "WaitingForInsurer Checkbox Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(Cancelled_Refund_Awaited_Click, "Cancelled_Refund_Awaited Checkbox Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(2000);
        String WaitingForInsurerVerify1=WaitingForInsurerVerify.getText();
        WebCommands.staticSleep(1000);
        Assert.assertEquals(WaitingForInsurerVerify1,"WAITING_FOR_INSURER");
        WebCommands.staticSleep(2000);
    }

    public void Filter_PIbranch() {
        TestUtil.click(PIbranchFilterCTA, "PIbranch Filter Selected");
        WebCommands.staticSleep(4000);
        TestUtil.click(PIBranchMumbai, "PI Branch Mumbai Checkbox Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(2000);
        String MumbaiAssert1 =MumbaiAssert.getText();
        WebCommands.staticSleep(1000);
        Assert.assertEquals(MumbaiAssert1,"mumbai");
        WebCommands.staticSleep(2000);
    }

    public void Filter_InspectionStatus() {
        TestUtil.click(inspectionStatusFilterCTA, "inspection Status Filter Selected");
        WebCommands.staticSleep(4000);
        js.executeScript("arguments[0].scrollIntoView(true);", InspectionRecommended);
        WebCommands.staticSleep(2000);
        TestUtil.click(InspectionRecommended, "Inspection Recommended Checkbox Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(2000);
        String RECOMMENDEDassert1 =RECOMMENDEDassert.getText();
        WebCommands.staticSleep(1000);
        Assert.assertEquals(RECOMMENDEDassert1,"RECOMMENDED");
        WebCommands.staticSleep(2000);
    }

    public void Filter_InspectionSubStatus() {
        TestUtil.click(inspectionSubStatusFilterCTA, "inspection Sub Status Filter Selected");
        WebCommands.staticSleep(4000);
        js.executeScript("arguments[0].scrollIntoView(true);", InspectionSubStatusConnected);
        WebCommands.staticSleep(1000);
        TestUtil.click(InspectionSubStatusConnected, "Inspection Sub Status Connected Checkbox Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(2000);
        String CONNECTEDassert1=CONNECTEDassert.getText();
        WebCommands.staticSleep(1000);
        Assert.assertEquals(CONNECTEDassert1,"CONNECTED");
        WebCommands.staticSleep(2000);
    }

    public void Filter_Inspection() {
        TestUtil.click(inspectionFilterCTA, "inspection Filter Selected");
        WebCommands.staticSleep(4000);
        js.executeScript("arguments[0].scrollIntoView(true);", InspectionRequired);
        WebCommands.staticSleep(1000);
        TestUtil.click(InspectionRequired, "Inspection Required Checkbox Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(2000);
        String Required1=Required.getText();
        WebCommands.staticSleep(1000);
        Assert.assertEquals(Required1,"Required");
        WebCommands.staticSleep(2000);
    }

    public void Filter_ProductType() {
        TestUtil.click(ProductTypeFilterCTA, "Product Type filter Selected");
        WebCommands.staticSleep(4000);
        js.executeScript("arguments[0].scrollIntoView(true);", ProductTypeComprehensive);
        WebCommands.staticSleep(1000);
        TestUtil.click(ProductTypeComprehensive, "Product Type Comprehensive Checkbox Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(2000);
        String COMPREHENSIVEassert1=COMPREHENSIVEassert.getText();
        WebCommands.staticSleep(1000);
        Assert.assertEquals(COMPREHENSIVEassert1,"COMPREHENSIVE");
        WebCommands.staticSleep(2000);
    }

    public void Filter_ClearAll() {
        TestUtil.click(ProductTypeFilterCTA, "Product Type filter Selected");
        WebCommands.staticSleep(4000);
        TestUtil.click(ProductTypeComprehensive, "Product Type Comprehensive Checkbox Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(2000);
        String CompVerify1=COMPREHENSIVEassert.getText();
        WebCommands.staticSleep(1000);
        Assert.assertEquals(CompVerify1,"COMPREHENSIVE");
        WebCommands.staticSleep(2000);
        TestUtil.click(MoreOption, "More Option Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(ClearFilterCTA, "Filter Cleared");
        COMPREHENSIVEassert.isDisplayed();
        boolean TPpolicy1 = TPpolicy.isDisplayed();
        Assert.assertEquals(TPpolicy1,true);
        WebCommands.staticSleep(2000);
    }
}