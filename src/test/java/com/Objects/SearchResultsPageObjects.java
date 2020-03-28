package com.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPageObjects {
	@FindBy(xpath = "//div[@id='merchandised-content']//img[@alt='Headphones']")
    public WebElement headPhones;
	
	@FindBy(xpath = "//div[@data-asin='B01M0GB8CC']//a")
    public WebElement firstHeadPhone;
	
	@FindBy(xpath = "//div[@class='s-result-list sg-row']/div[2]//a[1]")
	public WebElement macBook;
}
