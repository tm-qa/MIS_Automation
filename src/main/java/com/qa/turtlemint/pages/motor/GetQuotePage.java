package com.qa.turtlemint.pages.motor;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.four_wheeler.FW_RegistrationInfoPage;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.qa.turtlemint.util.TestUtil.waitUntilTextToPresent;

public class GetQuotePage extends TestBase {

    public String reg;
    TestUtil tl = new TestUtil();

    public GetQuotePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type='text']")
    WebElement EnterRegNum;

    @FindBy(xpath = "//button[text()=' Get Quote']")
    WebElement ClickGetQuote;

    @FindBy(xpath = "//div[text()='Quote With Photo of RC Copy, Previous policy']")
    WebElement QuoteWithRC;

    @FindBy(xpath = "//span[text()='New Vehicle']")
    WebElement NewVehicle;

    @FindBy(xpath = "//span[text()='Renewal']")
    WebElement ReNewVehicle;

    @FindBy(xpath = "//span[text()='No']")
    WebElement No;

    @FindBy(xpath = "//input[@id=\"registrationNo\"]")
    WebElement RegNo;

    @FindBy(xpath = "//button[text()='Submit']")
    WebElement submit;

    @FindBy(xpath = "//button[text()='×']")
    WebElement xbtn;

    @FindBy(xpath = "//button[text()=' I am ready to issue policy']")
    WebElement DirectIssuance;

    @FindBy(xpath = "(//input[@type='file'])[2]")
    WebElement UploadFile2;


    public void createQuoteWithRCCopy() {
       WebCommands.staticSleep(10000);
        TestUtil.click(QuoteWithRC, "QIS flow started");
    }

    public void Quote_in_a_SnapForNew() {
        TestUtil.click(NewVehicle, "New Vehicle Selected");
       TestUtil.uploadFile("ubuntu");
      //  TestUtil.uploadFile("pavangadewar");
        TestUtil.click(submit, "Submit succesfully");
        TestUtil.click(xbtn, "close");

    }

    public void Quote_in_a_SnapForRenew() throws Exception
    {
        TestUtil.click(ReNewVehicle, "New Vehicle Selected");
        TestUtil.uploadFile("ubuntu"); //commenting for local
      // TestUtil.uploadFile("");
        WebCommands.staticSleep(2000);
        UploadFile2.sendKeys("/home/ubuntu/storage/dog.png");
    //  UploadFile2.sendKeys("/Users/pavangadewar/Downloads/Test.png");
        LogUtils.info("File Upload successfully");
        TestUtil.click(No, "No select");
        tl.GenerateRegNo();
        TestUtil.sendKeys(RegNo, tl.RegNo, "");
        TestUtil.click(submit, "Submit successfully");
        TestUtil.click(xbtn, "close");
        Thread.sleep(5000);
    }
}