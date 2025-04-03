package Manual_Autoparse;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.common.Mis_newSale;
import com.qa.turtlemint.pages.common.junk;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.manualautoparse.TC_1_12;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.RetryAnalyser;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(groups = {"Mis_Full","TC_1_12_test"})
public class TC_1_12_test extends TestBase {

    public LoginPage ninjaloginpage;
    public junk junkpolicyl;
    public Mis_newSale create;
    public TC_1_12 TC;


    @BeforeMethod()
    public void start() throws Exception {
        initialization();

        ninjaloginpage = new LoginPage();
        junkpolicyl = new junk();
        create = new Mis_newSale();
        TC = new TC_1_12();
        ninjaloginpage.ninja_MIS();

    }

    @Test(description = "Motor autoparsing flow", retryAnalyzer = RetryAnalyser.class)
    public void TC1() throws Exception {

        create.Motor_productCatagory_Status_insurer("Motor","Issued","Bajaj Allianz","Car");
        String misID = junkpolicyl.misId.getAttribute("value");
        System.out.println(misID);
        TC.basicDetails("Website","New","09-10-2024");
        TC.saleDetails("09-10-2024");
        TC.policyDetail();

    }

    @Test(description = "TW autoparsing flow",retryAnalyzer = RetryAnalyser.class)
    public void TC3() throws Exception {
        create.Motor_productCatagory_Status_insurer("TW","Issued","HDFC Ergo","TW");
        String misID = junkpolicyl.misId.getAttribute("value");
        System.out.println(misID);
        TC.basicDetails("Website","New","09-12-2024");
        TC.saleDetails("09-12-2024");
        TC.policyDetail();

    }
    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TC5() throws Exception {
//        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Status_insurer("Motor","Pending from TM","Tata Aig","Car");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID+"test");
        TC.generalDetails("New","09-12-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetails("Comprehensive");
        TC.dateEndorsementDtails("23-10-2025","23-10-2026");
        TC.qcDtails("Ready");
        TC.saleDetailsmanual("09-10-2024");
        TC.policyDetailmanual();
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID);

    }
    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TC6() throws Exception {
//        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Status_insurer("Motor","Pending from TM","HDFC Ergo","Car");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID);
        TC.generalDetails("Rollover","11-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetails("OD");
        TC.makeModelMotor("Fiat Base 500");
        TC.variant();
        TC.vehicleDetails1();
        TC.dateEndorsementDtailsod("23-10-2024","23-10-2025");
        TC.qcDtails("Ready");
        TC.saleDetailsmanual("11-10-2024");
        TC.policyDetailmanual();
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID);
    }
    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TC7() throws Exception {

//        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Status_insurer("Motor","Pending from TM","HDFC Ergo","PCV");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID);
        TC.generalDetails("New","11-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetails("Comprehensive");
        TC.vehicleDetailsPCV("SCHOOL_BUS","Public");
        TC.makeModelMotor("MAHINDRA INTL FJ 470 20");
        TC.addVariant(", CC: 1, Seating: 20");
        TC.vehicleDetails1();
        TC.dateEndorsementDtails("23-10-2024","23-10-2025");
        TC.qcDtails("Ready");
        TC.saleDetailsmanual("11-10-2024");
        TC.policyDetailmanual();
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID);
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TC8() throws Exception {
        create.Motor_productCatagory_Status_insurer("Motor","Pending from TM","HDFC Ergo","GCV");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID);
        TC.generalDetails("New","11-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetails("OD");
//        TC.vehicleDetailsPCV("SCHOOL_BUS","Public");
        TC.makeModelMotor("Fiat Base 500");
        TC.addVariant("Abarth 595 Competizione (1368 CC)");
        TC.vehicleDetails1();
        TC.dateEndorsementDtailsod("23-10-2024","23-10-2025");
        TC.qcDtails("Ready");
        TC.saleDetailsmanual("11-10-2024");
        TC.policyDetailmanual();
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID);
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TC9() throws Exception {
        create.Motor_productCatagory_Status_insurer("TW","Pending from TM","Reliance","TW");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID);
        TC.generalDetails("New","11-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetails("OD");
        TC.makeModel();
        TC.addVariant("Lithium-Ion 60V 28Ah (1 CC)");
        TC.vehicleDetails1();
        TC.dateEndorsementDtailsod("23-10-2024","23-10-2025");
        TC.premiumDetailsTw();
        TC.qcDtails("Ready");
        TC.saleDetailsmanual("11-10-2024");
        TC.policyDetailmanual();
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID);
    }
    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TC10() throws Exception {
        create.Motor_productCatagory_Status_insurer("TW","Pending from TM","Reliance","TW");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID);
        TC.generalDetails("New","11-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetails("OD");
        TC.makeModel();
        TC.addVariant("Lithium-Ion 60V 28Ah (1 CC)");
        TC.vehicleDetails1();
        TC.dateEndorsementDtailsod("23-10-2024","23-10-2025");
        TC.premiumDetailsTw();
        TC.qcDtails("Ready");
        TC.saleDetailsmanual("11-10-2024");
        TC.policyDetailmanual();
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID);
    }

    @AfterMethod()
    public void Close() {

       driver.quit();
    }

}