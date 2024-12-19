package ManualAndAutoParseFlowTest;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.ManualAndAutoParseFlowPage.TC_1_12;
import com.qa.turtlemint.pages.common.Mis_newSale;
import com.qa.turtlemint.pages.common.junk;
import com.qa.turtlemint.pages.login.LoginPage;
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
        create.Motor_productCatagory_Status_insurer("Motor","Issued","Car");
        String misID = junkpolicyl.policyCkicked.getAttribute("value");
        System.out.println(misID);
        TC.generalDetails("New","19-12-2024","99211001022");
        TC.proposerDetails("Mr");
        TC.vehicleDetails("Comprehensive","GA-05-M-2311");
        TC.vehicleDetails1();
        TC.makeModel();
        TC.variant();
        TC.premiumDetails();
        TC.riskStartDtails("01-01-2025");
        TC.riskEndDtails("01-02-2025");
        TC.qcDtails("Ready");
        TC.saleDetailsmanual("Website","13-12-2024","Turtlemint");
        TC.policyDetail();

        create.Motor_productCatagory_Status_insurer("Motor","Issued","Car");
        String misID1 = junkpolicyl.policyCkicked.getAttribute("value");
        System.out.println(misID1);
        TC.generalDetails("New","19-12-2024","9280100022");
        TC.proposerDetails("Mr");
        TC.vehicleDetails("Comprehensive","GA-05-M-2311");
        TC.vehicleDetails1();
        TC.duplicatePolicyPop();
        TC.makeModel();
        TC.variant();
        TC.premiumDetails();
        TC.riskStartDtails("15-01-2024");
        TC.duplicatePolicyPop();
        TC.riskEndDtails("03-02-2024");
        TC.duplicatePolicyPop();
        TC.qcDtails("Ready");
        TC.saleDetailsmanual("Website","01-01-2025","Turtlemint");
        TC.policyDetail();

    }


}
