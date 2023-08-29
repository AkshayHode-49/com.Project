package com.Project.POM;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class buy_Product {
	
	public WebDriver driver;
	
	@FindBy(xpath="//span[text()='Men']")
	WebElement MenOption;
	
	@FindBy(xpath="//*[@id=\"ui-id-17\"]/span[2]")
	WebElement tops;
	
	@FindBy(xpath="//*[@id=\"ui-id-19\"]")
	WebElement jackets;
	
	@FindBy(id="sorter")
	WebElement sort_By;
	
	@FindBy(xpath="//*[@id=\"narrow-by-list\"]/div[4]/div[1]")
	WebElement colour;
	
	@FindBy(xpath="//*[@id=\"narrow-by-list\"]/div[4]/div[2]/div/div/a[2]/div")
	WebElement blue_Colour;
	
	
	public buy_Product(WebDriver driver) {
		
		PageFactory.initElements(driver, this);		
	}
	
	public void buy_Produt(WebDriver driver) throws IOException {
		
		Actions a=new Actions(driver);
		a.moveToElement(MenOption).build().perform();
		a.moveToElement(tops).build().perform();
		a.moveToElement(jackets).click().build().perform();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		Select s=new Select(sort_By);
		s.selectByValue("price");
		
		colour.click();
		blue_Colour.click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\Screenshots\\blueJackets.img");
		
		FileUtils.copyFile(src, trg);
		
	}

}
