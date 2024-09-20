package Mis_Test;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.common.junk;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.iTestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(iTestListener.class)
@Test(groups = {"Ninja_Full", "mis_login"})
public class Mis_Login extends TestBase {

    public LoginPage ninjaloginpage;
    public junk junkpolicyl;

    public Mis_Login() {super();}

    @BeforeMethod()
    public void start()  {
        initialization();

        ninjaloginpage = new LoginPage();
        junkpolicyl = new junk();

    }

    @Test()
    public void PaymentModeFilterTest() throws Exception {
        ninjaloginpage.ninja_MIS();

        String misid = junkpolicyl.policyCkicked.getText();
        junkpolicyl.JunkPolicy(misid);

    }

    @AfterMethod()
    public void Close() {
      //  driver.quit();
    }
}
