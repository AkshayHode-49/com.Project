package com.Project.Test_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cb_baseClass {
	
	public WebDriver driver;
	
	@Parameters("browserName")
	@BeforeClass(groups={"smoke","sanity"})
	public void setUp(String browserName) {
		
		System.out.println("browserName :"+browserName);
		System.out.println("Thread ID :"+ Thread.currentThread().getId());
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("IE")) {
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://magento.softwaretestingboard.com/");
	}
	
	@AfterClass(groups={"smoke","sanity"})
	public void tearDown() {
		
		driver.quit();
	}

}
