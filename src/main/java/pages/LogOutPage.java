package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage extends BasePage {
    public LogOutPage(WebDriver driver) {
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

    @FindBy(css = "#widget-navbar-217834 > ul > li:nth-child(6) > a")
    private WebElement MouseOverMyAccount;

    public void moveOverMyAccount() {
        Actions action = new Actions(driver);
        action.moveToElement(MouseOverMyAccount).perform();
    }

    @FindBy(css = "#widget-navbar-217834 > ul > li:nth-child(6) > ul > li:nth-child(6) > a")
    private WebElement ClickOnLogOut;

    public void setClickOnLogOut() {
        Actions action = new Actions(driver);
        action.moveToElement(ClickOnLogOut);
        action.click().build().perform();
    }
}