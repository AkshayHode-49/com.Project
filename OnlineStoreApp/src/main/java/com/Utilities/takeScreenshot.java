package com.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class takeScreenshot {
	
	static public void takingScreenshot(WebDriver driver,String sc_name) throws IOException
	{
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screnshots/"+sc_name+".png");
		
		FileUtils.copyFile(src, trg);
		
	}

}
