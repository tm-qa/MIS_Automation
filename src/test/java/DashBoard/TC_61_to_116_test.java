package DashBoard;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.Dashboard.TC_61_to_116;
import com.qa.turtlemint.pages.common.junk;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.iTestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.RetryAnalyser;

@Listeners(iTestListener.class)
@Test(groups = {"Mis_Full", "dash_61_116","Dashboard"},retryAnalyzer = RetryAnalyser.class)
public class TC_61_to_116_test extends TestBase {

    public LoginPage ninjaloginpage;
    public junk junkpolicyl;
    public TC_61_to_116 DB;

    public TC_61_to_116_test() {
        super();
    }

    @BeforeMethod()
    public void start() {
        initialization();

        ninjaloginpage = new LoginPage();
        junkpolicyl = new junk();
        DB = new TC_61_to_116();

    }

    @Test()
    public void InsurerALLFilterValuesTest() throws Exception {
//        ninjaloginpage.ninja_MIS();
//        DB.InsurerFilterValue();
    }
    @Test()
    public void InsurerFilterValuePersistTest() throws Exception {
//        ninjaloginpage.ninja_MIS();
//        DB.filterValue();
    }
    @Test()
    public void NewSaleTest() throws Exception {
//        ninjaloginpage.ninja_MIS();
//        DB.NewSale();
    }
    @Test()
    public void NewSaleNegativeTest() throws Exception {
//        ninjaloginpage.ninja_MIS();
//        DB.NewSaleNegative();
    }
    @Test()
    public void ScrollTest() throws Exception {
//        ninjaloginpage.ninja_MIS();
//        DB.scrollValue();
    }

    @Test()
    public void SalesStatusValueTest() throws Exception {
//        ninjaloginpage.ninja_MIS();
//        DB.scrollValue();
    }
    @Test()
    public void SalesStatusFilterTest() throws Exception {
//        ninjaloginpage.ninja_MIS();
//        DB.scrollValue();
    }

    @Test()
    public void RegNoAndPolicyNoSearchTest() throws Exception {
//        ninjaloginpage.ninja_MIS();
//        DB.RegNoAndPolicyNoSearch("GJ-01-Ab-6889","VMTN008989000100");
    }

    @Test()
    public void CreationSourceFilterValueTest() throws Exception {
//        ninjaloginpage.ninja_MIS();
//        DB.RegNoAndPolicyNoSearch("GJ-01-Ab-6889","VMTN008989000100");
    }

    @AfterMethod()
    public void Close() {
          driver.quit();
    }
}
