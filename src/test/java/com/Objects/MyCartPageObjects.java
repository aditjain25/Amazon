package com.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyCartPageObjects {

	@FindBy(xpath="//div[@data-asin='B01M0GB8CC']//input[@type='submit']")
	public WebElement removeHeadphone;
	
	@FindBy(name="quantity")
	public WebElement quantityCartPage;
}
