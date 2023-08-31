package com.Tests;

import org.testng.annotations.Test;

import com.Pages.homePage;

public class homePage_Test extends baseClass  {
	
	@Test()
	public void home_Page() {
		
		homePage h=new homePage(driver);
		h.HomePageLinks_validation();
	}

}
