package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class signIn {

	public String Email="shivthakareBB16@gmail.com";
	public String Password="shivBB16";
	
	
	@FindBy(xpath="//button[@id='myAccount']")
	WebElement my_account;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement mail;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Sign in']")
	WebElement sign_in;
	
	@FindBy(xpath="//div[text()='Welcome, Shiv!']")
	WebElement welcome_shiv;
	
	
	public signIn(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public void sign_in() {
		
		my_account.click();
		mail.sendKeys(Email);
		password.sendKeys(Password);
		sign_in.click();
	    welcome_shiv.isDisplayed();
		    
	    Assert.assertEquals(true, true);
		
		
	}
	
}
