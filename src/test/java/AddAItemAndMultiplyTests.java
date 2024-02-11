import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddAItemAndMultiplyPage;
import pages.BasePage;

import java.time.Duration;

public class AddAItemAndMultiplyTests extends BasePage {
    private AddAItemAndMultiplyPage addAItemAndMultiplyPage;
    @BeforeMethod
    public void setUp() {
        super.setUp();
        addAItemAndMultiplyPage = new AddAItemAndMultiplyPage(driver);
    }
    @Description("Increase the number of IMac")
    @Test(priority = 1)
    public void addAItemAndMultiply() {
        addAItemAndMultiplyPage.ClickOnIMac();
        addAItemAndMultiplyPage.ClickOnIncreaseNumberOfIMac();
        addAItemAndMultiplyPage.ClickOnIncreaseNumberOfIMac();
        addAItemAndMultiplyPage.ClickOnIncreaseNumberOfIMac();
        addAItemAndMultiplyPage.ClickOnIncreaseNumberOfIMac();
        WebElement quantity = driver.findElement(By.cssSelector("#entry_216841 > .input-group >.form-control"));
        String quantityValue = quantity.getAttribute("value");
        Assert.assertEquals(quantityValue, "5");
    }
    @Description("Decrease the number of IMac")
    @Test(priority = 2)
    public void decreaseAItemAndMultiply() throws InterruptedException {
        addAItemAndMultiplyPage.ClickOnIMac();
        addAItemAndMultiplyPage.ClickOnIncreaseNumberOfIMac();
        addAItemAndMultiplyPage.ClickOnIncreaseNumberOfIMac();
        addAItemAndMultiplyPage.ClickOnIncreaseNumberOfIMac();
        addAItemAndMultiplyPage.ClickOnIncreaseNumberOfIMac();
        Thread.sleep(500);
        addAItemAndMultiplyPage.ClickOnDecreaseNumberOfIMac();
        addAItemAndMultiplyPage.ClickOnDecreaseNumberOfIMac();
        addAItemAndMultiplyPage.ClickOnDecreaseNumberOfIMac();
        WebElement quantity = driver.findElement(By.cssSelector("#entry_216841 > .input-group >.form-control"));
        String quantityValue = quantity.getAttribute("value");
        Assert.assertEquals(quantityValue, "2");



    }



}
