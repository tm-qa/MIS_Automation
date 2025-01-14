package com.qa.turtlemint.pages.DashBoard;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;

public class Dashboard_Pagee extends TestBase{

    public Dashboard_Pagee() {
        PageFactory.initElements(driver, this); }

    @FindBy(xpath = "//span[text()='Channel']//parent::div//span[@role=\"button\"]")
    WebElement ChannelColumnClick;

    @FindBy(xpath = "//span[text()=\"Partner\"]/parent::*//label")
    WebElement ChannelPartnerOption;

    @FindBy(xpath = "//span[text()='Category']//parent::div//span[@role=\"button\"]")
    WebElement CategoryColumnClick;

    @FindBy(xpath = "//span[text()=\"Health\"]")
    WebElement CategoryHealthOption;

    @FindBy(xpath = "//span[text()=\"Select all items\"]")
    WebElement SelectAllForCategory;

    @FindBy(xpath = "//span[text()='Insurer']//parent::div//span[@role=\"button\"]//span")
    WebElement InsurerColumnClick;

    @FindBy(xpath = "//input[@placeholder=\"Search in filters\"]")
    WebElement SearchInFilters;

    @FindBy(xpath = "//span[text()=\"BAJAJ\"]")
    WebElement InsurerBAJAJOption;

    @FindBy(xpath = "//span[text()='Issuance status']//parent::div//span[@role=\"button\"]//span")
    WebElement IssuanceStatusColumnClick;

    @FindBy(xpath = "//span[text()=\"Pending from Insurer\"]")
    WebElement OptionPendingFromInsurer;

    @FindBy(xpath = "//span[text()='Call Status']//parent::div//span[@role=\"button\"]")
    WebElement CallStatusColumnClick;

    @FindBy(xpath = "//span[text()=\"PENDING\"]")
    WebElement PendingOption;

    @FindBy(xpath = "//button[text()='Ninja V1']")
    WebElement NinjaV1Button;

    @FindBy(xpath = "//input[@placeholder=\"Search by policy no or registration no (min. 4 char)\"]")
    WebElement SearchBarOnNinjaV1;

    @FindBy(xpath = "//span[@role=\"img\"]//img[@src=\"/ninja-v2/static/media/download-icon.d7c4e6ee9415822011bc267f3b103e22.svg\"]")
    WebElement BulkExportIcon;

    @FindBy(xpath = "//button[@class=\"ant-btn css-txh9fw ant-btn-link ant-btn-sm\"]")
    WebElement ResetButton;

    @FindBy(xpath = "//button[text()=\"Apply\"]")
    WebElement ApplyButton;

    @FindBy(xpath = "//input[@placeholder=\"Start date\"]")
    WebElement ClickOnStartDate;

    @FindBy(xpath = "//input[@placeholder=\"End date\"]")
    WebElement ClickOnEndDate;

    @FindBy(xpath = "//label[@title=\"Filter By\"]//parent::div//parent::div//div[@class=\"ant-form-item-control-input\"]")
    WebElement SelectFilterOption;

    @FindBy(xpath = "//div[text()=\"Creation Date\"]")
    WebElement SelectCreationDate;

    @FindBy(xpath = "//button[contains(text(),\"Total Records\")]")
    WebElement TotalRecordsButton;

    @FindBy(xpath = "//button/span[text()=\"OK\"]")
    WebElement OkButton;

    @FindBy(xpath = "//span[text()=\"Date range can not be greater than 3 months\"]")
    WebElement BulkError;

    @FindBy(xpath = "//li[@title=\"2\"]")
    WebElement Pagination2;

    @FindBy(xpath = "//li[@title=\"3\"]")
    WebElement Pagination3;

    @FindBy(xpath = "//*[contains(@class,\"ant-pagination-options-size-changer\")]")
    WebElement RowsPerPageElement;

    @FindBy(xpath = "//div[@title=\"10 \"]")
    WebElement Title10;

    @FindBy(xpath = "//li[@title=\"Previous Page\"]")
    WebElement PaginationPreviousArrow;
    ArrayList<String> ChannelOptions = new ArrayList<String> () {
        {
            add("Website");
            add("Website+Chat");
            add("Chat");
            add( "SMS");
            add("Partner");
            add("Dealer");
            add("Referral");
            add("Sub-Broker");
            add("Lead Buy");
            add("Inbound Call");
            add("Cold Call");
            add("Petrol Pump");
            add("Strategic Alliance");
            add("Employee");
        }
    };

