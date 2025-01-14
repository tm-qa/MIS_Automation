package com.qa.turtlemint.pages.DashBoard;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class Dashborad_page extends TestBase {


    public Dashborad_page() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@data-icon=\"menu\"]")
    WebElement hamburger;

    @FindBy(xpath = "//img[@alt=\"notification icon\"]")
    WebElement notificationIcon;

    @FindBy(xpath = "//input[@placeholder=\"Search by Policy No. or Registration No. (min. 4 chars)\"]")
    WebElement searchBox;

    @FindBy(xpath = "//span[@class=\"anticon anticon-search\"]")
    WebElement searchIcon;

    @FindBy(xpath = "//img[@alt=\"Plus\"]")
    WebElement createLeadIcon;

    @FindBy(xpath = "//button[text()=\"Ninja V1\"]")
    WebElement ninjaV1;

    @FindBy(xpath = "//div[text()=\"All Records\"]")
    WebElement allRecords;

    @FindBy(xpath = "//input[@placeholder=\"Start date\"]")
    WebElement startDate;

    @FindBy(xpath = "//input[@placeholder=\"End date\"]")
    WebElement endDate;

    @FindBy(xpath = "//input[@class=\"ant-select-selection-search-input\"]//parent::*//parent::div")
    WebElement filterBy;

    @FindBy(xpath = "//button[text()=\"Apply\"]")
    WebElement applybutton;

    @FindBy(xpath = "//button[text()=\"Reset Filters\"]")
    WebElement resetFilter;

    @FindBy(xpath = "//button[text()=\"Total Records: 0\"]")
    WebElement totalRecords;

    @FindBy(xpath = "//table[@style=\"table-layout: fixed;\"]//th")
    WebElement columns;

    @FindBy(xpath = "//div[@class=\"sc-eeDRCY idbdya\"]//p")
    List<WebElement> hamburgerModules;

//    @FindBy(xpath = "//p[text()=\"Partner Lead Management\"]")
//    WebElement plmModule;
//
//    @FindBy(xpath = "//p[text()=\"Partner Management\"]")
//    WebElement pmModule;
//
//    @FindBy(xpath = "//p[text()=\"Supervisor Assignment\"]")
//    WebElement saModule;



    @FindBy(xpath = "//*[text()=\"Logout\"]")
    WebElement logout;

    @FindBy(xpath = "//*[@alt=\"Google\"]")
    WebElement signIn;

    @FindBy(xpath = "(//a[@data-auto=\"mis-module\"])[2]")
    WebElement MIS;

    @FindBy(xpath = "//*[@data-auto=\"ham-menu\"]")
    WebElement ham;

    @FindBy(xpath = "//div[@class=\"ant-table-body\"]")
    WebElement smallWindow;

    @FindBy(xpath = "//*[@class=\"sc-bmzYkS irUjej\"]")
    WebElement modules;

    @FindBy(xpath = "//td[@class=\"ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today\"]")
    WebElement selectTodaysDate;

    @FindBy(xpath = "//td[contains(@class,\"ant-picker-cell-today ant-picker-cell-selected\")]")
    WebElement selectEndDate;

    @FindBy(xpath = "//div[text()=\"Creation Date\"]")
    WebElement creationDate;

    @FindBy(xpath = "//button[text()=\"Apply\"]")
    WebElement applyFilter;

    @FindBy(xpath = "//div[@class=\"rc-virtual-list-holder-inner\"]")
    WebElement filterByValues;

    @FindBy(xpath = "//tbody[@class=\"ant-table-tbody\"]//tr[contains(@data-row-key,\"table-body-id\")]//td[12]")
    WebElement verifySalesCloseDate;

    Actions actions = new Actions(driver);

    public void elementIsDisplaed(WebElement element){

        if (element.isDisplayed()) {
            System.out.println("Element is visible on the screen.");
            System.out.println(element.getText());
        } else {
            System.out.println("Element is not visible on the screen.");
        }
    }

    public void hamburger  (){

        TestUtil.click(hamburger, "click on hamburger");
    }
    public void hamburgerModules(){
        TestUtil.click(hamburger, "jkndf");
        actions.moveToElement(modules).perform();


        List <WebElement> elements = driver.findElements(By.xpath("//div[@class=\"sc-eeDRCY idbdya\"]//p"));
        for(WebElement module : elements){

            elementIsDisplaed(module);
        }
    }

    public void clickhamburgerModules() throws InterruptedException {
        TestUtil.click(hamburger, "jkndf");
        List <WebElement> elements = driver.findElements(By.xpath("//div[@class=\"sc-eeDRCY idbdya\"]//p"));
        for(WebElement module : elements){
            System.out.println("ywtfdh");
            Thread.sleep(5000);
            TestUtil.click(module , "click on ");
            Thread.sleep(2000);
            TestUtil.click(ham,"click");
            Thread.sleep(1000);
            TestUtil.click(logout, "jkndf");
            TestUtil.click(signIn, "jkndf");
            Thread.sleep(2000);
            TestUtil.click(MIS, "jkndf");
            TestUtil.click(hamburger, "jkndf");
        }
    }


    public void verifyDashboardTabs(){
        elementIsDisplaed(searchBox);
        elementIsDisplaed(searchIcon);
        elementIsDisplaed(createLeadIcon);
        elementIsDisplaed(notificationIcon);
        elementIsDisplaed(ninjaV1);
        elementIsDisplaed(allRecords);
        elementIsDisplaed(hamburger);

    }
    public void verifyDashboardColumns() throws IOException {

        List<WebElement > columns = driver.findElements(By.xpath("//table[@style=\"table-layout: fixed;\"]//th"));

        int i = 0;
        for (WebElement element : columns){

            if(i==7){
                System.out.println(i);
                WebElement scrollableDiv = driver.findElement(By.cssSelector("div.ant-table-body"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollableDiv);
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft += 5000;", scrollableDiv);
                TestUtil.getFullPageScreenShot();
            }
            elementIsDisplaed(element);
            i++;
        }
    }

    public void VerifydateRangeAndFilterByCombination() throws InterruptedException, IOException {
        verifyDateRange();
        TestUtil.getFullPageScreenShot();
        TestUtil.click(filterBy,"click on filter by");
        Thread.sleep(2000);
        List <WebElement> filterValues = driver.findElements(By.xpath("//div[@class=\"rc-virtual-list-holder-inner\"]//div[contains(@title,\"Date\")]"));
        for (WebElement filterDropdown : filterValues){
            TestUtil.click(filterDropdown,"click on creation date");
            TestUtil.click(applyFilter, "click on apply filter");
            System.out.println(filterDropdown.getText()+" - filter applied");
            TestUtil.getFullPageScreenShot();
            TestUtil.click(filterBy,"click on filter by");
        }
    }
    public void verifyDateRange() throws IOException {
        TestUtil.getFullPageScreenShot();
        TestUtil.click(startDate , "click on start date");
        String days = TestUtil.ninjaPastDate(5);
        TestUtil.sendKeys(startDate,days,"start date entered");
        TestUtil.click(endDate , "click on start date");
        TestUtil.sendKeys(endDate,TestUtil.ninjaPastDate(1),"end date entered");
        endDate.sendKeys(Keys.RETURN);
        TestUtil.getFullPageScreenShot();
    }
    public void verifyFilterAscendingDesending() throws IOException {
        verifyDateRange();
        List <WebElement > salesCloseDate = driver.findElements(By.xpath("//tbody[@class=\"ant-table-tbody\"]//tr[contains(@data-row-key,\"table-body-id\")]//td[12]"));

    }

}
