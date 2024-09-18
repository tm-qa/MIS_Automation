package QuotesRequestTest;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.four_wheeler.CarDetailsPage;
import com.qa.turtlemint.pages.four_wheeler.FWPage;
import com.qa.turtlemint.pages.four_wheeler.FW_RegistrationInfoPage;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.mintpro.GrowPageSellButton;
import com.qa.turtlemint.pages.mintpro.QIS_Lead_Page;
import com.qa.turtlemint.pages.motor.GetQuotePage;
import com.qa.turtlemint.pages.motor.LeadNamePage;
import com.qa.turtlemint.pages.motor.ResultPageCommonElements;
import com.qa.turtlemint.pages.ninja.Ninja_QIS;
import com.qa.turtlemint.util.TestUtil;
import com.qa.turtlemint.util.iTestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(iTestListener.class)
@Test(groups = {"Ninja_Full", "Quote_Request"})
    public class FWandCVQuotesRequestTest extends TestBase {
        public LoginPage loginpage;
        public String uID;
        public String leadName;
        GrowPageSellButton growPage;
        FWPage productspage;
        GetQuotePage reginfo;
        FW_RegistrationInfoPage fw_reginfo;
        CarDetailsPage cdp;
        LeadNamePage leadpage;
        TestUtil tl;
        ResultPageCommonElements rpce;
        Ninja_QIS ni;
        QIS_Lead_Page leadpageQIS;
        public FWandCVQuotesRequestTest() {
            super();
        }

        @BeforeMethod()
        public void start() throws InterruptedException {
            initialization();
            // driver.get(System.getProperty("url"));
            driver.get(prop.getProperty("sanityurl"));
            loginpage = new LoginPage();
            growPage = new GrowPageSellButton();
            productspage = new FWPage();
            reginfo = new GetQuotePage();
            fw_reginfo = new FW_RegistrationInfoPage();
            cdp = new CarDetailsPage();
            tl = new TestUtil();
            leadpage = new LeadNamePage();
            rpce = new ResultPageCommonElements();
            ni = new Ninja_QIS();
            leadpageQIS = new QIS_Lead_Page();

       }

        @Test(enabled = true)
        public void newQisFlow() throws Exception {
            loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
            growPage.ValidateSellButton();
            productspage.ValidateMotorFWClick();
            reginfo.createQuoteWithRCCopy();
            reginfo.Quote_in_a_SnapForNew();
            ni.ninjaQISFlowForNew();
            fw_reginfo.SelectFWRegistrationLocation(prop.getProperty("registrationlocation"));
            cdp.NinjaCarDetails(prop.getProperty("Model"));
            leadName = tl.NameGenerator();
            leadpage.SaveLead(leadName);
            uID = rpce.getUniqueIDForQIS();
            ni.addQuoteforFW();
            ni.checkstatus();
            ni.assertSolved(uID);
            ni.switchToMintPro();
            leadpageQIS.leadPageVerificationForQIS(leadName);
            leadpageQIS.reject();

        }


        @Test(enabled = true)
        public void RenewQisFlow() throws Exception {
            loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
            growPage.ValidateSellButton();
            productspage.ValidateMotorFWClick();
            reginfo.createQuoteWithRCCopy();
            reginfo.Quote_in_a_SnapForRenew();
            ni.ninjaQISFlowForRenew();
            fw_reginfo.SelectFWRegistrationLocation(prop.getProperty("registrationlocation"));
            //   cdp.SaveCarDetails(prop.getProperty("Model"));
            cdp.NinjaCarDetails(prop.getProperty("Model"));
            leadName = tl.NameGenerator();
            leadpage.SaveLead(leadName);
            uID = rpce.getUniqueIDForQIS();
            ni.addQuoteforFW();
            ni.checkstatus();
            ni.assertSolved(uID);
            ni.switchToMintPro();
            leadpageQIS.leadPageVerificationForQIS(leadName);
            leadpageQIS.reject();
        }


        @AfterMethod
        public void Close() {
            driver.quit();
        }


    }








