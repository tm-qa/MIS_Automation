package Manual_Autoparse;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.common.Mis_newSale;
import com.qa.turtlemint.pages.common.junk;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.manualautoparse.TC_1_12;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.RetryAnalyser;

@Test(groups = {"Mis_Full","TC_1_12_test"},retryAnalyzer = RetryAnalyser.class)
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
        create.Motor_productCatagory_Status_insurer("Motor","Issued","Bajaj Allianz","Car");

    }
    @Test()
    public void TC5() throws Exception {
        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Status_insurer("Motor","Issued","Bajaj Allianz","Car");

    }
    @Test()
    public void TC6() throws Exception {
        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Status_insurer("Motor","Issued","Bajaj Allianz","Car");
    }
    @Test()
    public void TC7() throws Exception {

        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Status_insurer("Motor","Issued","Bajaj Allianz","Car");
    }
    public void TC8() throws Exception {

        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Status_insurer("Motor","Issued","Bajaj Allianz","Car");
    }

    @Test()
    public void TC9() throws Exception {

        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Status_insurer("Motor","Issued","Bajaj Allianz","Car");
    }
    @Test()
    public void TC10() throws Exception {
        ninjaloginpage.ninja_MIS();
        create.Motor_productCatagory_Status_insurer("Motor","Issued","Bajaj Allianz","Car");
    }













}
