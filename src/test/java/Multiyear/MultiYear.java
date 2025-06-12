package Multiyear;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.common.Mis_newSale;
import com.qa.turtlemint.pages.common.junk;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.manualautoparse.Health_Life_Page;
import com.qa.turtlemint.pages.manualautoparse.TC_09_TO_21_Page;
import com.qa.turtlemint.pages.manualautoparse.TC_1_12;
import com.qa.turtlemint.util.RetryAnalyser;
import com.qa.turtlemint.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MultiYear extends TestBase {


    public LoginPage ninjaloginpage;
    public junk junkpolicyl;
    public Mis_newSale create;
    public TC_1_12 TC;
    public TC_09_TO_21_Page tc_09_to_21_page;
    public Health_Life_Page health_life_page;
    @BeforeMethod()
    public void start() throws Exception {
        initialization();

        ninjaloginpage = new LoginPage();
        junkpolicyl = new junk();
        create = new Mis_newSale();
        TC = new TC_1_12();
        tc_09_to_21_page = new TC_09_TO_21_Page();
//        ninjaloginpage.ninja_MIS();
        health_life_page = new Health_Life_Page();

    }

    @Test(description = "Multi Year compherensive" )
    public void MultiYear_Comp() throws Exception {
        ninjaloginpage.ninja_MIS();
        WebCommands.staticSleep(2000);
        create.Motor_productCatagory_Status_insurer("Motor","Pending from Insurer","L&T","Car");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID+"test");
        TC.vehicleDetailsMultiYear("Comprehensive");
        LocalDate futureDate = LocalDate.now().plusDays(548);
        LocalDate futureDate1 = LocalDate.now().plusDays(365);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = futureDate.format(formatter);
        String formattedDate1 = futureDate1.format(formatter);
        TC.dateEndorsementDtails(TestUtil.PresentDate(),formattedDate);
        TC.tmbrokercodecheckboxmanual();
        TC.multiYear(TestUtil.PresentDate() , formattedDate1);
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID);
    }
    @Test(description = "Multi Year OD" )
    public void MultiYear_OD() throws Exception {
        ninjaloginpage.ninja_MIS();
        WebCommands.staticSleep(2000);
        create.Motor_productCatagory_Status_insurer("Motor","Pending from Insurer","L&T","Car");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID+"test");
        TC.vehicleDetailsMultiYear("OD");
        LocalDate futureDate = LocalDate.now().plusDays(548);
        LocalDate futureDate1 = LocalDate.now().plusDays(365);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = futureDate.format(formatter);
        String formattedDate1 = futureDate1.format(formatter);
        TC.dateEndorsementDtailsod(TestUtil.PresentDate(),formattedDate);
        TC.tmbrokercodecheckboxmanual();
        TC.multiYear(TestUtil.PresentDate() , formattedDate1);
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID);
    }

    @Test(description = "Multi Year TP" )
    public void MultiYear_TP() throws Exception {
        ninjaloginpage.ninja_MIS();
        WebCommands.staticSleep(2000);
        create.Motor_productCatagory_Status_insurer("Motor","Pending from Insurer","L&T","Car");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID+"test");
        TC.vehicleDetailsMultiYear("Third party");
        LocalDate futureDate = LocalDate.now().plusDays(548);
        LocalDate futureDate1 = LocalDate.now().plusDays(365);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = futureDate.format(formatter);
        String formattedDate1 = futureDate1.format(formatter);
        TC.dateEndorsementDtailsTp(TestUtil.PresentDate(),formattedDate);
        TC.tmbrokercodecheckboxmanual();
       Assert.assertTrue(TC.multiyearCheckBox.isSelected());
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID);
    }

    @Test(description = "Multi Year TP" )
    public void Source_UnderpolicyCopy() throws Exception {
        ninjaloginpage.ninja_MIS();
        WebCommands.staticSleep(2000);
        create.Motor_productCatagory_Status_insurer("Motor","Pending from Insurer","L&T","Car");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID+"test");
        TC.tmbrokercodecheckboxmanual();
        WebCommands.staticSleep(2000);
        TC.policyDetailmanual1();
      TC.backArrow.click();
      junkpolicyl.JunkPolicy(misID);
    }
}
