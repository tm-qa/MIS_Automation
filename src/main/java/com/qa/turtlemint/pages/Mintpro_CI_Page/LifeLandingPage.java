package com.qa.turtlemint.pages.Mintpro_CI_Page;

import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.qa.turtlemint.base.TestBase.driver;

public class LifeLandingPage {
    public LifeLandingPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Term Life']//parent::div")
    WebElement termLifeButton;

    public void TermLifeClick() throws InterruptedException {
        WebCommands.staticSleep(2000);
        TestUtil.click(termLifeButton, "Clicked on Term Life Option");
    }

}