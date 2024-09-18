package com.qa.turtlemint.pages.motor;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static com.qa.turtlemint.util.TestUtil.waitUntilTextToPresent;

public class ResultPageCommonElements extends TestBase {

    public String HeaderText;
    public String getUrl;
    public String orderID;
    public String ncbText;

    public ResultPageCommonElements() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Share Results']")
    WebElement ShareResultsBtn;

    @FindBy(xpath = "//input[@name='userNumber'][@type='number']")
    WebElement EnterMobileNumber;

    @FindBy(xpath = "//input[@id='mobileSubmit'][@type='submit']")
    WebElement SendSmsBtn;

    @FindBy(xpath = "//input[@name='email']")
    WebElement EnterEmail;

    @FindBy(xpath = "//button[@id='copyurl']")
    WebElement CopyUrlBtn;

    @FindBy(xpath = "//p[text()=' Link copied to clipboard ']")
    WebElement UrlCopiedText;

    @FindBy(xpath = "//input[@placeholder='Link']")
    WebElement copyURlLink;

    @FindBy(xpath = "//span[text()='Check Activity Points']")
    WebElement actpoint;


    @FindBy(xpath = "//h4[text()='Activity Points Sheet']")
    WebElement Activity_point_verify;

    @FindBy(xpath = "//div[@class=\"dialog-headding modal-header\"]//button")
    WebElement checkpointclosebtn;



    public void SharePlan(String number, String email) throws InterruptedException {
        TestUtil.click(ShareResultsBtn, "Share result button clicked");
        TestUtil.sendKeys(EnterMobileNumber, number, "Mobile Number Entered");
        TestUtil.sendKeys(EnterEmail, email, "Email Entered");
        TestUtil.click(CopyUrlBtn, "Url Copied");
        HeaderText = UrlCopiedText.getText();
        Assert.assertEquals("Link copied to clipboard", HeaderText);
        TestUtil.click(SendSmsBtn, "Quotes shared over SMS");
        String url = copyURlLink.getText();
        LogUtils.info("Copied URL is: " + url);
        WebCommands.staticSleep(2000);
    }

    public void CheckActivityPoints() throws InterruptedException {
        TestUtil.click(actpoint, "CheckActivityPoints Button Clicked");
        WebCommands.staticSleep(2000);
        String expectedResult = Activity_point_verify.getText();
        String actualResult = "Activity Points Sheet";
        Assert.assertEquals(expectedResult, actualResult);
        LogUtils.info("Activity Point verify: " + expectedResult);
        WebCommands.staticSleep(2000);
        TestUtil.click(checkpointclosebtn, "Close Button Clicked");
        WebCommands.staticSleep(2000);
        Actions act = new Actions(driver);
        act.sendKeys(Keys.HOME).build().perform();
        WebCommands.staticSleep(2000);
    }

    public String getUniqueIDForQIS() throws InterruptedException {
        getUrl = driver.getCurrentUrl();
        String[] result = getUrl.split("result/");
        System.out.println("Order ID = " + result[1]);
        orderID = result[1];
        WebCommands.staticSleep(2000);
        return orderID;
    }

}