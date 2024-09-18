package com.qa.turtlemint.pages.ninja;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Ninja_QIS extends TestBase {

    public String p;
    public String c;

    public String mintproW;
    public String ninjaW;
    public String ninjasignupW;
    public String SolvedID;
    public String SolvedOrderID;


    @FindBy(xpath = "//span/a[@id='google-signin-button']")
    WebElement SignInbtn;

    @FindBy(xpath = "//input[@type='email']")
    WebElement Email;

    @FindBy(xpath = "//span[text()='Next']")
    WebElement Nextbtn1;

    @FindBy(xpath = "//div[@id='password']/div/div/div/input[@type='password']")
    WebElement Password;

    @FindBy(xpath = "//div[@id='passwordNext']")
    WebElement Nextbtn2;

    @FindBy(xpath = "//a[@data-auto=\"qis-module\"]")
    WebElement QuoteRequest;

    @FindBy(xpath = "//td[text()=\"automationtesting@turtlemint.com\"]//parent::tr//span[text()='New']")
    WebElement ActionReqQIS;

    @FindBy(xpath = "//button[text()='OWN']")
    WebElement OWNbtn;

    @FindBy(xpath = "(//span[text()='Tag this file'])[2]")
    WebElement FileTag;

    @FindBy(xpath = "//div[text()='untagged']")
    WebElement untagged;

    @FindBy(xpath = "(//md-radio-button[@value=\"POLICY\"])[2]")
    WebElement PolicySelect;

    @FindBy(xpath = "//button[text()='Continue']")
    WebElement Continue;

    @FindBy(xpath = "//button[text()=' ADD NEW ']")
    WebElement addNewClick;

    @FindBy(xpath = " //select[@id=\"manual-email\"]")
    WebElement addQuote;

    @FindBy(xpath = "//option[text()='KOTAK']")
    WebElement kotakSelect;

    @FindBy(xpath = "//option[text()='NINA']")
    WebElement NINASelect;

    @FindBy(xpath = "//input[@id=\"manualIDV\"]")
    WebElement manualIDVPrice;

    @FindBy(xpath = "//input[@id=\"manualFinalPremium\"]")
    WebElement manualFinalPremiumPrice;

    @FindBy(xpath = "//span[text()='Select Addons']")
    WebElement selectAddonDropdown;

    @FindBy(xpath = "//input[@id=\"zeroDep\"]")
    WebElement zeroDepSelect;

    @FindBy(xpath = "//span[text()='1 addon(s) selected']")
    WebElement addonselected;

    @FindBy(xpath = "//button[@id=\"add-quote\"]")
    WebElement quoteAdded;

    @FindBy(xpath = "//button[text()='Close']")
    WebElement closeBtn;

    @FindBy(xpath = "//md-input-container[contains(text(),'Status')]")
    WebElement Statusclick;

    @FindBy(xpath = "(//div[contains(text(),'New Request')])[2]")
    WebElement newRequest;

    @FindBy(xpath = "(//div[contains(text(),' Open Request')])[2]")
    WebElement openRequest;

    @FindBy(xpath = "//div[contains(text(),'Solved Request')]")
    WebElement SolvedRequest;

    @FindBy(xpath = "//button[@data-auto='status-apply-filter']")
    WebElement apply;

    @FindBy(xpath = "//td[text()=\"automationtesting@turtlemint.com\"]//parent::tr//span[text()='Solved']")
    WebElement SolvedPolicySelect;

    @FindBy(xpath = "//p[text()=' I do not have a registration number ']")
    WebElement DoNotHaveRegNO;
    @FindBy(xpath = "//span[text()=' Back to Home']")
    WebElement BackToHome;
    @FindBy(xpath = "//button[text()='Ok']")
    WebElement ok;



    public Ninja_QIS() {
        PageFactory.initElements(driver, this);
    }


    public void NinjaLogin(String NinjaEmail, String NinjaPassword) throws Exception {

      driver.get(System.getProperty("url"));  //for running on jenkins uncomment this line of code
    //    driver.get(prop.getProperty("localninjaurl"));
        WebCommands.staticSleep(4000);
        LogUtils.info("Ninja Website Opened");
        String strUrl = driver.getCurrentUrl();
        LogUtils.info("Opened Website: " + strUrl);

        SignInbtn.click();
        LogUtils.info("Clicked on Sign In with Google Button");

        Set<String> allWindowHandles = driver.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<String>(allWindowHandles);
        System.out.println("No. of tabs: " + tabs.size());

        if (tabs.size() <= 2) {
            Set<String> windows = driver.getWindowHandles();
            Iterator<String> it = windows.iterator();
            p = it.next();
            c = it.next();
            driver.switchTo().window(c);
        } else {
            Set<String> windows = driver.getWindowHandles();
            Iterator<String> it = windows.iterator();
            mintproW = it.next();
            ninjaW = it.next();
            ninjasignupW = it.next();
            driver.switchTo().window(ninjasignupW);
        }
        LogUtils.info("Switched to child window");
        Email.sendKeys(NinjaEmail);
        LogUtils.info("Email Entered");
        Nextbtn1.click();
        LogUtils.info("Clicked on Next button");
        Password.sendKeys(NinjaPassword);
        LogUtils.info("Password entered");
        Nextbtn2.click();
        WebCommands.staticSleep(3000);
        LogUtils.info("Clicked on Next button after password");
        if (tabs.size() <= 2) {
            driver.switchTo().window(p);
        } else {
            driver.switchTo().window(ninjaW);
        }
        LogUtils.info("Switched Back to Parent window");
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
    }

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void ninjaQISFlowForNew() throws Exception {
        WebCommands.staticSleep(10000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        WebCommands.staticSleep(5000);
        NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        WebCommands.staticSleep(5000);
        TestUtil.click(QuoteRequest, "Quote Request Selected");
        WebCommands.staticSleep(20000);
        TestUtil.click(ActionReqQIS, "New button Clicked");
        WebCommands.staticSleep(3000);
        TestUtil.click(OWNbtn, "OWN Clicked ");
        WebCommands.staticSleep(12000);
        js.executeScript("arguments[0].click();", FileTag);
        //   TestUtil.click(FileTag, "");
        WebCommands.staticSleep(1000);
        TestUtil.click(PolicySelect, "Policy selected");
        WebCommands.staticSleep(1000);
        TestUtil.click(Continue, "continue button clicked");
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
        driver.switchTo().frame(0);
        TestUtil.getScreenShot();
        WebCommands.staticSleep(3000);
        js.executeScript("arguments[0].click();", DoNotHaveRegNO);

    }

    public void ninjaQISFlowForRenew() throws Exception
    {
        driver.switchTo().newWindow(WindowType.WINDOW);
        WebCommands.staticSleep(2000);
        NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(QuoteRequest, "Quote Request Selected");
        WebCommands.staticSleep(20000);
        TestUtil.click(ActionReqQIS, "New button Clicked");
        WebCommands.staticSleep(3000);
        TestUtil.click(OWNbtn, "OWN Clicked ");
        WebCommands.staticSleep(12000);
        js.executeScript("arguments[0].click();", FileTag);
        WebCommands.staticSleep(1000);
        TestUtil.click(PolicySelect, "Policy selected");
        WebCommands.staticSleep(1000);
        TestUtil.click(untagged, "");
        WebCommands.staticSleep(2500);
        js.executeScript("arguments[0].click();", FileTag);
        WebCommands.staticSleep(1000);
        TestUtil.click(PolicySelect, "Policy selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(Continue, "continue button clicked");
        WebCommands.staticSleep(3000);
        driver.switchTo().frame(0);
        WebCommands.staticSleep(6000);
        js.executeScript("arguments[0].click();", DoNotHaveRegNO);
    }

    public void addQuote() throws Exception {
        driver.switchTo().frame(0);
        WebCommands.staticSleep(2000);
        TestUtil.click(addNewClick, "Add Nw clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(addQuote, "");
        WebCommands.staticSleep(1000);
        TestUtil.click(kotakSelect, "Kotak Select");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(manualIDVPrice, "10", "Amount fillup");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(manualFinalPremiumPrice, "1", "manual Final Premium Price amount fillup");
        WebCommands.staticSleep(1000);
        TestUtil.click(selectAddonDropdown, "");
        WebCommands.staticSleep(1000);
        TestUtil.click(zeroDepSelect, "zero Dep Select");
        TestUtil.click(addonselected, "");
        TestUtil.click(quoteAdded, "");
        WebCommands.staticSleep(2000);
        TestUtil.click(closeBtn, "Successfully added quote");
        WebCommands.staticSleep(10000);

    }

    public void addQuoteforFW() {
        driver.switchTo().frame(0);
        WebCommands.staticSleep(2000);
        TestUtil.click(addNewClick, "Add Nw clicked");
        WebCommands.staticSleep(1000);
        TestUtil.click(addQuote, "");
        WebCommands.staticSleep(1000);
        TestUtil.click(kotakSelect, "Kotak Select");
        WebCommands.staticSleep(1000);
        manualIDVPrice.clear();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(manualIDVPrice, "10", "Amount fillup");
        WebCommands.staticSleep(4000);
        manualFinalPremiumPrice.clear();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(manualFinalPremiumPrice, "1", "manual Final Premium Price amount fillup");
        WebCommands.staticSleep(2000);
        TestUtil.click(quoteAdded, "1st Quotes Added");
        WebCommands.staticSleep(10000);
        TestUtil.click(addNewClick, "Add Nw clicked");
        WebCommands.staticSleep(1000);
        TestUtil.click(addQuote, "");
        WebCommands.staticSleep(1000);
        TestUtil.click(NINASelect, "NINA Select");
        WebCommands.staticSleep(1000);
        manualIDVPrice.clear();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(manualIDVPrice, "10", "Amount fillup");
        WebCommands.staticSleep(4000);
        manualFinalPremiumPrice.clear();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(manualFinalPremiumPrice, "10", "manual Final Premium Price amount fillup");
        WebCommands.staticSleep(2000);
        TestUtil.click(quoteAdded, "");
        WebCommands.staticSleep(4000);
        TestUtil.click(closeBtn, "Successfully added quote");
        WebCommands.staticSleep(10000);


    }

    public void checkstatus() {
        TestUtil.click(Statusclick, "Status clicked");
        WebCommands.staticSleep(8000);
        TestUtil.click(newRequest, "");
        WebCommands.staticSleep(3000);
        TestUtil.click(openRequest, "");
        WebCommands.staticSleep(3000);
        TestUtil.click(SolvedRequest, "Solved Request selected");
        WebCommands.staticSleep(3000);
        TestUtil.click(apply, "Apply");
        WebCommands.staticSleep(10000);
        TestUtil.click(SolvedPolicySelect, "Solved policy select for verification");
        WebCommands.staticSleep(8000);
    }

    public void assertSolved(String uID) throws InterruptedException {
        WebCommands.staticSleep(5000);
        SolvedID = driver.getCurrentUrl();
        String[] result = SolvedID.split("result/");
        System.out.println("Solved ID = " + result[1]);
        SolvedOrderID = result[1];
        WebCommands.staticSleep(3000);
        Assert.assertEquals(SolvedOrderID, uID);
        driver.close();


    }

    public void switchToMintPro() {
        WebCommands.staticSleep(3000);
        driver.switchTo().window(mintproW);
        WebCommands.staticSleep(1000);
        WebCommands.staticSleep(3000);
        TestUtil.click(BackToHome, "Back to Home page");
        TestUtil.click(ok, "Back to Home page");
        WebCommands.staticSleep(6000);
    }





}
