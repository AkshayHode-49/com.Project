package com.Project.Test_Class;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Project.POM.buy_Product;
import com.Project.POM.create_Account_Page;
import com.Project.POM.home_Page;

import com.Project.POM.sign_Up_Page;

public class Test_Class extends baseClass {

	
	@Test(groups="smoke")
	public void createAccount() {
		
	create_Account_Page c=new create_Account_Page(driver);
	c.create_Account();
		
	}
	
	@Test(priority=1,groups="smoke")
	public void signIn() {
		
	sign_Up_Page s=new sign_Up_Page(driver);
	s.signIn();
	
	}
	
	@Test(priority=2,groups="sanity")
	public void homePage() {
		
	home_Page home=new home_Page(driver);
	home.homePage();
	}
	
	@Test(priority=3,groups={"smoke","sanity"})
	public void cart() throws IOException {
		
		buy_Product t=new buy_Product(driver);
		t.buy_Produt(driver);
	}
	
	
}
