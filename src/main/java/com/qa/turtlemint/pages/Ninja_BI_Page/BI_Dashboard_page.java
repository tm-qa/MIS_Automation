package com.qa.turtlemint.pages.Ninja_BI_Page;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BI_Dashboard_page extends TestBase {

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
    @FindBy(xpath = "//a[@data-auto='insights-module']")
    WebElement Insight;
    @FindBy(xpath = "//button[@data-auto='mint-academy-module']")
    WebElement NinjaAcademy;
    @FindBy(xpath = "//a[@data-auto='lifeOps-module']")
    WebElement LifeOps;
    @FindBy(xpath = "//a[@data-auto='claims-module'][@aria-hidden]")
    WebElement Claims;
    @FindBy(xpath = "//span[contains(text(),'ISSUANCE')]")
    WebElement Issuancefield;
    @FindBy(xpath = "//span[contains(text(),'REPORT A SALE')]")
    WebElement ReportASalefield;
    @FindBy(xpath = "//button[@data-auto='new-branch-button']")
    WebElement ReportASale;
    @FindBy(xpath = "//md-select[@aria-label='Cross Sell Status']")
    WebElement Cross_Sale_Status_filter;
    @FindBy(xpath = "//div[text()='Yes']")
    WebElement Cross_Sale_yes;
    @FindBy(xpath = "//div[@class='md-scroll-mask']//following::button[text()='Apply']")
    WebElement Apply;
    @FindBy(xpath = "//div[text()='No']")
    WebElement No;
    @FindBy(xpath = "//md-select[@aria-label='Auto PDF Reading Status']")
    WebElement autoPDF_filter;
    @FindBy(xpath = "//div[@class='md-scroll-mask']//following::div[text()='Success']")
    WebElement autoPDF_success;
    @FindBy(xpath = "//div[@class='md-scroll-mask']//following::div[text()='Processing']")
    WebElement autoPDF_processing;
    @FindBy(xpath = "//div[@class='md-scroll-mask']//following::div[text()='Failure']")
    WebElement autoPDF_failure;
    @FindBy(xpath = "//div[@class='md-scroll-mask']//following::div[text()='Success (Duplicate)']")
    WebElement autoPDF_failure_duplicate;
    @FindBy(xpath = "//md-select[@aria-label='Insurer']")
    WebElement Insurer_filter;

    @FindBy(xpath = "//div[@class='md-scroll-mask']//following::div[text()='ADITYABIRLAHEALTH']")
    WebElement ADITYABIRLAHEALTH_Insurer;
    @FindBy(xpath = "//md-select[@aria-label='Vertical']")
    WebElement Product_category_filter;
    @FindBy(xpath = "//div[@class='md-scroll-mask']//following::div[text()='Motor']")
    WebElement Motor_product;
    @FindBy(xpath = "//div[@class='md-scroll-mask']//following::div[text()='Health']")
    WebElement HEALTH_product;
    public BI_Dashboard_page() {
        PageFactory.initElements(driver, this);
    }
    public void dashboard() {
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(PartnerLeadManagement,"PartnerLeadManagement btn displayed");
        TestUtil.IsDisplayed(PartnerManagement,"PartnerManagement module btn displayed");
        TestUtil.IsDisplayed(QuoteRequest,"QuteRequest module btn displayed");
        TestUtil.IsDisplayed(IssuanceBtn,"issuance btn displayed");
        TestUtil.IsDisplayed(Mis,"Mis module btn displayed");
        TestUtil.IsDisplayed(Renewals,"renewals module btn displayed");
       // TestUtil.IsDisplayed(Insight,"insights module btn displayed");
        TestUtil.IsDisplayed(NinjaAcademy,"NinjaAcademy module btn displayed");
        TestUtil.IsDisplayed(LifeOps,"Lifeops module btn displayed");
        TestUtil.IsDisplayed(Claims,"claims module btn displayed");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
    }
    public void Issuance() {
        TestUtil.click(IssuanceBtn, "Policy Insuance Selected");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(Issuancefield,"Issuancefield  displayed");
        TestUtil.getScreenShot();
        TestUtil.click(ReportASalefield, "report a sale Selected");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(ReportASale,"ReportASale btn displayed at right corner");
        TestUtil.getScreenShot();

    }
    public void Issuance_report_a_sale() {
        TestUtil.click(IssuanceBtn, "Policy Insuance Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(ReportASalefield, "report a sale Selected");
        WebCommands.staticSleep(2000);
    }
    public void Issuance_cross_sale_Filter() {
        TestUtil.click(Cross_Sale_Status_filter, "Cross_Sale_Status_filter Selected");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(No,"cross sale no option displayed");
        TestUtil.click(Cross_Sale_yes, "Cross_Sale_Yes_filter Selected");
        TestUtil.click(Apply, "apply_filter Selected");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }

    public void AutoPDF_reading_Status_Filter() {
        TestUtil.click(autoPDF_filter, "autoPDF_filter Selected");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(autoPDF_processing,"processing check box displayed");
        TestUtil.IsDisplayed(autoPDF_failure,"failure check box displayed");
        TestUtil.IsDisplayed(autoPDF_failure_duplicate,"failure duplicate check box displayed");
        TestUtil.click(autoPDF_success, "autoPDF_success Selected");
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
}
