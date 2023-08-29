package com.Project.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sign_Up_Page {
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	WebElement signIn;
	
	@FindBy(name="login[username]")
	WebElement email;
	
	@FindBy(name="login[password]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"send2\"]/span")
	WebElement sign_In;
	
	
	public sign_Up_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void signIn() {
		
		signIn.click();
		email.sendKeys("shiv_bigboss2@gmai.com");
		password.sendKeys("BB16_winner");
		sign_In.click();
	}

}
