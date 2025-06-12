package com.qa.turtlemint.pages.login;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='google-signin-button']")
    WebElement SignInbtn;

    @FindBy(xpath = "//input[@type=\"email\"]")
    WebElement emailgoogle;

    @FindBy(xpath = "//input[@type=\"password\"]")
    WebElement passworgoogle;

    @FindBy(xpath = "(//a[@data-auto=\"mis-module\"])[2]")
    WebElement MIS;

    @FindBy(xpath = "//a[@data-auto=\"pi-module\"]")
    WebElement PI;

    @FindBy(xpath = "//input[@aria-label=\"Employee ID\"]")
    WebElement Employe;

    @FindBy(name = "mobileNumber")
    WebElement MobileNumber;

    @FindBy(xpath = "//span[text()='GET OTP']")
    WebElement GetOTP;

    @FindBy(xpath = "//input[@class='OTPInput']")
    WebElement OTPField;

    @FindBy(xpath = "//span[text()='Verify OTP']")
    WebElement VerifyOTPBtn;

    @FindBy(xpath = "//span[text()='Sell']")
    WebElement SellBtn;

    @FindBy(xpath = "//input[@id='customerName']")
    WebElement name;

    @FindBy(xpath = "//input[@placeholder=\"Name\"]")
    WebElement name1;

    @FindBy(xpath = "//span[text()='Next']//parent::button")
    WebElement NextButton1;

    @FindBy(id = "container-next-btn")
    WebElement NextButton;
    public void NinjaLogin() throws InterruptedException {
        driver.get("https://accounts.google.com/");
        WebCommands.staticSleep(3000);

        TestUtil.sendKeys(emailgoogle, "automationtesting@turtlemint.com", "email Id entered");
        WebCommands.staticSleep(3000);
        TestUtil.sendKeys(emailgoogle, String.valueOf(Keys.RETURN), "email Id entered");
        WebCommands.staticSleep(3000);
        TestUtil.sendKeys(passworgoogle, "Turtle@2k25", "Password entered");
        WebCommands.staticSleep(3000);
        TestUtil.sendKeys(passworgoogle, String.valueOf(Keys.RETURN), "Password entered");
        WebCommands.staticSleep(8000);


        try {
            Thread.sleep(3000);
            TestUtil.getScreenShot();
            TestUtil.sendKeys(Employe, "FBS4825", "Employee ID entered");
            Thread.sleep(3000);
            TestUtil.sendKeys(Employe, String.valueOf(Keys.RETURN), "Password entered");

            Thread.sleep(10000);

        }catch (Exception e){
            System.out.println("******");
        }


        TestUtil.getScreenShot();
       driver.get(System.getProperty("ninjaurl"));
//       driver.get(prop.getProperty("ninjaurl"));
        System.out.println(driver.getCurrentUrl());
        WebCommands.staticSleep(4000);
        TestUtil.click(SignInbtn, "Sign in button clicked");
        WebCommands.staticSleep(4000);
        driver.switchTo().frame(0);
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
        WebCommands.staticSleep(8000);
        TestUtil.getScreenShot();
    }

    public void ninja_MIS() throws Exception {
        NinjaLogin();
        TestUtil.click(MIS, "MIS Selected");
        WebCommands.staticSleep(5000);
    }

    public void ninja_PI() throws Exception {
        NinjaLogin();
        TestUtil.click(PI, "PI Selected");
        WebCommands.staticSleep(5000);
    }

    public void loginless(){
      //  driver.get("https://ninja.sanity.turtle-feature.com/branch-issuance");
        driver.get(System.getProperty("ninjaurl")+"branch-issuance");
    }
    public void ValidateLogin(String username, String otp) {
        String strUrl = driver.getCurrentUrl();
        LogUtils.info("Opened Website: " + strUrl);
        TestUtil.click(MobileNumber , " cjhe");
        TestUtil.sendKeys(MobileNumber, username, "Mobile Number Entered");
        TestUtil.click(GetOTP, "Continue pressed");
        TestUtil.sendKeys(OTPField, otp, "OTP Entered");
        TestUtil.click(VerifyOTPBtn, "Login Successful");
        WebCommands.staticSleep(8000);
        TestUtil.click(SellBtn , "click on sell button");
    }

    public void SaveLead(String LeadName) throws InterruptedException {

        name.sendKeys(LeadName);
        LogUtils.info("All Details Filled and Lead Name Entered");
        NextButton.click();
        WebCommands.staticSleep(2000);
    }

    public void SaveLead1(String LeadName) throws InterruptedException {

        name1.sendKeys(LeadName);
        LogUtils.info("All Details Filled and Lead Name Entered");
        NextButton1.click();
        WebCommands.staticSleep(2000);
    }


}