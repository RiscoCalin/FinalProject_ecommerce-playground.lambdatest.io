package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchForCameraPage extends BasePage {
    public SearchForCameraPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#search > div.search-input-group.flex-fill > div.search-input.d-flex > div.flex-fill > input[type=text]")
    private WebElement SearchField;
    public void typeSearchField(String text){
        SearchField.sendKeys(text);
    }
    @FindBy(css = ".search-button >.type-text")
    private WebElement SearchButton;
    public void ClickOnSearchButton(){
        SearchButton.click();
    }
}

