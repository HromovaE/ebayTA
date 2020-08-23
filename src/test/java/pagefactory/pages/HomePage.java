package pagefactory.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//ul[@class='hl-cat-nav__container']/li/a[contains(text(),'Electronics')]")
    private WebElement electronicsCategory;


    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;

    @FindBy(xpath = "//span[@class='sidebar-item']")
    private WebElement catalogueProductButton;

    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'apple-store')]")
    private WebElement appleStoreButton;

    @FindBy(xpath = "//div[@class='brand-box__title']/a[contains(@href,'iphone')]")
    private WebElement amountOfProductsInCart;

    @FindBy(xpath = "//li[@class='']/a[contains(@href,'kontaktyi')]")
    private WebElement contactsLink;

    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'gadzhetyi1')]")
    private WebElement gadgetsGroup;



    public HomePage (WebDriver driver) {
            super(driver);
    }

    public void searchByKeyword(String keyword){
        searchInput.sendKeys(keyword, Keys.ENTER);
    }

    public void clickCatalogueButton() {
        catalogueProductButton.click();
    }

    public void clickAppleStoreButton() {
        appleStoreButton.click();   //каталог товаров
    }

    public String getAmountOfProductsInCart(){
        return amountOfProductsInCart.getText();
    }

    public void clickContactsLink() {
        contactsLink.click();
    }

    public void clickGadgetsGroup() {
        gadgetsGroup.click();
    }




    public void clickElectronicsCategory() {
        electronicsCategory.click();
    }

}

