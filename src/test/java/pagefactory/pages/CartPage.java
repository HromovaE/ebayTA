package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    @FindBy (xpath = "//span[contains(text(),'was removed from your cart')]")
    private WebElement itemIsRemoved;


    public CartPage (WebDriver driver) {
        super(driver);
    }


    public boolean isRemoved(){
        return itemIsRemoved.getText().length()>0;
    }

}

