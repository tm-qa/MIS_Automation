package com.qa.turtlemint.pages.Mintpro_CI_Page;

import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.qa.turtlemint.base.TestBase.driver;

public class LifePage {

    @FindBy(xpath = "//span[text()='Term Life']")
    WebElement term_life;

    public LifePage() {
        PageFactory.initElements(driver, this);
    }

    public void ValidateLifeClick() throws InterruptedException {
        TestUtil.click(term_life, "Life button Click");
    }
}
