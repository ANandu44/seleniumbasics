package test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import utilities.Excel_Utility;

public class HomePageTest extends Base{
	@Test
	public void verifyHomePageTitle() 
	{
		driver.get("https://demowebshop.tricentis.com/");
		String actual_title=driver.getTitle();
		System.out.println(actual_title);
		String expected_result=Excel_Utility.getStringData(0, 1, "Home_Page");
		System.out.println(expected_result);
		Assert.assertEquals(actual_title, expected_result, "invalid title");
	}
	
	@Test
	public void verifyCommunityPollSelection() 
	{
		driver.get("https://demowebshop.tricentis.com/");
		//List<WebElement> community_poll=driver.findElements(By.xpath("//ul[@class='poll-options']"));
		List<WebElement> community_poll=driver.findElements(By.xpath("//li[@class='answer']//input[@type='radio']//following-sibling::label"));
		int poll_size=community_poll.size();
		for(int i=0;i<poll_size;i++)
		{
			
			String poll_text=community_poll.get(i).getText();
			if(poll_text.equals(Excel_Utility.getStringData(0, 1, "Home_Page")))
			{
				community_poll.get(i).click();
			}
			
		}
		
	}

}
