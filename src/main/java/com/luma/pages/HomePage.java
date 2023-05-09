package com.luma.pages;


import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement womenLink;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[2]")
    WebElement topLink;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jacketLink;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gearLink;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Bags')]")
    WebElement bagLink;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-5']")
    WebElement menLink;

    @CacheLookup
    @FindBy(linkText = "Bottoms")
    WebElement bottomLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Pants')]")
    WebElement pantLink;

    public void mouseHoverOnWomenMenu() {
        Reporter.log("MouseHover on Women Menu " + womenLink.toString());
        mouseHoverToElement(womenLink);
        CustomListeners.test.log(Status.PASS, "mouseHover on women menu");
    }

    public void mouseHoverOnTopMenu() {
        Reporter.log("MouseHover on Top Menu " + topLink.toString());
        mouseHoverToElement(topLink);
        CustomListeners.test.log(Status.PASS, "mouseHover on Top menu");
    }

    public void clickOnJacketsLink() {
        Reporter.log("Clicking on jacket link " + jacketLink.toString());
        clickOnElement(jacketLink);
        CustomListeners.test.log(Status.PASS, "Click on jacket link");
    }

    public void mouseHoverOnGear() {
        Reporter.log("MouseHover on Gear Menu " + gearLink.toString());
        mouseHoverToElement(gearLink);
        CustomListeners.test.log(Status.PASS, "mouseHover on gear link");
    }

    public void clickOnBagLink() {
        Reporter.log("Clicking on bag link " + bagLink.toString());
        clickOnElement(bagLink);
        CustomListeners.test.log(Status.PASS, "Click on bag link");
    }

    public void mouseHoverMenMenu() {
        Reporter.log("MouseHover on men Menu " + menLink.toString());
        mouseHoverToElement(menLink);
        CustomListeners.test.log(Status.PASS, "mouseHover on menu link");
    }

    public void mouseHoverOnBottoms() {
        Reporter.log("MouseHover on bottoms Menu " + bottomLink.toString());
        mouseHoverToElement(bottomLink);
        CustomListeners.test.log(Status.PASS, "mouseHover on bottoms link");
    }

    public void clickOnPantLink() {
        Reporter.log("Clicking on pant link " + pantLink.toString());
        clickOnElement(pantLink);
        CustomListeners.test.log(Status.PASS, "Click on pant link");
    }
}
