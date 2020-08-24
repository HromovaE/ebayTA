package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//a[@id='isCartBtn_btn']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//i[@id=\"gh-cart-n\"]")
    private WebElement countItemsInCart;

    @FindBy(xpath ="//button[@data-test-id='cart-remove-item']")
    private WebElement deleteFromCartButton;

    public ProductPage (WebDriver driver) {
        super(driver);
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public String getCountItemsInCart(){
        return countItemsInCart.getText();
    }

    public void clickDeleteFromCartButton() {
        deleteFromCartButton.click();
    }


}
