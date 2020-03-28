package com.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPageObjects {
      @FindBy(id="add-to-cart-button")
      public WebElement addToCart;
      
      @FindBy(xpath="//select[@id='quantity']")
      public WebElement quantity;
}
