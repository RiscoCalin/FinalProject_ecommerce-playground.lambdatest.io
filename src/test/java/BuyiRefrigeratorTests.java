import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.BuyiRefrigeratorPage;

public class BuyiRefrigeratorTests extends BasePage {D

    private final By applePageLink = By.cssSelector("#entry281_216477 > div > div > ul > li:nth-child(1) > a");


    @BeforeClass
    public void setUp() {
        super.setUp();
        BuyiRefrigeratorPage buyiRefrigeratorPage = new BuyiRefrigeratorPage(driver);
    }

    @Test
    public void AddToCartRefrigerator() {
        driver.findElement(applePageLink).click();

    }

    public By getApplePageLink() {
        return applePageLink;
    }
}
