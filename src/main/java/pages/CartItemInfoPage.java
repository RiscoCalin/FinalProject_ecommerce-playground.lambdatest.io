package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartItemInfoPage extends BasePage{
    public CartItemInfoPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div[3]/div/div[2]/div/div[1]/div[1]/a/figure/div[1]/img")
    private WebElement DeskTops;
    public void ClickOnDeskTop(){
        DeskTops.click();
    }
    @FindBy(css = "#list-view>.fa-th-list")
    private WebElement ListView;
    public void ClickOnListView(){
        ListView.click();
    }
    @FindBy(css = "#entry_212408 > div > div:nth-child(1) > div > div.caption > div.product-action > button.btn.btn-cart.cart-28")
    private WebElement HTCAddToCart;
    public void ClickOnHTCAddToCart(){
        HTCAddToCart.click();
    }
    @FindBy(css = "#swiper-wrapper-8243f32e1532a453>.swiper-slide-active")
    private WebElement MouseOverDeskTop;
    public void MouseOverDeskTop(){
        Actions action = new Actions(driver);
        action.moveToElement(MouseOverDeskTop).perform();
    }
}
