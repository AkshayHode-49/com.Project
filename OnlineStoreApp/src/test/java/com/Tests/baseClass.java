package com.Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.Utilities.takeScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	
	public static WebDriver driver;
	public String URL="https://luma-demo.scandipwa.com/";
	
	
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) {
		
		System.out.println("BrowserName :"+browserName);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("IE")) {
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(URL);
	}
	
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		
		if(ITestResult.FAILURE==result.getStatus()) {
			
			takeScreenshot.takingScreenshot(driver,result.getName());
		}
		
	
		
		driver.quit();
		
	}

}
