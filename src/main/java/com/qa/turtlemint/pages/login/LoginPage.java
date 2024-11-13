package com.qa.turtlemint.pages.login;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Set;

public class LoginPage extends TestBase {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='google-signin-button']//img")
    WebElement SignInbtn;

    @FindBy(xpath = "//input[@type=\"email\"]")
    WebElement emailgoogle;

    @FindBy(xpath = "//input[@type=\"password\"]")
    WebElement passworgoogle;

    @FindBy(xpath = "(//a[@data-auto=\"mis-module\"])[2]")
    WebElement MIS;



    public void NinjaLogin() {
        driver.get("https://accounts.google.com/");
        WebCommands.staticSleep(3000);
        driver.get(System.getProperty("ninjaurl"));

        TestUtil.sendKeys(emailgoogle, "automationtesting@turtlemint.com", "email Id entered");
        TestUtil.sendKeys(emailgoogle, String.valueOf(Keys.RETURN), "email Id entered");
        TestUtil.sendKeys(passworgoogle, "Turtle@2023", "Password entered");
        TestUtil.sendKeys(passworgoogle, String.valueOf(Keys.RETURN), "Password entered");
        WebCommands.staticSleep(8000);
        TestUtil.getScreenShot();
        driver.get(System.getProperty("ninjaurl"));
       //  driver.get(prop.getProperty("ninjaurl"));
        System.out.println(driver.getCurrentUrl());
        WebCommands.staticSleep(8000);
        TestUtil.click(SignInbtn, "Sign in button clicked");
        WebCommands.staticSleep(10000);
        TestUtil.getScreenShot();
        System.out.println();
    }

    public void ninja_MIS() throws Exception {
        NinjaLogin();
        Set<String> allWindowHandles = driver.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<String>(allWindowHandles);
        System.out.println("No. of tabs: " + tabs.size());
        TestUtil.click(MIS, "MIS Selected");
        System.out.println("chutiya");
        WebCommands.staticSleep(10000);
        driver.navigate().refresh();
        driver.get("https://ninja.turtlemint.com/ninja-v2/mis/allrecords");

    }

}