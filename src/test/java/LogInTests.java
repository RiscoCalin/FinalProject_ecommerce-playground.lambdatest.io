import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LogInPage;


public class LogInTests extends BasePage {
    private LogInPage logInPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        logInPage = new LogInPage(driver);
    }

    @Test
    public void ClickOnMyAccountBox() {
        logInPage.ClickOnMyAccountBox();
        logInPage.typeEmailField("riscocalin@gmail.com");
        logInPage.typePasswordField("YkMx5JLQMEqn@cT");
        logInPage.ClickOnLogInButton();
        String actualResult = driver.findElement(By.cssSelector("#content > div:nth-child(1) > h2")).getText();
        Assert.assertTrue(actualResult.contains("My Account"));


    }
}
