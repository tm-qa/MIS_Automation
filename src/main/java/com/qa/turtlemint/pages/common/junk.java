package com.qa.turtlemint.pages.common;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class junk extends TestBase {

    public junk() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@data-icon=\"close\"]")
    WebElement closeButton;

    @FindBy(xpath = "//img[@alt=\"Edit\"]")
    WebElement Edit;

    @FindBy(xpath = "//button[@data-auto=\"edit-mis-button\"]")
    WebElement EditLife;

    @FindBy(xpath = "//*[@id=\"Life_status\"]//..//following-sibling::span")
    WebElement policyStatus;

    @FindBy(xpath = "//div[text()='Junk']")
    WebElement junk;

    @FindBy(xpath = "//input[@name=\"opsDetail.comments\"]")
    WebElement comentforJunk;

    @FindBy(id = "opsDetail.comments")
    WebElement motorComment;

    @FindBy(xpath = "//button[text()='Save Sale']")
    WebElement SaveSale;

    @FindBy(xpath = "//span[text()='Junk']")
    WebElement junkassert;

    @FindBy(xpath = "//input[@placeholder=\"Search by Policy No. or Registration No. (min. 4 chars)\"]")
    WebElement search;

    @FindBy(xpath = "//input[@data-auto=\"search-input-nav\"]")
    WebElement policysearch;

    @FindBy(xpath = "//div[@class=\"sc-fHjqPf iFCspv\"]")
    public WebElement policyCkicked;

    @FindBy(xpath = "//button[@data-auto=\"yes-mis-button\"]")
    public WebElement Yes;

    @FindBy(xpath = "//input[@id=\"policyDetailsId\"]")
    public WebElement idBI;

    @FindBy(xpath = "//span[@class=\"pageTitle ng-binding\"]")
    public WebElement policyID;

    @FindBy(xpath = "(//a[@data-auto=\"mis-module\"])[2]")
    WebElement MIS;

    @FindBy(xpath = "//span[text()='mr automation test']//..//..")
    WebElement policyselectAutomation;

    @FindBy(xpath = "//*[@id=\"Motor_status\"]//..//following-sibling::span")
    WebElement motorstatus;


    public void JunkPolicy(String misID) {
        TestUtil.sendKeys(search, misID, "search policy entered");
        TestUtil.sendKeys(search, String.valueOf(Keys.RETURN), "entered");
        TestUtil.getScreenShot();
        TestUtil.click(policyCkicked, "clicked on policy");

        try {
            TestUtil.click(closeButton, "click on close button");
            TestUtil.click(Edit, "Edit button clicked");
        } catch (Exception e) {
            TestUtil.click(Edit, "Edit button clicked");
        }
        WebCommands.staticSleep(2000);
        TestUtil.click(policyStatus, "policy Status clicked");
        WebCommands.staticSleep(1000);
        TestUtil.click(junk, "junk selected");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(comentforJunk, "Dummy policy for Automation Test", "comment entered");
        TestUtil.click(SaveSale, "Save sale clicked");
        WebCommands.staticSleep(2000);
        Assert.assertEquals(junkassert.getText(), "Junk");
        System.out.println("Policy " + misID + " Successfully junked");
    }

    public void JunkPolicyBI(String misID, String tw_fw) {


        // driver.get(System.getProperty("ninjaurl"));
        driver.get(prop.getProperty("ninjaurl"));

        TestUtil.click(MIS, "MIS Selected");
        TestUtil.sendKeys(search, misID, "search policy entered");
        TestUtil.sendKeys(search, String.valueOf(Keys.RETURN), "entered");
        TestUtil.getScreenShot();

        WebCommands.staticSleep(10000);

        TestUtil.click(driver.findElement(By.xpath("//p[text()='" + misID + "']//..//..")), "");
        // TestUtil.click(policyCkicked,"clicked on policy");


        if (tw_fw == "TW" || tw_fw == "FW") {

            TestUtil.click(Edit, "Edit button clicked");
        } else {

            try {
                TestUtil.click(closeButton, "click on close button");
                TestUtil.click(EditLife, "Edit button clicked");
            } catch (Exception e) {
                TestUtil.click(Edit, "Edit button clicked");
            }
        }


        WebCommands.staticSleep(2000);


        if (tw_fw == "TW" || tw_fw == "FW") {

            TestUtil.click(motorstatus, "motorstatus clicked");
        } else {

            TestUtil.click(policyStatus, "policy Status clicked");
        }

        WebCommands.staticSleep(1000);
        TestUtil.click(junk, "junk selected");
        WebCommands.staticSleep(1000);

        if (tw_fw == "TW" || tw_fw == "FW") {
            TestUtil.sendKeys(motorComment, "Dummy policy for Automation Test", "comment entered for junk");
        } else {
            TestUtil.sendKeys(comentforJunk, "Dummy policy for Automation Test", "comment entered for junk");
        }
        WebCommands.staticSleep(2000);

        TestUtil.click(SaveSale, "Save sale clicked");
        WebCommands.staticSleep(2000);
        try {

        } catch (Exception e) {
            TestUtil.click(Yes, "Yes clicked");

        }
        WebCommands.staticSleep(2000);
        Assert.assertEquals(junkassert.getText(), "Junk");
        System.out.println("********************Policy--- " + misID + "    ************** Successfully junked");
    }

    public void policyid(String policyid) {
        TestUtil.sendKeys(policysearch, policyid, "search policy entered");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(policysearch, String.valueOf(Keys.RETURN), "entered");
        TestUtil.getScreenShot();

        WebCommands.staticSleep(10000);
        TestUtil.click(policyselectAutomation, "automation policy select");
        WebCommands.staticSleep(5000);
    }


}
