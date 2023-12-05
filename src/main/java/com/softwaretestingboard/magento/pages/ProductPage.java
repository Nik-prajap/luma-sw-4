package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {

    By sortJackets = By.xpath("(//select[@id='sorter'])[1]");


    By cronusYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By size32YogaPant = By.xpath("(//div[@class='swatch-option text'])[1]");
    By blackYogaPant = By.xpath("(//div[@class='swatch-option color'])[1]");
    By addToShoppingCartButton = By.xpath("//a[normalize-space()='Cronus Yoga Pant'");
    By addToCartButton = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    By verifyCronusShoppingCartText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLinkPants = By.xpath("//a[normalize-space()='shopping cart']");


    By overnightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By verifyOvernightDuffleText = By.xpath("//span[@class='base']");
    By changeQty3 = By.xpath("//input[@id='qty']");
    By overnightDuffleAddToCart = By.xpath("//button[@id='product-addtocart-button'");
    By verifyAddedOvernightDuffleToShoppingCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By clickOnShoppingCartLink = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");


    public void sortByFilter(String filter) {
        selectByVisibleTextFromDropDown(sortJackets, filter);
    }


    public void mouseHoverToCronusYogaPant() {
        mouseHoverToElement(cronusYogaPant);
    }

    public void mouseHoverToCronusYogaPantAndClickSize32() {
        waitUntilVisibilityOfElementLocated(size32YogaPant,10);
        mouseHoverToElementAndClick(size32YogaPant);
    }

    public void mouseHoverToCronusYogaPantAndClickBlackColour() {
        waitUntilVisibilityOfElementLocated(blackYogaPant,10);
        mouseHoverToElementAndClick(blackYogaPant);
    }

    public void mouseHoverToCronusAndClickOnAddToCartButton() {
        waitUntilVisibilityOfElementLocated(addToShoppingCartButton,10);
        mouseHoverToElementAndClick(addToShoppingCartButton);
    }

    public void mouseHoverToCronusYogaPant1() {
        mouseHoverToElementAndClick(addToShoppingCartButton);
    }

    public void mouseHoverToCronusAndClickOnAddToCartButton1() {
        mouseHoverToElementAndClick(addToCartButton);
    }

    public void getTextFromAddedCronusPantInYourShoppingCart() {
        getTextFromElement(verifyCronusShoppingCartText);
    }

    public void clickOnShoppingCartLinkIntoMessageForPants() {
        clickOnElement(shoppingCartLinkPants);
    }


    public void clickOnOverNightDuffle() {
        clickOnElement(overnightDuffle);
    }

    public String getTextFromOvernightDuffle() {
        return getTextFromElement(verifyOvernightDuffleText);
    }

    public void sendTextToChangeQty(String quantity) {
        sendTextToElement(changeQty3, quantity);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(overnightDuffleAddToCart);
    }

    public String verifyTheAddedShoppingText() {
        return getTextFromElement(verifyAddedOvernightDuffleToShoppingCart);
    }

    public void clickOnShoppingCartLinkIntoMessage() {
        clickOnElement(clickOnShoppingCartLink);
    }

}
