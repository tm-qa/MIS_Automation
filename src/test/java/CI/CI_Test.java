package CI;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.CI.*;

import com.qa.turtlemint.pages.login.LoginPage;

import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import com.qa.turtlemint.util.iTestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.RetryAnalyser;



@Listeners(iTestListener.class)
@Test(groups = {"Mis_Full", "CI"})
public class CI_Test extends TestBase {

    public CI_Test() {
        super();
    }

    public String uID;
    public String sanityserver;

    CI_fw_pages ci;
    LoginPage loginpage;

    CI_health he;
    CI_life li;
    CI_CV cv;
    CI_NINJA ni;
    TestUtil tl = new TestUtil();



    @BeforeMethod()
    public void start() throws InterruptedException {
        initialization();
        ci = new CI_fw_pages();
        loginpage = new LoginPage();

        he = new CI_health();
        li = new CI_life();
        cv = new CI_CV();
        ni = new CI_NINJA();

        loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));


    }


    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void FW_Icici_InspectionTPToCompFlowWithExpiringTodayOrTomorrow() throws Exception
    {
        he.ValidateMotorFWClick();
        ci.CreateQuoteWithRegNumber();
        ci.SelectRegDate();
        ci.SaveCarDetails(prop.getProperty("Model"));
        ci.comprehensiveSelect();
        ci.Expired_less_than_90_days_ago();
        ci.thirdPartySelect();
        loginpage.SaveLead(tl.NameGenerator());
        he.GotIT();
        uID = ci.getUniqueID();
        ci.iciciProceedtoNONPaydBuy();
        ci.cKyc();
        ci.ICICIinspectionTpToCP(tl.firstname, tl.lastname);
        sanityserver = driver.getCurrentUrl();
        if (sanityserver.contains("sanity")) {
            ni.ninjaInspectionPCV(uID);
        }
        else
        {
            System.out.println("***************************** This is prod server soCancelled inspection *****************************");
            ni.InspectionCancalledGCV(uID);
            System.out.println("*****************************Cancellation successfully done on prod server inspection *****************************");
        }
    }

    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Health_Individual_CI() throws Exception {
        he.ValidateHealthClick();
        he.HealthInsuranceClick();
        he.Profile_page_Individual("male", "27", "122003");
        loginpage.SaveLead1(tl.NameGenerator());
        he.VewDetaisandBuynow("ProHealth Prime Advantage");
        he.CKYCdetails("niva");
        he.CheckoutCompairPlan();
        if (sanityserver.contains("mintpro")) {
            System.out.println("***************************** This is prod server so not doing Payment *****************************");

            LogUtils.info("Checkout flow completed");

        } else {
            System.out.println("***************************** This is not a prod  server so doing Payment *****************************");

        }
    }

    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void lifeTC() throws Exception {
        li.ValidateLifeClick();
        li.TermLifeClick();
        li.TataSRSLifeProfilePage();
        String uID = li.getUniqueID();
        li.EtouchResult();
        li.checkout();
        li.checkmarks();
        li.issuedPolicyThroughNinja(uID);
        li.junkMarkPolicy();
        LogUtils.info("Policy Issued and Junk Marked Successfully For Life");
    }

    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void CV_inspectionCP_CP_Expired_more_than_90_days_ago() throws Exception {

        cv.ValidateMotorCVClick();
        cv.Select_Category();
        ci.CreateQuoteWithRegNumber();
        cv.RolloverCVRegLocPublic();
        cv.comprehensiveSelect();
        cv.Expired_more_than_90_days_ago();
        cv.DIGIT_Insurer_Select();
        cv.SaveCVDetailsGCV();
        loginpage.SaveLead(tl.NameGenerator());
        ci.GotIT();
        uID = ci.getUniqueID();
        cv.DIGITProccedtoBuy();
        ci.cKyc();
        cv.DigitInspectionMoreThan90(tl.firstname, tl.lastname);
        if (sanityserver.contains("sanity")) {
            ni.InspectionCancalledGCV(uID);
        } else {
            LogUtils.info("***************************** This is prod server soCancelled inspection *****************************");
            ni.InspectionCancalledGCV(uID);
            LogUtils.info("*****************************Cancellation successfully done on prod server inspection *****************************");
        }
    }


    @AfterMethod
    public void Close() {
        driver.quit();
    }
}
