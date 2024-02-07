import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LogOutPage;

public class LogOutTests extends BasePage {
    private LogOutPage logOutPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        logOutPage = new LogOutPage(driver);

    }

    @Test
    public void ClickOnMyAccountBox() {
        logOutPage.ClickOnMyAccountBox();
        logOutPage.typeEmailField("riscocalin@gmail.com");
        logOutPage.typePasswordField("YkMx5JLQMEqn@cT");
        logOutPage.ClickOnLogInButton();
        logOutPage.moveOverMyAccount();
        logOutPage.setClickOnLogOut();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
        // Get the text of the element
        String actualResult = element.getText();
        // Define the expected result
        String expectedResult = "Account Logout";
        // Assert that the actual result matches the expected result
        Assert.assertEquals(expectedResult, actualResult);

    }
}
