package org.testngcommands;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		WebElement subscribe_button=driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));
		boolean isSubscribeButtonEnabled= subscribe_button.isEnabled();
		Assert.assertTrue(isSubscribeButtonEnabled, "not enabled");
	}
	
	@Test
	public void verifyIsEnaled()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement vote_button=driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
		boolean isVoteButtonDisplayed=vote_button.isDisplayed();
		Assert.assertTrue(isVoteButtonDisplayed, "not displayed");
	}
	
	@Test
	public void verifyJavascriptExecuter()
	{
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById(\"newsletter-email\").value='test23@gmail.com'" );
		js.executeScript("document.getElementById(\"newsletter-subscribe-button\").click()");
	}
	
	@Test
	public void verifyVerticalScroll()
	{
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	@Test
	public void verifyDemoWebShopLogin()
	{
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	}
	
	@Test
	public void verifyWaits()
	{
		driver.get("https://demoqa.com/alerts");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement clickme_button=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		clickme_button.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		
	}
	
	@Test
	public void verifyFluentWait()
	{
		driver.get("https://demoqa.com/alerts");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		FluentWait wait=new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(3));
		wait.ignoring(NoSuchElementException.class);
		
		WebElement clickme_button=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		clickme_button.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
	}
	
}
		
			
