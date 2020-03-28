package com.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {
	
	@FindBy(xpath="//div[@id='nav-logo']/a")
	public WebElement amazonHome;
	
    @FindBy(id = "anonCarousel1")
    public WebElement header;

    @FindBy(id = "nav-al-signin")
    public WebElement signInButton;
    
	@FindBy(id = "nav-link-accountList")
	public WebElement MyAccount;
	
	@FindBy(id = "nav-item-signout")
    public WebElement signOutLink;
	
	
	@FindBy(id = "nav-link-shopall")
    public WebElement department;
	
	@FindBy(linkText = "Electronics")
    public WebElement electronics;
	
	@FindBy(id = "nav-cart")
    public WebElement cart;
	
	@FindBy(id="twotabsearchtextbox")
	public WebElement searchBox;
	
    @FindBy(xpath="//div[@class='a-popover-wrapper']//input[@type='submit']")
    public WebElement continueButton;
	
}

