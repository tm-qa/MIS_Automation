package com.qa.turtlemint.pages.login;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
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

    @FindBy(xpath = "//input[@aria-label=\"Employee ID\"]")
    WebElement Employe;


    public void NinjaLogin() throws InterruptedException {
        driver.get("https://accounts.google.com/");
        WebCommands.staticSleep(3000);

        TestUtil.sendKeys(emailgoogle, "automationtesting@turtlemint.com", "email Id entered");
        TestUtil.sendKeys(emailgoogle, String.valueOf(Keys.RETURN), "email Id entered");
        TestUtil.sendKeys(passworgoogle, "Turtle@2024", "Password entered");
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
        //  driver.get(prop.getProperty("ninjaurl"));
        System.out.println(driver.getCurrentUrl());
        WebCommands.staticSleep(2000);
        TestUtil.click(SignInbtn, "Sign in button clicked");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }

    public void ninja_MIS() throws Exception {
        NinjaLogin();
        TestUtil.click(MIS, "MIS Selected");
        WebCommands.staticSleep(5000);
    }

}