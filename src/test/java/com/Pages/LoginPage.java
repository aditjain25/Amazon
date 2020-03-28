package com.Pages;

import com.Objects.LoginPageObjects;
import com.Utils.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Helpers {


    private final LoginPageObjects loginPageObjects;

    public LoginPage(WebDriver driver) {
        super(driver);
        loginPageObjects = new LoginPageObjects();
        PageFactory.initElements(driver, loginPageObjects);
        waitForElement(loginPageObjects.signInButton);
    }

    public HomePage enterCredentials(String email, String password) {
        loginPageObjects.email.sendKeys(email);
        loginPageObjects.password.sendKeys(password);
        loginPageObjects.signInButton.click();
        return new HomePage(driver);
    }

}
