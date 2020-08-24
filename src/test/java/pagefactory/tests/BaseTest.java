package pagefactory.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pagefactory.pages.*;

public class BaseTest {

    private WebDriver driver;
    public static final String AVIC_URL = "https://www.ebay.com/";
    protected static final int AMOUNT_SECONDS_TO_WAIT = 30;

    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
    }

    @BeforeMethod
    public void testSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AVIC_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }

    public ElectronicsPage getElectronicsPage() {
        return new ElectronicsPage(driver);
    }

    public SmartWatchesPage getSmartWatchesPage(){
        return new SmartWatchesPage(driver);
    }

    public ProductPage getProductPage(){

        return new ProductPage(driver);
    }

    public SearchResultPage getSearchResultPage() {
        return new SearchResultPage(driver);
    }

    public CartPage getCartPage(){
        return new CartPage(driver);
    }
}
