package com.luma.pages;


import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OverNightDufflePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]")
    WebElement overnightDuffleText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartButton;

    @CacheLookup
    @FindBy(xpath = "//tbody[1]/tr[1]/td[1]/div[1]/strong[1]/a[1]")
    WebElement OvernightDuffleText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='field qty']//input")
    WebElement quantityTextField;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'$135.00')]")
    WebElement priceTextField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='cart-106590-qty']")
    WebElement quantityAddTextField;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'$225.00')]")
    WebElement priceTextField2;


    public String getTextOvernightDuffle() {
        Reporter.log("Get OvernightDuffle Text  " + overnightDuffleText.toString());
        return getTextFromElement(overnightDuffleText);
        // CustomListeners.test.log(Status.PASS,"Text overnightDuffle");

    }

    public void clickOnShoppingCartButton() {
        Reporter.log("Clicking on Continue Button " + shoppingCartButton.toString());
        clickOnElement(shoppingCartButton);
        CustomListeners.test.log(Status.PASS, "Click on shoppingCart Button");
    }

    public String getTextCronusYogaPant() {
        Reporter.log("Get Account Has Been Created  text  " + overnightDuffleText.toString());
        return getTextFromElement(overnightDuffleText);

    }

    public String getTextOfQuantityThree() {
        Reporter.log("get text quantity  " + quantityTextField.toString());
        return getTextFromElement(quantityTextField);

    }

    public String getTextOfPrice$13500() {
        Reporter.log("get text price$13500  " + priceTextField.toString());
        return getTextFromElement(priceTextField);
    }

    public void addQuantityTo5() {
        Reporter.log("Add quantity  " + quantityAddTextField.toString());
        sendTextToElement(quantityAddTextField, "5");
        CustomListeners.test.log(Status.PASS, "add quantity ");
    }

    public String getPrice$22500() {
        Reporter.log("get text price$22500  " + priceTextField.toString());
        return getTextFromElement(priceTextField2);

    }


}
