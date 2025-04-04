package Renewals_Rollover;


import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.common.Mis_newSale;
import com.qa.turtlemint.pages.common.junk;
import com.qa.turtlemint.pages.login.LoginPage;
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

    @BeforeMethod()
    public void start() throws Exception {
        initialization();

        ninjaloginpage = new LoginPage();
        junkpolicyl = new junk();
        create = new Mis_newSale();
        TC = new TC_1_12();
        tc_09_to_21_page = new TC_09_TO_21_Page();
        ninjaloginpage.ninja_MIS();

    }

    @Test(description = "Renewals_TW")
    public void Renewals_TW() throws Exception {
//        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Status_insurer("Motor","Issued","Universal Sompo","Car");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID+"test");
        TC.generalDetails("New","11-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetailsRenewals("Comprehensive" , "MH-03-AA-1011" , "Fiat Base 500","Sports (1248 CC)" , "Car");
        TC.vehicleDetails1();
        TC.saleDetailsmanual("11-10-2024");
        TC.dateEndorsementDtails("23-10-2024","10-11-2024");
        tc_09_to_21_page.PremiumDetails();
        TC.qcDtails("Ready");
        TC.policyDetailmanual();
        TC.backArrow.click();

        create.Motor_productCatagory_Status_insurer("Motor","Issued","Universal Sompo","Car");
        String misID1 = junkpolicyl.misId.getText();
        System.out.println(misID1+"test");
        TC.generalDetails("New","11-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetailsRenewals("Comprehensive" , "MH-03-AA-1011" , "Fiat Base 500","Sports (1248 CC)" , "Car");
        TC.vehicleDetails1();
        TC.saleDetailsmanual("11-10-2024");
        TC.dateEndorsementDtails("25-10-2024","05-11-2024");
        tc_09_to_21_page.PremiumDetails();
        TC.qcDtails("Ready");
        TC.policyDetailmanual();
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID1);
        junkpolicyl.JunkPolicy(misID);

    }

}
