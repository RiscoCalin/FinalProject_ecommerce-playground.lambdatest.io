package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsletterPage extends BasePage{
    public NewsletterPage(WebDriver driver){
        super((WebDriver) driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[6]/a")
    private WebElement MyAccountBox;

    public void ClickOnMyAccountBox() {
        MyAccountBox.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/div[2]/div/div/form/div[1]/input")
    private WebElement EmailField;
    public void typeEmailField(String text) {EmailField.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/div[2]/div/div/form/div[2]/input")
    private WebElement PasswordField;
    public void typePasswordField(String text) {PasswordField.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/div[2]/div/div/form/input[1]")
    private WebElement LogInButton;
    public void ClickOnLogInButton() {LogInButton.click();}
    @FindBy (linkText = "Newsletter")
    private WebElement Newsletter;
    public void ClickOnNewsletter(){
        Newsletter.click();
    };
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset/div/div/div[1]/label")
    private WebElement Yes;
    public void ClickOnYes() {Yes.click();}
    @FindBy(css = ".buttons>.float-right>.btn-primary")
    private WebElement ContinueButton;
    public void ClickOnContinueButton() {ContinueButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset/div/div/div[2]/label")
    private WebElement No;
    public void ClickOnNo() {No.click();}

    @FindBy(linkText = "Transactions")
    private WebElement Transactions;
    public void ClickOnTransactions() {Transactions.click();}
    @FindBy(linkText = "Reward Points")
    private WebElement RewardPoints;
    public void ClickOnRewardPoints() {RewardPoints.click();}
    @FindBy(linkText = "Notification")
    private WebElement Notifications;
    public void ClickOnNotifications() {Notifications.click();}
    @FindBy(linkText = "Brands")
    private WebElement Brands;
    public void ClickOnBrands() {Brands.click();}





}
