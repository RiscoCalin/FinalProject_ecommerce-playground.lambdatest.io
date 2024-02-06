import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        buyiRefrigeratorPage.typeFirstName("Test");
        buyiRefrigeratorPage.typeLastName("Test1");
        buyiRefrigeratorPage.typeEmail("Test@test.com");
        buyiRefrigeratorPage.typeTelephone("123456789");
        buyiRefrigeratorPage.typeAddress("Bul.Nicolae Iorga");
        buyiRefrigeratorPage.typeCity("Iasi");
        buyiRefrigeratorPage.typePostCode("70000");
        buyiRefrigeratorPage.typeCountry();
        buyiRefrigeratorPage.typeRegion();

    }

    //driver.findElement(applePageLink).click();


}
