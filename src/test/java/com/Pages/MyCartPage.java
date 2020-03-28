package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Objects.MyCartPageObjects;
import com.Utils.Helpers;

public class MyCartPage extends Helpers {
private final MyCartPageObjects myCartPageObjects;
	
	public MyCartPage(WebDriver driver) {
        super(driver);
        myCartPageObjects = new MyCartPageObjects();
        PageFactory.initElements(driver, myCartPageObjects);
    }
	
	public MyCartPage deleteHeadphone(){
		myCartPageObjects.removeHeadphone.click();
		return new MyCartPage(driver);	
	}
	
	public MyCartPage changeQuantity(String quantity){
		select(myCartPageObjects.quantityCartPage,quantity);
		return new MyCartPage(driver);
		
	}

}
