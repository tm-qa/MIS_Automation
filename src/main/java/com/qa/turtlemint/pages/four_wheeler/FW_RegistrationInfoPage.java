package com.qa.turtlemint.pages.four_wheeler;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FW_RegistrationInfoPage extends TestBase {

    public FW_RegistrationInfoPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type='search']")
    WebElement Search;

    @FindBy(xpath = "//input[@id='calendarCheckbox']")
    WebElement  CheckBox;

    @FindBy(id = "container-next-btn")
    WebElement NextButton;

    @FindBy(xpath = "//span[text()='MH-01-Mumbai Central- Location- Tardeo']")
    WebElement SelectRegLocationfw;

    Actions act = new Actions(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;


    public CarDetailsPage SelectFWRegistrationLocation(String no) {
        TestUtil.sendKeys(Search, no, "No RegistrationDate");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(4000);
       js.executeScript("arguments[0].click();", SelectRegLocationfw);
        WebCommands.staticSleep(2000);
        act.moveToElement(CheckBox).click().perform();
        TestUtil.click(NextButton, "Next Button Pressed");
        WebCommands.staticSleep(2000);
        return new CarDetailsPage();
    }

}
