package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import data_provider.Data_Providers;
import listeners.RetryAnalyzer;
import utilities.Excel_Utility;

public class LoginPageTest extends Base{
	@Test(retryAnalyzer=RetryAnalyzer.class)
	public void verifyLoginPageTitle() 
	{
		driver.get("https://demowebshop.tricentis.com/login");
		String login_title=driver.getTitle();
		System.out.println("actual title-"+login_title);
		String expected_title=Excel_Utility.getStringData(0, 0, "Login_Page");
		//System.out.println(expected_title);
		Assert.assertEquals(login_title, expected_title, "invalid title");
		
	}
	
	@Test
	public void verifyUserLogin()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement login_field=driver.findElement(By.className("ico-login"));
		login_field.click();
		WebElement email_field=driver.findElement(By.id("Email"));
		email_field.sendKeys(Excel_Utility.getStringData(0, 1, "Login_Page"));
		WebElement password_field=driver.findElement(By.id("Password"));
		password_field.sendKeys(Excel_Utility.getStringData(1, 1, "Login_Page"));
		WebElement login_button=driver.findElement(By.className("login-button"));
		login_button.click();
		WebElement email_shown=driver.findElement(By.xpath("//a[text()='john314@gmail.com']"));
		String actual_email=email_shown.getText();
		System.out.println(actual_email);
		String expected_email=Excel_Utility.getStringData(0, 1, "Login_Page");
		Assert.assertEquals(actual_email, expected_email, "Invalid mail id");
		
		
	}
	
	@Test(dataProvider="InvalidUserCredntials",dataProviderClass=Data_Providers.class)
	public void verifyUserLoginWithInvalidCredentials(String username,String password)
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement login_field=driver.findElement(By.className("ico-login"));
		login_field.click();
		WebElement email_field=driver.findElement(By.id("Email"));
		email_field.sendKeys(username);
		WebElement password_field=driver.findElement(By.id("Password"));
		password_field.sendKeys(password);
		WebElement login_button=driver.findElement(By.className("login-button"));
		login_button.click();
		WebElement result_message=driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
		String actual_result=result_message.getText();
		System.out.println(actual_result);
		String expected_result=Excel_Utility.getStringData(2, 1, "Login_Page");
		System.out.println(expected_result);
		Assert.assertEquals(actual_result,expected_result, "succesfull login");
		
		
		
		
	}
	
	

	

}
