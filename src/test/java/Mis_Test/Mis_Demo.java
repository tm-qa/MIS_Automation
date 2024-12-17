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
@Test(groups = {"", "mis_login"})
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
       // create.Motor_productCatagory_Status_insurer("Motor","Issued","NAVI General Insurance","TW");
    }

//    @Test()
//    public void JunkPolicy() throws Exception {
//        ninjaloginpage.ninja_MIS();
//        String misid = junkpolicyl.policyCkicked.getText();
//        junkpolicyl.JunkPolicy(misid);
//    }

    @AfterMethod()
    public void Close() {
        driver.quit();
    }
}
