package com.Utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers {

    public WebDriver driver;
    WebDriverWait webDriverWait;
    public Actions action;
    public Alert alert;
    Select quantityDropdown;

    public Helpers(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, 15);
        action = new Actions(driver);
    }

    public WebElement waitForElement(WebElement by) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
        return by;
    }
    
    public WebElement mouseHover(WebElement by){
    	action.moveToElement(by).perform();;
		return by;	
    }
    
    public WebElement elementNotClickable(WebElement by){
    	action.moveToElement(by).click().build().perform();
    	return by;
    }
    
//    public boolean isAlertPresent(){
//    	try
//    	{
//    		driver.switchTo().alert();
//    		return true;	
//    	}
//    	catch (NoAlertPresentException Ex)
//    	{
//    		return false;
//    	}
//    }
    
    public WebElement select(WebElement by, String quantity){
    	quantityDropdown = new Select(by);
    	quantityDropdown.selectByValue(quantity);
		return by;
    	
    }
}
