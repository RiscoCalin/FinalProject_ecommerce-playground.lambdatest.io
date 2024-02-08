import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddTwoItemsToCamparePage;
import pages.BasePage;

public class AddTwoItemsToCampareTests extends BasePage {
    private AddTwoItemsToCamparePage addTwoItemsToCamparePage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        addTwoItemsToCamparePage = new AddTwoItemsToCamparePage(driver);


    }

    @Test
    public void AddTwoItemsToCampare() {
        addTwoItemsToCamparePage.HoverOverMegaMenu();
        addTwoItemsToCamparePage.ClickOnHeadphones();
        addTwoItemsToCamparePage.MouseOverSamsungHeadphones();
        addTwoItemsToCamparePage.ClickOnCompareSamsungHeadphones();
        addTwoItemsToCamparePage.ClickOnPage2();
        addTwoItemsToCamparePage.MouseOverMacBookAir();
        addTwoItemsToCamparePage.ClickOnCompareMacBookAir();
        addTwoItemsToCamparePage.ClickOnCompare();
        WebElement element = driver.findElement(By.cssSelector("#content > .h4"));
        String actualResult = element.getText();
        String expectedResult = "Product Comparison";
        Assert.assertEquals(actualResult, expectedResult);




    }@Description("Remove from Compare")
    @Test
    public void RemoveFromCompare () {
        addTwoItemsToCamparePage.HoverOverMegaMenu();
        addTwoItemsToCamparePage.ClickOnHeadphones();
        addTwoItemsToCamparePage.MouseOverSamsungHeadphones();
        addTwoItemsToCamparePage.ClickOnCompareSamsungHeadphones();
        addTwoItemsToCamparePage.ClickOnPage2();
        addTwoItemsToCamparePage.MouseOverMacBookAir();
        addTwoItemsToCamparePage.ClickOnCompareMacBookAir();
        addTwoItemsToCamparePage.ClickOnCompare();
        addTwoItemsToCamparePage.clickOnRemoveFromCompare();
        WebElement element = driver.findElement(By.cssSelector("#product-compare >.alert-success"));
        String actualResult = element.getText();
        String expectedResult = "Success: You have modified your product comparison!";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println(actualResult);
    }
}