    ArrayList<String> CategoryOptions = new ArrayList<String>() {
        {
            add("TW");
            add("Motor");
            add("Commercial");
            add("Health");
            add("Term");
            add("Life");
            add("Burglary");
            add("CPM");
            add("Fire");
            add("GMC");
            add("Householder's");
            add("Liability");
            add("Marine");
            add("Money Insurance");
            add("PA");
            add("Standard Fire & Special Perils");
            add("Travel");
            add("WC");
            add("GPA");
        }
    };

    ArrayList<String> InsurerOptions = new ArrayList<>() {
        {
            add("-");
            add("ACKOGENERAL");
            add("ADITYABIRLAHEALTH");
            add("AEGONLI");
            add("AFLI");
            add("AGRICULTUREINSURANCE");
            add("APOLLO");
            add("AVIVALIFELI");
            add("BAJAJ");
            add("BAJAJLI");
            add("BHARTIAXA");
            add("BHARTIAXALI");
            add("BIRLASUNLI");
            add("CANARAHSBCLI");
            add("CHOL");
            add("CIGNA");
            add("DHFLGENERAL");
            add("DHFLLI");
            add("DIGIT");
            add("EDELWEISS");
            add("EDELWISSTOKIOLI");
            add("EXIDELIFELI");
            add("EXPORTCREDIT");
            add("FGGI");
            add("FGLI");
            add("HDFC");
            add("HDFC_ONLINE");
            add("HDFCERGOHEALTH");
            add("HDFCLI");
            add("ICICILOMBARD");
            add("ICICIPRULI");
            add("IDBIFLI");
            add("IFTO");
            add("INDIAFIRSTLI");
            add("KOTAK");
            add("KOTAKLI");
            add("LIBERTY");
            add("LICLI");
            add("LNT");
            add("MAXBUPAHEALTH");
            add("MAXLIFELI");
            add("MGMA");
            add("NAVIGI");
            add("NINA");
            add("NTNL");
            add("ONE_ASSIST");
            add("ORNT");
            add("PNBMETLIFELI");
            add("RELI");
            add("RELIANCELI");
            add(" RELIGARE");
            add("RHJA");
            add("ROYALSUNDARAM");
            add("SAHARALIFELI");
            add("SBIG");
            add("SBIG_ONLINE");
            add("SBILI");
            add("SHRI");
            add("SHRIRAMLIFELI");
            add("STAR");
            add("STARUNIONDAIICHILI");
            add("TATA");
            add("TATAAIALI");
            add("UNISOMPO");
            add("UNISOMPO_ONLINE");
            add("UNTD");
            add("VIDEOCON");
        }
    };

    ArrayList<String> IssuanceStatusOptions = new ArrayList<>() {
        {
            add("Issued");
            add("Covernote Issued");
            add("Cancelled");
            add("Expired");
            add("Pending From Insurer");
            add("Pending From TM");
            add("Endorsed");
            add("Refund");
            add("Junk");
            add("Potential Duplicate");
        }
    };
    ArrayList<String> CallStatusOptions = new ArrayList<>() {
        {
            add("DONE");
            add("FAILED");
            add("PENDING");
        }
    };
    ArrayList<String> ChannelOptionsFetched = new ArrayList<String>();
    ArrayList<String> CategoryOptionsFetched = new ArrayList<String>();
    ArrayList<String> InsurerFetched = new ArrayList<String>();
    ArrayList<String> IssuanceStatusFetched = new ArrayList<String>();
    ArrayList<String> CallStatusFetched = new ArrayList<String>();

    JavascriptExecutor js = (JavascriptExecutor) driver;



    public void SelectFilter() throws Exception {
        WebCommands.staticSleep(1000);
        TestUtil.click(SelectFilterOption, "Clicking on Filter Option");
        TestUtil.click(SelectCreationDate, "Selecting Creation Date Option");
    }

    // Channel - Column
    public void VerifyChannelColumnFilterOptions() throws Exception {
        TestUtil.click(ChannelColumnClick,"Clicking on Channel Options");
        WebCommands.staticSleep(2000);
        List <WebElement> testDropDown = driver.findElements(By.xpath("//li[@class=\"ant-dropdown-menu-item\"]"));
        for (WebElement e : testDropDown){
            ChannelOptionsFetched.add(e.getText());
        }
        if (ChannelOptions.equals(ChannelOptionsFetched)) {
            System.out.println("Options are Matching");
        }
        else {
            System.out.println("Options are not Matching");
        }
    }

