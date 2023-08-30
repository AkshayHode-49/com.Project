package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	
	@FindBy(xpath="//input[@id='search-field']")
	WebElement search_box;
	
	@FindBy(xpath="//img[@title='ScandiPWA logo']")
	WebElement logo;
	
	@FindBy(xpath="//button[@class='Header-MinicartButtonWrapper']")
	WebElement cart_option;
	
	@FindBy(xpath="//button[@id='myAccount']")
	WebElement myaccount_link;
	




  public homePage(WebDriver driver) {
	   
	  PageFactory.initElements(driver, this);
	  
  }
  
  public void HomePageLinks_validation() {
	  
	  System.out.println("search box Displayed :"+search_box.isDisplayed());
	  System.out.println("Search box is enabled :"+search_box.isEnabled());
	  
	  System.out.println("Logo displayed :"+logo.isDisplayed());
	  System.out.println("Cart option :"+cart_option.isDisplayed());
	  
	  System.out.println("My account link :"+myaccount_link.isDisplayed());
	
  }
   
}