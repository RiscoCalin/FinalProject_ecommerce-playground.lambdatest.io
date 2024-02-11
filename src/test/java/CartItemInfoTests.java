import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CartItemInfoPage;

import java.awt.*;
import java.time.Duration;

public class CartItemInfoTests extends BasePage {
    private CartItemInfoPage cartItemInfoPage;
    @BeforeMethod
    public void setUp() {
        super.setUp();
        cartItemInfoPage = new CartItemInfoPage(driver);
    }
    @Description("Add an item to cart and check if it is notified")
    @Test
    public void CartItemInfo() throws InterruptedException {
        WebElement desktop = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div[3]/div/div[2]/div/div[1]/div[1]/a/figure/div[1]/img"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView;", desktop);
        Duration timeout = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement confirm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[5]/div[1]/div[3]/div/div[2]/div/div[1]/div[1]/a/figure/div[1]/img")));
        //cartItemInfoPage.MouseOverDeskTop();
        cartItemInfoPage.ClickOnDeskTop();
        cartItemInfoPage.ClickOnListView();
        cartItemInfoPage.ClickOnHTCAddToCart();
        Thread.sleep(300);
        WebElement element = driver.findElement(By.cssSelector("#entry_217825 > a > div.cart-icon > span"));
        String actualResult = element.getText();
        String expectedResult = "1";
        Assert.assertEquals(actualResult, expectedResult);
    }
}
