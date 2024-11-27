package com.qa.turtlemint.pages.manualautoparse;

import com.github.javafaker.Faker;
import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.Date;


public class TC_09_TO_21_Page extends TestBase {
    TestUtil tl = new TestUtil();

    public TC_09_TO_21_Page() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id=\"createMISEntry_insurer\"]//parent::span")
    WebElement insurerp;

    @FindBy(xpath = "//button[text()=\"Create Sale\"]")
    WebElement createSale;

    @FindBy(xpath = "//input[@id=\"createMISEntry_vehicleType\"]//parent::span")
    WebElement vehicleType;
    @FindBy(xpath = "//div[@id=\"root\"]//span[@class=\"anticon\"]//img[@alt=\"Plus\"]")
    WebElement plus;

    @FindBy(xpath = "//input[@aria-controls=\"createMISEntry_productCategory_list\"]//parent::span")
    WebElement policyCatagory;

    @FindBy(xpath = "//input[@id=\"createMISEntry_policyStatus\"]//parent::span")
    WebElement policyStatus;
    @FindBy(xpath = "//input[@name='policyNumber']")
    WebElement policyNo;
    @FindBy(xpath = "//label[text()='Turtlemint Broker Code']//parent::div//following-sibling::div//span")
    WebElement checkbox;
    @FindBy(xpath = "//input[@name='applicationNumber']")
    WebElement applicationNO;
    @FindBy(xpath = "//input[@id='Motor_businessType']")
    WebElement BusinessType;
    @FindBy(xpath = "//div[@title='New']")
    WebElement New;
    @FindBy(xpath = "//input[@id='Motor_proposer.title']")
    WebElement ProposerTitle;
    @FindBy(xpath = "//div[@title='Mr']")
    WebElement Mr;
    @FindBy(xpath = "//input[@name='proposer.fName']")
    WebElement customer_f_name;
    @FindBy(xpath = "//input[@name='proposer.mobile']")
    WebElement customer_phone;
    @FindBy(xpath = "//input[@name='proposer.email']")
    WebElement customer_email;
    @FindBy(xpath = "//input[@name='proposer.address']")
    WebElement registration_address;
    @FindBy(xpath = "//input[@name='Registration Pincode']")
    WebElement registration_pincode;
    @FindBy(xpath = "//input[@name='proposer.registrationCity']")
    WebElement registration_city;
    @FindBy(xpath = "//input[@name='proposer.registrationState']")
    WebElement registration_state;
    @FindBy(xpath = "//label[text()='Current Address same as Registration Address']//parent::div//following-sibling::div//span")
    WebElement checkbox_address;
    @FindBy(xpath = "//input[@id='Motor_productName']")
    WebElement product_name;
    @FindBy(xpath = "//div[@title='Comprehensive']")
    WebElement Comprehensive;
    @FindBy(xpath = "//input[@id='registrationNo']")
    WebElement registraionNo;
    @FindBy(xpath = "//label[text()='Make Model']//parent::div//following-sibling::div//span")
    WebElement MakeModel;
    @FindBy(xpath = "//div[text()='Fiat Base 500']")
    WebElement fiat_base500;
    @FindBy(xpath = "//input[@id='Motor_policyRisk.variant']")
    WebElement varient;
    @FindBy(xpath = "//div[@title='Sports (1248 CC)']")
    WebElement sports_varient;
    @FindBy(xpath = "//input[@id='manufactureYear']")
    WebElement manufacturer_year;
    @FindBy(xpath = "//input[@id='engineNo']")
    WebElement engine_no;
    @FindBy(xpath = "//input[@id='chassisNo']")
    WebElement chassis_no;
    @FindBy(xpath = "//label[@title='Endorsement(Yes/No)']//parent::div//following-sibling::div//span[text()='No']")
    WebElement EndorsementNo;
    @FindBy(xpath = "//label[@title='Is Vehicle Financed']//parent::div//following-sibling::div//span[text()='No']")
    WebElement Vehical_finance_No;
    @FindBy(xpath = "//input[@id ='NCB']")
    WebElement NCB;
    @FindBy(xpath = "//input[@name ='IDV/Sum Insured']")
    WebElement IDV_SumInsured;

    @FindBy(xpath = "//input[@name ='Basic OD Premium']")
    WebElement Basic_OD_premium;

    @FindBy(xpath = "//input[@name ='Total TP Premium']")
    WebElement total_tp_premium;

    @FindBy(xpath = "//input[@name ='Total OD Premium']")
    WebElement total_OD_premium;
    @FindBy(xpath = "//input[@name ='Basic TP Premium']")
    WebElement basic_tp_premium;
    @FindBy(xpath = "//input[@name ='Net Premium']")
    WebElement net_premium;
    @FindBy(xpath = "//input[@name ='Service Tax / GST']")
    WebElement serviceTax;
    @FindBy(xpath = "//input[@name ='Gross Premium']")
    WebElement gross_prem;
    @FindBy(xpath = "//label[@title ='Data QC']//parent::div//following-sibling::div")
    WebElement Data_QC;
    @FindBy(xpath = "//div[text()='Ready']")
    WebElement ready;
    @FindBy(xpath = "//label[@title ='Channel Type']//parent::div//following-sibling::div")
    WebElement ChannelType;
    @FindBy(xpath = "//div[text()='Website']")
    WebElement website;
    @FindBy(xpath = "//label[@title='Policy Issuance Date']//parent ::div//following-sibling::div")
    WebElement policy_issuance_date;
    @FindBy(xpath = "(//a[text()='Today'])[2]")
    WebElement PolicyIssuanceToday;
    @FindBy(xpath = "(//td[@class=\"ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today\"])[1]//preceding-sibling::td")
    WebElement PolicyIssuancePastDate;

    @FindBy(xpath = "//label[@title='Sale Closed Date']//parent ::div//following-sibling::div")
    WebElement sale_closed_date;
    @FindBy(xpath = "//label[@title='Sub Status']//parent ::div//following-sibling::div")
    WebElement substatus;
    @FindBy(xpath = "//div[text()='In force']")
    WebElement InForce;
    @FindBy(xpath = "//label[@title='Category']//parent ::div//following-sibling::div")
    WebElement category;
    @FindBy(xpath = "//div[text()='Investment']")
    WebElement Investment;
    @FindBy(xpath = "//label[@title='Plan Type']//parent ::div//following-sibling::div")
    WebElement planType;
    @FindBy(xpath = "//div[text()='Term']")
    WebElement term;
    @FindBy(xpath = "//label[@title='Plan name']//parent ::div//following-sibling::div")
    WebElement planName;
    @FindBy(xpath = "//div[text()='Secure']")
    WebElement Secure;
    @FindBy(xpath = "(//a[text()='Today'])[4]")
    WebElement sale_closed_date_today;
    @FindBy(xpath = "(//td[@class=\"ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today\"])[4]//following-sibling::td")
    WebElement sale_closed_date_future;
    @FindBy(xpath = "//label[@title='Risk Start Date']//parent ::div//following-sibling::div")
    WebElement risk_start_date;
    @FindBy(xpath = "(//a[text()='Today'])[2]")
    // @FindBy(xpath = "((//td[@class=\"ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today\"])[1]//following-sibling::td)[1]")
    WebElement risk_start_date_today;
    @FindBy(xpath = "(//a[text()='Today'])[3]")
    WebElement risk_start_date_todaylife;
    @FindBy(xpath = "//label[@title='Risk End Date']//parent ::div//following-sibling::div")
    WebElement risk_end_date;
    @FindBy(xpath = "(//a[text()='Today'])[3]")
    // @FindBy(xpath = "(//td[@class='ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today'])[4]//following-sibling::td")
    WebElement risk_end_date_today;
    @FindBy(xpath = "(//a[text()='Today'])[4]")
    WebElement risk_end_date_todayLife;
    @FindBy(xpath = "((//td[@class=\"ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today\"])[3]//following-sibling::td)")
    WebElement risk_end_date_tom;
    @FindBy(xpath = "//button[text()='Edit Current Entry']")
    WebElement editCurrentEntry;
    @FindBy(xpath = "//button[text()='Save Sale']")
    WebElement SaveSale;
    @FindBy(xpath = "(//a[text()='Today'])[1]")
    WebElement sale_closed_date_todayLife;
    @FindBy(xpath = "//label[@title='Client Category']//parent ::div//following-sibling::div")
    WebElement clientCategory;
    @FindBy(xpath = "//div[text()='Individual - RI']")
    WebElement Individual_RI;
    @FindBy(xpath = "//label[@title='Gender']//parent ::div//following-sibling::div")
    WebElement gender;
    @FindBy(xpath = "//div[text()='Male']")
    WebElement male;
    @FindBy(xpath = "//label[@title='Date of Birth']//parent ::div//following-sibling::div")
    WebElement dob;
    @FindBy(xpath = "(//button[text()='2024'])[5]")
    WebElement year2024;
    @FindBy(xpath = "(//button[@tabindex='-1'])[25]")
    WebElement previousyear;
    @FindBy(xpath = "//td[@title='2001']")
    WebElement dob_year;
    @FindBy(xpath = "//div[text()='Jan']")
    WebElement Jan;
    @FindBy(xpath = "(//div[text()='1'])[9]")
    WebElement dob_date;
    @FindBy(xpath = "//label[@title='Proposer Title']//parent ::div//following-sibling::div")
    WebElement ProposerTitlelife;
    @FindBy(xpath = "//label[@title='Payment Status']//parent ::div//following-sibling::div")
    WebElement PaymentStatus;
    @FindBy(xpath = "//div[text()='Completed']")
    WebElement Completed;
    @FindBy(xpath = "//label[@title='Payment Mode']//parent ::div//following-sibling::div")
    WebElement PaymentMode;
    @FindBy(xpath = "//div[text()='Online']")
    WebElement online;
    @FindBy(xpath = "//label[@title='Payment Frequency']//parent ::div//following-sibling::div")
    WebElement PaymentFrequ;
    @FindBy(xpath = "//div[text()='Single']")
    WebElement Single;
    @FindBy(xpath = "//input[@name='Policy Term (in years)']")
    WebElement PolicyTerminYears;
    @FindBy(xpath = "//input[@name='Modal Premium (without GST)']")
    WebElement Model_premium_without_GST;
    @FindBy(xpath = "//input[@name='Modal GST']")
    WebElement Model_GST;
    @FindBy(xpath = "(//input[@value='1000'])[1]")
    WebElement NetPremium;
    @FindBy(xpath = "(//input[@value='1000'])[2]")
    WebElement service_Tax;
    @FindBy(xpath = "//input[@value='2000']")
    WebElement GrossPremium;
    @FindBy(xpath = "//input[@name='policyRisk.benefitPayoutTerm']")
    WebElement Benefit_Payout_Term;
    @FindBy(xpath = "//input[@name='Sum Insured']")
    WebElement sum_Insured;

    Faker faker = new Faker();
    String firstname;
    String phoneNumber;
    String policyNumber = TestUtil.generateRandomPolicyNo(7);
    Actions builder = new Actions(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    Date myDate;

    public void commonflow(String TW_Motor_Health_Life, String status,String insurer,String vehicalType) {

        TestUtil.click(plus,"Plus button clicked");
        TestUtil.click(policyCatagory, " policy catagory clicked");
        WebElement PC = driver.findElement(By.xpath("//div[@title='" + TW_Motor_Health_Life + "']"));
        TestUtil.click(PC, TW_Motor_Health_Life + " policy catagory selected");
        TestUtil.click(policyStatus, " policy status clicked");
        WebElement PS = driver.findElement(By.xpath("//div[@title='" + status + "']"));
        TestUtil.click(PS, status + " policy Status selected");
        TestUtil.click(insurerp, " insurer select clicked");
        WebElement Insurer = driver.findElement(By.xpath("//div[@title='" + insurer + "']"));
        TestUtil.click(Insurer, status + " policy insurer selected");
        TestUtil.click(createSale, " create Sale clicked");
        TestUtil.click(vehicleType, " insurer select clicked");
        WebElement VT = driver.findElement(By.xpath("//div[@title='" + vehicalType + "']"));
        TestUtil.click(VT, vehicalType + " VT selected");
        TestUtil.click(createSale, " create Sale clicked");
    }

    public void commonflowLife(String TW_Motor_Health_Life, String status,String insurer) {

        TestUtil.click(plus,"Plus button clicked");
        TestUtil.click(policyCatagory, " policy catagory clicked");
        WebElement PC = driver.findElement(By.xpath("//div[@title='" + TW_Motor_Health_Life + "']"));
        TestUtil.click(PC, TW_Motor_Health_Life + " policy catagory selected");
        TestUtil.click(policyStatus, " policy status clicked");
        WebElement PS = driver.findElement(By.xpath("//div[@title='" + status + "']"));
        TestUtil.click(PS, status + " policy Status selected");
        TestUtil.click(insurerp, " insurer select clicked");
        WebElement Insurer = driver.findElement(By.xpath("//div[@title='" + insurer + "']"));
        TestUtil.click(Insurer, status + " policy insurer selected");
        TestUtil.click(createSale, " create Sale clicked");
    }

    public void makeModel(){
        TestUtil.click(MakeModel, " MakeModel clicked");
        WebCommands.staticSleep(2000);
        new Actions(driver)
                .keyDown(Keys.SHIFT)
                .sendKeys("f")
                .keyUp(Keys.SHIFT)
                .sendKeys("i")
                .perform();
        WebCommands.staticSleep(2000);
        TestUtil.click(fiat_base500, " fiat_base500 selected");
        WebCommands.staticSleep(2000);
    }

    public void general(){
        TestUtil.sendKeys(policyNo,policyNumber,"entered policy Number");
        TestUtil.click(checkbox, " checkbox selected ");
        TestUtil.sendKeys(applicationNO,"policyNumber","entered policy Number");
        TestUtil.click(BusinessType, " BusinessType selected ");
        TestUtil.click(New, " new BusinessType selected ");
        TestUtil.click(policy_issuance_date, "  policy_issuance_date selected ");
        TestUtil.click(PolicyIssuancePastDate, " yesterdays date selected ");
    }
    public void ProposerDetails(){
        TestUtil.click(ProposerTitle, " ProposerTitle dropdown clicked ");
        TestUtil.click(Mr, " Mr selected ");
        firstname = faker.name().firstName();
        TestUtil.sendKeys(customer_f_name,"firstname","entered firstname");
        phoneNumber = TestUtil.getRandomPhoneNumber();
        TestUtil.sendKeys(customer_phone,"phone","entered phone number");
        TestUtil.sendKeys(customer_email,"automation@gmail.com","entered email");
        TestUtil.sendKeys(registration_address,"registration_address","entered registration_address");
        TestUtil.sendKeys(registration_pincode,"400000","entered registration_pincode");
        TestUtil.sendKeys(registration_city,"mumbai","entered registration city");
        TestUtil.sendKeys(registration_state,"maharashtra","entered registration state maharashtra");
        TestUtil.click(checkbox_address, " checkbox_address selected ");
    }

    public void VehicalDetails() {
        TestUtil.click(product_name, " product_name dropdown clicked ");
        TestUtil.click(Comprehensive, " comprehensive selected");
        tl.GenerateRegNo();
        TestUtil.sendKeys(registraionNo, tl.RegNo, "Reg number entered");
        WebCommands.staticSleep(5000);
        js.executeScript("arguments[0].scrollIntoView(true);", registraionNo);
        WebCommands.staticSleep(2000);
        makeModel();
        builder.moveToElement( varient ).click( varient );
        builder.perform();
        TestUtil.click(sports_varient, " sports_varient varient clicked");
        TestUtil.sendKeys(manufacturer_year, "2020", "manufacturer_year entered");
        TestUtil.sendKeys(engine_no, policyNumber, "engine_no entered");
        TestUtil.sendKeys(chassis_no, policyNumber, "chassis no entered");
    }

    public void DatesAndEndorsement(){
        TestUtil.click(risk_start_date, " risk_start_date selected ");
        WebCommands.staticSleep(2000);
        TestUtil.click(risk_start_date_today, " todays risk_start_date selected ");
        WebCommands.staticSleep(3000);
        TestUtil.click(risk_end_date, " risk_start_date selected ");
        WebCommands.staticSleep(2000);
        TestUtil.click(risk_end_date_today, " tom risk_end_date_tom selected ");
        WebCommands.staticSleep(2000);
        TestUtil.click(EndorsementNo, " Endorsement as No selected ");
        TestUtil.click(Vehical_finance_No, " Vehical_finance_as No selected");
    }
    public void PremiumDetails(){
        js.executeScript("arguments[0].scrollIntoView(true);", NCB);
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(NCB, "1", "NCB 1 entered");
        TestUtil.sendKeys(IDV_SumInsured, "1", "IDV_SumInsured 1 entered");
        TestUtil.sendKeys(Basic_OD_premium, "1", "Basic_OD_premium 1 entered");
        TestUtil.sendKeys(total_OD_premium, "1", "total_OD_premium 1 entered");
        TestUtil.sendKeys(basic_tp_premium, "1", "basic_tp_premium 1 entered");
        TestUtil.sendKeys(total_tp_premium, "1", "total_tp_premium 1 entered");
        TestUtil.sendKeys(net_premium, "1", "Basic_OD_premium 1 entered");
        TestUtil.sendKeys(serviceTax, "1", "Basic_OD_premium 1 entered");
        TestUtil.sendKeys(gross_prem, "1", "Basic_OD_premium 1 entered");
    }
    public void QualityCheck(){
        TestUtil.click(Data_QC, " Data_QC dropdown clicked ");
        TestUtil.click(ready, " ready selected from Data_QC dropdown  ");

    }
    public void SalesHierarchy(){
        TestUtil.click(ChannelType, " Channel Type selected");
        TestUtil.click(website, " website selected from channel type dropdown");
        TestUtil.click(sale_closed_date, " sale_closed_date selected ");
        TestUtil.click(sale_closed_date_today, " tommarows date selected in sale_closed_date");
        WebCommands.staticSleep(2000);
        WebCommands.staticSleep(5000);

    }
    public void SaveSale(){
        TestUtil.click(SaveSale, " Save Sale clicked ");
    }

    public static void popup() {

        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
            System.out.println("Alert accepted.");
            String alertText = alert.getText();
            System.out.println("Alert text: " + alertText);

        } catch (NoAlertPresentException e) {
            System.out.println("No alert present.");
        }
    }

    public void BackToHome(){
        driver.get(prop.getProperty("ninjaurl"));
        WebCommands.staticSleep(2000);
    }

    public void PolicyDetails(){

        TestUtil.sendKeys(policyNo,policyNumber,"entered policy Number");
        TestUtil.sendKeys(applicationNO,"policyNumber","entered policy Number");
        TestUtil.click(sale_closed_date, " sale_closed_date selected ");
        TestUtil.click(sale_closed_date_todayLife, " tommarows date selected in sale_closed_date");
        TestUtil.click(policy_issuance_date, "  policy_issuance_date selected ");
        TestUtil.click(PolicyIssuanceToday, " todays date selected ");
        TestUtil.click(substatus, " substatus clicked ");
        TestUtil.click(InForce, " InForce clicked ");
        TestUtil.click(category, " category clicked ");
        TestUtil.click(Investment, " Investment clicked ");
        TestUtil.click(planType, " planType clicked ");
        TestUtil.click(term, " term clicked ");
        TestUtil.click(planName, " teplanNamerm clicked ");
        WebCommands.staticSleep(2000);
        TestUtil.click(Secure, " SmartProtectionGoal clicked ");
        TestUtil.click(risk_start_date, " risk_start_date clicked ");
        TestUtil.click(risk_start_date_todaylife, " todays clicked ");
        TestUtil.click(risk_end_date, " risk_end_date clicked ");
        TestUtil.click(risk_end_date_todayLife, " todays date clicked ");
    }

    public void duplicatepopup() {
        try {
            editCurrentEntry.click();
            System.out.println("duplicate entry edit current entry clicked successfully.");
        } catch (NoSuchElementException e) {
            System.out.println("duplicate popup not found. Unable to click.");
        }    }

    public void PolicyHolderDetails() {

        TestUtil.click(clientCategory, " clientCategory clicked ");
        TestUtil.click(Individual_RI, " Individual_RI clicked ");
        TestUtil.click(ProposerTitlelife, " ProposerTitlelife dropdown clicked ");
        TestUtil.click(Mr, " Mr selected ");
        firstname = faker.name().firstName();
        TestUtil.sendKeys(customer_f_name,"firstname","entered firstname");
        phoneNumber = TestUtil.getRandomPhoneNumber();
        TestUtil.sendKeys(customer_phone,"phone","entered phone number");
        TestUtil.sendKeys(customer_email,"automation@gmail.com","entered email");
        TestUtil.sendKeys(registration_address,"registration_address","entered registration_address");
        TestUtil.sendKeys(registration_pincode,"400000","entered registration_pincode");
        TestUtil.sendKeys(registration_city,"mumbai","entered registration city");
        TestUtil.sendKeys(registration_state,"maharashtra","entered registration state maharashtra");
        TestUtil.click(checkbox_address, " checkbox_address selected ");
        TestUtil.click(gender, " gender clicked ");
        TestUtil.click(male, " male clicked ");
        dob();
    }
    public void dob() {

        TestUtil.click(dob, " dob clicked ");
        TestUtil.click(year2024, " year2024 clicked ");
        TestUtil.click(previousyear, " prev year clicked ");
        TestUtil.click(previousyear, " prev year clicked ");
        TestUtil.click(dob_year, " bday year clicked ");
        TestUtil.click(Jan, "jan clicked ");
        TestUtil.click(dob_date, " dob date clicked ");
    }
    public void Policy_Premium_Details(){

        TestUtil.click(PaymentFrequ, " PaymentFrequ selected ");
        TestUtil.click(Single, "Single clicked");
        TestUtil.sendKeys(PolicyTerminYears,"1","entered policy term in yrs");
        TestUtil.sendKeys(Model_premium_without_GST,"1000","entered Model_premium_without_GST");
        TestUtil.sendKeys(Model_GST,"1000","entered Model_GST");
        TestUtil.IsDisplayed(NetPremium,"Net premium displayed as Modal premium * premium frequency");
        TestUtil.IsDisplayed(service_Tax,"service_Tax displayed as Modal GST * premium frequency");
        TestUtil.IsDisplayed(GrossPremium,"GrossPremium displayed as Net premium + Service tax/GST");
        TestUtil.sendKeys(Benefit_Payout_Term,"term","entered term in Benefit_Payout_Term ");
        TestUtil.sendKeys(sum_Insured,"3000","entered 3000 in sum_Insured ");
    }
    public void PremiumPaymentDetails() {

        TestUtil.click(PaymentStatus, " PaymentStatus selected ");
        TestUtil.click(Completed, "Completed clicked");
        TestUtil.click(PaymentMode, " PaymentMode selected ");
        TestUtil.click(online, "online clicked");
    }
    public void SalesHierarchyLife() {
        TestUtil.click(ChannelType, " Channel Type selected");
        TestUtil.click(website, " website selected from channel type dropdown");
    }

    public void TC_09(){

        general();
        ProposerDetails();
        VehicalDetails();
        DatesAndEndorsement();
        PremiumDetails();
        QualityCheck();
        SalesHierarchy();
        SaveSale();
        popup();
        BackToHome();
    }

    public void TC_21(){

        PolicyDetails();
        duplicatepopup();
        PolicyHolderDetails();
        Policy_Premium_Details();
        PremiumPaymentDetails();
        SalesHierarchyLife();
        QualityCheck();
        SaveSale();
        duplicatepopup();
    }

}
