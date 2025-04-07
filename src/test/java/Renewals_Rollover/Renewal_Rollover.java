package Renewals_Rollover;


import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.common.Mis_newSale;
import com.qa.turtlemint.pages.common.junk;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.manualautoparse.Health_Life_Page;
import com.qa.turtlemint.pages.manualautoparse.TC_09_TO_21_Page;
import com.qa.turtlemint.pages.manualautoparse.TC_1_12;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.enterprise.inject.New;

@Test(groups = {"Mis_Full","TC_1_12_test","Mis_Roll"})
public class Renewal_Rollover extends TestBase {


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
        ninjaloginpage.ninja_MIS();
        health_life_page = new Health_Life_Page();

    }

    @Test(description = "Renewals_TW")
    public void Renewals_FW() throws Exception {
//        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Status_insurer("Motor","Issued","L&T","Car");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID+"test");
        TC.generalDetails("New","11-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetailsRenewals("Comprehensive" , "MH-03-AA-1411" , "Fiat Base 500","Sports (1248 CC)" , "Car");
//        TC.vehicleDetails1();

        WebCommands.staticSleep(4000);
        TC.saleDetailsmanual("11-10-2024");
        WebCommands.staticSleep(2000);
        TC.dateEndorsementDtails("23-10-2024","10-11-2024");
        tc_09_to_21_page.PremiumDetails();
        TC.qcDtails("Ready");
        WebCommands.staticSleep(2000);
        TC.policyDetailmanual();
        TC.backArrow.click();
        create.Motor_productCatagory_Status_insurer("Motor","Issued","L&T","Car");
        String misID1 = junkpolicyl.misId.getText();
        System.out.println(misID1+"test");
        TC.generalDetails("New","11-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetailsRenewals("Comprehensive" , "MH-03-AA-1411" , "Fiat Base 500","Sports (1248 CC)" , "Car");
//        TC.vehicleDetails1();
        WebCommands.staticSleep(4000);
        TC.saleDetailsmanual("11-10-2024");
        WebCommands.staticSleep(2000);
        TC.dateEndorsementDtailssecondPolicy("25-10-2024","05-11-2024");
        tc_09_to_21_page.PremiumDetails();
        TC.qcDtails("Ready");
        TC.policyDetailmanualSecond();
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID1);
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID);
    }

    @Test(description = "Renewals_TW")
    public void Renewals_TW() throws Exception {
//        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Status_insurer("TW","Issued","L&T","TW");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID+"test");
        TC.generalDetails("New","11-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetailsRenewals("Comprehensive" , "MH-03-AA-1411" , "Fidato Easy Go","Lithium-Ion 60V 28Ah (1 CC)" , "Scooter");
//        TC.vehicleDetails1();
        WebCommands.staticSleep(4000);
        TC.saleDetailsmanual("11-10-2024");
        WebCommands.staticSleep(2000);
        TC.dateEndorsementDtails("23-10-2024","10-11-2024");
        tc_09_to_21_page.PremiumDetails();
        TC.qcDtails("Ready");
        WebCommands.staticSleep(2000);
        TC.policyDetailmanual();
        TC.backArrow.click();
        create.Motor_productCatagory_Status_insurer("TW","Issued","L&T","TW");
        String misID1 = junkpolicyl.misId.getText();
        System.out.println(misID1+"test");
        TC.generalDetails("New","11-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetailsRenewals("Comprehensive" , "MH-03-AA-1411" , "Fidato Easy Go","Lithium-Ion 60V 28Ah (1 CC)" , "Scooter");
//        TC.vehicleDetails1();
        WebCommands.staticSleep(4000);
        TC.saleDetailsmanual("11-10-2024");
        WebCommands.staticSleep(2000);
        TC.dateEndorsementDtailssecondPolicy("25-10-2024","05-11-2024");
        tc_09_to_21_page.PremiumDetails();
        TC.qcDtails("Ready");
        TC.policyDetailmanualSecond();
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID1);
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID);
    }

    @Test(description = "Renewals_TW")
    public void Rollover_TW() throws Exception {
//        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Status_insurer("TW","Issued","L&T","TW");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID+"test");
        TC.generalDetails("New","11-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetailsRenewals("Comprehensive" , "MH-03-AA-1310" , "Fidato Easy Go","Lithium-Ion 60V 28Ah (1 CC)" , "Scooter");
//        TC.vehicleDetails1();
        WebCommands.staticSleep(4000);
        TC.saleDetailsmanual("11-10-2024");
        WebCommands.staticSleep(2000);
        TC.dateEndorsementDtails("20-10-2024","10-11-2024");
        tc_09_to_21_page.PremiumDetails();
        TC.qcDtails("Ready");
        WebCommands.staticSleep(2000);
        TC.policyDetailmanual();
        TC.backArrow.click();
        create.Motor_productCatagory_Status_insurer("TW","Issued","ONE_ASSIST","TW");
        String misID1 = junkpolicyl.misId.getText();
        System.out.println(misID1+"test");
        TC.generalDetails("New","11-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetailsRenewals("Comprehensive" , "MH-03-AA-1411" , "Fidato Easy Go","Lithium-Ion 60V 28Ah (1 CC)" , "Scooter");
//        TC.vehicleDetails1();
        WebCommands.staticSleep(4000);
        TC.saleDetailsmanual("08-10-2024");
        WebCommands.staticSleep(2000);
        TC.dateEndorsementDtails("09-10-2024","01-10-2025");
        tc_09_to_21_page.PremiumDetails();
        TC.qcDtails("Ready");
        TC.policyDetailmanual();
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID1);
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID);
    }

    @Test(description = "Renewals_TW")
    public void Rollover_FW() throws Exception {
//        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Status_insurer("Motor","Issued","L&T","Car");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID+"test");
        TC.generalDetails("New","11-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetailsRenewals("Comprehensive" , "MH-03-AA-1310" , "Fiat Base 500","Sports (1248 CC)" , "Car");
//        TC.vehicleDetails1();
        WebCommands.staticSleep(4000);
        TC.saleDetailsmanual("11-10-2024");
        WebCommands.staticSleep(2000);
        TC.dateEndorsementDtails("20-10-2024","10-11-2024");
        tc_09_to_21_page.PremiumDetails();
        TC.qcDtails("Ready");
        WebCommands.staticSleep(2000);
        TC.policyDetailmanual();
        TC.backArrow.click();
        create.Motor_productCatagory_Status_insurer("Motor","Issued","ONE_ASSIST","Car");
        String misID1 = junkpolicyl.misId.getText();
        System.out.println(misID1+"test");
        TC.generalDetails("New","11-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetailsRenewals("Comprehensive" , "MH-03-AA-1411" , "Fiat Base 500","Sports (1248 CC)" , "Car");
//        TC.vehicleDetails1();
        WebCommands.staticSleep(4000);
        TC.saleDetailsmanual("08-10-2024");
        WebCommands.staticSleep(2000);
        TC.dateEndorsementDtails("09-10-2024","01-10-2025");
        tc_09_to_21_page.PremiumDetails();
        TC.qcDtails("Ready");
        TC.policyDetailmanual();
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID1);
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID);
    }

    @Test(description = "Renewals_TW")
    public void _Health() throws Exception {
//        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Health("Health","Issued","Bharti AXA General Insurance","");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID+"test");
        health_life_page.generalDetailsHealth("New","11-10-2024");
        health_life_page.proposerDetails("Mr");
        health_life_page.addMember();
        WebCommands.staticSleep(4000);
//        TC.saleDetailsmanual("11-10-2024");
//        WebCommands.staticSleep(2000);
//        TC.dateEndorsementDtails("20-10-2024","10-11-2024");
//        tc_09_to_21_page.PremiumDetails();
//        TC.qcDtails("Ready");
//        WebCommands.staticSleep(2000);
//        TC.policyDetailmanual();
//        TC.backArrow.click();
//        create.Motor_productCatagory_Status_insurer("Health","Issued","ONE_ASSIST","Car");
//        String misID1 = junkpolicyl.misId.getText();
//        System.out.println(misID1+"test");
//        TC.generalDetails("New","11-10-2024");
//        TC.proposerDetails("Mr");
//        TC.vehicleDetailsRenewals("Comprehensive" , "MH-03-AA-1411" , "Fiat Base 500","Sports (1248 CC)" , "Car");
////        TC.vehicleDetails1();
//        WebCommands.staticSleep(4000);
//        TC.saleDetailsmanual("08-10-2024");
//        WebCommands.staticSleep(2000);
//        TC.dateEndorsementDtails("09-10-2024","01-10-2025");
//        tc_09_to_21_page.PremiumDetails();
//        TC.qcDtails("Ready");
//        TC.policyDetailmanual();
//        TC.backArrow.click();
//        junkpolicyl.JunkPolicy(misID1);
//        TC.backArrow.click();
//        junkpolicyl.JunkPolicy(misID);
    }


}