    public void ChannelFilterFunctionality() throws Exception {
        TestUtil.click(ClickOnStartDate , "click on start date");
        String days = TestUtil.ninjaPastDate(5);
        TestUtil.sendKeys(ClickOnStartDate,days,"start date entered");
        TestUtil.click(ClickOnEndDate , "click on start date");
        TestUtil.sendKeys(ClickOnEndDate,TestUtil.ninjaPastDate(1),"end date entered");
        SelectFilter();
        TestUtil.click(ChannelColumnClick,"Clicking on Channel Filter");
        WebCommands.staticSleep(5000);
        TestUtil.click(ChannelPartnerOption, "Clicking on Partner Option");
        TestUtil.click(ApplyButton,"Clicked on Apply Button");
        WebCommands.staticSleep(2000);
        Assert.assertTrue(TotalRecordsButton.isDisplayed());
    }

    public void VerifyResetButtonDisable() throws Exception {
        TestUtil.click(ChannelColumnClick,"Clicking on Channel Filter");
        WebCommands.staticSleep(2000);
        boolean resetB = ResetButton.isEnabled();
        System.out.println(resetB);
        Assert.assertFalse(ResetButton.isEnabled());
    }

    public void VerifyResetButtonEnabled() throws Exception {
        TestUtil.click(ChannelColumnClick,"Clicking on Channel Column");
        WebCommands.staticSleep(2000);
        TestUtil.click(ChannelPartnerOption, "Clicking on Partner Option");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(ResetButton.isEnabled());
    }

    public void VerifyOKButtonFunctionalityForChannelFilter() throws Exception {
        TestUtil.click(ClickOnStartDate , "click on start date");
        String days = TestUtil.ninjaPastDate(5);
        TestUtil.sendKeys(ClickOnStartDate,days,"start date entered");
        TestUtil.click(ClickOnEndDate , "click on start date");
        TestUtil.sendKeys(ClickOnEndDate,TestUtil.ninjaPastDate(1),"end date entered");
        SelectFilter();
        TestUtil.click(ChannelColumnClick,"Clicking on Channel Filter");
        WebCommands.staticSleep(3000);
        TestUtil.click(ChannelPartnerOption, "Clicking on Partner Option");
        TestUtil.click(OkButton,"Clicking on OK button");
        WebCommands.staticSleep(2000);
        Assert.assertTrue(TotalRecordsButton.isDisplayed());
    }

    // Category - Column

    public void VerifyCategoryColumnFilterOptions() throws Exception {
        TestUtil.click(CategoryColumnClick,"Clicking on Category Column");
        WebCommands.staticSleep(2000);
        List<WebElement> CategoryOption = driver.findElements(By.xpath("//span[@class=\"ant-tree-title\"]"));
        for (WebElement e : CategoryOption){
            CategoryOptionsFetched.add(e.getText());
        };
        if (CategoryOptions.equals(CategoryOptionsFetched)) {
            System.out.println("Options are Matching");
        }
    }

    public void CategoryFilterFunctionality() throws Exception {
        TestUtil.click(ClickOnStartDate , "click on start date");
        String days = TestUtil.ninjaPastDate(5);
        TestUtil.sendKeys(ClickOnStartDate,days,"start date entered");
        TestUtil.click(ClickOnEndDate , "click on start date");
        TestUtil.sendKeys(ClickOnEndDate,TestUtil.ninjaPastDate(1),"end date entered");
        SelectFilter();
        TestUtil.click(CategoryColumnClick,"Clicked on Category Column");
        WebCommands.staticSleep(2000);
        TestUtil.click(CategoryHealthOption,"Selecting Health Option");
        TestUtil.click(ApplyButton,"Clicking on Apply Button");
        WebCommands.staticSleep(2000);
        Assert.assertTrue(TotalRecordsButton.isDisplayed());
    }

