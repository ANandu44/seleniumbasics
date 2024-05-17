package org.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
	public void verifySwagLabsLogin()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement username_field=driver.findElement(By.id("user-name"));
		username_field.sendKeys("standard_user");
		WebElement password_field=driver.findElement(By.id("password"));
		password_field.sendKeys("secret_sauce");
		WebElement login_button=driver.findElement(By.id("login-button"));
		login_button.click();
	}
	
	public void verifyDemoWebshopLogin()
	{
		WebDriver driver=new ChromeDriver();
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
		driver.close();
		
	}
	
	public void verifyLinkText()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		WebElement destination_field=driver.findElement(By.linkText("your destination"));
		destination_field.click();
		
		
	}
	public void verifyPartialLinkText()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		WebElement destination_field=driver.findElement(By.partialLinkText("destination"));
		destination_field.click();
		
		
	}
	public void totalNoOfTagInTheApplication()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		List<WebElement> inputtype=driver.findElements(By.tagName("input"));
		int inputsize=inputtype.size();
		System.out.println("total no of input tag is"+inputsize);
		
	}
	
	public void verifyDemoWebshopRegistration()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement registration_field=driver.findElement(By.className("ico-register"));
		registration_field.click();
		WebElement gender_option=driver.findElement(By.className("forcheckbox"));
		gender_option.click();
		WebElement firstname_field=driver.findElement(By.id("FirstName"));
		firstname_field.sendKeys("Anandu");
		WebElement lastname_field=driver.findElement(By.id("LastName"));
		lastname_field.sendKeys("AJ");
		WebElement email_field=driver.findElement(By.id("Email"));
		email_field.sendKeys("anandu112@gmail.com");
		WebElement password_field=driver.findElement(By.id("Password"));
		password_field.sendKeys("abcdef@123");
		WebElement confirmpassword_field=driver.findElement(By.id("ConfirmPassword"));
		confirmpassword_field.sendKeys("abcdef@123");
		WebElement register_button=driver.findElement(By.id("register-button"));
		register_button.click();
		
		
		
		
		
		
		
		
	}
	
	public void verifyGuru99Registration()
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		WebElement registration_field=driver.findElement(By.linkText("REGISTER"));
		registration_field.click();
		WebElement firstname_field=driver.findElement(By.name("firstName"));
		firstname_field.sendKeys("Anandu");
		WebElement lastname_field=driver.findElement(By.name("lastName"));
		lastname_field.sendKeys("AJ");
		WebElement phone_field=driver.findElement(By.name("phone"));
		phone_field.sendKeys("9797343434");
		WebElement email_field=driver.findElement(By.id("userName"));
		email_field.sendKeys("anandu112@gmail.com");
		WebElement address_field=driver.findElement(By.name("address1"));
		address_field.sendKeys("Neyyatinkara");
		WebElement city_field=driver.findElement(By.name("city"));
		city_field.sendKeys("Trivandrum");
		WebElement state_field=driver.findElement(By.name("state"));
		state_field.sendKeys("kerala");
		WebElement postalcode_field=driver.findElement(By.name("postalCode"));
		postalcode_field.sendKeys("123456");
		WebElement username_field=driver.findElement(By.id("email"));
		username_field.sendKeys("Anandu");
		WebElement password_field=driver.findElement(By.name("password"));
		password_field.sendKeys("abcdef@123");
		WebElement confirmpassword_field=driver.findElement(By.name("confirmPassword"));
		confirmpassword_field.sendKeys("abcdef@123");
		WebElement submit_button=driver.findElement(By.name("submit"));
		submit_button.click();
		
	}
	
	public void verifyIsSelected()
	{
		boolean ismaleselected;
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement gendermale_field=driver.findElement(By.xpath("//input[@id='gender-male']"));
		ismaleselected=gendermale_field.isSelected();
		System.out.println("male element before selected"+ismaleselected);
		gendermale_field.click();
		ismaleselected=gendermale_field.isSelected();
		System.out.println("male element after selected"+ismaleselected);
		
		
		
		
	}
	
	public void verifyIsEnabled()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement subscribe_button=driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));
		boolean isSubscribeButtonEnabled= subscribe_button.isEnabled();
		System.out.println("subscribe button enabled or not"+isSubscribeButtonEnabled);
		
	}
	
	public void verifyIsDisplayed()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement vote_button=driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
		boolean isVoteButtonDisplayed=vote_button.isDisplayed();
		System.out.println("vote button displayed or not"+isVoteButtonDisplayed);
		
	}

	public static void main(String[] args) {
		WebElementCommands obj=new WebElementCommands();
		//obj.verifyLinkText();
		//obj.verifyDemoWebshopLogin();
		//obj.verifySwagLabsLogin();
		//obj.verifyPartialLinkText();
		//obj.totalNoOfTagInTheApplication();
		//obj.verifyDemoWebshopRegistration();
		//obj.verifyGuru99Registration();
		//obj.verifyIsDisplayed();
		//obj.verifyIsEnabled();
		obj.verifyIsSelected();

	}

}
