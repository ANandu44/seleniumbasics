package org.selenium.basics;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
	
	public void verifyValuesFromDropdown() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement country_dropdown=driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select(country_dropdown);
		//select.selectByVisibleText("ALGERIA");
		//select.selectByIndex(5);
		select.selectByValue("AUSTRIA");
		WebElement selected_country=select.getFirstSelectedOption();
		System.out.println(selected_country.getText());
	}
	
	public void verifyTotalDropdownValues()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement country_dropdown=driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select(country_dropdown);
		List<WebElement> dropdownlist=select.getOptions();
		System.out.println("total no of options in dropdown-"+dropdownlist);
	}
	
	public void verifyMultipleOptionsFromDropdown()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		WebElement multiselect=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select select=new Select(multiselect);
		boolean selected_values=select.isMultiple();
		System.out.println("check whether values are selected"+selected_values);
		select.selectByIndex(2);
		select.selectByIndex(0);
		List<WebElement> listofselectedoptions=select.getAllSelectedOptions();
		for(WebElement e:listofselectedoptions)
		{
			System.out.println(e.getText());
		}
		select.deselectByIndex(0);
		
		
		
	}
	
	public void verifyColorFromDropdown()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		WebElement select_color=driver.findElement(By.cssSelector("select#single-input-field"));
		Select select =new Select(select_color);
		select.selectByValue("Yellow");
		WebElement message_display=driver.findElement(By.cssSelector("div#message-one"));
		String message=message_display.getText();
		System.out.println(message);
	}
	
	public void verifySimpleAlert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement clickme_button=driver.findElement(By.cssSelector("button#alertButton"));
		clickme_button.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.close();
	}
	
	public void verifyConformationAlert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement clickme_button=driver.findElement(By.cssSelector("button#confirmButton"));
		clickme_button.click();
		Alert alert=driver.switchTo().alert();
		String alert_message=alert.getText();
		System.out.println(alert_message);
		//alert.accept();
		alert.dismiss();
		WebElement result_message=driver.findElement(By.cssSelector("span#confirmResult"));
		String result=result_message.getText();
		System.out.println("after clicking alertbox-"+result);
	
	}
	
	public void verifyPromptAlert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement clickme_button=driver.findElement(By.xpath("//button[@id='promtButton']"));
		clickme_button.click();
		Alert alert=driver.switchTo().alert();
		String alert_text=alert.getText();
		System.out.println(alert_text);
		alert.sendKeys("anandu");
		alert.accept();
		WebElement result_message=driver.findElement(By.xpath("//span[@id='promptResult']"));
		String result=result_message.getText();
		System.out.println(result);
		driver.close();
		
	}
	
	public void verifyCustomerDelete()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement customer_id=driver.findElement(By.xpath("//input[@name='cusid']"));
		customer_id.sendKeys("123456");
		WebElement submit_button=driver.findElement(By.xpath("//input[@name='submit']"));
		submit_button.click();
		Alert alert=driver.switchTo().alert();
		String alert_message=alert.getText();
		System.out.println(alert_message);
		alert.accept();
		String conformation_message=alert.getText();
		System.out.println(conformation_message);
		alert.accept();
		driver.close();
		
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
		//obj.verifyIsSelected();
		//obj.verifyValuesFromDropdown();
		//obj.verifyTotalDropdownValues();
		//obj.verifyMultipleOptionsFromDropdown();
		//obj.verifyColorFromDropdown();
		//obj.verifySimpleAlert();
	    //obj.verifyConformationAlert();
		//obj.verifyPromptAlert();
		obj.verifyCustomerDelete();
		
		

	}

}
