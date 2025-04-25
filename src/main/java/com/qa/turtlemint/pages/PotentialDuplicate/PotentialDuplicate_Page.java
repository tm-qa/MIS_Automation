package com.qa.turtlemint.pages.PotentialDuplicate;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.testng.Assert;

import java.io.IOException;

public class PotentialDuplicate_Page extends TestBase {

    @FindBy(xpath = "//span[text()=\"Potential Duplicate\"]")
    WebElement potentialDuplicate;


    @FindBy(xpath = "//label[@title=\"Policy Status\"]//..//..//following-sibling::div")
    WebElement getPolicyStatus;

    @FindBy(xpath = "//div[text()='Pending from TM']")
    WebElement junk;

    @FindBy(xpath = "//p[text()=\"Warning! Duplicate Policy Detected\"] | //div[text()=\"A duplicate has been detected on the registration number provided.\"]")
    WebElement warningMsg;

    @FindBy(xpath = "//*[@data-icon=\"close\"]")
    WebElement dublocatePopup;

    @FindBy(xpath = "//label[@title=\"Insurer\"]//..//..//following-sibling::div")
    WebElement insurer;

    @FindBy(xpath = "//div[@title=\"New India\"]")
    WebElement newIndia;


    @FindBy(id = "Health_issuanceDate")
    WebElement healthIssuanceDate;

    @FindBy(id="Motor_issuanceDate")
    WebElement motorIssuanceDate;

    @FindBy(xpath = "//*[@data-icon=\"close\"]")
    WebElement closeButton;

    @FindBy(xpath = "//img[@alt=\"Edit\"]")
    WebElement Edit;

    public PotentialDuplicate_Page() {
        PageFactory.initElements(driver, this);
    }

    public void setPotentialDuplicate() throws IOException {
        try {
            TestUtil.click(closeButton, "click on close button");
            TestUtil.click(Edit, "Edit button clicked");
        } catch (Exception e) {
            TestUtil.click(Edit, "Edit button clicked");
        }WebCommands.staticSleep(2000);
        String potentialD = potentialDuplicate.getText();
        System.out.println(potentialD);
        WebCommands.staticSleep(2000);
        Assert.assertEquals(potentialD , "Potential Duplicate");
        TestUtil.click(getPolicyStatus,"click on get policy status");
        WebCommands.staticSleep(1000);
        TestUtil.click(junk , "click on junk");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        String wasrning = warningMsg.getText();
        System.out.println(wasrning);
        WebCommands.staticSleep(2000);
        Assert.assertEquals(wasrning , "Warning! Duplicate Policy Detected");
        TestUtil.click(dublocatePopup , "click on dupl");
        TestUtil.click(insurer , "click on insurer");
        TestUtil.click(newIndia , "click on insurer");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();;
        Assert.assertEquals(wasrning , "Warning! Duplicate Policy Detected");
        TestUtil.click(dublocatePopup , "click on dupl");

    }


}


