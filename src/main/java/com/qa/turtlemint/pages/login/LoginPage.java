package com.qa.turtlemint.pages.login;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    public String SolvedID;
    public String SolvedOrderID;


    @FindBy(xpath = "//a[@id='google-signin-button']")
    WebElement SignInbtn;

    @FindBy(xpath = "//input[@type='email']")
    WebElement Email;

    @FindBy(xpath = "//span[text()='Next']")
    WebElement Nextbtn1;

    @FindBy(xpath = "//div[@id='password']/div/div/div/input[@type='password']")
    WebElement Password;

    @FindBy(xpath = "//div[@id='passwordNext']")
    WebElement Nextbtn2;

    @FindBy(xpath = "//a[@data-auto=\"mis-module\"]")
    WebElement MIS;

    @FindBy(xpath = "//a[contains(text(),'Policy Issuance')]")
    WebElement IssuanceBtn;

    @FindBy(xpath = "//a[@data-auto=\"lifeOps-module\"]//following::a[@data-auto=\"claims-module\"]")
    WebElement Claims;

    @FindBy(xpath = "//span[text()='Create an account/ Sign in']")
    WebElement CreateAccount;

    @FindBy(name = "mobileNumber")
    WebElement MobileNumber;

    @FindBy(xpath = "//span[text()='Continue']")
    WebElement ContinueBtn;

    @FindBy(xpath = "//input[@class='OTPInput']")
    WebElement OTPField;

    @FindBy(xpath = "//span[text()='Verify OTP']")
    WebElement VerifyOTPBtn;


    public void NinjaLogin(String NinjaEmail, String NinjaPassword) throws Exception {
        LogUtils.info("Ninja Website Opened");
        String strUrl = driver.getCurrentUrl();
        LogUtils.info("Opened Website: " + strUrl);
        String parent = driver.getWindowHandle();
        TestUtil.click(SignInbtn, "Clicked on Sign In with Google Button");
        WebCommands.staticSleep(2000);
        driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
        LogUtils.info("Switched to child window");
        WebCommands.staticSleep(4000);
        TestUtil.sendKeys(Email, NinjaEmail, "Email Entered");
        WebCommands.staticSleep(2000);
        TestUtil.click(Nextbtn1, "Clicked on Next button");
        WebCommands.staticSleep(2000);
        //  driver.navigate().refresh();
        TestUtil.sendKeys(Password, NinjaPassword, "Password entered");
        TestUtil.click(Nextbtn1, "Clicked on Next button");
        driver.switchTo().window(parent);
        //  driver.findElement(By.xpath("(//ul[@class=\"OVnw0d\"]//li)[3]")).click();
    }

    public void ninja_MIS() throws Exception {
        NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        WebCommands.staticSleep(14000);
        TestUtil.getScreenShot();
        TestUtil.click(MIS, "MIS Selected");
        WebCommands.staticSleep(12000);
    }

    public void ninja_Claims() throws Exception {
        NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(Claims, "Quote Request Selected");
        WebCommands.staticSleep(5000);
        driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));

    }

    public void ninja_BI() throws Exception {
        //driver.switchTo().newWindow(WindowType.WINDOW);
        NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        WebCommands.staticSleep(14000);
        TestUtil.getFullPageScreenShot();
        TestUtil.click(IssuanceBtn, "Policy Insuance Selected");
        WebCommands.staticSleep(4000);
    }

    public void ninja_BI_Dashboard() throws Exception {
        NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        WebCommands.staticSleep(14000);
    }


    public GrowPageSellButton ValidateLogin(String username, String otp) {
        String strUrl = driver.getCurrentUrl();
        LogUtils.info("Opened Website: " + strUrl);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", CreateAccount);
        TestUtil.sendKeys(MobileNumber, username, "Mobile Number Entered");
        TestUtil.click(ContinueBtn, "Continue pressed");
        TestUtil.sendKeys(OTPField, otp, "OTP Entered");
        TestUtil.click(VerifyOTPBtn, "Login Successful");

        return new GrowPageSellButton();

    }
}