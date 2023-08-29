package com.Project.POM;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class home_Page {

	@FindBy(xpath="//span[text()='Men']")
	WebElement MenOption;
	
	@FindBy(xpath="//*[@id=\"ui-id-17\"]/span[2]")
	WebElement tops;
	
	@FindBy(xpath="//*[@id=\"ui-id-19\"]")
	WebElement jackets;
	
	@FindBy(xpath="//*[@id=\"ui-id-6\"]/span[2]")
	WebElement gear;
	
	@FindBy(id="search")
	WebElement searchBox;
	
	public home_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void homePage() {
		
		
	}
	
}
