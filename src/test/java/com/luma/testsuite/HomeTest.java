package com.luma.testsuite;


import com.luma.customlisteners.CustomListeners;
import com.luma.pages.*;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.ArrayList;

@Listeners(CustomListeners.class)
public class HomeTest extends BaseTest {

    HomePage homePage;
    BottomsPage bottomsPage;
    JacketsPage jacketsPage;
    OverNightDufflePage overNightDufflePage;
    BagsPage bagsPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        bottomsPage = new BottomsPage();
        jacketsPage = new JacketsPage();
        overNightDufflePage = new OverNightDufflePage();
        bagsPage = new BagsPage();
    }

    @Test(groups = {"Sanity", "Regression"})
    public void verifyTheSortByProductNameFilter() {
        homePage.mouseHoverOnWomenMenu();
        homePage.mouseHoverOnTopMenu();
        homePage.clickOnJacketsLink();
        jacketsPage.sortByProductName();
        ArrayList<String> actualProductsName = jacketsPage.getActualProductsNameByOrder();
        ArrayList<String> expectedProductsName = jacketsPage.getProductsNameByAscendingOrder();
        Assert.assertEquals(actualProductsName, expectedProductsName);

    }

    @Test(groups = {"Smoke", "Regression"})
    public void userShouldAddProductSuccessFullyToShoppinCart() {
        homePage.mouseHoverOnGear();
        homePage.clickOnBagLink();
        bagsPage.selectOvernightDuffle();
        String expectedMessage = "Overnight Duffle";
        String actualMessage = bagsPage.getTextOvernightDuffle();
        Assert.assertEquals(expectedMessage, actualMessage);
        bagsPage.addQuantity();
        bagsPage.clickOnOvernightDuffleAddToCart();
        String expectedMessage1 = "You added Overnight Duffle to your shopping cart.";
        String actualMessage1 = overNightDufflePage.getTextOvernightDuffle();
        Assert.assertEquals(expectedMessage1, actualMessage1);
        overNightDufflePage.clickOnShoppingCartButton();
        overNightDufflePage.getTextCronusYogaPant();
        //* Verify the Qty is ‘3’
        String expectedMessage3 = "3";
        String actualMessage3 = overNightDufflePage.getTextOfQuantityThree();
        Assert.assertEquals(actualMessage3, expectedMessage3);
        //* Verify the product price ‘$135.00’
        String expectedMessage4 = "$135.00";
        String actualMessage4 = overNightDufflePage.getTextOfPrice$13500();
        Assert.assertEquals(actualMessage4, expectedMessage4);
        //* Change Qty to ‘5’
        overNightDufflePage.addQuantityTo5();
        overNightDufflePage.clickOnShoppingCartButton();
        //* Verify the product price ‘$225.00’
        String expectedMessage5 = "$225.00";
        String actualMessage5 = overNightDufflePage.getPrice$22500();
        Assert.assertEquals(actualMessage5, expectedMessage5);

    }

    @Test(groups = {"Regression"})
    public void verifyTheSortByPriceFilter() {
        homePage.mouseHoverOnWomenMenu();
        homePage.mouseHoverOnTopMenu();
        homePage.clickOnJacketsLink();
        jacketsPage.sortByPrice();
        ArrayList<String> actualPrice = jacketsPage.getActualProductsPriceByOrder();
        ArrayList<String> expectedPrice = jacketsPage.getProductsPriceByAscendingOrder();
        Assert.assertEquals(actualPrice, expectedPrice);

    }


}


