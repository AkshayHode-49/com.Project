package com.Project.Test_Class;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	
	
	
	public WebDriver driver;
	String baseUrl="https://magento.softwaretestingboard.com/";
	String email="shiv_bigboss2@gmai.com";
	String password="BB16_winner";
	
	
	@BeforeClass
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseUrl);
		
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
		
		
	}
	

}
