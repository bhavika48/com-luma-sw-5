package com.luma.pages;


import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BagsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Overnight Duffle')]")
    WebElement overNightDuffleLink;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Overnight Duffle')]")
    WebElement overNightDuffleText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantityTextField;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
    WebElement addToCartButton;


    public void selectOvernightDuffle() {
        Reporter.log("Clicking on OvernightDuffle " + overNightDuffleLink.toString());
        clickOnElement(overNightDuffleLink);
        CustomListeners.test.log(Status.PASS, "Click on OvernightDuffle");
    }

    public String getTextOvernightDuffle() {
        Reporter.log("Get OvernightDuffle Text  " + overNightDuffleText.toString());
        return getTextFromElement(overNightDuffleText);

    }

    public void addQuantity() {
        Reporter.log("Add Quantity " + quantityTextField.toString());
        sendTextToElement(quantityTextField, "3");
        CustomListeners.test.log(Status.PASS, "quantity field");
    }

    public void clickOnOvernightDuffleAddToCart() {
        Reporter.log("Clicking on Add to cart " + addToCartButton.toString());
        clickOnElement(addToCartButton);
        CustomListeners.test.log(Status.PASS, "Click on add to Button");
    }


}
