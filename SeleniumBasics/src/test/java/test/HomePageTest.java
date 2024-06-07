package test;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;

public class HomePageTest extends Base {
	@Test
	public void verifyHomePageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/");
		String actual_title=driver.getTitle();
		System.out.println(actual_title);
		String expected_result="Demo Web Shop";
		Assert.assertEquals(actual_title, expected_result, "invalid title");
	}
	
	@Test
	public void verifyCommunityPollSelection()
	{
		driver.get("https://demowebshop.tricentis.com/");
		//List<WebElement> community_poll=driver.findElements(By.xpath("//ul[@class='poll-options']"));
		List<WebElement> community_poll=driver.findElements(By.xpath("//li[@class='answer']//input[@type='radio']//following-sibling::label"));
		for(WebElement poll_options:community_poll)
		{
			
			String poll_text=poll_options.getText();
			if(poll_text.equals("Good"))
			{
				poll_options.click();
			}
			
		}
		
	}

}
