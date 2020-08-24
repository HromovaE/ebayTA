package pagefactory.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//ul[@class='hl-cat-nav__container']/li/a[contains(text(),'Electronics')]")
    private WebElement electronicsCategory;

    @FindBy(xpath = "//div[@id='gh-ac-box2']/input[@class='gh-tb ui-autocomplete-input']")
    private WebElement searchInput;

    public HomePage (WebDriver driver) {
            super(driver);
    }

    public void searchByKeyword(String keyword){
        searchInput.sendKeys(keyword, Keys.ENTER);
    }

    public void clickElectronicsCategory() {
        electronicsCategory.click();
    }

}

