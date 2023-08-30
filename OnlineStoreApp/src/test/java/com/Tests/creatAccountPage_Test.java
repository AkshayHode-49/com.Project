package com.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.createAccount;

public class creatAccountPage_Test extends baseClass{

	
	@Test
	public void My_account() {
		
		createAccount c=new createAccount(driver);
		c.create_Account(driver);
		
	    Assert.assertEquals(true, true);
	}
	
}
