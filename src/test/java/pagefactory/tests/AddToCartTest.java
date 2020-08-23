package pagefactory.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactory.pages.ElectronicsPage;

import static org.testng.Assert.assertEquals;

public class AddToCartTest extends BaseTest {
    private static final String PRODUCT_ADDED_TO_CART = "1";
    private static final String PRODUCTS_AFTER_COUNT_INCREASING = "2";

    @Test(priority = 1)
    public void checkAddToCart() {
        getHomePage().clickElectronicsCategory();
        getHomePage().implicitlyWait(30);
        getElectronicsPage().clickSubCategorySmartWatches();
        getHomePage().implicitlyWait(30);
        getSmartWatchesPage().clickFirstProductInCategory();
        getHomePage().implicitlyWait(30);
        getProductPage().clickAddToCartButton();
        getHomePage().implicitlyWait(30);
        assertEquals(getProductPage().getCountItemsInCart(), PRODUCT_ADDED_TO_CART);
    }




}
