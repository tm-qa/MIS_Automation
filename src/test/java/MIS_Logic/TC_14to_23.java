package MIS_Logic;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.BI.BI_pages;
import com.qa.turtlemint.pages.MIS_logic_page.mislogic;
import com.qa.turtlemint.pages.common.Mis_newSale;
import com.qa.turtlemint.pages.common.junk;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.RetryAnalyser;
import com.qa.turtlemint.util.iTestListener;
import org.testng.annotations.*;


@Listeners(iTestListener.class)
@Test(groups = {"Mis_Full", "mis_Logic"}, retryAnalyzer = RetryAnalyser.class)
public class TC_14to_23 extends TestBase {
    public LoginPage ninjaloginpage;
    BI_pages bi;
    Mis_newSale flow;
    mislogic logic;
    junk id;


    public TC_14to_23() {
        super();
    }

    @BeforeMethod()
    public void start() throws Exception {
        initialization();
        ninjaloginpage = new LoginPage();
        flow = new Mis_newSale();
        bi = new BI_pages();
        logic = new mislogic();
        id = new junk();
    }


    @Test(retryAnalyzer = RetryAnalyser.class, description = "*** TC_13_14_16_17_18_19 ***Verify Details populated for Payment schedule when case status is issued. ****AND*** Verify if First installment has Due Date = RIsk start date for payment schedule.****AND*** Verify for Life if Net premium autopopulates when Modal Premium (without GST)  and payment frequency are entered.****AND*** Verify for Life if  Service Tax / GST autopopulates when Modal GST and payment frequency are entered.")
    public void TC_13_14_16_17_18_19_20() throws Exception {
        ninjaloginpage.ninja_MIS();
        flow.Motor_productCatagory_Health("Life", "Issued", "Bajaj", "");
        logic.PolicyDetails("10-10-2019", "10-10-2022");
        logic.PolicyHolderDetails("10-10-1994",4,4,"Regular Pay");
        logic.verify("10-10-2019","10-11-2019","10-12-2019");


        String misID = logic.MisID.getAttribute("value");
        System.out.println("**********************************    " + misID + "     *********************************");
        id.JunkPolicyBI(misID,"life");

    }

    @Test(retryAnalyzer = RetryAnalyser.class, description = "***TC 15 ***  if PT > PPT than Payment Type then limited pay.")
    public void TC_15() throws Exception {
        ninjaloginpage.ninja_MIS();
        flow.Motor_productCatagory_Health("Life", "Issued", "Bajaj", "");
        String misID = logic.MisID.getAttribute("value");
        logic.PolicyDetails("10-10-2019", "10-10-2022");
        logic.PolicyHolderDetails("10-10-1994",4,9,"Limited Pay");
        System.out.println("**********************************    " + misID + "     *********************************");
        id.JunkPolicyBI(misID,"life");

    }

    @AfterMethod()
    public void Close() {

        driver.quit();

    }

}
