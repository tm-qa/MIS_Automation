package SourceofSale;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.common.Mis_newSale;
import com.qa.turtlemint.pages.common.junk;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.manualautoparse.Health_Life_Page;
import com.qa.turtlemint.pages.manualautoparse.TC_09_TO_21_Page;
import com.qa.turtlemint.pages.manualautoparse.TC_1_12;
import com.qa.turtlemint.util.RetryAnalyser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(groups = {"Mis_Full","Source_of_Sale"})
public class SourceofSale extends TestBase {


    public LoginPage ninjaloginpage;
    public junk junkpolicyl;
    public Mis_newSale create;
    public TC_1_12 TC;
    public TC_09_TO_21_Page tc_09_to_21_page;
    public Health_Life_Page health_life_page;

    @BeforeMethod()
    public void start() throws Exception {
        initialization();

        ninjaloginpage = new LoginPage();
        junkpolicyl = new junk();
        create = new Mis_newSale();
        TC = new TC_1_12();
        tc_09_to_21_page = new TC_09_TO_21_Page();
//        ninjaloginpage.ninja_MIS();
        health_life_page = new Health_Life_Page();

    }

    @Test(description = "Motor source Of Sale", retryAnalyzer = RetryAnalyser.class)
    public void Motor_sourceOfSale() throws Exception {
        ninjaloginpage.ninja_MIS();
        WebCommands.staticSleep(2000);
        create.Motor_productCatagory_Status_insurer("Motor", "Issued", "L&T", "Car");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID + "test");
        TC.generalDetails("New", "11-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetailsRenewals("Comprehensive", "MH-03-AA-1001", "Fiat Base 500", "Sports (1248 CC)", "Car");
//        TC.vehicleDetails1();
        WebCommands.staticSleep(4000);
        TC.saleDetailsmanualPartner("11-10-2024");
        WebCommands.staticSleep(2000);
        TC.dateEndorsementDtails("23-10-2024", "10-11-2024");
        tc_09_to_21_page.PremiumDetailsSos();
        TC.qcDtails("Ready");
        WebCommands.staticSleep(2000);
        TC.policyDetailmanual();
        TC.salesOfSales();
        TC.backArrow.click();

    }

    @Test(description = "TW source Of Sale", retryAnalyzer = RetryAnalyser.class)
    public void TW_sourceOfSale() throws Exception {
        ninjaloginpage.ninja_MIS();
        WebCommands.staticSleep(2000);
        create.Motor_productCatagory_Status_insurer("TW", "Issued", "L&T", "TW");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID + "test");
        TC.generalDetails("New", "11-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetailsRenewals("Comprehensive", "MH-03-AA-4411", "Fidato Easy Go", "Lithium-Ion 60V 28Ah (1 CC)", "Scooter");
        WebCommands.staticSleep(4000);
        TC.saleDetailsmanualPartner("11-10-2024");
        WebCommands.staticSleep(2000);
        TC.dateEndorsementDtails("23-10-2024", "10-11-2024");
        tc_09_to_21_page.PremiumDetailsSos();
        TC.qcDtails("Ready");
        WebCommands.staticSleep(2000);
        TC.policyDetailmanual();
        TC.salesOfSales();
        TC.backArrow.click();

    }

    @Test(description = "Health source Of Sale", retryAnalyzer = RetryAnalyser.class)
    public void health_sourceOfSale() throws Exception {
        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Health("Health", "Issued", "HDFC Ergo", "");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID + "test");
        health_life_page.generalDetailsHealth("New", "11-10-2024");
        health_life_page.proposerDetails("Mr");
        health_life_page.addMember();
        WebCommands.staticSleep(2000);
        health_life_page.saleDetailsmanualPartner("11-10-2024");
        WebCommands.staticSleep(2000);
        health_life_page.dateEndorsementDtails("22-10-2023", "22-10-2024");
        health_life_page.premiumAndayment();
        health_life_page.policyDetails();
        health_life_page.qcDtails("Ready");
        WebCommands.staticSleep(2000);
        TC.policyDetailmanual();
        TC.salesOfSales();
        TC.backArrow.click();

    }

    @AfterMethod()
    public void Close() {
        driver.quit();
    }
}



