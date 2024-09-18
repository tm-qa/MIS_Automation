package com.qa.turtlemint.pages.mintpro;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrowPageSellButton extends TestBase {


    @FindBy(xpath = "//span[text()='Sell']")
    WebElement SellBtn;




    public GrowPageSellButton() {
        PageFactory.initElements(driver, this);
    }

    public void ValidateSellButton() {
        TestUtil.click(SellBtn , "click on sell button");

    }
}
