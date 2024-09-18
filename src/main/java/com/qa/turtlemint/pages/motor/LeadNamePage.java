package com.qa.turtlemint.pages.motor;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.qa.turtlemint.util.TestUtil.waitUntilTextToPresent;

public class LeadNamePage extends TestBase {

    public LeadNamePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='customerName']")
    WebElement name;

    @FindBy(id = "container-next-btn")
    WebElement NextButton;


    public void SaveLead(String LeadName) throws InterruptedException {

        name.sendKeys(LeadName);
        LogUtils.info("All Details Filled and Lead Name Entered");
        NextButton.click();
        WebCommands.staticSleep(2000);
    }
}

