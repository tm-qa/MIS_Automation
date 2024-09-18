package com.qa.turtlemint.pages.four_wheeler;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CarDetailsPage extends TestBase {

    public CarDetailsPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//p[text()='Your Car detail']")
    WebElement Carlbl;

    @FindBy(xpath = "//input[@type='search']")
    WebElement CarModel;

    @FindBy(xpath = "//span[text()='Hyundai i20 Active']")
    WebElement SelectModel;

    @FindBy(xpath = "//span[text()='2022'] | //span[text()='2021'] | //span[text()='2020']")
    WebElement RollRegYear;

    @FindBy(xpath = "//span[text()='Diesel']")
    WebElement FuelType;

    @FindBy(xpath = "//input[@placeholder='Type name or select']")
    WebElement EnterVariant;

    @FindBy(id = "container-next-btn")
    WebElement NextButton;

    @FindBy(xpath = "//span[text()='Type name or select']")
    WebElement Varianttapping;


    JavascriptExecutor js = (JavascriptExecutor) driver;


    public void NinjaCarDetails(String CarName) throws Exception {
        driver.manage().window().maximize();
        Carlbl.isDisplayed();
        LogUtils.info("Car Details Entering Started");
        TestUtil.sendKeys(CarModel, CarName, "Car Name Entered");
        Thread.sleep(2500);
        TestUtil.click(SelectModel, "Model Selected");
        WebCommands.staticSleep(6000);
        js.executeScript("arguments[0].click();", RollRegYear);
        LogUtils.info("Year Selected");
        WebCommands.staticSleep(6000);
        js.executeScript("arguments[0].click();", FuelType);
        LogUtils.info("Fuel Type selected");
        TestUtil.getScreenShot();//....1
        WebCommands.staticSleep(3000);
        js.executeScript("window.scrollBy(0,-135)");
       Actions ac =new Actions(driver);
        ac.moveToElement(Varianttapping).click().build().perform();
        WebCommands.staticSleep(2000);
        LogUtils.info("Clicked on variant box");
        TestUtil.sendKeys(EnterVariant,"S (1396 CC)","Sendkeys of variant");
        EnterVariant.sendKeys(Keys.TAB);
        TestUtil.getScreenShot();//......2
          TestUtil.getScreenShot();
            WebCommands.staticSleep(2000);
            js.executeScript("window.scrollBy(0,700)");
            WebCommands.staticSleep(4000);
            try {
                TestUtil.click(NextButton, "Clicked Next Button and Proceeded to Lead Name Page");
            }
            catch(Exception e)
        {
            LogUtils.info("The Exception is"+e);
        }
        WebCommands.staticSleep(5000);

    }


}
