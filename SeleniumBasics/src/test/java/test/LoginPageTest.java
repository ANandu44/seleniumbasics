package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;

public class LoginPageTest extends Base{
	@Test
	public void verifyLoginPageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/login");
		String login_title=driver.getTitle();
		System.out.println("actual title-"+login_title);
		String expected_title="Demo Web Shop. Login";
		Assert.assertEquals(login_title, expected_title, "invalid title");
		
	}
	
	@Test
	public void verifyUserLogin()
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
	public void verifyUserLoginWithInvalidCredentials()
	{
		
	}
	

}
