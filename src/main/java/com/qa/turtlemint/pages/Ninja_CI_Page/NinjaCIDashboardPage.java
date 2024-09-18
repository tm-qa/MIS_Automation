package com.qa.turtlemint.pages.Ninja_CI_Page;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NinjaCIDashboardPage extends TestBase {
    @FindBy(xpath = "//a[contains(text(),'Policy Issuance')]")
    WebElement IssuanceBtn;
    @FindBy(xpath = "//a[@data-auto='pl-module']")
    WebElement PartnerLeadManagement;
    @FindBy(xpath = "//a[@data-auto='pm-module']")
    WebElement PartnerManagement;
    @FindBy(xpath = "//a[@data-auto='qis-module']")
    WebElement QuoteRequest;
    @FindBy(xpath = "//a[@data-auto='mis-module']")
    WebElement Mis;
    @FindBy(xpath = "//a[@data-auto='renewals-module']")
    WebElement Renewals;
    @FindBy(xpath = "//a[@data-auto='lifeOps-module']")
    WebElement LifeOps;
    @FindBy(xpath = "//a[@data-auto='claims-module'][@aria-hidden]")
    WebElement Claims;
    @FindBy(xpath = "//a[@data-auto='payouts-module']")
    WebElement Payouts;
    @FindBy(xpath = "//span[contains(text(),'ISSUANCE')]")
    WebElement IssuanceTab;
    @FindBy(xpath = "//md-select[@aria-label='Cross Sell Status']")
    WebElement Cross_Sale_Status_filter;
    @FindBy(xpath = "//div[text()='Yes']")
    WebElement Cross_Sale_yes;
    @FindBy(xpath = "//div[@class='md-scroll-mask']//following::button[text()='Apply']")
    WebElement Apply;
    @FindBy(xpath = "//div[text()='No']")
    WebElement No;
    @FindBy(xpath = "//md-select[@aria-label='Insurer']")
    WebElement Insurer_filter;
    @FindBy(xpath = "//md-select[@aria-label='Payment Mode']")
    WebElement PaymentModeFilter;
    @FindBy(xpath = "//md-select[@aria-label='Issuance Status: Pending, Waiting for insurer, Open, Review']")
    WebElement IssuanceStatusFilter;
    @FindBy(xpath = "//md-input-container[contains(text(),'Owner')]")
    WebElement OwnerFilter;
    @FindBy(xpath = "//div[text()='sayali dange']")
    WebElement OwnerSelected;
    @FindBy(xpath = "//md-input-container[contains(text(),'Inspection SubStatus')]")
    WebElement InspectionSubStatusFilter;
    @FindBy(xpath = "//div[text()='Connected']")
    WebElement SubStatusConnectedSelected;
    @FindBy(xpath = "//md-input-container[contains(text(),'Product Type')]")
    WebElement ProductTypeFilter;
    @FindBy(xpath = "//md-select[@aria-label='Inspection Status']")
    WebElement InspectionFilter;
    @FindBy(xpath = "//div[text()='Required']")
    WebElement InspectionRequired;
    @FindBy(xpath = "//md-option[@value='comprehensive']")
    WebElement ProductTypeComp;
    @FindBy(xpath = "//div[text()='ONLINE']")
    WebElement Online;
    @FindBy(xpath = "//div[text()='Issued']")
    WebElement IssuanceStatusIssued;
    @FindBy(xpath = "//div[@class='md-scroll-mask']//following::div[text()='ADITYABIRLAHEALTH']")
    WebElement ADITYABIRLAHEALTH_Insurer;
    @FindBy(xpath = "//md-select[@aria-label='Vertical']")
    WebElement Product_category_filter;
    @FindBy(xpath = "//input[@type='text']")
    WebElement SearchPartner;
    @FindBy(xpath = "//th[@ng-show='selectedColumnList.inspectionStatus.selected']")
    WebElement inspectionStatusFilterCTA;
    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']//following::div[text()='Recommended']")
    WebElement InspectionRecommended;
    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']//following::div[text()='Completed Response awaited']")
    WebElement CompletedResponse;
    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']//following::div[text()='Scheduled']")
    WebElement InspectionScheduled;
    @FindBy(xpath = "//div[@class='md-scroll-mask']//following::div[text()='Motor']")
    WebElement Motor_product;

    public NinjaCIDashboardPage() {
        PageFactory.initElements(driver, this);
    }

    public void dashboard() {
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(PartnerLeadManagement, "PartnerLeadManagement btn displayed");
        TestUtil.IsDisplayed(PartnerManagement, "PartnerManagement module btn displayed");
        TestUtil.IsDisplayed(QuoteRequest, "QuteRequest module btn displayed");
        TestUtil.IsDisplayed(IssuanceBtn, "issuance btn displayed");
        TestUtil.IsDisplayed(Mis, "Mis module btn displayed");
        TestUtil.IsDisplayed(Renewals, "renewals module btn displayed");
        TestUtil.IsDisplayed(LifeOps, "Lifeops module btn displayed");
        TestUtil.IsDisplayed(Claims, "claims module btn displayed");
        TestUtil.IsDisplayed(Payouts, "Payouts module displayed");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(3000);
    }

    public void Issuance_Tab() {
        WebCommands.staticSleep(2000);
        TestUtil.click(IssuanceBtn, "Policy Issuance Selected");
        WebCommands.staticSleep(4000);
        TestUtil.click(IssuanceTab, "Issuance Tab Selected");
        WebCommands.staticSleep(4000);
    }

    public void Issuance_cross_sale_Filter() {
        TestUtil.click(Cross_Sale_Status_filter, "Cross_Sale_Status_filter Selected");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(No, "cross sale no option displayed");
        TestUtil.click(Cross_Sale_yes, "Cross_Sale_Yes_filter Selected");
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }

    public void Insurer_Filter() {
        TestUtil.click(Insurer_filter, "insurer_filter Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(ADITYABIRLAHEALTH_Insurer, "aditya birla health insurer Selected");
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }

    public void Product_Category_Filter() {
        TestUtil.click(Product_category_filter, "Product_category_filter Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(Motor_product, "HEALTH_product  Selected");
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }

    public void PaymentModeFilter() {
        TestUtil.click(PaymentModeFilter, "Payment Mode filter Selected");
        WebCommands.staticSleep(500);
        TestUtil.click(Online, "Online option  Selected");
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(500);
        TestUtil.getScreenShot();
    }

    public void Owner() {
        TestUtil.click(OwnerFilter, "Owner filter Selected");
        WebCommands.staticSleep(500);
        TestUtil.sendKeys(SearchPartner, "sayali dange", "Owner name entered");
        WebCommands.staticSleep(1000);
        TestUtil.click(OwnerSelected, "Owner Selected");
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
    }

    public void IssuanceStatusFilter() {
        TestUtil.click(IssuanceStatusFilter, "Issuance status filter Selected");
        WebCommands.staticSleep(500);
        TestUtil.click(IssuanceStatusIssued, "Issuance Status Issued Selected");
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(500);
        TestUtil.getScreenShot();
    }

    public void Filter_InspectionStatus() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        TestUtil.click(inspectionStatusFilterCTA, "inspection Status Filter Selected");
        WebCommands.staticSleep(4000);
        js.executeScript("arguments[0].scrollIntoView(true);", InspectionRecommended);
        WebCommands.staticSleep(2000);
        TestUtil.click(CompletedResponse, "Inspection checkbox unchecked");
        TestUtil.click(InspectionScheduled, "Inspection checkbox unchecked");
        TestUtil.click(InspectionRecommended, "Inspection Recommended Checkbox Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(20000);
        TestUtil.getScreenShot();
    }

    public void ProductTypeFilter() {
        TestUtil.click(ProductTypeFilter, "Product status filter Selected");
        WebCommands.staticSleep(1500);
        TestUtil.click(ProductTypeComp, "Product type comprehensive Selected");
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(500);
        TestUtil.getScreenShot();
    }

    public void InspectionFilter() {
        TestUtil.click(InspectionFilter, "Inspection filter Selected");
        WebCommands.staticSleep(1500);
        TestUtil.click(InspectionRequired, "Inspection Required type Selected");
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(500);
        TestUtil.getScreenShot();
    }

    public void InspectionSubStatus() {
        TestUtil.click(InspectionSubStatusFilter, "Inspection sub status filter Selected");
        WebCommands.staticSleep(1500);
        TestUtil.click(SubStatusConnectedSelected, "Inspection sub status connected Selected");
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(500);
        TestUtil.getScreenShot();
    }
}