    public void VerifySelectAllItemsForCategory() throws Exception {
        TestUtil.click(ClickOnStartDate , "click on start date");
        String days = TestUtil.ninjaPastDate(5);
        TestUtil.sendKeys(ClickOnStartDate,days,"start date entered");
        TestUtil.click(ClickOnEndDate , "click on start date");
        TestUtil.sendKeys(ClickOnEndDate,TestUtil.ninjaPastDate(1),"end date entered");
        SelectFilter();
        TestUtil.click(CategoryColumnClick,"Clicked on Category Column");
        WebCommands.staticSleep(2000);
        TestUtil.click(SelectAllForCategory,"Select all items for Category Option");
        TestUtil.click(ApplyButton,"Clicking on Apply Button");
        WebCommands.staticSleep(2000);
        Assert.assertTrue(TotalRecordsButton.isDisplayed());
    }

    public void VerifyResetButtonCategoryColumn() throws Exception {
        TestUtil.click(CategoryColumnClick,"Clicked on Category Column");
        WebCommands.staticSleep(2000);
        boolean resetB = ResetButton.isEnabled();
        System.out.println(resetB);
        Assert.assertFalse(ResetButton.isEnabled());
    }

    public void VerifyResetButtonEnabledCategory() throws Exception {
        TestUtil.click(CategoryColumnClick,"Clicked on Category Column");
        WebCommands.staticSleep(2000);
        TestUtil.click(CategoryHealthOption,"Selecting Health Option");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(ResetButton.isEnabled());
    }

    public void VerifyOkButtonForCategoryColumn() throws Exception {
        TestUtil.click(ClickOnStartDate , "click on start date");
        String days = TestUtil.ninjaPastDate(5);
        TestUtil.sendKeys(ClickOnStartDate,days,"start date entered");
        TestUtil.click(ClickOnEndDate , "click on start date");
        TestUtil.sendKeys(ClickOnEndDate,TestUtil.ninjaPastDate(1),"end date entered");
        ClickOnEndDate.sendKeys(Keys.RETURN);
        SelectFilter();
        TestUtil.click(CategoryColumnClick,"Clicked on Category Column");
        WebCommands.staticSleep(2000);
        TestUtil.click(CategoryHealthOption,"Selecting Health Option");
        WebCommands.staticSleep(1000);
        TestUtil.click(OkButton,"Clicking on OK button");
        WebCommands.staticSleep(1000);
        TestUtil.click(ApplyButton,"Clicking on Apply Button");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(TotalRecordsButton.isDisplayed());
    }

    // Insurer - Column

    public void VerifyInsureColumnOptions() throws Exception {
        driver.manage().window().maximize();
        TestUtil.click(InsurerColumnClick,"Clicked on Insurer Column");
        WebCommands.staticSleep(2000);
        List<WebElement> testDropDown = driver.findElements(By.xpath("//li[@class=\"ant-dropdown-menu-item\"]"));
        for (WebElement e : testDropDown){
            InsurerFetched.add(e.getText());
        }
        if (InsurerOptions.equals(InsurerFetched)) {
            System.out.println("Options are Matching");
        }
    }

    public void VerifySearchInFiltersVisible() throws Exception {
        driver.manage().window().maximize();
        TestUtil.click(InsurerColumnClick,"Clicked on Insurer Column");
        WebCommands.staticSleep(2000);
        Assert.assertTrue(SearchInFilters.isDisplayed());
        TestUtil.click(SearchInFilters,"Clicking on Search filters ");
        TestUtil.sendKeys(SearchInFilters,"ICICI","Entering ICICI in Search box");
    }

    public void VerifyInsurerFilterFunctionality() throws Exception {
        driver.manage().window().maximize();
        TestUtil.click(ClickOnStartDate , "click on start date");
        String days = TestUtil.ninjaPastDate(5);
        TestUtil.sendKeys(ClickOnStartDate,days,"start date entered");
        TestUtil.click(ClickOnEndDate , "click on start date");
        TestUtil.sendKeys(ClickOnEndDate,TestUtil.ninjaPastDate(1),"end date entered");
        SelectFilter();
        TestUtil.click(InsurerColumnClick,"Clicked on Insurer Column");
        WebCommands.staticSleep(1500);
        TestUtil.click(InsurerBAJAJOption,"Selecting Bajaj Option");
        TestUtil.click(OkButton,"Clicking on OK button");
        WebCommands.staticSleep(1500);
        TestUtil.click(ApplyButton,"Clicking on Apply Button");
        WebCommands.staticSleep(1500);
        Assert.assertTrue(TotalRecordsButton.isDisplayed());
    }

