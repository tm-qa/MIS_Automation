package com.qa.turtlemint.pages.mintpro;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class QIS_Lead_Page extends TestBase {

    public String QuoteText;

    @FindBy(xpath = "//span[text()=' Back to Home']")
    WebElement BackToHome;

    @FindBy(xpath = "//button[text()='Ok']")
    WebElement ok;

    @FindBy(xpath = " //div[@class=\"input_wrapper\"]")
    WebElement ClicktoSearch;

    @FindBy(xpath = "//input[@type=\"text\"]")
    WebElement SearchByLeadname;

    @FindBy(xpath = "//div[@class=\"cardContainer\"]//div[@role=\"presentation\"]")
    WebElement Select;

    @FindBy(xpath = "//span[text()='Quote']")
    WebElement Quote;

    @FindBy(xpath = "//div[text()='Manually added quote * ']")
    WebElement verifyQuote;

    @FindBy(xpath = "//div[text()='Got It!']")
    WebElement GotItBtn;

    @FindBy(xpath = "//li[@ng-click=\"rejectManualQuote(insurer)\"]")
    WebElement ClickOnReject;
    @FindBy(xpath = "//textarea[@id=\"remarks\"]")
    WebElement SelectRemark;
    @FindBy(xpath = "//button[text()=\"Submit \"]")
    WebElement SubmitButton;
    @FindBy(xpath = "//div[text()='Rejected quote']")
    WebElement Rejectassert;


    public QIS_Lead_Page() {
        PageFactory.initElements(driver, this);
    }


    public void leadPageVerificationForQIS(String LeadName) throws IOException {
        WebCommands.staticSleep(3000);
        TestUtil.click(ClicktoSearch, "");
        TestUtil.sendKeys(SearchByLeadname, LeadName, "Lead searched");
        WebCommands.staticSleep(6000);
        SearchByLeadname.sendKeys(Keys.RETURN);
        WebCommands.staticSleep(5000);
        TestUtil.click(Select, "Lead selected");
        WebCommands.staticSleep(30000);
        //   waitUntilTextToPresent(Quote, "Quote","Quote is displayed");
        TestUtil.click(Quote, "Clicked on Quote");
        WebCommands.staticSleep(10000);
        GotItBtn.click();
        WebCommands.staticSleep(10000);

    }

    public void reject() {
        TestUtil.click(ClickOnReject, "Reject 1 Quotes");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        TestUtil.sendKeys(SelectRemark, "Rejected Quotes for automation test", "Quotes Rejected");
        TestUtil.click(SubmitButton, "Quotes Rejected");
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
        Assert.assertEquals(Rejectassert.getText(), "Rejected quote\n" +
                "Car details");
        TestUtil.getScreenShot();

    }


}
