package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckSofwarePage extends BasePage {
    public CheckSofwarePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#entry_217832>.text-reset")
    private WebElement  ShopByCategory;
    public void ClickOnShopByCategory(){
        ShopByCategory.click();
    }
    @FindBy(css = "#widget-navbar-217841 > ul > li:nth-child(4) > a > div.info > span")
    private WebElement  Software;
    public void ClickOnSoftware(){
        Software.click();
    }
    @FindBy(xpath = "/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[4]/div/div[5]/div/select/option[4]")
    private WebElement SortByNewest ;
    public void ClickOnSortByNewest(){
        SortByNewest.click();
    }
    @FindBy(xpath = "/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[4]/div/div[5]/div/select/option[2]")
    private WebElement SortByBestSeller ;
    public void ClickOnSortByBestSeller(){
        SortByBestSeller.click();
    }
    @FindBy(xpath = "/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[4]/div/div[5]/div/select/option[6]")
    private WebElement SortByNameZA ;
    public void ClickOnSortByNameZA(){
        SortByNameZA.click();
    }
    @FindBy(xpath = "/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[4]/div/div[5]/div/select/option[8]")
    private WebElement SortByPriceHIGHTLOW ;
    public void ClickOnSortByPriceHIGHTLOW(){
        SortByPriceHIGHTLOW.click();
    }
    @FindBy(xpath = "/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[4]/div/div[5]/div/select/option[11]")
    private WebElement SortByModelAZ ;
    public void ClickOnSortByModelAZ(){
        SortByModelAZ.click();
    }


}
