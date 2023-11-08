package orange.tests;

import orange.pages.LoginPage;
import org.testng.annotations.Test;
import utilities.ExcelUtility;
import utilities.PropertiesUtility;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidUsernameAndPassword() {
        LoginPage logPage = new LoginPage();
        //logPage.loginToOrange(ExcelUtility.getTestData(1,0),
          //      ExcelUtility.getTestData(1,1));
        logPage.loginToOrange(PropertiesUtility.getPropertyData("username"),
                PropertiesUtility.getPropertyData("password"));
    }
}
