package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import utilities.Excel_Utility;
import utilities.RandomData_Utility;

public class RegistrationPageTest extends Base {
	@Test
	public void verifyRegistrationPageTitle() 
	{
		
		driver.get("https://demowebshop.tricentis.com/register");
		String login_title=driver.getTitle();
		System.out.println("actual title-"+login_title);
		String expected_title=Excel_Utility.getStringData(0, 0, "Registration_Page");
		System.out.println(expected_title);
		Assert.assertEquals(login_title, expected_title, "invalid title");
	}
	
	@Test
	public void verifyUserRegistration()
	{
		driver.get("https://demowebshop.tricentis.com/");
		String first_name=RandomData_Utility.getFirstName();
		String last_name=RandomData_Utility.getLastName();
		String email_id=first_name+"."+last_name+"@yahoo.com";
		String password=first_name+"."+last_name;
		WebElement registration_field=driver.findElement(By.className("ico-register"));
		registration_field.click();
		WebElement gender_option=driver.findElement(By.className("forcheckbox"));
		gender_option.click();
		WebElement firstname_field=driver.findElement(By.id("FirstName"));
		firstname_field.sendKeys(first_name);
		WebElement lastname_field=driver.findElement(By.id("LastName"));
		lastname_field.sendKeys(last_name);
		WebElement email_field=driver.findElement(By.id("Email"));
		email_field.sendKeys(email_id);
		WebElement password_field=driver.findElement(By.id("Password"));
		password_field.sendKeys(password);
		WebElement confirmpassword_field=driver.findElement(By.id("ConfirmPassword"));
		confirmpassword_field.sendKeys(password);
		WebElement register_button=driver.findElement(By.id("register-button"));
		register_button.click();
		WebElement confirmation=driver.findElement(By.xpath("//div[@class='result']"));
		String conformation_message=confirmation.getText();
		//System.out.println(conformation_message);
		String expected_message=Excel_Utility.getStringData(0, 1, "Registration_Page");
		Assert.assertEquals(conformation_message, expected_message, "existing user");
	}

}