    public void VerifyInsurerColumnResetButtonDisable() throws Exception {
        driver.manage().window().maximize();
        TestUtil.click(InsurerColumnClick,"Clicked on Insurer Column");
        WebCommands.staticSleep(1500);
        boolean resetB = ResetButton.isEnabled();
        System.out.println(resetB);
        Assert.assertFalse(ResetButton.isEnabled());
    }

    public void VerifyInsurerColumnResetButtonEnable() throws Exception {
        driver.manage().window().maximize();
        TestUtil.click(InsurerColumnClick,"Clicked on Insurer Column");
        WebCommands.staticSleep(1500);
        TestUtil.click(InsurerBAJAJOption,"Selecting Bajaj Option");
        Assert.assertTrue(ResetButton.isEnabled());
    }


    // Issuance Status - Column
    public void VerifyIssuanceStatusOptions() throws Exception {
        driver.manage().window().maximize();
        TestUtil.click(IssuanceStatusColumnClick,"Clicked on Issuance Status Column");
        WebCommands.staticSleep(1500);
        List<WebElement> testDropDown = driver.findElements(By.xpath("//li[@class=\"ant-dropdown-menu-item\"]"));
        for (WebElement e : testDropDown){
            IssuanceStatusFetched.add(e.getText());
        };
        if (IssuanceStatusOptions.equals(IssuanceStatusFetched)) {
            System.out.println("Options are Matching");
        }
    }

    public void VerifyIssuanceStatusFunctionality() throws Exception {
        driver.manage().window().maximize();
        TestUtil.click(ClickOnStartDate , "click on start date");
        String days = TestUtil.ninjaPastDate(5);
        TestUtil.sendKeys(ClickOnStartDate,days,"start date entered");
        TestUtil.click(ClickOnEndDate , "click on start date");
        TestUtil.sendKeys(ClickOnEndDate,TestUtil.ninjaPastDate(1),"end date entered");
        SelectFilter();
        TestUtil.click(IssuanceStatusColumnClick,"Clicking On column Issuance Status");
        WebCommands.staticSleep(1500);
        TestUtil.click(OptionPendingFromInsurer,"Selecting Option in Issuance Status Column");
        WebCommands.staticSleep(1500);
        TestUtil.click(OkButton,"Clicking on OK button");
        WebCommands.staticSleep(1500);
        TestUtil.click(ApplyButton,"Clicking on Apply Button");
        WebCommands.staticSleep(1500);
        Assert.assertTrue(TotalRecordsButton.isDisplayed());
    }

    public void VerifyIssuanceStatusResetDisabled() throws Exception {
        driver.manage().window().maximize();
        TestUtil.click(IssuanceStatusColumnClick,"Clicked on Issuance Status Column");
        WebCommands.staticSleep(1500);
        boolean resetB = ResetButton.isEnabled();
        System.out.println(resetB);
        Assert.assertFalse(ResetButton.isEnabled());
    }

    public void VerifyIssuanceStatusResetEnabled() throws Exception {
        driver.manage().window().maximize();
        TestUtil.click(IssuanceStatusColumnClick,"Clicked on Issuance Status Column");
        WebCommands.staticSleep(1500);
        TestUtil.click(OptionPendingFromInsurer,"Selecting Option in Issuance Status Column");
        WebCommands.staticSleep(1500);
        Assert.assertTrue(ResetButton.isEnabled());
    }

    public void VerifyCallStatusOptions() throws Exception {
        driver.manage().window().maximize();
        js.executeScript("arguments[0].scrollIntoView();",CallStatusColumnClick);
        TestUtil.click(CallStatusColumnClick,"Clicked on Call Status Column");
        WebCommands.staticSleep(1500);
        List<WebElement> testDropDown = driver.findElements(By.xpath("//span[@class=\"ant-dropdown-menu-title-content\"]"));
        for (WebElement e : testDropDown){
            CallStatusFetched.add(e.getText());
        };
        if (CallStatusOptions.equals(IssuanceStatusFetched)) {
            System.out.println("Options are Matching");
        }
    }

