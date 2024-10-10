import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.common.Mis_newSale;
import com.qa.turtlemint.pages.common.junk;
import com.qa.turtlemint.pages.login.LoginPage;
import org.testng.annotations.BeforeMethod;

public class Online_Issuance extends TestBase {

    public LoginPage ninjaloginpage;
    public junk junkpolicyl;
    public Mis_newSale create;

    public Online_Issuance() {super();}

    @BeforeMethod()
    public void start()  {
        initialization();

        ninjaloginpage = new LoginPage();
        junkpolicyl = new junk();
        create = new Mis_newSale();

    }




}
