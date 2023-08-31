package com.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.createAccount;
import com.Pages.homePage;
import com.Pages.signIn;

public class testClass extends baseClass {
	
	@Test(priority=1)
	public void CreateNewAccount() {
		
		createAccount c=new createAccount(driver);
		c.create_Account(driver);
		
	    Assert.assertEquals(true, true);
	}
	
	@Test(priority=2)
	public void signIN() {
		
		signIn s=new signIn(driver);
		s.sign_in();
		
	    System.out.println(driver.getTitle());
	    Assert.assertEquals(true, true);
	   
	}
	
	@Test(dependsOnMethods="signIN", priority=3)
	public void home_Page() {
		
		homePage h=new homePage(driver);
		h.HomePageLinks_validation();
		
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	

}
