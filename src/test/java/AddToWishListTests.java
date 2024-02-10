import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddToWishListPage;
import pages.BasePage;

import java.time.Duration;

public class AddToWishListTests extends BasePage {

    private AddToWishListPage addToWishListPage;
    @BeforeMethod
    public void setUp() {
        super.setUp();
        addToWishListPage = new AddToWishListPage(driver);
    }
    @Test
    public void AddToWishList() {
        addToWishListPage.ClickOnMyAccountBox();
        addToWishListPage.typeEmailField("riscocalin@gmail.com");
        addToWishListPage.typePasswordField("YkMx5JLQMEqn@cT");
        addToWishListPage.ClickOnLogInButton();
        addToWishListPage.ClickOnHome();
        addToWishListPage.HoverOverMegaMenu();
        addToWishListPage.ClickOnMouseOverSmartWatch();
        addToWishListPage.MouseOverIPodNanoWatch();
        addToWishListPage.ClickOnAddToWishList();
        addToWishListPage.ClickOnPage5();
        addToWishListPage.MouseOverSamsungGalaxyWatch();
        addToWishListPage.ClickOnAddToWishListSamsungGalaxyWatch();
        Duration timeout = Duration.ofSeconds(10); //comada pentru timp de asteptare
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement waitForWishListNotification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#notification-box-top > div > div.toast-body > a")));
        addToWishListPage.ClickOnWishList();
        WebElement product1 = driver.findElement(By.linkText("iPod Nano"));
        WebElement product2 = driver.findElement(By.linkText("Samsung Galaxy Tab 10.1"));
        String actualResult = product1.getText();
        String actualResult2 = product2.getText();
        String expectedResult = "iPod Nano";
        String expectedResult2 = "Samsung Galaxy Tab 10.1";
        Assert.assertEquals(expectedResult, actualResult);
        Assert.assertEquals(expectedResult2, actualResult2);
        System.out.println(product1.getText());
        System.out.println(product2.getText());

    }
    @Description("Remove one product from wish list")
    @Test
    public void RemoveFromWishList() {
        addToWishListPage.ClickOnMyAccountBox();
        addToWishListPage.typeEmailField("riscocalin@gmail.com");
        addToWishListPage.typePasswordField("YkMx5JLQMEqn@cT");
        addToWishListPage.ClickOnLogInButton();
        addToWishListPage.ClickOnHome();
//        addToWishListPage.HoverOverMegaMenu();
//        addToWishListPage.ClickOnMouseOverSmartWatch();
//        addToWishListPage.MouseOverIPodNanoWatch();
//        addToWishListPage.ClickOnAddToWishList();
//        addToWishListPage.ClickOnPage5();
//        addToWishListPage.MouseOverSamsungGalaxyWatch();
//        addToWishListPage.ClickOnAddToWishListSamsungGalaxyWatch();
        addToWishListPage.ClickOnWishList();
        addToWishListPage.ClickOnRemovrOneProduct();
        WebElement element = driver.findElement(By.cssSelector("#account-wishlist > div.alert.alert-success.alert-dismissible"));
        String actualResult = element.getText();
        String expectedResult = "Success: You have modified your wish list!";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println(element.getText());

    }


}
