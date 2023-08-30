package com.Tests;

import org.testng.annotations.*;

import com.Pages.signIn;

public class signInPage_Test extends baseClass {
	
	
	
	@Test
	public void signIN() {
		
		signIn s=new signIn(driver);
		s.sign_in();
		
	}

}
