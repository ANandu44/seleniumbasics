package org.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTest {
	
	public void verifySingleInputField()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement message_field=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		message_field.sendKeys("selenium automation");
		WebElement showmessage_button=driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessage_button.click();
		WebElement your_message=driver.findElement(By.xpath("//div[@id='message-one']"));
		String result_message=your_message.getText();
		System.out.println(result_message);
		
	}
	
	public void verifyTwoInputFields()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement value_a=driver.findElement(By.xpath("//input[@class='form-control'and@id='value-a']"));
		value_a.sendKeys("20");
		WebElement value_b=driver.findElement(By.xpath("//input[@class='form-control'and@id='value-b']"));
		value_b.sendKeys("30");
		WebElement gettotal_button=driver.findElement(By.xpath("//button[@class='btn btn-primary'and@id='button-two']"));
		gettotal_button.click();
		WebElement total_message=driver.findElement(By.xpath("//div[@class='my-2'and@id='message-two']"));
		String result=total_message.getText();
		System.out.println(result);
	}
	
	public void verifyCheckBoxDemo()
	{
		boolean CheckBoxIsSelected;
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement singlecheckbox=driver.findElement(By.xpath("//div[@class='form-check']//input[@id='gridCheck']"));
		CheckBoxIsSelected=singlecheckbox.isSelected();
		System.out.println("checkbox before selected"+CheckBoxIsSelected);
		singlecheckbox.click();
		CheckBoxIsSelected=singlecheckbox.isSelected();
		System.out.println("checkbox after selected"+CheckBoxIsSelected);
	}
	
	public void verifyRadioButtonDemo()
	{
		boolean IsMaleSelected;
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement male_box=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		IsMaleSelected=male_box.isSelected();
		System.out.println("before male is selected-"+IsMaleSelected);
		male_box.click();
		IsMaleSelected=male_box.isSelected();
		System.out.println("after male is selected-"+IsMaleSelected);
		WebElement ShowSelectedValue=driver.findElement(By.cssSelector("button#button-one"));
		ShowSelectedValue.click();
		WebElement messagefield=driver.findElement(By.cssSelector("div#message-one"));
		String result_message=messagefield.getText();
		System.out.println(result_message);
		
		
		
	}
	
	public void verifyFormSubmit()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/form-submit.php");
		driver.manage().window().maximize();
		WebElement firstname_field=driver.findElement(By.cssSelector("input#validationCustom01"));
		firstname_field.sendKeys("Anandu");
		WebElement lastname_field=driver.findElement(By.cssSelector("input#validationCustom02"));
		lastname_field.sendKeys("A");
		WebElement username_field=driver.findElement(By.cssSelector("input#validationCustomUsername"));
		username_field.sendKeys("anandu123");
		WebElement city_field=driver.findElement(By.cssSelector("input#validationCustom03"));
		city_field.sendKeys("Trivandrum");
		WebElement state_field=driver.findElement(By.cssSelector("input#validationCustom04"));
		state_field.sendKeys("kerala");
		WebElement zip_field=driver.findElement(By.cssSelector("input#validationCustom05"));
		zip_field.sendKeys("123456");
		WebElement termsandconditions=driver.findElement(By.cssSelector("input#invalidCheck"));
		termsandconditions.click();
		WebElement submit_button=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		submit_button.click();
		WebElement submit_message=driver.findElement(By.cssSelector("div#message-one"));
		String result=submit_message.getText();
		System.out.println(result);
		
		
		
	}
	

	public static void main(String[] args) {
		AssignmentTest obj=new AssignmentTest();
		//obj.verifySingleInputField();
		//obj.verifyTwoInputFields();
		//obj.verifyCheckBoxDemo();
		//obj.verifyRadioButtonDemo();
		obj.verifyFormSubmit();
		

	}

}
