package com.qa.turtlemint.pages.four_wheeler;

import com.qa.turtlemint.pages.motor.GetQuotePage;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.qa.turtlemint.base.TestBase.driver;

public class FWPage {

    @FindBy(xpath = "//span[text()='Car']")
    WebElement fw;

    public FWPage() {
        PageFactory.initElements(driver, this);
    }

    public GetQuotePage ValidateMotorFWClick() throws InterruptedException {
        fw.click();
        return new GetQuotePage();
    }
}
