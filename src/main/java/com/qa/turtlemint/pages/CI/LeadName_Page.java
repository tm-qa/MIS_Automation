package com.qa.turtlemint.pages.CI;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
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

    @FindBy(xpath = "//button[.='Got it']")
    WebElement GotItBtn;

    public void SaveLead(String LeadName) throws InterruptedException {
        name.sendKeys(LeadName);
        LogUtils.info("All Details Filled and Lead Name Entered");
        WebCommands.staticSleep(1500);
        NextButton.click();
        WebCommands.staticSleep(10000);
    }

    public static void JsClick(WebElement element, String msg)
    {
        WebCommands.staticSleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",element );
        LogUtils.info(msg);

    }
    public void GotItButton() throws InterruptedException, IOException {

        try {
            if(GotItBtn.isDisplayed()){
                JsClick(GotItBtn,"clicked on GotItBtn");
            }
            else{
                LogUtils.info("GotItBtn is not disaplayed");
            }
        } catch (Exception e) {
            e.getMessage();
        }


    }
}
