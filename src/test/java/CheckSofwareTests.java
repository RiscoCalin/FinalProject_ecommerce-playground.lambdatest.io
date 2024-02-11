import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckSofwarePage;

import java.time.Duration;

public class CheckSofwareTests extends BasePage {
    private CheckSofwarePage checkSofwarePage;
    @BeforeMethod
    public void setUp() {
        super.setUp();
        checkSofwarePage = new CheckSofwarePage(driver);

    }
    @Description("Sort By:Newest")
    @Test
    public void checkSofwareSortByNewest()throws InterruptedException {
        checkSofwarePage.ClickOnShopByCategory();
        Duration timeout = Duration.ofSeconds(10); //comada pentru timp de asteptare
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement software = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#widget-navbar-217841 > ul > li:nth-child(4) > a > div.info > span")));
        checkSofwarePage.ClickOnSoftware();
        checkSofwarePage.ClickOnSortByNewest();
        Thread.sleep(200);
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[4]/div/div[5]/div/select/option[4]"));
        //System.out.println(element.getText());
        String actualText = element.getText();
        String expectedText = "Newest";
        Assert.assertEquals(actualText, expectedText);
     //   WebElement sortByNewest = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#input-sort-212403 > option[value=\"https://ecommerce-playground.lambdatest.io/index.php?route=product/category&path=17&sort=p.date_added&order=DESC&limit=15\"]")));
//        checkSofwarePage.ClickOnSortByNewest();
    }
    @Description("Sort By:Best Seller")
    @Test
    public void checkSofwareSortByBestSeller() throws InterruptedException{
        checkSofwarePage.ClickOnShopByCategory();
        Duration timeout = Duration.ofSeconds(10); //comada pentru timp de asteptare
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement software = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#widget-navbar-217841 > ul > li:nth-child(4) > a > div.info > span")));
        checkSofwarePage.ClickOnSoftware();
        checkSofwarePage.ClickOnSortByBestSeller();
        Thread.sleep(200);
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[4]/div/div[5]/div/select/option[2]"));
        String actualText = element.getText();
        String expectedText = "Best sellers";
        Assert.assertEquals(actualText, expectedText);

    }
    @Description("Sort By:Name (Z-A)")
    @Test
    public void checkSofwareSortByNameZA()throws InterruptedException {
        checkSofwarePage.ClickOnShopByCategory();
        Duration timeout = Duration.ofSeconds(10); //comada pentru timp de asteptare
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement software = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#widget-navbar-217841 > ul > li:nth-child(4) > a > div.info > span")));
        checkSofwarePage.ClickOnSoftware();
        checkSofwarePage.ClickOnSortByNameZA();
        Thread.sleep(200);
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[4]/div/div[5]/div/select/option[6]"));
        String actualText = element.getText();
        String expectedText = "Name (Z - A)";
        Assert.assertEquals(actualText, expectedText);
    }
    @Description("Sort By:Price (HIGHT>LOW)")
    @Test
    public void checkSofwareSortByPriceHIGHTLOW()throws InterruptedException{
        checkSofwarePage.ClickOnShopByCategory();
        Duration timeout = Duration.ofSeconds(10); //comada pentru timp de asteptare
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement software = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#widget-navbar-217841 > ul > li:nth-child(4) > a > div.info > span")));
        checkSofwarePage.ClickOnSoftware();
        checkSofwarePage.ClickOnSortByPriceHIGHTLOW();
        Thread.sleep(200);
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[4]/div/div[5]/div/select/option[8]"));
        String actualText = element.getText();
        String expectedText = "Price (High > Low)";
        Assert.assertEquals(actualText, expectedText);
    }
    @Description("Sort By:Model(A-Z)")
    @Test
    public void checkSofwareSortByModelAZ() throws InterruptedException {
        checkSofwarePage.ClickOnShopByCategory();
        Duration timeout = Duration.ofSeconds(10); //comada pentru timp de asteptare
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement software = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#widget-navbar-217841 > ul > li:nth-child(4) > a > div.info > span")));
        checkSofwarePage.ClickOnSoftware();
        checkSofwarePage.ClickOnSortByModelAZ();
        Thread.sleep(200);
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[4]/div/div[5]/div/select/option[11]"));
        String actualText = element.getText();
        String expectedText = "Model (A - Z)";
        Assert.assertEquals(actualText, expectedText);
    }

}
