package Mintpro_CI;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.Mintpro_CI_Page.CI_Life;
import com.qa.turtlemint.pages.Mintpro_CI_Page.LifeLandingPage;
import com.qa.turtlemint.pages.Mintpro_CI_Page.LifePage;
import com.qa.turtlemint.pages.Ninja_CI_Page.ninja;
import com.qa.turtlemint.pages.login.Mintpro_LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.iTestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(iTestListener.class)
@Test(groups = {"Ninja_Full", "CI_Life"})
public class CI_Life_Test extends TestBase {
    public CI_Life_Test() {
        super();
    }

    Mintpro_LoginPage MpLoginpage;
    GrowPageSellButton gp;
    LifePage lp;
    LifeLandingPage llp;
    CI_Life cil;
    ninja ninj;


    @BeforeMethod()
    public void start() throws InterruptedException {
        initialization();
       // driver.get(System.getProperty("url"));
         driver.get(prop.getProperty("sanityurl"));
        MpLoginpage = new Mintpro_LoginPage();
        gp = new GrowPageSellButton();
        lp = new LifePage();
        llp = new LifeLandingPage();
        cil = new CI_Life();
        ninj = new ninja();
        MpLoginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.TermLifeClick();
    }

    @Test(enabled = true)
    public void policyThroughNinja() throws Exception {
        cil.BajajSmartProfilePage();
        String uID = cil.getUniqueID();
        cil.BajajSmartResultPage();
        cil.checkout();
        cil.checkmarks();
        ninj.issuedPolicyThroughNinja(uID);
        ninj.junkMarkPolicy();
        LogUtils.info("Policy Issued and Junk Marked Successfully");
    }

    @AfterMethod()
    public void Close() {
        driver.quit();
    }
}
