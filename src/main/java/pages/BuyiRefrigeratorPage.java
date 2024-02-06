package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
}

