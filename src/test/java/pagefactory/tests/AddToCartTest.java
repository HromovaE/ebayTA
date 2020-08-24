package pagefactory.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AddToCartTest extends BaseTest {
    private static final String PRODUCT_ADDED_TO_CART = "1";

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

    @Test(priority = 3)
    public void checkCartAfterDeletingItem() {
        getHomePage().clickElectronicsCategory();
        getHomePage().implicitlyWait(30);
        getElectronicsPage().clickSubCategorySmartWatches();
        getHomePage().implicitlyWait(30);
        getSmartWatchesPage().clickFirstProductInCategory();
        getHomePage().implicitlyWait(30);
        getProductPage().clickAddToCartButton();
        getHomePage().implicitlyWait(30);
        getProductPage().clickDeleteFromCartButton();
        assertTrue(getCartPage().isRemoved());

    }



}
