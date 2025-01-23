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

    @FindBy(id = "policyStatus")
    WebElement policyStatus;

    @FindBy(xpath = "//div[text()='Junk']")
    WebElement junk;

    @FindBy(id = "comments")
    WebElement comentforJunk;

    @FindBy(xpath = "//button[text()='Save Sale']")
    WebElement SaveSale;

    @FindBy(xpath = "//span[text()='Junk']")
    WebElement junkassert;

    @FindBy(xpath = "//input[@placeholder=\"Search by Policy No. or Registration No. (min. 4 chars)\"]")
    WebElement search;

    @FindBy(xpath = "//div[@class=\"sc-fHjqPf iFCspv\"]")
    public WebElement policyCkicked;

    @FindBy(xpath = "//button[@data-auto=\"yes-mis-button\"]")
    public WebElement Yes;

    @FindBy(xpath = "//input[@id=\"policyDetailsId\"]")
    public WebElement idBI;

    @FindBy(xpath = "(//a[@data-auto=\"mis-module\"])[2]")
    WebElement MIS;



    public void JunkPolicy(String misID) {
        TestUtil.sendKeys(search,misID,"search policy entered");
        TestUtil.sendKeys(search, String.valueOf(Keys.RETURN),"entered");
        TestUtil.getScreenShot();
        TestUtil.click(policyCkicked,"clicked on policy");

        try {
            TestUtil.click(closeButton , "click on close button");
            TestUtil.click(Edit,"Edit button clicked");
        }catch (Exception e){
            TestUtil.click(Edit,"Edit button clicked");
        }
        WebCommands.staticSleep(2000);
        TestUtil.click(policyStatus,"policy Status clicked");
        WebCommands.staticSleep(1000);
        TestUtil.click(junk,"junk selected");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(comentforJunk,"Dummy policy for Automation Test","comment entered");
        TestUtil.click(SaveSale,"Save sale clicked");
        WebCommands.staticSleep(2000);
        Assert.assertEquals(junkassert.getText(),"Junk");
        System.out.println("Policy "+misID+" Successfully junked");
    }

    public void JunkPolicyBI(String misID) {


        // driver.get(System.getProperty("ninjaurl"));
        driver.get(prop.getProperty("ninjaurl"));

        TestUtil.click(MIS, "MIS Selected");
        TestUtil.sendKeys(search,misID,"search policy entered");
        TestUtil.sendKeys(search, String.valueOf(Keys.RETURN),"entered");
        TestUtil.getScreenShot();

        WebCommands.staticSleep(10000);

        TestUtil.click(driver.findElement(By.xpath("//p[text()='"+misID+"']//..//..")),"");
       // TestUtil.click(policyCkicked,"clicked on policy");

        try {
            TestUtil.click(closeButton , "click on close button");
            TestUtil.click(EditLife,"Edit button clicked");
        }catch (Exception e){
            TestUtil.click(EditLife,"Edit button clicked");
        }
        WebCommands.staticSleep(2000);
        TestUtil.click(policyStatus,"policy Status clicked");
        WebCommands.staticSleep(1000);
        TestUtil.click(junk,"junk selected");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(comentforJunk,"Dummy policy for Automation Test","comment entered");
        TestUtil.click(SaveSale,"Save sale clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(Yes,"Yes clicked");
        WebCommands.staticSleep(2000);
        Assert.assertEquals(junkassert.getText(),"Junk");
        System.out.println("********************Policy--- "+misID+"    ************** Successfully junked");
    }


}
