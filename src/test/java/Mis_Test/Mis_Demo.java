package Mis_Test;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.common.Mis_newSale;
import com.qa.turtlemint.pages.common.junk;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.iTestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(iTestListener.class)
@Test(groups = {"Ninja_Full", "mis_login"})
public class Mis_Demo extends TestBase {

    public LoginPage ninjaloginpage;
    public junk junkpolicyl;
    public Mis_newSale create;

    public Mis_Demo() {super();}

    @BeforeMethod()
    public void start()  {
        initialization();

        ninjaloginpage = new LoginPage();
        junkpolicyl = new junk();
        create = new Mis_newSale();

    }

    @Test()
    public void CreatePolicy() throws Exception {
        ninjaloginpage.ninja_MIS();
        create.productCatagory_Status_insurer("Life","Issued","LIC LI");
    }

    @Test()
    public void JunkPolicy() throws Exception {
        ninjaloginpage.ninja_MIS();
        String misID = junkpolicyl.policyCkicked.getText();
        junkpolicyl.JunkPolicy(misID);
    }

    @AfterMethod()
    public void Close() {
      //  driver.quit();
    }
}
