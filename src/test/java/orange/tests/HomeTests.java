package orange.tests;

import orange.pages.HomePage;
import org.testng.annotations.Test;

public class HomeTests extends BaseTest {

    @Test
    public void logout() {
        HomePage home = new HomePage();
        home.logoutFromPage();
    }
}
