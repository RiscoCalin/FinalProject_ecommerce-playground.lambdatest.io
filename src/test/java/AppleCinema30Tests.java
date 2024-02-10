import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AppleCinema30Page;
import pages.BasePage;

import java.time.Duration;

public class AppleCinema30Tests extends BasePage {
    private AppleCinema30Page appleCinema30Page;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        appleCinema30Page = new AppleCinema30Page(driver);
    }

    @Description("Test for the Small(+$12.00)")
    @Test //-aici sunt teste de cat de mare sa cumperi
    public void AppleCinema30Small() throws InterruptedException {
        appleCinema30Page.HoverOverMegaMenu();
        appleCinema30Page.HoverOverMegaMenuAndClickAppleSection();
        appleCinema30Page.clickOnAppleCinema30();
        appleCinema30Page.SelectSizeSmall0();
        Duration timeout = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement confirm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".flex-wrap>.price>.price-new")));
        WebElement price = driver.findElement(By.cssSelector(".flex-wrap>.price>.price-new"));
        Thread.sleep(1000);
        String actualPrice = price.getText();
        String expectedPrice = "$134.00";
        Assert.assertEquals(actualPrice, expectedPrice);

    }

    @Description("Test for the Small(-$13.20)")
    @Test
    public void AppleCinema30Small1() throws InterruptedException {
        appleCinema30Page.HoverOverMegaMenu();
        appleCinema30Page.HoverOverMegaMenuAndClickAppleSection();
        appleCinema30Page.clickOnAppleCinema30();
//        appleCinema30Page.MoveMouseOverAndClick();
        appleCinema30Page.SelectSizeSmall1();
        Duration timeout = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement confirm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".flex-wrap>.price>.price-new")));
        WebElement price = driver.findElement(By.cssSelector(".flex-wrap>.price>.price-new"));
        Thread.sleep(1000);
        String actualPrice = price.getText();
        String expectedPrice = "$108.80";
        Assert.assertEquals(actualPrice, expectedPrice);

    }
     @Description("Test for the Medium(-$28.80)")
    @Test
    public void AppleCinema30Medium() throws InterruptedException {
        appleCinema30Page.HoverOverMegaMenu();
        appleCinema30Page.HoverOverMegaMenuAndClickAppleSection();
        appleCinema30Page.clickOnAppleCinema30();
        appleCinema30Page.SelectSizeMedium();Duration timeout = Duration.ofSeconds(10);
         WebDriverWait wait = new WebDriverWait(driver, timeout);
         WebElement confirm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".flex-wrap>.price>.price-new")));
         WebElement price = driver.findElement(By.cssSelector(".flex-wrap>.price>.price-new"));
         Thread.sleep(1000);
         String actualPrice = price.getText();
         String expectedPrice = "$93.20";
         Assert.assertEquals(actualPrice, expectedPrice);

    }
     @Description("Test for the Large(+$18.00)")
    @Test
    public void AppleCinema30Large()  throws InterruptedException {
        appleCinema30Page.HoverOverMegaMenu();
        appleCinema30Page.HoverOverMegaMenuAndClickAppleSection();
        appleCinema30Page.clickOnAppleCinema30();
        appleCinema30Page.SelectSizeLarge();
         Duration timeout = Duration.ofSeconds(10);
         WebDriverWait wait = new WebDriverWait(driver, timeout);
         WebElement confirm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".flex-wrap>.price>.price-new")));
         WebElement price = driver.findElement(By.cssSelector(".flex-wrap>.price>.price-new"));
         Thread.sleep(1000);
         String actualPrice = price.getText();
         String expectedPrice = "$140.00";
         Assert.assertEquals(actualPrice, expectedPrice);

    }
    @Description("Test PopUp")
    @Test//-mai este de popup
    public void AppleCinema30PopUp() {

        appleCinema30Page.HoverOverMegaMenu();
        appleCinema30Page.HoverOverMegaMenuAndClickAppleSection();
        appleCinema30Page.clickOnAppleCinema30();
        appleCinema30Page.ClickOnPopup();
        Duration timeout = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[6]/div/div/div/div/div/p")));
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div/div/div/p"));
        String actualText = element.getText();
        String expectedText = "Place here any module, widget, design or HTML.";
        Assert.assertEquals(actualText, expectedText);

    }
    @Description("Test write a review")
    @Test//-mai este si write a review
    public void AppleCinema30WriteReview() {

        appleCinema30Page.HoverOverMegaMenu();
        appleCinema30Page.HoverOverMegaMenuAndClickAppleSection();
        appleCinema30Page.clickOnAppleCinema30();
        appleCinema30Page.clickSelectRating();
        appleCinema30Page.InputName("Test");
        appleCinema30Page.InputReview("De ce a trecut gaina strada?");
        appleCinema30Page.ClickOnWriteReview();
        Duration timeout = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#form-review > .alert-success")));
        WebElement element = driver.findElement(By.cssSelector("#form-review > .alert-success"));
        String actualText = element.getText();
        String expectedText = "Thank you for your review. It has been submitted to the webmaster for approval.";
        Assert.assertEquals(actualText, expectedText);

    }

}



//-mai este si ask a question
//-si daca mai este in setoc