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

    @FindBy(css = "#form-checkout > div > div.col-lg-5.mb-5.mb-lg-0 > div > div:nth-child(1) > div > div:nth-child(1)")
    private WebElement LogIn;

    public void ClickOnLogIn() {
        LogIn.click();
    }

    @FindBy(css = "#input-login-email")
    private WebElement Email;

    public void typeEmailField(String text) {
        Email.sendKeys(text);
    }

    @FindBy(css = "#input-login-password")
    private WebElement Password;

    public void typePasswordField(String text) {
        Password.sendKeys(text);
    }

    @FindBy(css = ".clearfix >#button-login")
    private WebElement LogInButton;

    public void ClickOnLogInButton() {
        LogInButton.click();
    }

    @FindBy(xpath = "//*[@id=\"input-payment-firstname\"]")
    private WebElement FirstName;

    public void typeFirstName(String text) {
        FirstName.sendKeys(text);
    }
    @FindBy(css = "#input-payment-lastname")
    private WebElement LastName;
    public void typeLastName(String text){
        LastName.sendKeys(text);
    }
    @FindBy(css = "#input-payment-address-1")
    private WebElement Address;
    public void typeAddress(String text){
        Address.sendKeys(text);
    }
    @FindBy(css = "input-payment-city")
    private WebElement City;
    public void typeCity(String text){
        City.sendKeys(text);
    }
    @FindBy(css = "#input-payment-postcode")
    private WebElement PostCode;
    public void typePostCode(String text){
        PostCode.sendKeys(text);
    }
    @FindBy(css = "input-comment")
    private WebElement Comment;
    public void typeComment(String text){
        Comment.sendKeys(text);
    }


}





