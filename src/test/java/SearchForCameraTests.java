import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SearchForCameraPage;

public class SearchForCameraTests extends BasePage {
    private SearchForCameraPage searchForCameraPage;
    @BeforeMethod
    public void setUp() {
        super.setUp();
        searchForCameraPage = new SearchForCameraPage(driver);
    }
    @Test
    public void searchForCamera() {
        searchForCameraPage.typeSearchField("Camera");
        searchForCameraPage.ClickOnSearchButton();
        WebElement element = driver.findElement(By.linkText("Product Compare (0)"));
        WebElement element1 = driver.findElement(By.cssSelector("#entry_212456 > .h4"));
        String actualResult = element.getText();
        String expectedResult = "Product Compare (0)";
        String actualResult1 = element1.getText();
        String expectedResult1 = "Search - Camera";
        Assert.assertEquals(actualResult, expectedResult);
        Assert.assertEquals(actualResult1, expectedResult1);
        System.out.println(actualResult);
        System.out.println(actualResult1);
    }
}
