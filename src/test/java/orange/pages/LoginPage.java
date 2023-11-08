package orange.pages;

import orange.tests.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reports.ExtentReportUtils;

public class LoginPage {

    @FindBy(xpath = "//input[@name='username']")
    WebElement usernameBox;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordBox;

    @FindBy(tagName = "button")
    WebElement loginButton;

    public LoginPage() {
        PageFactory.initElements(BaseTest.driver, this);
    }

    Logger log = LogManager.getLogger(LoginPage.class);

    public void loginToOrange(String username, String password) {
        usernameBox.sendKeys(username);
        log.info("Username has been entered in the specified text box");
        ExtentReportUtils.addStep("username has been entered");
        passwordBox.sendKeys(password);
        log.info("Password has been entered in the specified text box");
        ExtentReportUtils.addStep("Password has been added");
        loginButton.click();
        log.info("The login button has been clicked");
        ExtentReportUtils.addStep("Login button has been clicked");
    }
}
