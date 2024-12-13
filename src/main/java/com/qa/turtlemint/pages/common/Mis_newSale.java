package com.qa.turtlemint.pages.common;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mis_newSale extends TestBase {

    public Mis_newSale() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id=\"root\"]//span[@class=\"anticon\"]//img[@alt=\"Plus\"]")
    WebElement plus;

    @FindBy(xpath = "//input[@aria-controls=\"createMISEntry_productCategory_list\"]//parent::span")
    WebElement policyCatagory;

    @FindBy(xpath = "//input[@id=\"createMISEntry_policyStatus\"]//parent::span")
    WebElement policyStatus;

    @FindBy(xpath = "//input[@id=\"createMISEntry_insurer\"]//parent::span")
    WebElement insurerp;

    @FindBy(xpath = "//button[text()=\"Create Sale\"]")
    WebElement createSale;

    @FindBy(xpath = "//input[@id=\"createMISEntry_vehicleType\"]//parent::span")
    WebElement vehicleType;



    public void productCatagory_Status_insurer(String TW_Motor_Health_Life, String status,String insurer) {
        WebCommands.staticSleep(1000);
        TestUtil.click(plus,"Plus button clicked");
        TestUtil.click(policyCatagory, " policy catagory clicked");
        WebElement PC = driver.findElement(By.xpath("//div[@title='" + TW_Motor_Health_Life + "']"));
        TestUtil.click(PC, TW_Motor_Health_Life + " policy catagory selected");

        TestUtil.click(policyStatus, " policy status clicked");
        WebElement PS = driver.findElement(By.xpath("//div[@title='" + status + "']"));
        TestUtil.click(PS, status + " policy Status selected");

        TestUtil.click(insurerp, " insurer select clicked");
        WebElement Insurer = driver.findElement(By.xpath("//div[@title='" + insurer + "']"));
        TestUtil.click(Insurer, insurer + " policy insurer selected");

        TestUtil.click(createSale, " create Sale clicked");
    }

    public void Motor_productCatagory_Status_insurer(String TW_Motor_Health_Life, String status,String insurer,String vehicalType) {
        productCatagory_Status_insurer(TW_Motor_Health_Life,status,insurer);
        TestUtil.click(vehicleType, " insurer select clicked");
        WebElement VT = driver.findElement(By.xpath("//div[@title='" + vehicalType + "']"));
        TestUtil.click(VT, vehicalType + " VT selected");

        TestUtil.click(createSale, " create Sale clicked");
    }

}