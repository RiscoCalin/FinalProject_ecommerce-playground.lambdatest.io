package pages;

import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAItemAndMultiplyPage extends BasePage {
    public AddAItemAndMultiplyPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#mz-product-listing-image-37213259-0-0 >.carousel-inner>.active>.lazy-load")
    private WebElement IMac;
    public void ClickOnIMac() {
        IMac.click();
    }
    @FindBy(css = "#entry_216841 > .input-group >.input-group-append")
    private WebElement IncreaseNumberOfIMac;
    public void ClickOnIncreaseNumberOfIMac() {
        IncreaseNumberOfIMac.click();
    }
    @FindBy(css = "#entry_216841 > .input-group >.input-group-prepend")
    private WebElement DecreaseNumberOfIMac;
    public void ClickOnDecreaseNumberOfIMac() {
        DecreaseNumberOfIMac.click();
    }


}
