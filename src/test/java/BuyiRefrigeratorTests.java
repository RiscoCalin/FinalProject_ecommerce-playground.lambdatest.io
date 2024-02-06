import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.BuyiRefrigeratorPage;

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
        buyiRefrigeratorPage.ClickOnGuestCheckout();

    }

    //driver.findElement(applePageLink).click();


}
