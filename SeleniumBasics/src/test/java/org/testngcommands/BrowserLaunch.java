package org.testngcommands;

import java.io.File;
import java.io.IOException;

import javax.naming.spi.DirStateFactory.Result;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserLaunch {
	WebDriver driver;
	public void initializeBrowser(String browser)
	{
		if(browser.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			throw new RuntimeException("Invalid Exception");
		}
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initializeBrowser("Chrome");
	}
	
	@AfterMethod
	public void closeBrowser(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			takeScreenShot(result);
		}
		driver.close();
	}
	
	public void takeScreenShot(ITestResult result) throws IOException
	{
		TakesScreenshot takesscreenshot=(TakesScreenshot)driver;
		File screenshot=takesscreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("./ScreenShot/"+result.getName()+".png"));
		
		
		
	}

}
