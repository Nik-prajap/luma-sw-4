package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {


    By shoppingCartText = By.xpath("//span[@class='base']");
    By cronusYogaPantText = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By productSize32 = By.xpath("//dd[contains(text(),'32')]");
    By blackText = By.xpath("//dd[contains(text(),'Black')]");


    By productNameText = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By verifyTheQty3 = By.xpath("//input[@title='Qty']");
    By productPrice = By.xpath("//span[@class='cart-price']//span)[2]");
    By qtyChangeTo5 = By.xpath("(//input[@class='input-text qty'])[1]");
    By shoppingCartButton = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By productPrice225 = By.xpath("(//span[@class='cart-price']//span)[2]");


    public void verifyShoppingCartText() {
        getTextFromElement(shoppingCartText);
    }

    public void verifyCronusYogaPantText() {
        getTextFromElement(cronusYogaPantText);
    }

    public void verifyProductSize32Text() {
        getTextFromElement(productSize32);
    }

    public void verifyBlackColourText() {
        getTextFromElement(blackText);
    }


    public void getTextToVerifyProductOverNightDuffle() {
        getTextFromElement(productNameText);
    }

    public void getTextToVerifyQuantityIs3() {
        getTextFromElement(verifyTheQty3);
    }

    public void getTextToVerifyProductPrice135() {
        getTextFromElement(productPrice);
    }

    public void sendTextToVerifyProductPrice135(String quantity1) {
        sendTextToElement(qtyChangeTo5, quantity1);
    }

    public void clickOnUpdateShoppingCartButton() {
        clickOnElement(shoppingCartButton);
    }

    public void verifyTheProductPrice225() {
        getTextFromElement(productPrice225);
    }


}
