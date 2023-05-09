package com.luma.pages;


import com.luma.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;

public class JacketsPage extends Utility {
    @CacheLookup
    @FindBy(id = "sorter")
    WebElement sortByDropDown;



public void selectProductsByFilters(){
    selectByVisibleTextFromDropDown(By.id("sorter"), "Product Name");
}

    public ArrayList<String> getProductsNameByAscendingOrder() {
        ArrayList<String> products = getListOfTextByElement(By.xpath("//ol//strong//a"));
        Collections.sort(products);
        return products;
    }
    public ArrayList<String> getActualProductsNameByOrder() {
        ArrayList<String> products = getListOfTextByElement(By.xpath("//ol//strong//a"));
        return products;
    }
    public ArrayList<String> getProductsPriceByAscendingOrder() {
        ArrayList<String> products = getListOfTextByElement(By.xpath("//div[@class='products wrapper grid products-grid']//span[@class='price']"));
        Collections.sort(products);
        return products;
    }
    public ArrayList<String> getActualProductsPriceByOrder() {
        ArrayList<String> products = getListOfTextByElement(By.xpath("//div[@class='products wrapper grid products-grid']//span[@class='price']"));
        return products;
    }
    public void sortByProductName(){
        selectByVisibleTextFromDropDown(sortByDropDown, "Product Name");
    }
    public void sortByPrice(){
        selectByVisibleTextFromDropDown(sortByDropDown, "Price ");
    }

}
