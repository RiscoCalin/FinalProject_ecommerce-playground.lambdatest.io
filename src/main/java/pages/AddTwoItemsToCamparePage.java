package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTwoItemsToCamparePage extends BasePage {
    public AddTwoItemsToCamparePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"widget-navbar-217834\"]/ul/li[4]/a")
    private WebElement MouseOverMegaMenu;

    public void HoverOverMegaMenu() {
        Actions action = new Actions(driver);
        action.moveToElement(MouseOverMegaMenu).perform();
    }
    @FindBy(linkText = "Headphones")
    private WebElement Headphones;
    public void ClickOnHeadphones() {
        Actions action = new Actions(driver);
        action.moveToElement(Headphones).click().build().perform();
    }
    @FindBy(css = "#mz-product-grid-image-33-212408 > div > div.carousel-item.active > img")
    private WebElement SamsungHeadphones;
    public void MouseOverSamsungHeadphones() {
        Actions action = new Actions(driver);
        action.moveToElement(SamsungHeadphones).perform();
    }
    @FindBy(css = "#entry_212408 > div > div:nth-child(6) > div > div.product-thumb-top > div.product-action > button.btn.btn-compare.compare-33")
    private WebElement CompareSamsungHeadphones;
    public void ClickOnCompareSamsungHeadphones() {
        CompareSamsungHeadphones.click();
    }
    @FindBy(linkText = "2")
    private WebElement Page2;
    public void ClickOnPage2() {
        Page2.click();
    }
    @FindBy(css = "#mz-product-grid-image-61-212408 > div > div.carousel-item.active > img")
    private WebElement MacBookAir;
    public void MouseOverMacBookAir() {
        Actions action = new Actions(driver);
        action.moveToElement(MacBookAir).perform();
    }
    @FindBy(css = "#entry_212408 > div > div:nth-child(14) > div > div.product-thumb-top > div.product-action > button.btn.btn-compare.compare-61")
private WebElement CompareMacBookAir;
    public void ClickOnCompareMacBookAir() {
        CompareMacBookAir.click();
    }
    @FindBy(css = "#entry_217823 > a > span > svg")
    private WebElement Compare;
    public void ClickOnCompare() {
        Compare.click();
    }
    @FindBy(linkText = "Remove")
    private WebElement RemoveFromCompare;
    public void clickOnRemoveFromCompare() {
        RemoveFromCompare.click();
    }
}



