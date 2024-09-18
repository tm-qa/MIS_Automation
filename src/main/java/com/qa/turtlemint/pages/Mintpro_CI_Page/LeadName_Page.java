package com.qa.turtlemint.pages.Mintpro_CI_Page;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LeadName_Page extends TestBase {
    public LeadName_Page() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement name;

    @FindBy(xpath = "//span[text()='Next']")
    WebElement NextButton;

    @FindBy(xpath = "//Button[text()='OK, GOT IT!']")
    WebElement OkGotItBtn;

    @FindBy(xpath = "//button[text()='Got it!']")
    WebElement GotItBtn;

    public void SaveLead(String LeadName) throws InterruptedException {
        name.sendKeys(LeadName);
        LogUtils.info("All Details Filled and Lead Name Entered");
        WebCommands.staticSleep(1500);
        NextButton.click();
        WebCommands.staticSleep(10000);
    }

    public void GotItButton() throws InterruptedException, IOException {
        WebCommands.staticSleep(7000);
        TestUtil.click(OkGotItBtn, "GotItBtn clicked");
        WebCommands.staticSleep(3000);
        TestUtil.click(GotItBtn, "Another Got It Clicked");
        WebCommands.staticSleep(10000);
        TestUtil.getFullPageScreenShot();
    }
}
