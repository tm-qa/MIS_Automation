package com.qa.turtlemint.pages.ManualAndAutoParseFlowPage;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_1_12 extends TestBase {

    public TC_1_12() {
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//input[@id=\"AutoParsing_channelType\"]//parent::span")
    WebElement channeltype;
    @FindBy(xpath = "//input[@id=\"AutoParsing_businessType\"]//parent::span")
    WebElement bussinesstype;
    @FindBy(xpath = "//input[@id=\"AutoParsing_issuanceDate\"]")
    WebElement PIdate;

    @FindBy(xpath = "//input[@id=\"AutoParsing_salesDetail.saleClosedDate\"]")
    WebElement saleclosedate;

    @FindBy(xpath = "//div[text()=\"14\"]")
    WebElement date;
    //div[text()="14"]

    @FindBy(xpath = "//input[@id=\"AutoParsing_turtlemintBrokerCode\"]//parent::span")
    WebElement tmbrokercodecheckbox;
    @FindBy(xpath = "//input[@name=\"Files\"]//parent::span")
    WebElement fileupload;
    @FindBy(xpath = "//button[text()=\"Create Sale\"]")
    WebElement createsale;




   public void basicDetails(String channelType, String bussinessType, String issuanceDate) {

       TestUtil.click(tmbrokercodecheckbox, "Check box selected");

       TestUtil.click(bussinesstype, " Business type select clicked");
       WebElement BT = driver.findElement(By.xpath("//div[@title='" + bussinessType + "']"));
       TestUtil.click(BT, bussinessType + " Business type selected");

       TestUtil.click(channeltype, " Channel type select clicked");
       WebElement CT = driver.findElement(By.xpath("//div[@title='" + channelType + "']"));
       TestUtil.click(CT, channelType + " Channel type selected");

       TestUtil.sendKeys(PIdate, issuanceDate, issuanceDate + " Issuance date Entered");
       PIdate.sendKeys(Keys.ENTER);
       WebCommands.staticSleep(2000);

   }

    public void saleDetails(String salecloseDate){
       WebCommands.staticSleep(2000);
       //TestUtil.click(saleclosedate,"calendar opened");
       TestUtil.sendKeys(saleclosedate, salecloseDate, salecloseDate + " Sale close date Entered");
       saleclosedate.sendKeys(Keys.ENTER);

    }
    public void policyDetail(){
       TestUtil.click(fileupload,"Clicked on plus icon to upload file");
        TestUtil.uploadFile("Users/nitinrathod/Downloads/Sprint 140.pdf");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();



    }
















}
