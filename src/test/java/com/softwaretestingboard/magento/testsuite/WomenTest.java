package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ProductPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write down the following test into Women Test Class
 * 1. verifyTheSortByProductNameFilter() {
 * -Mouse Hover on Women Menu
 * -Mouse Hover on Tops
 * -Click on Jackets
 * -Select Sort By Filter "Product Name".
 * -Verify the Products name display in alphabetical Order. }
 * 2. verifyTheSortByPriceFilter() {
 * -Mouse Hover on Women Menu
 * -Mouse Hover on Tops
 * Click on Jackets
 * Select Sort By filter "Price"
 * Verify the products price display in Low to High }
 */

public class WomenTest extends TestBase {

    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();


    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {


        // Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();
        Thread.sleep(2000);

        // Mouse Hover on Tops Menu
        homePage.mouseHoverOnTopsMenu();
        Thread.sleep(2000);

        // Click on Jackets Menu
        homePage.mouseHoverToJacketsMenuAndClick();
        Thread.sleep(2000);

        // Storing jackets names in list
        List<WebElement> jacketsElementsIntoList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement e : jacketsElementsIntoList) {
            jacketsNameListBefore.add(e.getText());

            // Select Sort By filter Product Name wise
            productPage.sortByFilter("Product Name");

            // Verify products name displayed in alphabetical order
            jacketsElementsIntoList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
            List<String> jacketsNameListAfter = new ArrayList<>();
            Thread.sleep(1000);
            for (WebElement e1 : jacketsElementsIntoList) {
                jacketsNameListAfter.add(e1.getText());
            }
            // Sort the name list into Ascending Order
            jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
            Assert.assertEquals(jacketsNameListBefore, jacketsNameListAfter);       // Verify products name displayed in alphabetical order
        }
    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {

        //Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();
        Thread.sleep(2000);

        //Mouse Hover on Tops Menu
        homePage.mouseHoverOnTopsMenu();
        Thread.sleep(2000);

        //Click on Jackets Menu
        homePage.mouseHoverToJacketsMenuAndClick();
        Thread.sleep(2000);

        // Storing jackets price into list
        List<WebElement> jacketsListPrice = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> listJacketsPriceBefore = new ArrayList<>();
        for (WebElement e : jacketsListPrice) {
            listJacketsPriceBefore.add(Double.valueOf(e.getText().replace("$", "")));       //Converting price in to Double and Removing $ from price
        }

        // Sort filter by Price
        productPage.sortByFilter("Price");
        Thread.sleep(1000);

        // After Sorting Products by Price
        jacketsListPrice = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsListPriceAfter = new ArrayList<>();
        Thread.sleep(1000);
        for (WebElement e : jacketsListPrice) {
            jacketsListPriceAfter.add(Double.valueOf(e.getText().replace("$", "")));    //Converting price symbol $ into Double
        }

        // Sort the Jacket price to Ascending Order format
        Collections.sort(listJacketsPriceBefore);

        // Verify the products price in Low to High format
        Assert.assertEquals(listJacketsPriceBefore, jacketsListPriceAfter);
    }

}

