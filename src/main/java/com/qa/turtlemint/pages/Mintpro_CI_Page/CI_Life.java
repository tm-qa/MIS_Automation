package com.qa.turtlemint.pages.Mintpro_CI_Page;

import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static com.qa.turtlemint.base.TestBase.driver;

public class CI_Life {
    public String getUrl;
    public String orderID;

    public CI_Life() {
        PageFactory.initElements(driver, this);
    }

    JavascriptExecutor jse = (JavascriptExecutor) driver;

    TestUtil tl = new TestUtil();
    LeadName_Page leadpage = new LeadName_Page();

    @FindBy(xpath = "//label[@id=\"Radio-M\"]")
    WebElement Maleselected;

    @FindBy(xpath = "//label[@id=\"Radio-F\"]")
    WebElement Femaleselected;

    @FindBy(xpath = "//label[@id=\"Radio-true\"]")
    WebElement yes;

    @FindBy(xpath = "//label[@id=\"Radio-false\"]")
    WebElement no;

    @FindBy(xpath = "//div[@class=\"sc-eqIVtm cCBzET\"]")
    WebElement approxAmount;

    @FindBy(xpath = "//li[text()='7 Lac to 10 Lac']")
    WebElement Amount_7to10lac;

    @FindBy(xpath = "//span[text()='₹1 Crs']")
    WebElement sumassuredamt;

    @FindBy(xpath = "//li[text()='₹1.50 Crs']")
    WebElement sumassuredamt_1_5Crs;

    @FindBy(id = "paymentFrequency")
    WebElement paymentFrequency;

    @FindBy(xpath = "//a[text()='Half-Yearly']")
    WebElement halfYearly;

    @FindBy(xpath = "//button[@id='coverAmount']") //new add
    WebElement coverAmount;

    @FindBy(xpath = "//li[@data-auto='coverAmount-dropdown-list-15']//a[text()='₹1 Crs']")
    WebElement coverAmt_1Crs;

    @FindBy(id = "maturityAge")
    WebElement maturityAge;

    @FindBy(xpath = "//a[text()='50 years']")
    WebElement maturityAge_50Yr;

    @FindBy(xpath = "//input[@placeholder=\"Enter Date\"]")
    WebElement calender;

    @FindBy(xpath = "//select[@class=\"sc-iQKALj gwKrYD\"]")
    WebElement yearselect;

    @FindBy(xpath = "(//select[@class=\"sc-iQKALj gwKrYD\"])[2]")
    WebElement monthselect;

    @FindBy(xpath = "//div[@aria-label=\"Choose Sunday, December 1st, 1985\"]")
    WebElement dateselect_1Dec;

    @FindBy(xpath = "//span[text()='Next']")
    WebElement next;

    @FindBy(id = "proceed-btn")
    WebElement buyNowButton;

    @FindBy(id = "insuredMemberLName")
    WebElement lastname;

    @FindBy(id = "insuredMemberMobile")
    WebElement mobilrNo;

    @FindBy(id = "insuredMemberEmail")
    WebElement emailId;

    @FindBy(id = "insuredMemberMaritalStatus-uiSelect")
    WebElement maritalstatusDropdown;

    @FindBy(xpath = "//span[text()='Married']")
    WebElement married;

    @FindBy(xpath = "//button[@data-auto=\"Continue\"]")
    WebElement continu;

    @FindBy(xpath = "//button[@data-auto=\"viewdetail-BAJAJLI-Smart Protect Goal\"]")
    WebElement BajajAllianz;

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void GenderButtonClick(String Gender) {
        WebCommands.staticSleep(1000);
        if (Gender == "male") {
            TestUtil.click(Maleselected, "Male Gender Selected");
        } else
            TestUtil.click(Femaleselected, "Female Gender Selected");
    }

    public void smoke_chewTobaco(String yesNo) {
        WebCommands.staticSleep(500);
        if (yesNo == "yes") {
            TestUtil.click(yes, "Yes Selected");
        } else
            TestUtil.click(no, "No Selected");
    }

    public void datepicker(String year, String Month, WebElement Date) {
        TestUtil.click(calender, "caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue(year);
        WebCommands.staticSleep(1000);
        Select monthSelect = new Select(monthselect);
        monthSelect.selectByVisibleText(Month);
        WebCommands.staticSleep(1000);
        TestUtil.click(Date, "5 aug date select");
        WebCommands.staticSleep(1000);
    }

    public void checkout() {
        TestUtil.sendKeys(lastname, "test", "last name entered");
        TestUtil.sendKeys(mobilrNo, "6888812345", "Mobile No entered");
        TestUtil.sendKeys(emailId, "automationtesting@turtlemint.com", "Email Id entered");
        TestUtil.click(maritalstatusDropdown, "next button click");
        TestUtil.click(married, "married click");
        TestUtil.click(continu, "Continue button click");
    }

    public void checkmarks() {
        WebCommands.staticSleep(3000);
        List<WebElement> AllCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        int size = AllCheckboxes.size();
        for (int i = 0; i < size; i++) {
            WebCommands.staticSleep(2000);
            AllCheckboxes.get(i).click();
        }
        TestUtil.click(continu, "continye clicked");
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
    }

    public void BajajSmartProfilePage() throws InterruptedException, IOException {
        GenderButtonClick("female");
        smoke_chewTobaco("no");
        datepicker("1985", "Dec", dateselect_1Dec);
        TestUtil.click(approxAmount, "");
        TestUtil.click(Amount_7to10lac, "7 to 10 lac amount select");
        TestUtil.click(next, "next button click");
        TestUtil.click(sumassuredamt, "");
        TestUtil.click(sumassuredamt_1_5Crs, "sum assured amt 1.5 Crs Selected");
        TestUtil.click(next, "next button click");
        leadpage.SaveLead(tl.NameGenerator());
    }

    public void BajajSmartResultPage() throws InterruptedException, IOException {
        leadpage.GotItButton();
        TestUtil.click(paymentFrequency, "");
        TestUtil.click(halfYearly, "Half yearly selected");
        TestUtil.click(coverAmount, "");
        WebCommands.staticSleep(5000);
        jse.executeScript("arguments[0].click()", coverAmt_1Crs);
        WebCommands.staticSleep(2000);
        TestUtil.click(maturityAge, "");
        TestUtil.click(maturityAge_50Yr, "Maturity Age 50 is selected");
        WebCommands.staticSleep(2000);
        WebCommands.staticSleep(3000);
        TestUtil.click(BajajAllianz, "view button Bajaj Allianz click");
        TestUtil.getFullPageScreenShot();
        js.executeScript("arguments[0].click();", buyNowButton);
        WebCommands.staticSleep(5000);
    }

    public String getUniqueID() throws InterruptedException {
        getUrl = driver.getCurrentUrl();
        System.out.println(getUrl);
        String[] result = getUrl.split("results/");
        System.out.println("Order ID = " + result[1]);
        orderID = result[1];
        WebCommands.staticSleep(2000);
        return orderID;
    }

}
