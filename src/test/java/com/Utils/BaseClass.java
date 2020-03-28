package com.Utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import com.Objects.HomePageObjects;
import com.Pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public WebDriver driver;
    Dimension d;
    private String baseUrl = "https://www.amazon.com/";


    @BeforeClass
    public void setUp() {
    	getChromeBrowser();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    private void getChromeBrowser() {
        System.out.println("Setting up Chrome Browser");
        String key="webdriver.chrome.driver";
    	String value="C:\\Users\\aditjain\\Desktop\\selenium-java-3.14.0\\chromedriver_win32\\chromedriver.exe";
        System.setProperty(key, value);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown() {
        if (driver != null)
            driver.quit();
    }

}
