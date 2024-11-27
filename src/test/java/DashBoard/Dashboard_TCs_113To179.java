package DashBoard;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.DashBoard.Dashboard_Pagee;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.iTestListener;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(iTestListener.class)
@Test(groups = {"Ninja_Full", "dash_113To179"})
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

    @Test
    public void TestCase113() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyChannelColumnFilterOptions();
    }

    public void TestCase114() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.ChannelFilterFunctionality();
    }

    public void TestCase115() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyResetButtonDisable();
    }
    public void TestCase116() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyResetButtonEnabled();
    }

    public void TestCase117and118and119() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyOKButtonFunctionalityForChannelFilter();
    }

    public void TestCase120() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyCategoryColumnFilterOptions();
    }

    public void TestCase121() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.CategoryFilterFunctionality();
    }

    public void TestCase122and123and124() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifySelectAllItemsForCategory();
    }

    public void TestCase125() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyResetButtonCategoryColumn();
    }

    public void TestCase126() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyResetButtonEnabledCategory();
    }

    public void TestCase127and128and129() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyOkButtonForCategoryColumn();
    }

    public void TestCase130() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyInsureColumnOptions();
    }

    public void TestCase131and132and133() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifySearchInFiltersVisible();
    }

    public void TestCase134and135() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyInsurerFilterFunctionality();
    }

    public void TestCase136() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyInsurerColumnResetButtonDisable();
    }

    public void TestCase137() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyInsurerColumnResetButtonEnable();
    }

    // Test Cases 138, 139 and 140 are covered in TestCase134and135.
    public void TestCase141and142() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyIssuanceStatusOptions();
    }

    public void TestCase145() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyIssuanceStatusResetDisabled();
    }

    public void TestCase146() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyIssuanceStatusResetEnabled();
    }

    public void TestCase143and144and147and148and149() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyIssuanceStatusFunctionality();
    }

    public void TestCase150and151() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyCallStatusOptions();
    }

    public void TestCase152() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyCallStatusResetDisable();
    }

    public void TestCase153() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyCallStatusResetEnable();
    }

    public void TestCase154and155and156() throws Exception{
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyCallStatusFilterFunctionality();
    }

    public void TestCase160() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyPaginationVisible();
    }

    public void TestCase161() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyPaginationNext();
    }

    public void TestCase159and162() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyRowsPerPage();
    }

    public void TestCase163and164and165() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyNinjaV1();
    }

    public void TestCase168() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashboardPage.VerifyBulkExportError();
    }



}
