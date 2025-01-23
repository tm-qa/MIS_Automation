package BI;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.BI.BI_pages;
import com.qa.turtlemint.pages.common.Mis_newSale;
import com.qa.turtlemint.pages.common.junk;
import com.qa.turtlemint.pages.login.LoginPage;
import org.testng.annotations.*;

public class BI extends TestBase {
    public LoginPage ninjaloginpage;
    BI_pages bi;
    Mis_newSale flow;
    junk id;


    public BI() {
        super();
    }

    @BeforeClass()
    public void start() throws Exception {
        initialization();
        ninjaloginpage = new LoginPage();
        flow = new Mis_newSale();
        bi = new BI_pages();
        id = new junk();

        ninjaloginpage.ninja_PI();
    }

    @BeforeMethod
    public void a() {
        ninjaloginpage.loginless();

    }

    @Test()
    public void TC_01() throws Exception {
        flow.PI_productCatagory_Status_insurer("TW", "HDFC ergo");
        bi.PolicyCreateForBI("TW");
        bi.PolicyUploadforBI();
//        String misID = id.idBI.getAttribute("value");
//        System.out.println("*****************    " + misID + "     *******************");
//        id.JunkPolicyBI(misID);

    }

    @Test()
    public void TC_02() throws Exception {
        //  ninjaloginpage.ninja_MIS();
        flow.PI_productCatagory_Status_insurer("TW", "Bajaj");
        bi.PolicyCreateForBI("TW");
        bi.PolicyUploadforBI();
//        String misID = id.idBI.getAttribute("value");
//        System.out.println("*****************    " + misID + "     *******************");
//        id.JunkPolicyBI(misID);


    }

    @Test()
    public void TC_03() throws Exception {
        // ninjaloginpage.ninja_MIS();
        flow.PI_productCatagory_Status_insurer("FW", "L&T");
        bi.PolicyCreateForBI("FW");
        bi.PolicyUploadforBI();
//        String misID = id.idBI.getAttribute("value");
//        System.out.println("*****************    " + misID + "     *******************");
//        id.JunkPolicyBI(misID);

    }

    @Test()
    public void TC_04() throws Exception {
        // ninjaloginpage.ninja_MIS();
        // flow.Motor_productCatagory_Status_insurer("Motor", "Issued", "HDFC Ergo Health", "Car");
        flow.PI_productCatagory_Status_insurer("FW", "HDFC Ergo Health");
        bi.PolicyCreateForBI("FW");
        bi.PolicyUploadforBI();
//        String misID = id.idBI.getAttribute("value");
//        System.out.println("*****************    " + misID + "     *******************");
//        id.JunkPolicyBI(misID);
    }

    @Test()
    public void TC_05_12() throws Exception {
        //ninjaloginpage.ninja_MIS();
        flow.PI_productCatagory_HealtLife("LIFE", "Bajaj");
        bi.PolicyCreateForBI_LIfe();
        bi.PolicyUploadforBILIFE();
        String misID = id.idBI.getAttribute("value");
        System.out.println("**********************************    " + misID + "     *********************************");
        id.JunkPolicyBI(misID);

    }

    @Test()
    public void TC_06() throws Exception {
        //  ninjaloginpage.ninja_MIS();
       // flow.Motor_productCatagory_Status_insurer("TW", "Issued", "NAVI", "TW");
        flow.PI_productCatagory_Status_insurer("TW", "NAVI");
        bi.PolicyCreateForBI("TW");
        bi.PolicyUploadforBI();
//        String misID = id.idBI.getAttribute("value");
//        System.out.println("*****************    " + misID + "     *******************");
//        id.JunkPolicyBI(misID);

    }

    @Test()
    public void TC_07() throws Exception {
        // ninjaloginpage.ninja_MIS();
       // flow.Motor_productCatagory_Status_insurer("Motor", "Issued", "NAVI", "Car");
        flow.PI_productCatagory_Status_insurer("FW", "NAVI");
        bi.PolicyCreateForBI("FW");
        bi.PolicyUploadforBI();
//        String misID = id.idBI.getAttribute("value");
//        System.out.println("*****************    " + misID + "     *******************");
//        id.JunkPolicyBI(misID);

    }

    @Test()
    public void TC_08() throws Exception {
        // ninjaloginpage.ninja_MIS();
        flow.PI_productCatagory_HealtLife("HEALTH", "Liberty");
      //  bi.PolicyCreateForBI_LIfe();

    }


    @AfterClass()
    public void Close() {
           driver.quit();
    }
}
