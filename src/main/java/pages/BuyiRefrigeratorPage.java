package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyiRefrigeratorPage extends BasePage {
    public BuyiRefrigeratorPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#entry_212439 > div > div:nth-child(4) > div > div.product-thumb-top > div.product-action > button.btn.btn-cart.cart-40")
    private WebElement AddToCartRefrigerator;

    public void ClickOnAddToCartRefrigerator() {
        AddToCartRefrigerator.click();

    }

    @FindBy(xpath = "//*[@id=\"widget-navbar-217834\"]/ul/li[4]/a")
    private WebElement MouseOverMegaMenu;

    public void HoverOverMegaMenu() {
        Actions action = new Actions(driver);
        action.moveToElement(MouseOverMegaMenu).perform();
    }

    @FindBy(xpath = "//*[@id=\"entry281_216477\"]/div/div/ul/li[1]/a")
    private WebElement MouseOverAndClickAppleSection;

    public void HoverOverMegaMenuAndClickAppleSection() {
        Actions action = new Actions(driver);
        action.moveToElement(MouseOverAndClickAppleSection);
        action.click().build().perform();
    }

    @FindBy(css = "#mz-product-grid-image-40-212439 > div > div.carousel-item.active > img")
    private WebElement iRefrigerator;

    public void ClickOnIRefrigerator() {
        iRefrigerator.click();
    }

    @FindBy(css = "#entry_216843 > button")
    private WebElement BuyNow;

    public void ClickOnBuyNow() {
        BuyNow.click();
    }

    @FindBy(css = "label[for='input-account-guest']")
    private WebElement GuestCheckout;

    public void ClickOnGuestCheckout() {
//        GuestCheckout.click();
        Actions action = new Actions(driver);
        action.moveToElement(GuestCheckout);
        action.click().build().perform();
    }
}

