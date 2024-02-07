import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.BuyiRefrigeratorPage;

import java.time.Duration;

public class BuyiRefrigeratorTests extends BasePage {


    private final By applePageLink = By.cssSelector("#entry281_216477 > div > div > ul > li:nth-child(1) > a");
    private BuyiRefrigeratorPage buyiRefrigeratorPage;


    @BeforeClass
    public void setUp() {
        super.setUp();
        buyiRefrigeratorPage = new BuyiRefrigeratorPage(driver);
    }

    @Test
    public void AddToCartRefrigerator() {
        buyiRefrigeratorPage.HoverOverMegaMenu();
        buyiRefrigeratorPage.HoverOverMegaMenuAndClickAppleSection();
        buyiRefrigeratorPage.ClickOnIRefrigerator();
        buyiRefrigeratorPage.ClickOnBuyNow();
        Duration timeout = Duration.ofSeconds(10); //comada pentru timp de asteptare
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement guestCheckoutButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/form/div/div[1]/div/div[1]/div/div[3]")));
        guestCheckoutButton.click();// Click on Guest Checkout button
        buyiRefrigeratorPage.ClickOnLogIn();
        buyiRefrigeratorPage.typeEmailField("riscocalin@gmail.com");
        buyiRefrigeratorPage.typePasswordField("YkMx5JLQMEqn@cT");
        buyiRefrigeratorPage.ClickOnLogInButton();
        WebElement firstNameWait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/form/div/div[1]/div/div[2]/div[3]/div[1]/div/input")));
        buyiRefrigeratorPage.typeFirstName("Test");
        buyiRefrigeratorPage.typeLastName("Test1");
        buyiRefrigeratorPage.typeAddress("Calea Mortilor");
        buyiRefrigeratorPage.typeCity("Iasi");
        buyiRefrigeratorPage.typePostCode("123456");
        buyiRefrigeratorPage.typeComment("Cand il aduceti sa fie plin cu bere");
        buyiRefrigeratorPage.ClickOnAgree();
        buyiRefrigeratorPage.setMouseOverContinue();
        buyiRefrigeratorPage.ClickOnContinue();
        WebElement confirm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".buttons >#button-confirm")));
        buyiRefrigeratorPage.clickConfirm();

        WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
        // Get the text of the element
        String actualResult = element.getText();
        // Define the expected result
        String expectedResult = "Confirm Order";
        // Assert that the actual result matches the expected result
        Assert.assertEquals(expectedResult, actualResult);
    }


}





