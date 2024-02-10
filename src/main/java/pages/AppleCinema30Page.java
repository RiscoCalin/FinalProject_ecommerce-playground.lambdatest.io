package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.awt.SystemColor.text;

public class AppleCinema30Page extends BasePage {
    public AppleCinema30Page(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

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

    @FindBy(css = "#mz-product-grid-image-42-212439 > div > div.carousel-item.active > img")
    private WebElement AppleCinema30;

    public void clickOnAppleCinema30() {
        AppleCinema30.click();
    }

    @FindBy(css = "#input-option231-216836>option[value=\"38\"]")
    private WebElement SelectSizeSmall0;

    public void SelectSizeSmall0() {
        SelectSizeSmall0.click();
    }

    @FindBy(css = "#input-option231-216836>option[value=\"37\"]")
    private WebElement SelectSizeSmall1;

    public void SelectSizeSmall1() {
        SelectSizeSmall1.click();
    }


    @FindBy(css = "#input-option231-216836>option[value=\"35\"]")
    private WebElement SelectSizeMedium;

    public void SelectSizeMedium() {
        SelectSizeMedium.click();
    }
    @FindBy(css = "#input-option231-216836>option[value=\"34\"]")
    private WebElement SelectSizeLarge;

    public void SelectSizeLarge() {
        SelectSizeLarge.click();


    }
    @FindBy(linkText = "Popup")
    private WebElement Popup;
    public void ClickOnPopup(){
        Popup.click();
    }
    @FindBy(css = "#form-review > div.form-group.select-rating.d-flex.flex-wrap > span > label:nth-child(2)")
    private WebElement SelectRating;
    public void clickSelectRating(){
        SelectRating.click();
    }
    @FindBy(css = "#input-name")
    private WebElement InputName;
    public void InputName(String text){
        InputName.sendKeys(text);
    }
    @FindBy(css = "#input-review")
    private WebElement InputReview;
    public void InputReview(String text){
        InputReview.sendKeys(text);
    }
    @FindBy(css = ".float-right>#button-review")
    private WebElement WriteReview;
    public void ClickOnWriteReview(){
        WriteReview.click();
    }



}



