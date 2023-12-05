package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ProductPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.annotations.Test;


/**
 * Write down the following test into 'GearTest' class
 * 1. userShouldAddProductSuccessfullyToShoppingCart() {
 * -Mouse Hover on Gear Menu
 * -Click on Bags
 * -Click on Product Name 'Overnight Duffle'
 * -Verify the Text ''OverNight Duffle'
 * -Change Qty 3
 * -Click on 'Add to Cart' Button.
 * -Verify the Text - ‘You added Overnight Duffle to your shopping cart.’
 * -Click on ‘shopping cart’ Link into message
 * -Verify the product name ‘Cronus Yoga Pant’
 * -Verify the Qty is '3'.
 * -Verify the product price '$135.00'
 * -Change Qty to '5'
 * -Click on 'Update Shopping Cart' button
 * -Verify the product price '$225.00'
 * }
 */
public class GearTest extends TestBase {

    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessfullyShoppingCart() {


        homePage.mouseHoverToGearMenu();
        homePage.mouseHoverToBagsMenuAndClick();


        productPage.clickOnOverNightDuffle();
        productPage.getTextFromOvernightDuffle();
        productPage.sendTextToChangeQty("3");
        productPage.clickOnAddToCartButton();
        productPage.verifyTheAddedShoppingText();
        productPage.clickOnShoppingCartLinkIntoMessage();


        shoppingCartPage.getTextToVerifyProductOverNightDuffle();
        shoppingCartPage.getTextToVerifyQuantityIs3();
        shoppingCartPage.getTextToVerifyProductPrice135();
        shoppingCartPage.sendTextToVerifyProductPrice135("quantity1");
        shoppingCartPage.clickOnUpdateShoppingCartButton();
        shoppingCartPage.verifyTheProductPrice225();
    }
}
