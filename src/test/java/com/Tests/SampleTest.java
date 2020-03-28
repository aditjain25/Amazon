package com.Tests;

import org.testng.annotations.Test;

import com.Pages.HomePage;
import com.Utils.BaseClass;

public class SampleTest extends BaseClass {
	
	@Test(priority=1)
    public void SignInTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickMyAccount().enterCredentials("aditi.d.singhai@gmail.com", "Test@user")
                .validateHomePage();
    }
	@Test(priority=2)
	public void AddHeadPhone(){
		HomePage homePage= new HomePage(driver);
		homePage.electronicsDeaprtment().openfirstHeadPhone().clickAddToCart("1");
	}
	@Test(priority=3)
	public void AddMacbook(){
		HomePage homePage= new HomePage(driver);
		homePage.search("Macbook pro").openSecondHeadMacbook().clickAddToCart("2").clickContinue();
	}
    @Test(priority=4)
	public void reduceproductQuantity(){
		HomePage homePage= new HomePage(driver);
		homePage.clickAmazonHome();
		homePage.cart().deleteHeadphone();
		homePage.cart().changeQuantity("1");
	}
	@Test(priority=5)
	public void SignOutTest(){
		HomePage homepage= new HomePage(driver);
		homepage.signOut();
		
	}

}
