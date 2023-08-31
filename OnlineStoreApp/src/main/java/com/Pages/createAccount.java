package com.Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class createAccount {
	

   	public String First_Name="Shiv";
	public String Last_Name="Thakare";
	public String Email="shivthakareBB16@gmail.com";
	public String Password="shivBB16";
	public String Confirm_Password="shivBB16";
	
	
	
	@FindBy(xpath="//button[@id='myAccount']")
	WebElement my_account;
	
	@FindBy(xpath="//button[text()='Create an account']")
	WebElement create_account;
	
	@FindBy(xpath="//input[@id='firstname']")
	WebElement first_name;
	
	@FindBy(xpath="//input[@id='lastname']")
	WebElement last_name;
	
	@FindBy(xpath="//input[@id='is_subscribed']")
	WebElement subscribe;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='confirm_password']")
	WebElement confirm_password;
	
	@FindBy(xpath="//div[text()='Got it']")
	WebElement popUP_gotit;
	
	@FindBy(xpath="//button[text()='Sign up']")
	WebElement signUp_button;
	
	@FindBy(xpath="//div[text()='Welcome, Shiv!']")
	WebElement welcome_shiv;
	
	public createAccount(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void create_Account(WebDriver driver) {
		
		my_account.click();
	    create_account.click();
	    first_name.sendKeys(First_Name);
	    last_name.sendKeys(Last_Name);
	    subscribe.click();
	    email.sendKeys(Email);
	    password.sendKeys(Password);
	    confirm_password.sendKeys(Confirm_Password);
	    
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,50)");
	    
	    System.out.println("Enabaled or not :"+signUp_button.isEnabled());
	    System.out.println("Displayed or not :"+signUp_button.isDisplayed());
	    
	    popUP_gotit.click();
	      
	    try 
	    {
	    	signUp_button.click();
	     }
	    catch(NoSuchElementException f)
	    {
	    	System.out.println("Exception Occurs");
	    }
	    
	  
	}

}
