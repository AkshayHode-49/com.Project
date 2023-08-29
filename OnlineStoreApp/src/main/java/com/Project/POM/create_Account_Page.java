package com.Project.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class create_Account_Page {
	
	
	@FindBy(xpath="//div[@class='panel header']//a[text()='Create an Account']")
	WebElement createAccount_link;
	
	@FindBy(id="firstname")
	WebElement first_name;
	
	@FindBy(id="lastname")
	WebElement last_name;
	
	@FindBy(id="email_address")
	WebElement email_address;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="password-confirmation")
	WebElement retype_password;
	
	@FindBy(xpath="//*[@id=\"form-validate\"]/div/div[1]/button/span")
	WebElement click_createAccount;
	
	public create_Account_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void create_Account() {
		
		createAccount_link.click();
		first_name.sendKeys("Shiv");
		last_name.sendKeys("Thakare");
		email_address.sendKeys("shiv_bigboss2@gmai.com");
		password.sendKeys("BB16_winner");
		retype_password.sendKeys("BB16_winner");
		click_createAccount.click();
	}
	
	

}
