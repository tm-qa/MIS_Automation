package ManualAndAutoParseFlowTest;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.ManualAndAutoParseFlowPage.TC_1_12;
import com.qa.turtlemint.pages.common.Mis_newSale;
import com.qa.turtlemint.pages.common.junk;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_1_12_test extends TestBase {

    public LoginPage ninjaloginpage;
    public junk junkpolicyl;
    public Mis_newSale create;
    public TC_1_12 TC;

    @BeforeMethod()
    public void start()  {
        initialization();

        ninjaloginpage = new LoginPage();
        junkpolicyl = new junk();
        create = new Mis_newSale();
        TC = new TC_1_12();


    }

    @Test()
    public void TC1() throws Exception {
        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Status_insurer("Motor","Issued","Bajaj Allianz","Car");
        String misID = junkpolicyl.policyCkicked.getAttribute("value");
        System.out.println(misID);
        TC.basicDetails("Website","New","09-10-2024");
        TC.saleDetails("09-10-2024");
        TC.policyDetail();

    }

    @Test()
    public void TC3() throws Exception {
        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Status_insurer("TW","Issued","HDFC Ergo","TW");
        String misID = junkpolicyl.policyCkicked.getAttribute("value");
        System.out.println(misID);
        TC.basicDetails("Website","New","09-10-2024");
        TC.saleDetails("09-10-2024");
        TC.policyDetail();

    }
    @Test()
    public void TC5() throws Exception {
        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Status_insurer("Motor","Pending from TM","HDFC Ergo","Car");
        String misID = junkpolicyl.policyCkicked.getText();
        System.out.println(misID);
        TC.generalDetails("New","09-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetails("Comprehensive");
        TC.dateEndorsementDtails("23-10-2024","23-10-2025");
        TC.qcDtails("Ready");
        TC.saleDetailsmanual("09-10-2024");
        TC.policyDetailmanual();

    }
    @Test()
    public void TC6() throws Exception {
        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Status_insurer("Motor","Pending from TM","HDFC Ergo","Car");
        String misID = junkpolicyl.policyCkicked.getText();
        System.out.println(misID);
        TC.generalDetails("Rollover","11-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetails("OD");
        TC.makeModel();
        TC.variant();
        TC.vehicleDetails1();
        TC.dateEndorsementDtailsod("23-10-2024","23-10-2025");
        TC.qcDtails("Ready");
        TC.saleDetailsmanual("11-10-2024");
        TC.policyDetailmanual();
    }
    @Test()
    public void TC7() throws Exception {

        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Status_insurer("Motor","Pending from TM","HDFC Ergo","PCV");
        String misID = junkpolicyl.policyCkicked.getText();
        System.out.println(misID);
        TC.generalDetails("New","11-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetails("OD");
        TC.vehicleDetailsPCV("SCHOOL_BUS","Public");
        TC.makeModel();
        TC.variant();
        TC.vehicleDetails1();
        TC.dateEndorsementDtailsod("23-10-2024","23-10-2025");
        TC.qcDtails("Ready");
        TC.saleDetailsmanual("11-10-2024");
        TC.policyDetailmanual();
    }
    public void TC8() throws Exception {

        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Status_insurer("Motor","Pending from TM","HDFC Ergo","GCV");
        String misID = junkpolicyl.policyCkicked.getText();
        System.out.println(misID);
        TC.generalDetails("New","11-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetails("OD");
        TC.vehicleDetailsPCV("SCHOOL_BUS","Public");
        TC.makeModel();
        TC.variant();
        TC.vehicleDetails1();
        TC.dateEndorsementDtailsod("23-10-2024","23-10-2025");
        TC.qcDtails("Ready");
        TC.saleDetailsmanual("11-10-2024");
        TC.policyDetailmanual();
    }

    @Test()
    public void TC9() throws Exception {

        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Status_insurer("TW","Pending from TM","Reliance","TW");
        String misID = junkpolicyl.policyCkicked.getText();
        System.out.println(misID);
        TC.generalDetails("New","11-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetails("OD");
        TC.vehicleDetailsPCV("SCHOOL_BUS","Public");
        TC.makeModel();
        TC.variant();
        TC.vehicleDetails1();
        TC.dateEndorsementDtailsod("23-10-2024","23-10-2025");
        TC.premiumDetails();
        TC.qcDtails("Ready");
        TC.saleDetailsmanual("11-10-2024");
        TC.policyDetailmanual();
    }
    @Test()
    public void TC10() throws Exception {

        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Status_insurer("TW","Pending from TM","Reliance","TW");
        String misID = junkpolicyl.policyCkicked.getText();
        System.out.println(misID);
        TC.generalDetails("New","11-10-2024");
        TC.proposerDetails("Mr");
        TC.vehicleDetails("OD");
        TC.vehicleDetailsPCV("SCHOOL_BUS","Public");
        TC.makeModel();
        TC.variant();
        TC.vehicleDetails1();
        TC.dateEndorsementDtailsod("23-10-2024","23-10-2025");
        TC.premiumDetails();
        TC.qcDtails("Ready");
        TC.saleDetailsmanual("11-10-2024");
        TC.policyDetailmanual();
    }

    











}
