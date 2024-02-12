import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.NewsletterPage;

public class NewsletterTests extends BasePage{
    private NewsletterPage newsletterPage;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        newsletterPage = new NewsletterPage(driver);
    }
    @Description("Yes")
    @Test
    public void NewsletterSubYes(){
        newsletterPage.ClickOnMyAccountBox();
        newsletterPage.typeEmailField("riscocalin@gmail.com");
        newsletterPage.typePasswordField("YkMx5JLQMEqn@cT");
        newsletterPage.ClickOnLogInButton();
        newsletterPage.ClickOnNewsletter();
        newsletterPage.ClickOnYes();
        newsletterPage.ClickOnContinueButton();
        WebElement element = driver.findElement(By.cssSelector("#account-account > .alert-success"));
        String actualResult = element.getText();
        String expectedResult = "Success: Your newsletter subscription has been successfully updated!";
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Description("No")
    @Test
    public void NewsletterSubNo(){
        newsletterPage.ClickOnMyAccountBox();
        newsletterPage.typeEmailField("riscocalin@gmail.com");
        newsletterPage.typePasswordField("YkMx5JLQMEqn@cT");
        newsletterPage.ClickOnLogInButton();
        newsletterPage.ClickOnNewsletter();
        newsletterPage.ClickOnNo();
        newsletterPage.ClickOnContinueButton();
        WebElement element = driver.findElement(By.cssSelector("#account-account > .alert-success"));
        String actualResult = element.getText();
        String expectedResult = "Success: Your newsletter subscription has been successfully updated!";
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Description("Cecking for Transactions")
    @Test
    public void CeckingForTransactions(){
        newsletterPage.ClickOnMyAccountBox();
        newsletterPage.typeEmailField("riscocalin@gmail.com");
        newsletterPage.typePasswordField("YkMx5JLQMEqn@cT");
        newsletterPage.ClickOnLogInButton();
        newsletterPage.ClickOnTransactions();
        WebElement element = driver.findElement(By.cssSelector("#content > div.table-responsive > table > tbody > tr > td"));
        String actualResult = element.getText();
        String expectedResult = "No results!";
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Description("Cecking for Transactions Balance")
    @Test
    public void CeckingForTransactionsBalance(){
        newsletterPage.ClickOnMyAccountBox();
        newsletterPage.typeEmailField("riscocalin@gmail.com");
        newsletterPage.typePasswordField("YkMx5JLQMEqn@cT");
        newsletterPage.ClickOnLogInButton();
        newsletterPage.ClickOnTransactions();
        WebElement element = driver.findElement(By.cssSelector("#content > p > b"));
        String actualResult = element.getText();
        String expectedResult = "$0.00";
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Description("Cecking for Reward Points")
    @Test
    public void CeckingForRewardPoints(){
        newsletterPage.ClickOnMyAccountBox();
        newsletterPage.typeEmailField("riscocalin@gmail.com");
        newsletterPage.typePasswordField("YkMx5JLQMEqn@cT");
        newsletterPage.ClickOnLogInButton();
        newsletterPage.ClickOnRewardPoints();
        WebElement element = driver.findElement(By.cssSelector("#content > p > b"));
        String actualResult = element.getText();
        String expectedResult = "0";
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Description("Cecking for Notifications Products")
    @Test
    public void CeckingForNotificationsProducts(){
        newsletterPage.ClickOnMyAccountBox();
        newsletterPage.typeEmailField("riscocalin@gmail.com");
        newsletterPage.typePasswordField("YkMx5JLQMEqn@cT");
        newsletterPage.ClickOnLogInButton();
        newsletterPage.ClickOnNotifications();
        WebElement element = driver.findElement(By.cssSelector("#content > h1"));
        String actualResult = element.getText();
        String expectedResult = "Subscribed products";
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Description("Cecking for Notifications Brands")
    @Test
    public void CeckingForNotificationsBrands(){
        newsletterPage.ClickOnMyAccountBox();
        newsletterPage.typeEmailField("riscocalin@gmail.com");
        newsletterPage.typePasswordField("YkMx5JLQMEqn@cT");
        newsletterPage.ClickOnLogInButton();
        newsletterPage.ClickOnNotifications();
        newsletterPage.ClickOnBrands();
        WebElement element = driver.findElement(By.cssSelector("#content > h1"));
        String actualResult = element.getText();
        String expectedResult = "Subscribed manufacturers";
        Assert.assertEquals(actualResult, expectedResult);
    }


}
