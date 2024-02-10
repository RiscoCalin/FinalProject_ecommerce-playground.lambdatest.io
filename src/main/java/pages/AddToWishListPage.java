package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToWishListPage extends BasePage {

    public AddToWishListPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[6]/a")
    private WebElement MyAccountBox;

    public void ClickOnMyAccountBox() {
        MyAccountBox.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/div[2]/div/div/form/div[1]/input")
    private WebElement EmailField;

    public void typeEmailField(String text) {
        EmailField.sendKeys(text);
    }

    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/div[2]/div/div/form/div[2]/input")
    private WebElement PasswordField;

    public void typePasswordField(String text) {
        PasswordField.sendKeys(text);
    }

    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/div[2]/div/div/form/input[1]")
    private WebElement LogInButton;

    public void ClickOnLogInButton() {
        LogInButton.click();
    }

    @FindBy(css = "#widget-navbar-217834 > ul > li:nth-child(1) > a > div > span")
    private WebElement Home;

    public void ClickOnHome() {
        Home.click();
    }

    @FindBy(xpath = "//*[@id=\"widget-navbar-217834\"]/ul/li[4]/a")
    private WebElement MouseOverMegaMenu;

    public void HoverOverMegaMenu() {
        Actions action = new Actions(driver);
        action.moveToElement(MouseOverMegaMenu).perform();
    }

    @FindBy(linkText = "Smart Watch")
    private WebElement MouseOverSmartWatch;

    public void ClickOnMouseOverSmartWatch() {
        Actions action = new Actions(driver);
        action.moveToElement(MouseOverSmartWatch).click().build().perform();
    }

    @FindBy(css = "#mz-product-grid-image-36-212408 > div > div.carousel-item.active > img")
    private WebElement IPodNanoWatch;

    public void MouseOverIPodNanoWatch() {
        Actions action = new Actions(driver);
        action.moveToElement(IPodNanoWatch).perform();
    }
    @FindBy(css = "#entry_212408 > div > div:nth-child(8) > div > div.product-thumb-top > div.product-action > button.btn.btn-wishlist.wishlist-36")
    private WebElement AddToWishList;
    public void ClickOnAddToWishList() {
        AddToWishList.click();
    }
    @FindBy(linkText = "5")
    private WebElement Page5;
    public void ClickOnPage5() {
        Page5.click();


    }
    @FindBy(css = "#mz-product-grid-image-49-212408 > div > div.carousel-item.active > img")
    private WebElement SamsungGalaxyWatch;
    public void MouseOverSamsungGalaxyWatch() {
        Actions action = new Actions(driver);
        action.moveToElement(SamsungGalaxyWatch).perform();
    }
    @FindBy(css = "#entry_212408 > div > div:nth-child(14) > div > div.product-thumb-top > div.product-action > button.btn.btn-wishlist.wishlist-49")
    private WebElement AddToWishList2;
    public void ClickOnAddToWishListSamsungGalaxyWatch() {
        AddToWishList2.click();
    }
    @FindBy(css = "#entry_217824 > a")
    private WebElement WishList;
    public void ClickOnWishList() {
        WishList.click();
    }
    @FindBy(css = "#content > div.table-responsive > table > tbody > tr:nth-child(1) > td.text-right.text-nowrap > a")
    private WebElement RemovrOneProduct;
    public void ClickOnRemovrOneProduct() {
        RemovrOneProduct.click();
    }
}


