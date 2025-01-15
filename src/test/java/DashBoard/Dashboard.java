package DashBoard;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.DashBoard.Dashboard_Pagee;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.iTestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(iTestListener.class)
@Test(groups = {"Mis_Full","Dashboard", "dash_113To179"})
public class Dashboard extends TestBase {


    public LoginPage ninjaloginpage;
    public Dashboard_Pagee dashboardPage;

    public Dashboard() {super();}

    @BeforeMethod()
    public void start()  {
        initialization();
        ninjaloginpage = new LoginPage();
        dashboardPage = new Dashboard_Pagee();
    }
    @Test

    public void TestCase153() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyCallStatusResetEnable();
    }
    @Test

    public void TestCase154and155and156() throws Exception{
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyCallStatusFilterFunctionality();
    }
    @Test

    public void TestCase160() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyChannelColumnFilterOptions();
    }
    @Test

    public void TestCase161() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyChannelColumnFilterOptions();
    }

    @Test
    public void TestCase159and162() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyChannelColumnFilterOptions();
    }

    @Test
    public void TestCase163and164and165() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyNinjaV1();
    }
    @Test

    public void TestCase168() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyBulkExportError();
    }
    @AfterMethod()
    public void Close() {

        driver.quit();
    }

}
