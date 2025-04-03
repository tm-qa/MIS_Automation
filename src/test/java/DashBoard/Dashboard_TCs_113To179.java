package DashBoard;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.DashBoard.Dashboard_Pagee;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.RetryAnalyser;
import com.qa.turtlemint.util.iTestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(iTestListener.class)
@Test(groups = {"Mis_Full","Dashboard", "dash_113To179"})
public class Dashboard_TCs_113To179 extends TestBase {

    public LoginPage ninjaloginpage;
    public Dashboard_Pagee dashboardPage;

    public Dashboard_TCs_113To179() {super();}

    @BeforeMethod()
    public void start()  {
        initialization();
        ninjaloginpage = new LoginPage();
        dashboardPage = new Dashboard_Pagee();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TestCase113() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyChannelColumnFilterOptions();
    }


    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TestCase114() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.ChannelFilterFunctionality();
    }
    @Test(retryAnalyzer = RetryAnalyser.class)

    public void TestCase115() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyResetButtonDisable();
    }
    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TestCase116() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyResetButtonEnabled();
    }
    @Test(retryAnalyzer = RetryAnalyser.class)

    public void TestCase117and118and119() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyOKButtonFunctionalityForChannelFilter();
    }
    @Test(retryAnalyzer = RetryAnalyser.class)

    public void TestCase120() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyCategoryColumnFilterOptions();
    }
    @Test(retryAnalyzer = RetryAnalyser.class)

    public void TestCase121() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.CategoryFilterFunctionality();
    }
    @Test(retryAnalyzer = RetryAnalyser.class)

    public void TestCase122and123and124() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifySelectAllItemsForCategory();
    }
    @Test(retryAnalyzer = RetryAnalyser.class)

    public void TestCase125() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyResetButtonCategoryColumn();
    }
    @Test(retryAnalyzer = RetryAnalyser.class)

    public void TestCase126() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyResetButtonEnabledCategory();
    }
    @Test(retryAnalyzer = RetryAnalyser.class)

    public void TestCase127and128and129() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyOkButtonForCategoryColumn();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TestCase130() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyChannelColumnFilterOptions();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TestCase131and132and133() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyChannelColumnFilterOptions();
    }
    @Test(retryAnalyzer = RetryAnalyser.class)

    public void TestCase134and135() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyChannelColumnFilterOptions();
    }
    @Test(retryAnalyzer = RetryAnalyser.class)

    public void TestCase136() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyChannelColumnFilterOptions();
    }
    @Test(retryAnalyzer = RetryAnalyser.class)

    public void TestCase137() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyChannelColumnFilterOptions();
    }
    @Test(retryAnalyzer = RetryAnalyser.class)

    // Test Cases 138, 139 and 140 are covered in TestCase134and135.
    public void TestCase141and142() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyChannelColumnFilterOptions();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TestCase145() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyChannelColumnFilterOptions();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TestCase146() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyChannelColumnFilterOptions();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TestCase143and144and147and148and149() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyChannelColumnFilterOptions();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TestCase150and151() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyCallStatusOptions();
    }
    @Test(retryAnalyzer = RetryAnalyser.class)
    public void TestCase152() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyCallStatusResetDisable();
    }


    @AfterMethod()
    public void Close() {

        driver.quit();
    }

}
