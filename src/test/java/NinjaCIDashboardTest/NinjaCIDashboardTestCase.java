package NinjaCIDashboardTest;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.Ninja_CI_Page.NinjaCIDashboardPage;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.iTestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(iTestListener.class)
@Test(groups = {"Ninja_Full", "CI_Dashboard"})
public class NinjaCIDashboardTestCase extends TestBase {

    public NinjaCIDashboardPage ncp;
    public LoginPage ninjaloginpage;

    public NinjaCIDashboardTestCase() {
        super();
    }

    @BeforeMethod()
    public void start() {
        initialization();
        ninjaloginpage = new LoginPage();
        ncp = new NinjaCIDashboardPage();
    }

    @Test
    public void dashboard_Test() throws Exception {
        ninjaloginpage.NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        ncp.dashboard();
        LogUtils.info("all the modules present on bi dashboard");
    }

    @Test
    public void CI_Issuance_Tab() throws Exception {
        ninjaloginpage.NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        ncp.Issuance_Tab();
    }

    @Test
    public void CI_cross_sale_filters_test() throws Exception {
        ninjaloginpage.NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        ncp.Issuance_Tab();
        ncp.Issuance_cross_sale_Filter();
    }

    @Test
    public void CI_Insurer_filters_test() throws Exception {
        ninjaloginpage.NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        ncp.Issuance_Tab();
        ncp.Insurer_Filter();
    }

    @Test
    public void CI_Product_Category_Filter() throws Exception {
        ninjaloginpage.NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        ncp.Issuance_Tab();
        ncp.Product_Category_Filter();
    }

    @Test
    public void CI_PaymentMode_Filter() throws Exception {
        ninjaloginpage.NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        ncp.Issuance_Tab();
        ncp.PaymentModeFilter();
    }

    @Test
    public void CI_OwnerTypeFilter() throws Exception {
        ninjaloginpage.NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        ncp.Issuance_Tab();
        ncp.Owner();
    }

    @Test
    public void CI_IssuanceStatusTestFilter() throws Exception {
        ninjaloginpage.NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        ncp.Issuance_Tab();
        ncp.IssuanceStatusFilter();
    }

    @Test
    public void BI_InspectionStatusTest() throws Exception {
        ninjaloginpage.NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        ncp.Issuance_Tab();
        ncp.Filter_InspectionStatus();
    }

    @Test
    public void CI_InspectionSubStatusFilter() throws Exception {
        ninjaloginpage.NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        ncp.Issuance_Tab();
        ncp.InspectionSubStatus();
    }

    @Test
    public void CI_InspectionFilter() throws Exception {
        ninjaloginpage.NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        ncp.Issuance_Tab();
        ncp.InspectionFilter();
    }

    @Test
    public void CI_ProductTypeFilter() throws Exception {
        ninjaloginpage.NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        ncp.Issuance_Tab();
        ncp.ProductTypeFilter();
    }

    @AfterMethod()
    public void Close() {
        driver.quit();
    }
}
