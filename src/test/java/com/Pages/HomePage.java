package com.Pages;

import java.util.concurrent.TimeUnit;

import com.Objects.HomePageObjects;
import com.Utils.Helpers;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Helpers {
    private final HomePageObjects homePageObjects;

    public HomePage(WebDriver driver) {
        super(driver);
        homePageObjects = new HomePageObjects();
        PageFactory.initElements(driver, homePageObjects);
        waitForElement(homePageObjects.MyAccount);
    }
    public LoginPage clickMyAccount() {
    	homePageObjects.MyAccount.click();
        return new LoginPage(driver);
    }
    
    public void validateHomePage() {
        waitForElement(homePageObjects.MyAccount);
    }

    public LoginPage signOut(){
    	mouseHover(homePageObjects.MyAccount);
    	homePageObjects.signOutLink.click();
    	return new LoginPage(driver);
    } 
    
    public SearchResultsPage electronicsDeaprtment(){
    	mouseHover(homePageObjects.department);
    	homePageObjects.electronics.click();
		return new SearchResultsPage(driver);  	
    }
    
    public MyCartPage cart(){
    	homePageObjects.cart.click();
    	 return new MyCartPage(driver);  	
    }
    
    public SearchResultsPage search(String searchvalue){
    	homePageObjects.searchBox.sendKeys(searchvalue);
    	homePageObjects.searchBox.sendKeys(Keys.ENTER);
			return new SearchResultsPage(driver);
	    }
    public HomePage clickAmazonHome(){
    	mouseHover(homePageObjects.amazonHome).click();
		return new HomePage(driver); 	
    }
    
	public HomePage clickContinue(){
		if(homePageObjects.continueButton.isDisplayed())
		homePageObjects.continueButton.click();
		waitForElement(homePageObjects.amazonHome);
		return new HomePage(driver);
	}
    
}

