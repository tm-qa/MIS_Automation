package BI;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.BI.BI_pages;
import com.qa.turtlemint.pages.common.Mis_newSale;
import com.qa.turtlemint.pages.common.junk;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.RetryAnalyser;
import com.qa.turtlemint.util.iTestListener;
import org.testng.annotations.*;


@Listeners(iTestListener.class)
@Test(groups = {"Mis_Full", "BI_flow"})
public class BI extends TestBase {
    public LoginPage ninjaloginpage;
    BI_pages bi;
    Mis_newSale flow;
    junk id;


    public BI() {
        super();
    }

    @BeforeMethod()
    public void start() throws Exception {
        initialization();
        ninjaloginpage = new LoginPage();
        flow = new Mis_newSale();
        bi = new BI_pages();
        id = new junk();
    }


    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TC_01() throws Exception {
        ninjaloginpage.ninja_PI();
        flow.PI_productCatagory_Status_insurer("TW", "HDFC ergo");

        bi.PolicyCreateForBI("TW");
        String policyid = id.policyID.getText();
        System.out.println("*****************    " + policyid + "     *******************");
        bi.PolicyUploadforBI();

        id.policyid(policyid);

        String misID = id.idBI.getAttribute("value");
        System.out.println("*****************    " + misID + "     *******************");
        id.JunkPolicyBI(misID,"TW");

    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TC_02() throws Exception {
        ninjaloginpage.ninja_PI();
        //  ninjaloginpage.ninja_MIS();
        flow.PI_productCatagory_Status_insurer("TW", "Bajaj");
        bi.PolicyCreateForBI("TW");
        String policyid = id.policyID.getText();
        System.out.println("*****************    " + policyid + "     *******************");
        bi.PolicyUploadforBI();

        id.policyid(policyid);

        String misID = id.idBI.getAttribute("value");
        System.out.println("*****************    " + misID + "     *******************");
        id.JunkPolicyBI(misID,"TW");


    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TC_03() throws Exception {
        // ninjaloginpage.ninja_MIS();
        flow.PI_productCatagory_Status_insurer("FW", "L&T");
        bi.PolicyCreateForBI("FW");
        bi.PolicyUploadforBI();
        String misID = id.idBI.getAttribute("value");
        System.out.println("*****************    " + misID + "     *******************");
        id.JunkPolicyBI(misID,"FW");

    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TC_04() throws Exception {
        // ninjaloginpage.ninja_MIS();
        flow.PI_productCatagory_Status_insurer("FW", "HDFC Ergo Health");
        bi.PolicyCreateForBI("FW");
        bi.PolicyUploadforBI();
        String misID = id.idBI.getAttribute("value");
        System.out.println("*****************    " + misID + "     *******************");
        id.JunkPolicyBI(misID,"FW");
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TC_05_12() throws Exception {
        //ninjaloginpage.ninja_MIS();
        flow.PI_productCatagory_HealtLife("LIFE", "Bajaj");
        bi.PolicyCreateForBI_LIfe();
        bi.PolicyUploadforBILIFE();
        String misID = id.idBI.getAttribute("value");
        System.out.println("**********************************    " + misID + "     *********************************");
        id.JunkPolicyBI(misID,"life");

    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TC_06() throws Exception {
        //  ninjaloginpage.ninja_MIS();
       // flow.Motor_productCatagory_Status_insurer("TW", "Issued", "NAVI", "TW");
        flow.PI_productCatagory_Status_insurer("TW", "NAVI");
        bi.PolicyCreateForBI("TW");
        String policyid = id.policyID.getText();
        System.out.println("*****************    " + policyid + "     *******************");
        bi.PolicyUploadforBI();

        id.policyid(policyid);

        String misID = id.idBI.getAttribute("value");
        System.out.println("*****************    " + misID + "     *******************");
        id.JunkPolicyBI(misID,"TW");

    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TC_07() throws Exception {
        // ninjaloginpage.ninja_MIS();
        flow.PI_productCatagory_Status_insurer("FW", "NAVI");
        bi.PolicyCreateForBI("FW");
        bi.PolicyUploadforBI();
        String misID = id.idBI.getAttribute("value");
        System.out.println("*****************    " + misID + "     *******************");
        id.JunkPolicyBI(misID,"FW");

    }

//    @Test(retryAnalyzer = RetryAnalyser.class)
//    public void TC_08() throws Exception {
//        // ninjaloginpage.ninja_MIS();
//     //   flow.PI_productCatagory_HealtLife("HEALTH", "Liberty");
//      //  bi.PolicyCreateForBI_LIfe();
//
//    }


    @AfterMethod()
    public void Close() {
           driver.quit();
    }
}
