package CaseStatusPending;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.common.Mis_newSale;
import com.qa.turtlemint.pages.common.junk;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.manualautoparse.Health_Life_Page;
import com.qa.turtlemint.pages.manualautoparse.TC_09_TO_21_Page;
import com.qa.turtlemint.pages.manualautoparse.TC_1_12;
import com.qa.turtlemint.util.RetryAnalyser;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(groups = {"Mis_Full","Case_Status_Pending"})

public class CaseStatusPending extends TestBase {

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

    @Test(description = "Pending From Insurer Motor" , retryAnalyzer = RetryAnalyser.class)
    public void PendingFromInsurer_Motor() throws Exception {
        ninjaloginpage.ninja_MIS();
        WebCommands.staticSleep(2000);
        create.Motor_productCatagory_Status_insurer("Motor","Pending from Insurer","L&T","Car");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID+"test");
        TC.tmbrokercodecheckboxmanual();
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID);
    }

    @Test(description = "Pending From Insurer TW", retryAnalyzer = RetryAnalyser.class)
    public void PendingFromInsurer_TW() throws Exception {
        ninjaloginpage.ninja_MIS();
        WebCommands.staticSleep(2000);
        create.Motor_productCatagory_Status_insurer("TW","Pending from Insurer","L&T","TW");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID+"test");
        TC.tmbrokercodecheckboxmanual();
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID);
    }

    @Test(description = "Pending From TM Motor", retryAnalyzer = RetryAnalyser.class)
    public void PendingFromTM_Motor() throws Exception {
        ninjaloginpage.ninja_MIS();
        WebCommands.staticSleep(2000);
        create.Motor_productCatagory_Status_insurer("Motor","Pending from TM","L&T","Car");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID+"test");
        TC.tmbrokercodecheckboxmanual();
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID);
    }

    @Test(description = "Pending From TM TW", retryAnalyzer = RetryAnalyser.class)
    public void PendingFromTM_TW() throws Exception {
        ninjaloginpage.ninja_MIS();
        WebCommands.staticSleep(2000);
        create.Motor_productCatagory_Status_insurer("TW","Pending from TM","L&T","TW");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID+"test");
        TC.tmbrokercodecheckboxmanual();
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID);
    }


    @Test(description = "Pending From TM Health", retryAnalyzer = RetryAnalyser.class)
    public void PendingFromTM_Health() throws Exception {
        ninjaloginpage.ninja_MIS();
        WebCommands.staticSleep(2000);
        create.Motor_productCatagory_Health("Health","Pending from TM","Bharti AXA General Insurance","");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID+"test");
        TC.tmbrokercodecheckboxmanual();
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID);
    }

    @Test(description = "Pending From Insurer Health", retryAnalyzer = RetryAnalyser.class)
    public void PendingFromInsurer_Health() throws Exception {
        ninjaloginpage.ninja_MIS();
        WebCommands.staticSleep(2000);
        create.Motor_productCatagory_Health("Health","Pending from Insurer","Bharti AXA General Insurance","");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID+"test");
        TC.tmbrokercodecheckboxmanual();
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID);
    }


    @Test(description = "Pending From TM Life", retryAnalyzer = RetryAnalyser.class)
    public void PendingFromTM_Life() throws Exception {
        ninjaloginpage.ninja_MIS();
        WebCommands.staticSleep(2000);
        create.Motor_productCatagory_Health("Life","Pending from TM","Bajaj Allianz LI","");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID+"test");
        WebCommands.staticSleep(2000);
        TC.savebuttonmanual.click();
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID);
    }

    @Test(description = "Pending From Insurer Life", retryAnalyzer = RetryAnalyser.class)
    public void PendingFromInsurer_Life() throws Exception {
        ninjaloginpage.ninja_MIS();
        WebCommands.staticSleep(2000);
        create.Motor_productCatagory_Health("Life","Pending from Insurer","Bajaj Allianz LI","");
        String misID = junkpolicyl.misId.getText();
        System.out.println(misID+"test");
        WebCommands.staticSleep(2000);
        TC.savebuttonmanual.click();
        TC.backArrow.click();
        junkpolicyl.JunkPolicy(misID);
    }

}
