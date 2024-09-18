package Ninja_BI;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.Ninja_BI_Page.BI_Dashboard_page;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.iTestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(iTestListener.class)
@Test(groups = {"Ninja_Full", "BI_Dashboard"})
public class BI_Dashboard_test extends TestBase {
    public BI_Dashboard_page bi_dashboard;
    public LoginPage ninjaloginpage;

    public BI_Dashboard_test() {
        super();
    }



    @BeforeMethod()
    public void start() throws Exception {
        initialization();
        ninjaloginpage = new LoginPage();
        bi_dashboard = new BI_Dashboard_page();
        ninjaloginpage.ninja_BI_Dashboard();
    }

    @Test
    public void dashboard_Test()  {
        bi_dashboard.dashboard();
        LogUtils.info("all the modules present on bi dashboard");
    }

    @Test
    public void Issuance_test() {
        bi_dashboard.Issuance();
    }

    @Test
    public void cross_sale_filters_test()  {
        bi_dashboard.Issuance_report_a_sale();
        bi_dashboard.Issuance_cross_sale_Filter();
    }
    @Test
    public void AutoPDF_reading_Status_filter_test()  {
        bi_dashboard.Issuance_report_a_sale();
        bi_dashboard.AutoPDF_reading_Status_Filter();
    }
    @Test
    public void Insurer_filter_test()  {
        bi_dashboard.Issuance_report_a_sale();
        bi_dashboard.Insurer_Filter();
    }


    @Test
    public void Product_Category_Filter_test()  {
        bi_dashboard.Issuance_report_a_sale();
        bi_dashboard.Product_Category_Filter();
    }


    @AfterMethod()
    public void Close() {
        driver.quit();
    }









}
