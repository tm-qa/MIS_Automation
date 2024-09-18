package com.qa.turtlemint.pages.QuoteRequestPage;

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


public class FWandCVQuotesRequestPage extends TestBase {

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

    @FindBy(xpath = "(//div[@class='layout-column']//span[@class='ng-binding ng-scope'][normalize-space()='Tag this file']")
    WebElement FileTag;

    @FindBy(xpath = "//div[text()='untagged']")
    WebElement untagged;

    @FindBy(xpath = "(//md-radio-button[@id='radio_24380']")
    WebElement PolicySelect;

    @FindBy(xpath = "//button[text()='Continue']")
    WebElement Continue;

    @FindBy(xpath = "//button[text()=' ADD NEW ']")
    WebElement addNewClick;

    @FindBy(xpath = " //select[@id=\"manual-email\"]")
    WebElement addQuote;

    @FindBy(xpath = "//option[text()='KOTAK']")
    WebElement kotakSelect;

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

    @FindBy(xpath = "//div[text()[normalize-space()='New Request']]")
    WebElement newRequest;

    @FindBy(xpath = "(//div[text()[normalize-space()='Open Request']]")
    WebElement openRequest;

    @FindBy(xpath = "//div[contains(text(),'Solved Request')]")
    WebElement SolvedRequest;

    @FindBy(xpath = "//button[@data-auto='status-apply-filter']")
    WebElement apply;

    @FindBy(xpath = "//td[text()=\"automationtesting@turtlemint.com\"]//parent::tr//span[text()='Solved']")
    WebElement SolvedPolicySelect;

    @FindBy(xpath = "//p[text()=' I do not have a registration number ']")
    WebElement DoNotHaveRegNO;


    public FWandCVQuotesRequestPage() {
        PageFactory.initElements(driver, this);
    }


    public void NinjaLogin(String NinjaEmail, String NinjaPassword) throws Exception {

        //   driver.get("https://ninja.sanity.planturtle.com/login");                ////oldsanityURL
        //  driver.get(prop.getProperty("ninjasanityurl"));
        //    driver.get("https://ninja.sanity.turtle-feature.com/login");      ////sanityURL
        driver.get("https://ninja.turtlemint.com/login");                 ////ProdURL
        //  driver.get("https://ninja.pulse.turtle-feature.com/login");           ////Pulse
        //  driver.get("https://ninja.spectre.turtle-feature.com/login");              //spectre motor


        WebCommands.staticSleep(2000);
        LogUtils.info("Ninja Website Opened");
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



    public void addQuote() throws Exception {
        driver.switchTo().frame(0);
        WebCommands.staticSleep(2000);
        TestUtil.click(addNewClick, "Add Nw clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(addQuote, "");
        WebCommands.staticSleep(1000);
        TestUtil.click(kotakSelect, "Kotak Select");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(manualIDVPrice, "10000", "Amount fillup");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(manualFinalPremiumPrice, "400", "manual Final Premium Price amount fillup");
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



}




