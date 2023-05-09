package com.luma.testsuite;


import com.luma.customlisteners.CustomListeners;
import com.luma.pages.BottomsPage;
import com.luma.pages.HomePage;
import com.luma.pages.OverNightDufflePage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class MenTest extends BaseTest {
    HomePage homePage;
    BottomsPage bottomsPage;
    OverNightDufflePage overNightDufflePage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        bottomsPage = new BottomsPage();
        overNightDufflePage = new OverNightDufflePage();
    }

    @Test(groups = {"Sanity"})
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        homePage.mouseHoverMenMenu();
        homePage.mouseHoverOnBottoms();
        homePage.clickOnPantLink();
        bottomsPage.mouseHoverOnCronusYogaPant();
        bottomsPage.clickOnSize();
        //‘You added Cronus Yoga Pant to your shopping cart.’
        String expMessage = "You added Cronus Yoga Pant to your shopping cart.";
        String actualMessage = bottomsPage.getTextPantsAddedToCart();
        Assert.assertEquals(actualMessage, expMessage);
        overNightDufflePage.clickOnShoppingCartButton();
        String expMessage1 = "Cronus Yoga Pant";
        String actualMessage1 = bottomsPage.getTextPantsAddedToCart();
        Assert.assertEquals(actualMessage1, expMessage1);
        String expMessage2 = "32";
        String actualMessage2 = bottomsPage.gettextToCheckSizeOfProduct();
        Assert.assertEquals(actualMessage2, expMessage2);
        String expMessage3 = "Black";
        String actualMessage3 = bottomsPage.getTextToCheckColourOfProduct();
        Assert.assertEquals(actualMessage3, expMessage3);

    }
}
