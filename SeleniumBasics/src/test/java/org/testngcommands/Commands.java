package org.testngcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Commands extends BrowserLaunch {
	@Test
	public void verifyHomepageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/");
		String actual_title=driver.getTitle();
		System.out.println(actual_title);
		//String expected_result="Demo Web Shop";
		String expected_result="Demo Shop";
		Assert.assertEquals(actual_title, expected_result, "invalid title");;
	}
	
	@Test
	public void verifyDemoWebshopLogin()
	{
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement login_field=driver.findElement(By.className("ico-login"));
		login_field.click();
		WebElement email_field=driver.findElement(By.id("Email"));
		email_field.sendKeys("john314@gmail.com");
		WebElement password_field=driver.findElement(By.id("Password"));
		password_field.sendKeys("john@1234");
		WebElement login_button=driver.findElement(By.className("login-button"));
		login_button.click();
		WebElement email_shown=driver.findElement(By.xpath("//a[text()='john314@gmail.com']"));
		String actual_email=email_shown.getText();
		System.out.println(actual_email);
		String expected_email="john314@gmail.com";
		Assert.assertEquals(actual_email, expected_email, "Invalid mail id");
		
	}
	
	@Test
	public void verifyIsSelected()
	{
		boolean ismaleselected;
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		WebElement gendermale_field=driver.findElement(By.xpath("//input[@id='gender-male']"));
		ismaleselected=gendermale_field.isSelected();
		Assert.assertFalse(ismaleselected, "Male is selected");
		gendermale_field.click();
		ismaleselected=gendermale_field.isSelected();
		Assert.assertTrue(ismaleselected, "Male not selected");
		
	}
	
	@Test
	public void verifyIsEnabled()
	{
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement subscribe_button=driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));
		boolean isSubscribeButtonEnabled= subscribe_button.isEnabled();
		Assert.assertTrue(isSubscribeButtonEnabled, "not enabled");
	}
	
	@Test
	public void verifyIsEnaled()
	{
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement vote_button=driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
		boolean isVoteButtonDisplayed=vote_button.isDisplayed();
		Assert.assertTrue(isVoteButtonDisplayed, "not displayed");
	}
	
}
		
			
