package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends BasePage {


    @FindBy(xpath = "//div[@class='b-visualnav__grid']/a[contains(@href,'Smart-Watches/')]")
    private WebElement subCategorySmartWatches;

    public ElectronicsPage (WebDriver driver) {
        super(driver);
    }

    public void clickSubCategorySmartWatches() {
       subCategorySmartWatches.click();
    }


}

