package ManualAndAutoParseFlowTest;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.ManualAndAutoParseFlowPage.TC_1_12;
import com.qa.turtlemint.pages.common.Mis_newSale;
import com.qa.turtlemint.pages.common.junk;
import com.qa.turtlemint.pages.login.LoginPage;
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
        create.productCatagory_Status_insurer("Motor","Issued","Bajaj Allianz");
        create.Motor_productCatagory_Status_insurer("Car");
        TC.basicDetails("Website","New","09-10-2024");
        TC.saleDetails("09-10-2024");
        TC.policyDetail();

    }








}
