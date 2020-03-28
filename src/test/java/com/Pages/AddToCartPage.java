package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Objects.AddToCartPageObjects;
import com.Utils.Helpers;

public class AddToCartPage extends Helpers {
	
	private final AddToCartPageObjects addToCartPageObjects;
	
	public AddToCartPage(WebDriver driver) {
        super(driver);
        addToCartPageObjects = new AddToCartPageObjects();
        PageFactory.initElements(driver, addToCartPageObjects);
        waitForElement(addToCartPageObjects.addToCart);
    }
	
	public HomePage clickAddToCart(String quantity){
		select(addToCartPageObjects.quantity,quantity);
		addToCartPageObjects.addToCart.click();
		return new HomePage(driver);
	}
	
}
