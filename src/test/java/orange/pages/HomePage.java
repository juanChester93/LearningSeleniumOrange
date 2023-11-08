package orange.pages;

import orange.tests.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.Logger;
import reports.ExtentReportUtils;

public class HomePage {

    @FindBy(linkText = "Admin")
    WebElement adminLink;

    @FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
    WebElement profile;

    @FindBy(linkText = "Logout")
    WebElement logoutLink;

    public HomePage() {
        PageFactory.initElements(BaseTest.driver, this);
    }

    Logger log = LogManager.getLogger(HomePage.class);

    public void clickAdminLink() {
        adminLink.click();
        log.info("admin link has been clicked");
        ExtentReportUtils.addStep("Admin link button clicked");
    }

    public void logoutFromPage() {
        profile.click();
        log.info("Profile button has been clicked");
        ExtentReportUtils.addStep("Profile button has been clicked");
        logoutLink.click();
        log.info("Logout link has been clicked");
        ExtentReportUtils.addStep("Log out link has been clicked");
    }
}
