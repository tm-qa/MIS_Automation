package com.qa.turtlemint.pages.common;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mis_newSale extends TestBase {

    public Mis_newSale() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id=\"root\"]//span[@class=\"anticon\"]//img[@alt=\"Plus\"]")
    WebElement plus;

    @FindBy(xpath = "//input[@aria-controls=\"createMISEntry_productCategory_list\"]//parent::span")
    WebElement policyCatagory;

    @FindBy(xpath = "//input[@id=\"createMISEntry_policyStatus\"]//parent::span")
    WebElement policyStatus;

    @FindBy(xpath = "//input[@id=\"createMISEntry_insurer\"]")
    WebElement insurerp;

    @FindBy(xpath = "//button[text()=\"Create Sale\"]")
    WebElement createSale;

    @FindBy(xpath = "//input[@id=\"createMISEntry_vehicleType\"]//parent::span")
    WebElement vehicleType;

    @FindBy(xpath = "//li[@data-auto=\"branch-issuance-tab\"]//button")
    WebElement reportASAle;

    @FindBy(xpath = "//button[@data-auto=\"new-branch-button\"]")
    WebElement report;

    @FindBy(xpath = "//md-select[@id=\"$$vertical\"]")
    WebElement productPI;

    @FindBy(id = "insurer")
    WebElement insurerPI;

    @FindBy(xpath = "//input[@name=\"policyNo\"]")
    WebElement PolicyNo;

    @FindBy(xpath = "//button[@ng-click=\"createBIEntry(form)\"]")
    WebElement Proceed;

    @FindBy(xpath = "//li[@aria-posinset=\"1\"]")
    WebElement click1st;

    @FindBy(id = "policyIssuanceStatus")
    WebElement policyIssuanceStatus;

    @FindBy(xpath = "//md-option[@data-auto=\"policyIssuanceStatus-ISSUED-select\"]")
    WebElement issued;


    public void productCatagory_Status_insurer(String TW_Motor_Health_Life, String status, String insurer) {
        TestUtil.click(plus, "Plus button clicked");
        TestUtil.click(policyCatagory, " policy catagory clicked");
        WebElement PC = driver.findElement(By.xpath("//div[@title='" + TW_Motor_Health_Life + "']"));
        TestUtil.click(PC, TW_Motor_Health_Life + " policy catagory selected");

        TestUtil.click(policyStatus, " policy status clicked");
        WebElement PS = driver.findElement(By.xpath("//div[@title='" + status + "']"));
        TestUtil.click(PS, status + " policy Status selected");

        TestUtil.click(insurerp, "");
        TestUtil.sendKeys(insurerp, insurer, " insurer select clicked");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(insurerp, String.valueOf(Keys.ENTER), insurer + "  - insurer selected ");


        TestUtil.click(createSale, " create Sale clicked");
    }

    public void Motor_productCatagory_Status_insurer(String TW_Motor_Health_Life, String status, String insurer, String vehicalType) {
        productCatagory_Status_insurer(TW_Motor_Health_Life, status, insurer);

        TestUtil.click(vehicleType, " insurer select clicked");
        WebElement VT = driver.findElement(By.xpath("//div[@id=\"createMISEntry_vehicleType_list\"]/..//div[@title='" + vehicalType + "']"));
        TestUtil.click(VT, vehicalType + " VT selected");

        TestUtil.click(createSale, " create Sale clicked");
    }


    public void PI_productCatagory_Status_insurer(String TW_FW_LIFE_HEALTH, String insurer) {
        TestUtil.click(reportASAle, "report a sale clicked");
        TestUtil.click(report, "report a sale clicked");
        TestUtil.click(productPI, " policy catagory clicked");
        WebCommands.staticSleep(2000);
        WebElement PC = driver.findElement(By.xpath("(//md-option[@value='" + TW_FW_LIFE_HEALTH + "'])[2]"));
        WebCommands.staticSleep(2000);
        TestUtil.click(PC, TW_FW_LIFE_HEALTH + " policy catagory selected");

        TestUtil.click(insurerPI, "");
        TestUtil.sendKeys(insurerPI, insurer, " insurer select clicked");
        TestUtil.click(click1st, insurer + " insurer select");

        TestUtil.sendKeys(PolicyNo, TestUtil.generateRandomPolicyNo(7), "Policy Number entered");

        TestUtil.click(Proceed, " create Sale clicked");
    }

    public void PI_productCatagory_HealtLife(String TW_FW_LIFE_HEALTH, String insurer) {
        TestUtil.click(reportASAle, "report a sale clicked");
        TestUtil.click(report, "report a sale clicked");
        TestUtil.click(productPI, " policy catagory clicked");
        WebCommands.staticSleep(2000);
        WebElement PC = driver.findElement(By.xpath("(//md-option[@value='" + TW_FW_LIFE_HEALTH + "'])[2]"));
        WebCommands.staticSleep(2000);
        TestUtil.click(PC, TW_FW_LIFE_HEALTH + " policy catagory selected");

        if (TW_FW_LIFE_HEALTH == "HEALTH") {

            TestUtil.click(policyIssuanceStatus, "");
            TestUtil.click(issued, "Issued clicked");
        }

        TestUtil.click(insurerPI, "");
        TestUtil.sendKeys(insurerPI, insurer, " insurer select clicked");
        TestUtil.click(click1st, insurer + " insurer select for " + TW_FW_LIFE_HEALTH + " health");

        if (TW_FW_LIFE_HEALTH == "HEALTH") {

            TestUtil.sendKeys(PolicyNo, TestUtil.generateRandomPolicyNo(7), "Policy Number entered");

        }

        TestUtil.click(Proceed, " create Sale clicked");
    }
}