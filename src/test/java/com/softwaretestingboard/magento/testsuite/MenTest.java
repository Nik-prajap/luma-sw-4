package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ProductPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.annotations.Test;

/**
 * Write down the following  test into 'MenTest' class.
 * 1. userShouldAddProductSuccessfullyToShoppingCart() {
 * -Mouse Hover on Men Menu
 * -Mouse Hover on Bottoms
 * -Click on Pants
 * -Mouse Hover on Product name ‘Cronus Yoga Pant’ and click on size 32.
 * -Mouse Hover on Product name ‘Cronus Yoga Pant’ and click on colour Black.
 * -Mouse Hover on Product name 'Cronus Yoga Pant' and click on 'Add to Cart' Button.
 * -Verify the Text 'You added Cronus Yoga Pant to your shopping cart.'
 * -Click on 'Shopping cart' Link into message
 * -Verify the text 'Shopping Cart.'
 * -Verify the product name 'Cronus Yoga Pant'
 * -Verify the product size '32'.
 * -Verify the product colour 'Black'
 * }
 */

public class MenTest extends TestBase {

    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessfullyToShoppingCart() {

        homePage.mouseHoverToMenMenu();
        homePage.mouseHoverToBottomsMenu();
        homePage.mouseHoverToPantsMenuAndClick();

        productPage.mouseHoverToCronusYogaPant();
        productPage.mouseHoverToCronusYogaPantAndClickSize32();
        productPage.mouseHoverToCronusYogaPantAndClickBlackColour();
        productPage.mouseHoverToCronusAndClickOnAddToCartButton();
        productPage.mouseHoverToCronusYogaPant1();
        productPage.mouseHoverToCronusAndClickOnAddToCartButton1();
        productPage.getTextFromAddedCronusPantInYourShoppingCart();
        productPage.clickOnShoppingCartLinkIntoMessageForPants();

        shoppingCartPage.verifyShoppingCartText();
        shoppingCartPage.verifyCronusYogaPantText();
        shoppingCartPage.verifyProductSize32Text();
        shoppingCartPage.verifyBlackColourText();
    }
}
