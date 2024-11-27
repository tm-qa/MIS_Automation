package com.qa.turtlemint.pages.Dashboard;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


public class TC_61_to_116 extends TestBase {

    public TC_61_to_116() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id=\"root\"]//span[@class=\"anticon\"]//img[@alt=\"Plus\"]")
    WebElement plus;

    @FindBy(xpath = "//input[@aria-controls=\"createMISEntry_productCategory_list\"]//parent::span")
    WebElement policyCatagory;

    @FindBy(xpath = "//input[@id=\"createMISEntry_policyStatus\"]//parent::span")
    WebElement policyStatus;

    @FindBy(xpath = "//input[@id=\"createMISEntry_insurer\"]//parent::span")
    WebElement insurerp;

    @FindBy(xpath = "//button[text()=\"Create Sale\"]")
    WebElement createSale;

    @FindBy(xpath = "//input[@id=\"createMISEntry_vehicleType\"]//parent::span")
    WebElement vehicleType;

    @FindBy(xpath = "//span[text()=\"Insurer\"]//parent::div//span[@aria-label='filter']")
    WebElement insurerFilter;

    @FindBy(xpath = "//span[text()=\"Sales Status\"]//parent::div//span[@aria-label='filter']")
    WebElement SalesStatusFilter;

    @FindBy(xpath = "//input[@placeholder='Start date']")
    WebElement DateRange;

    @FindBy(xpath = "//button[@class='ant-picker-header-prev-btn']")
    WebElement PreviousMonth;

    @FindBy(xpath = "//div[@class='ant-select-selector']")
    WebElement filterBy;

    @FindBy(xpath = "//div[text()='Creation Date']")
    WebElement CreationDate;

    @FindBy(xpath = "//button[text()='Apply']")
    WebElement Apply;

    @FindBy(xpath = "//span[text()='BAJAJ']")
    WebElement SelectBajaj;

    @FindBy(xpath = "//span[text()='OK']")
    WebElement OK;

    @FindBy(xpath = "//span[text()='Reset']")
    WebElement Reset;

    @FindBy(xpath = "//div[contains(@class,'ant-table-filter')]//button")
    WebElement DisabledReset;

    @FindBy(xpath = "//span[@class='anticon']//img[contains(@src,'plus-icon')]")
    WebElement PlusIcon;

    @FindBy(xpath = "//button[text()='Cancel']")
    WebElement cancel;

    @FindBy(xpath = "//div//h5[text()='Basic Details']")
    WebElement basicDetails;

    @FindBy(xpath = "//div[@class='ant-table-body']//table[contains(@style,'width: 2250px')]")
    WebElement scrollableElement;

    @FindBy(xpath = "//span[text()='Confirmed']//parent::span//label")
    WebElement SalesStatusConfirmCheckbox;

    @FindBy(xpath = "//span[text()='Pending']//parent::span//label")
    WebElement SalesStatusPendingCheckbox;

    @FindBy(xpath = "//span[text()='Online Issuance']")
    WebElement OnlineIssuance;

    @FindBy(xpath = "//span[text()=\"Creation Source\"]//parent::div//span[@aria-label='filter']")
    WebElement CreationSource;

    @FindBy(xpath = "//input[contains(@placeholder,'Search by Policy No. or Registration No.')]")
    WebElement UniversalSearch;


    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void productCatagory_Status_insurer(String TW_Motor_Health_Life, String status, String insurer) {
        TestUtil.click(plus, "Plus button clicked");
        TestUtil.click(policyCatagory, " policy catagory clicked");
        WebElement PC = driver.findElement(By.xpath("//div[@title='" + TW_Motor_Health_Life + "']"));
        TestUtil.click(PC, TW_Motor_Health_Life + " policy catagory selected");

        TestUtil.click(policyStatus, " policy status clicked");
        WebElement PS = driver.findElement(By.xpath("//div[@title='" + status + "']"));
        TestUtil.click(PS, status + " policy Status selected");

        TestUtil.click(insurerp, " insurer select clicked");
        WebElement Insurer = driver.findElement(By.xpath("//div[@title='" + insurer + "']"));
        TestUtil.click(Insurer, status + " policy insurer selected");
    }

    public void Motor_productCatagory_Status_insurer(String TW_Motor_Health_Life, String status, String insurer, String vehicalType) {
        productCatagory_Status_insurer(TW_Motor_Health_Life, status, insurer);

        TestUtil.click(vehicleType, " insurer select clicked");
        WebElement VT = driver.findElement(By.xpath("//div[@title='" + vehicalType + "']"));
        TestUtil.click(VT, vehicalType + " VT selected");

        TestUtil.click(createSale, " create Sale clicked");
    }

    public void InsurerFilterValue() {
        WebCommands.staticSleep(3000);
        js.executeScript("arguments[0].scrollIntoView(true)", insurerFilter);
        js.executeScript("arguments[0].click();", insurerFilter);
        WebCommands.staticSleep(4000);
        List<String> expectedFilterValues = Arrays.asList(
                "ABSLI", "ACKOGENERAL", "ADITYABIRLAHEALTH", "AEGONLI", "AFLI", "AGRICULTUREINSURANCE", "APOLLO",
                "AVIVALIFELI", "BAJAJ", "BAJAJLI", "BHARTIAXA", "BHARTIAXALI", "BIRLASUNLI", "CANARAHSBCLI",
                "CHOL", "CIGNA", "DHFLGENERAL", "DHFLLI", "DIGIT", "DIGITLI" , "EDELWEISS", "EDELWISSTOKIOLI",
                "EXIDELIFELI", "EXPORTCREDIT", "FGGI", "FGLI", "HDFC", "HDFC_ONLINE", "HDFCERGOHEALTH",
                "HDFCLI", "ICICILOMBARD", "ICICIPRULI", "IDBIFLI", "IFTO", "INDIAFIRSTLI", "KOTAK", "KOTAKLI",
                "LIBERTY", "LICLI", "LNT", "MAXBUPAHEALTH", "MAXLIFELI", "MGMA", "NAVIGI", "NINA", "NTNL",
                "ONE_ASSIST", "ORNT", "PNBMETLIFELI", "RELI", "RELIANCELI", "RELIGARE", "RHJA",
                "ROYALSUNDARAM", "SAHARALIFELI", "SBIG", "SBIG_ONLINE", "SBILI", "SHRI", "SHRIRAMLIFELI",
                "STAR", "STARUNIONDAIICHILI", "TATA", "TATAAIALI", "UNISOMPO", "UNISOMPO_ONLINE",
                "UNTD", "VIDEOCON"
        );

        List<WebElement> filterElements = driver.findElements(By.xpath("//div[@class='ant-table-filter-dropdown']//ul"));

        List<String> actualFilterValues = filterElements.stream()
                .map(element -> element.getText().trim())
                .map(text -> text.split("\\n"))
                .flatMap(Arrays::stream)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        actualFilterValues.removeIf(value -> value.equals("-"));

        List<String> cleanedExpectedFilterValues = expectedFilterValues.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        if (actualFilterValues.isEmpty()) {
            System.out.println("Actual filter values are empty, no filters were captured from the page.");
        } else {
            System.out.println("Actual Filter Values: " + actualFilterValues);
        }

        List<String> missingValues = new ArrayList<>(cleanedExpectedFilterValues);
        missingValues.removeAll(actualFilterValues);

        List<String> extraValues = new ArrayList<>(actualFilterValues);
        extraValues.removeAll(cleanedExpectedFilterValues);

        if (missingValues.isEmpty() && extraValues.isEmpty()) {
            System.out.println("Filters match perfectly!");
        } else {
            System.out.println("Filters do not match.");
            System.out.println("Expected: " + cleanedExpectedFilterValues);
            System.out.println("Actual: " + actualFilterValues);

            if (!missingValues.isEmpty()) {
                System.out.println("Missing Values: " + missingValues);
            }

            if (!extraValues.isEmpty()) {
                System.out.println("Extra Values: " + extraValues);
            }

            Assert.fail("Test case failed: Filters do not match.");
        }
    }

    public void DefaultFilter(String startDate, String endDate) {
        WebCommands.staticSleep(2000);
        TestUtil.click(DateRange, "Clicked on select date range dropDown");
        WebCommands.staticSleep(500);
        TestUtil.click(PreviousMonth, "Clicked on Previous month arrow");
        WebCommands.staticSleep(500);
        WebElement Startdate = driver.findElement(By.xpath("(//table[@class='ant-picker-content']//tbody//tr//td)[" + startDate + "]"));
        TestUtil.click(Startdate, "Start date selected");
        WebElement Enddate = driver.findElement(By.xpath("(//table[@class='ant-picker-content']//tbody//tr//td)[" + endDate + "]"));
        TestUtil.click(Enddate, "End date selected");
        WebCommands.staticSleep(1000);
        TestUtil.click(filterBy, "clicked on filterBy dropdown");
        TestUtil.click(CreationDate, "Creation Date selected");
        TestUtil.click(Apply, "Clicked on Apply CTA");
        WebCommands.staticSleep(2000);
    }

    public void filterValue() {
        DefaultFilter("1", "9");
        js.executeScript("arguments[0].scrollIntoView(true)", insurerFilter);
        js.executeScript("arguments[0].click();", insurerFilter);
        TestUtil.click(SelectBajaj, "Bajaj Insurer selected");
        TestUtil.click(OK, "Clicked on OK button");
        js.executeScript("arguments[0].scrollIntoView(true)", insurerFilter);
        js.executeScript("arguments[0].click();", insurerFilter);
    }

    public void NewSale() {
        WebCommands.staticSleep(1000);
        TestUtil.click(PlusIcon, "Clicked on Plus Icon");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.click(cancel, "Clicked on cancel CTA on popup");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        productCatagory_Status_insurer("Life", "Issued", "Bajaj Allianz LI");
        TestUtil.click(createSale, " create Sale clicked");
        basicDetails.isDisplayed();
    }

    public void NewSaleNegative() {
        productCatagory_Status_insurer("Life", "Issued", "Bajaj Allianz LI");
        TestUtil.click(cancel, "Clicked on cancel CTA on popup");
        WebCommands.staticSleep(1000);
        TestUtil.click(PlusIcon, "Clicked on Plus Icon");
        WebCommands.staticSleep(1000);
        boolean policyCatagoryValue = policyCatagory.getText().isEmpty();
        boolean policyStatusValue = policyStatus.getText().isEmpty();
        boolean insurerpValue = insurerp.getText().isEmpty();
        Assert.assertTrue(policyCatagoryValue);
        Assert.assertTrue(policyStatusValue);
        Assert.assertTrue(insurerpValue);
    }

    public void scrollValue() {

        String elementWidth = (String) js.executeScript("return window.getComputedStyle(arguments[0]).width;", scrollableElement);
        System.out.println("Width of the element: " + elementWidth);
        Assert.assertEquals(elementWidth, "2250px");
    }

    public void SalesStatusValue() {
        WebCommands.staticSleep(2000);
        DefaultFilter("1", "9");
        js.executeScript("arguments[0].scrollIntoView(true)", SalesStatusFilter);
        js.executeScript("arguments[0].click();", SalesStatusFilter);
        WebCommands.staticSleep(2000);
        List<WebElement> Values = driver.findElements(By.xpath("//div[@class=\"ant-table-filter-dropdown\"]//ul//li"));
        for (WebElement filterValue : Values) {
            String text = filterValue.getText();
            System.out.println(text);
            if (text.equals("Confirmed")) {
                Assert.assertEquals(text, "Confirmed");
            } else {
                Assert.assertEquals(text, "Pending");
            }
        }
    }

    public void SalesStatusFilter() {
        WebCommands.staticSleep(2000);
        DefaultFilter("1", "9");
        js.executeScript("arguments[0].scrollIntoView(true)", SalesStatusFilter);
        js.executeScript("arguments[0].click();", SalesStatusFilter);
        WebCommands.staticSleep(1000);
        boolean resetDisabledcheck = DisabledReset.isEnabled();
        System.out.println(resetDisabledcheck);
        Assert.assertFalse(resetDisabledcheck);
        TestUtil.click(SalesStatusConfirmCheckbox, "Confirm checkbox clicked");
        boolean resetEnablecheck = DisabledReset.isEnabled();
        System.out.println(resetEnablecheck);
        Assert.assertTrue(resetEnablecheck);
        TestUtil.click(OK, "Clicked on OK button");
        WebCommands.staticSleep(1000);
        List<WebElement> RowCount = driver.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        int Count = RowCount.size();
        List<WebElement> CONFIRMEDCount = driver.findElements(By.xpath("//div//p[text()=' CONFIRMED']"));
        int Count1 = CONFIRMEDCount.size();
        Assert.assertEquals(Count, Count1);
    }

    public void RegNoAndPolicyNoSearch(String RegNo, String PolicyNo) {
        TestUtil.sendKeys(UniversalSearch, RegNo, "Reg number added in search box");
        Actions act = new Actions(driver);
        act.sendKeys(Keys.RETURN).build().perform();
        WebCommands.staticSleep(2000);
        List<WebElement> RowCount = driver.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        int Count = RowCount.size();
        TestUtil.getScreenShot();
        System.out.println(Count);
        List<WebElement> CONFIRMEDCount = driver.findElements(By.xpath("//div//p[text()=' " + RegNo + "']"));
        int Count1 = CONFIRMEDCount.size();
        System.out.println(Count1);
        Assert.assertEquals(Count, Count1);
        //GJ-01-Ab-6889
        UniversalSearch.clear();
        TestUtil.clear(UniversalSearch,"Search bar cleared");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(UniversalSearch, PolicyNo, "Policy number added in search box");
        act.sendKeys(Keys.RETURN).build().perform();
        List<WebElement> RowCount1 = driver.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        int Count2 = RowCount1.size();
        TestUtil.getScreenShot();
        System.out.println(Count2);
        List<WebElement> CONFIRMEDCount1 = driver.findElements(By.xpath("//div//p[text()='" + PolicyNo + "']"));
        int Count3 = CONFIRMEDCount1.size();
        System.out.println(Count3);
        Assert.assertEquals(Count2, Count3);
    }

    public void CreationSourceFilterValue() {
        DefaultFilter("1", "9");
        WebCommands.staticSleep(3000);
        js.executeScript("arguments[0].scrollIntoView(true);", CreationSource);
        js.executeScript("arguments[0].click();", CreationSource);
        WebCommands.staticSleep(1000);
        List<Object> expectedFilterValues = Arrays.asList("Online Issuance","Smartzone","opsupload","Emailpoller","Opsmanual","Csvupload","Pi-Central","Pi-Branch","RPA","Dp Submited","Transaction Master");
        List<WebElement> actualFilterElements = driver.findElements(By.xpath("//div[@class='ant-table-filter-dropdown']//ul//li//span//following-sibling::span[text()]"));
        List<String> actualFilterValues = new ArrayList<>();
        for(WebElement elements : actualFilterElements){
            actualFilterValues.add(elements.getText().trim());
        }
        System.out.println(actualFilterValues);
        Assert.assertEquals(actualFilterValues,expectedFilterValues);
        System.out.println(actualFilterValues);

        boolean resetDisabledcheck = DisabledReset.isEnabled();
        System.out.println(resetDisabledcheck);
        Assert.assertFalse(resetDisabledcheck);
        TestUtil.click(OnlineIssuance, "Online Issuance checkbox clicked");
        boolean resetEnablecheck = DisabledReset.isEnabled();
        System.out.println(resetEnablecheck);
        Assert.assertTrue(resetEnablecheck);
        TestUtil.click(OK, "Clicked on OK button");
        WebCommands.staticSleep(1000);
        List<WebElement> RowCount = driver.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        int Count = RowCount.size();
        List<WebElement> CONFIRMEDCount = driver.findElements(By.xpath("//div//p[text()=' CONFIRMED']"));
        int Count1 = CONFIRMEDCount.size();
        Assert.assertEquals(Count, Count1);
    }
}

