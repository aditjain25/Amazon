package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Objects.SearchResultsPageObjects;
import com.Utils.Helpers;

public class SearchResultsPage extends Helpers {
	private  SearchResultsPageObjects searchResultsPageObjects;
	
	public SearchResultsPage(WebDriver driver) {
        super(driver);
        searchResultsPageObjects = new SearchResultsPageObjects();
        PageFactory.initElements(driver, searchResultsPageObjects);
    }

	public AddToCartPage openfirstHeadPhone(){
		searchResultsPageObjects.headPhones.click();
		searchResultsPageObjects.firstHeadPhone.click();
		return new AddToCartPage(driver);		
	}
	public AddToCartPage openSecondHeadMacbook(){	
		searchResultsPageObjects.macBook.click();
		return new AddToCartPage(driver);
	}
}
