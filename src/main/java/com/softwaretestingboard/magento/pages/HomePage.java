package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By womenMenu = By.xpath("//span[contains(text(),'Women')]");
    By topsMenu = By.cssSelector("a[id='ui-id-9'] span:nth-child(2)");
    By jacketsMenu = By.xpath("//a[@id='ui-id-11']");


    By menMenu = By.xpath("//span[text()='Men']");
    By bottomsMenu = By.xpath("//span[text()='Bottoms']");
    By pantsMenu = By.id("ui-id-23");


    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By bagsMenu = By.xpath("//span[normalize-space()='Bags']");


    public void mouseHoverOnWomenMenu() {
        waitUntilVisibilityOfElementLocated(womenMenu,10);
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTopsMenu() {
        waitUntilVisibilityOfElementLocated(topsMenu,10);
        mouseHoverToElement(topsMenu);
    }

    public void mouseHoverToJacketsMenuAndClick() {
        waitUntilVisibilityOfElementLocated(jacketsMenu, 10);
        mouseHoverToElementAndClick(jacketsMenu);
    }

    public void mouseHoverToMenMenu() {
        waitUntilVisibilityOfElementLocated(menMenu,10);
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverToBottomsMenu() {
        waitUntilVisibilityOfElementLocated(bottomsMenu,10);
        mouseHoverToElement(bottomsMenu);
    }

    public void mouseHoverToPantsMenuAndClick() {
        waitUntilVisibilityOfElementLocated(pantsMenu, 10);
        mouseHoverToElementAndClick(pantsMenu);
    }

    public void mouseHoverToGearMenu() {
        waitUntilVisibilityOfElementLocated(gearMenu,10);
        mouseHoverToElement(gearMenu);
    }

    public void mouseHoverToBagsMenuAndClick() {
        waitUntilVisibilityOfElementLocated(bagsMenu, 10);
        mouseHoverToElementAndClick(bagsMenu);
    }

}
