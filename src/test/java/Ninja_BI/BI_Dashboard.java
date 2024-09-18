package Ninja_BI;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.iTestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.RetryAnalyser;
@Listeners(iTestListener.class)
@Test(groups = {"Ninja_Full", "BI_Dashboard"})
public class BI_Dashboard extends TestBase {
    public com.qa.turtlemint.pages.Ninja_BI_Page.BI_Dashboard bi_dashboard;
    public LoginPage ninjaloginpage;

    public BI_Dashboard() {super();}

    @BeforeMethod()
    public void start() throws Exception {
        initialization();
        ninjaloginpage = new LoginPage();
        bi_dashboard = new com.qa.turtlemint.pages.Ninja_BI_Page.BI_Dashboard();
        ninjaloginpage.ninja_BI();
        bi_dashboard.Issuance();
    }
    @Test(retryAnalyzer = RetryAnalyser.class)
    public void PaymentModeFilterTest() throws Exception {bi_dashboard.Filter_PaymentMode();}

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void OwnerFilterTest() throws Exception {bi_dashboard.Filter_Owner();}

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void IssuanceFilterTest() throws Exception {bi_dashboard.Filter_IssuanceStatus();}

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void PIbranchFilterTest() throws Exception {bi_dashboard.Filter_PIbranch();}

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void InspectionStatusFilterTest() throws Exception {bi_dashboard.Filter_InspectionStatus();}

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void InspectionSubStatusFilterTest() throws Exception {bi_dashboard.Filter_InspectionSubStatus();}

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void InspectionFilterTest() throws Exception {bi_dashboard.Filter_Inspection();}

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void ProductTypeFilterTest() throws Exception {bi_dashboard.Filter_ProductType();}

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void ClearALLFilterTest() throws Exception {bi_dashboard.Filter_ClearAll();
    }

    @AfterMethod()
    public void Close() {
        driver.quit();
    }


}

