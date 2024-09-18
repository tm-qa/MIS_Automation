package Ninja_BI;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.Ninja_BI_Page.*;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.iTestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
@Listeners(iTestListener.class)
@Test(groups = {"Ninja_Full", "BI_all"})

public class BI_Flow  extends TestBase {
    public BI_Flow() {
        super();
    }

    public LoginPage ninjaloginpage;
    public BI_health health;
    public BI_Life life;
    public BI_Motor_AP motorap;
    public BI_Motor_Manual mannualmotor;
    public BI_TW tw;

    @BeforeMethod()
    public void start() throws Exception {
        initialization();
        ninjaloginpage = new LoginPage();
        health = new BI_health();
        life = new BI_Life();
        motorap=new BI_Motor_AP();
        mannualmotor=new BI_Motor_Manual();
        tw=new BI_TW();

        ninjaloginpage.ninja_BI();
    }

    @Test(description = "Ninja Health Flow Test")
    public void HealthBIFlow() throws InterruptedException, IOException {

        health.BI_Health_flow();
        LogUtils.info("BI_Health_flow Successfully DONE");
    }

    @Test(description = "Ninja Life Flow Test")
    public void LifeBIFlow() throws InterruptedException, IOException {

        life.BI_Life_flow();
        LogUtils.info("BI_Life_flow Successfully DONE");
    }

    @Test(description = "Ninja AP Flow Test")
    public void APBIFlow() throws InterruptedException, IOException {

        motorap.BI_AP_Flow();
        LogUtils.info("BI_AP_Flow Successfully DONE");
    }

    @Test(description = "Ninja Motor Manual Flow Test")
    public void MotorBIManualFlow() throws InterruptedException, IOException {

        mannualmotor.NinjaBranchIssuanceFlow();
        LogUtils.info("Motor BI Manual Flow Successfully DONE");

    }

    @Test(description = "Ninja TW Flow Test")
    public void TwBIFlow() throws InterruptedException, IOException {

        tw.NinjaBranchIssuanceFlow();
        LogUtils.info("TW Successfully DONE");
    }

    @AfterMethod()
    public void Close() {
        driver.quit();
    }
}