    public void VerifyCallStatusFilterFunctionality() throws Exception {
        driver.manage().window().maximize();
        TestUtil.click(ClickOnStartDate , "click on start date");
        String days = TestUtil.ninjaPastDate(5);
        TestUtil.sendKeys(ClickOnStartDate,days,"start date entered");
        TestUtil.click(ClickOnEndDate , "click on start date");
        TestUtil.sendKeys(ClickOnEndDate,TestUtil.ninjaPastDate(1),"end date entered");
        SelectFilter();
        try{
        js.executeScript("arguments[0].scrollIntoView();",CallStatusColumnClick);
        TestUtil.click(CallStatusColumnClick,"Clicked on Call Status Column");
        WebCommands.staticSleep(1500);
        TestUtil.click(PendingOption,"Selecting Pending Option");
        WebCommands.staticSleep(1500);
        TestUtil.click(OkButton,"Clicking on OK button");
        WebCommands.staticSleep(1500);
        TestUtil.click(ApplyButton,"Clicking on Apply Button");
        WebCommands.staticSleep(1500);
        Assert.assertTrue(TotalRecordsButton.isDisplayed());}
        catch (Exception e){

        }
    }

    public void VerifyCallStatusResetEnable() throws Exception {
        try{
        driver.manage().window().maximize();
        js.executeScript("arguments[0].scrollIntoView();",CallStatusColumnClick);
        TestUtil.click(CallStatusColumnClick,"Clicked on Call Status Column");
        WebCommands.staticSleep(1500);
        TestUtil.click(PendingOption,"Selecting Pending Option");
        WebCommands.staticSleep(1500);
        Assert.assertTrue(ResetButton.isEnabled());}
         catch (Exception e){

        }

    }

    public void VerifyCallStatusResetDisable() throws Exception {
        try {
        driver.manage().window().maximize();
        js.executeScript("arguments[0].scrollIntoView();",CallStatusColumnClick);
        TestUtil.click(CallStatusColumnClick,"Clicked on Call Status Column");
        WebCommands.staticSleep(1500);
        boolean resetB = ResetButton.isEnabled();
        System.out.println(resetB);
        Assert.assertFalse(ResetButton.isEnabled()); }
        catch (Exception e){

        }
    }

    public void VerifyNinjaV1() throws Exception {
        driver.manage().window().maximize();
        js.executeScript("arguments[0].scrollIntoView();",NinjaV1Button);
        TestUtil.click(NinjaV1Button, "Clicking on Ninja V1 button");
        WebCommands.staticSleep(5000);
        Assert.assertTrue(SearchBarOnNinjaV1.isDisplayed());
    }

    public void VerifyPaginationVisible() throws Exception {
        VerifyOkButtonForCategoryColumn();
        Assert.assertTrue(PaginationPreviousArrow.isDisplayed());
    }

    public void VerifyPaginationNext() throws Exception {
        VerifyPaginationVisible();
        TestUtil.click(Pagination2,"Clicked on Pagination 2");
        WebCommands.staticSleep(1000);
        TestUtil.click(Pagination3,"Clicked on Pagination 3");
    }

    public void VerifyRowsPerPage() throws Exception {
        VerifyPaginationVisible();
        List<WebElement> DataByDefault = driver.findElements(By.xpath("//tr[@data-row-key]"));
        System.out.println("By Default data rows are : "+DataByDefault.size());
        TestUtil.click(RowsPerPageElement,"Clicking on Per Page");
        WebCommands.staticSleep(2000);
        TestUtil.click(Title10,"Clicked on Option 10");
        WebCommands.staticSleep(7000);
        List<WebElement> DataSelectingOption = driver.findElements(By.xpath("//tr[@data-row-key]"));
        System.out.println("Data rows after selecting option : "+DataSelectingOption.size());
    }

    public void VerifyBulkExportError() throws Exception {
        driver.manage().window().maximize();
        TestUtil.click(ClickOnStartDate , "click on start date");
        String days = TestUtil.ninjaPastDate(100);
        TestUtil.sendKeys(ClickOnStartDate,days,"start date entered");
        TestUtil.click(ClickOnEndDate , "click on end date");
        TestUtil.sendKeys(ClickOnEndDate,TestUtil.ninjaPastDate(1),"end date entered");
        ClickOnEndDate.sendKeys(Keys.RETURN);
        SelectFilter();
        TestUtil.click(ApplyButton,"Clicking on Apply Button");
        js.executeScript("arguments[0].scrollIntoView();",BulkExportIcon);
        WebCommands.staticSleep(2500);
        TestUtil.click(BulkExportIcon, "Clicking on Bulk Export Icon");
        WebCommands.staticSleep(500);
        Assert.assertTrue(BulkError.isDisplayed());
    }


}

