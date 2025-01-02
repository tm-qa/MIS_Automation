package Manual_Autoparse;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.manualautoparse.TC_09_TO_21_Page;
import com.qa.turtlemint.util.iTestListener;
import org.testng.annotations.*;
import util.RetryAnalyser;


@Listeners(iTestListener.class)
@Test(groups = {"Mis_Full", "TC_09_TO_21_Test"},retryAnalyzer = RetryAnalyser.class)
public class TC_09_TO_21_Test extends TestBase {
    public LoginPage ninjaloginpage;
    public TC_09_TO_21_Page TC_09_TO_21_Page;


    public TC_09_TO_21_Test() {
        super();
    }

    @BeforeMethod()
    public void start() throws Exception {
        initialization();
        ninjaloginpage = new LoginPage();
        TC_09_TO_21_Page = new TC_09_TO_21_Page();
    }

    @Test()
    public void TC_09() throws Exception {
        ninjaloginpage.ninja_MIS();
        TC_09_TO_21_Page.commonflow("Motor", "Issued", "L&T", "Car");
        TC_09_TO_21_Page.TC_09();
    }

    @Test()
    public void TC_21() throws Exception {
        ninjaloginpage.ninja_MIS();
        TC_09_TO_21_Page.commonflowLife("Life", "Issued", "Bajaj Allianz LI");
        TC_09_TO_21_Page.TC_21();
    }


    @AfterMethod()
    public void Close() {
        driver.quit();
    }
}
