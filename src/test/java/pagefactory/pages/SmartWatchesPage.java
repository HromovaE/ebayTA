package pagefactory.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartWatchesPage extends BasePage {




    @FindBy(xpath = "//ul[contains(@class,'b-list__items_nofooter')]/li[1]/div/div/a")
    private WebElement firstProductInCategory;

    public SmartWatchesPage (WebDriver driver) {
        super(driver);
    }

    public void clickFirstProductInCategory() {
        firstProductInCategory.click();
    }
}
