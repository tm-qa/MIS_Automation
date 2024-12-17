package DashBoard;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.DashBoard.Dashborad_page;
import com.qa.turtlemint.pages.common.Mis_newSale;
import com.qa.turtlemint.pages.common.junk;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

@Test(groups = {"Mis_Full","Dashboard"})
public class Mis_Dashboard extends TestBase {
    public LoginPage ninjaloginpage;
    public junk junkpolicyl;
    public Mis_newSale create;
    public Dashborad_page dashborad_page;

    public Mis_Dashboard() {super();}

    @BeforeMethod()
    public void start() throws Exception {
        initialization();
        ninjaloginpage = new LoginPage();
        dashborad_page =  new Dashborad_page();

    }
    @Test (description = " verify MIS Login")
    public void verifyMis() throws Exception {
        ninjaloginpage.ninja_MIS();
        TestUtil.getFullPageScreenShot();
    }

    @Test(description = " verify all Dashboard tabs Login")
    public void verifyDashboardTabs() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashborad_page.verifyDashboardTabs();

    }
    @Test(description = " verify all Dashboard columns Login")
    public void verifyDashboardColumns() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashborad_page.verifyDashboardColumns();
    }
    @Test(description = "verify hamburger")
    public void verifyHamburger() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashborad_page.hamburger();
    }
    @Test (description = "verify hamburger modules")
    public void verifyHamburgerAndModules() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashborad_page.hamburgerModules();
    }
    @Test(description = "verify date range with all filer by combinations")
    public void verifyDateRangeAndFilyerByCombinations() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashborad_page.VerifydateRangeAndFilterByCombination();
    }
    @Test(description = "verify date range")
    public void verifyDateRange() throws Exception {
        ninjaloginpage.ninja_MIS();
        dashborad_page.verifyDateRange();
    }

    @AfterMethod()
    public void Close() {
        driver.quit();
    }
}
