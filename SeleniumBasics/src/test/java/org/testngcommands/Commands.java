package org.testngcommands;

import org.testng.annotations.Test;

public class Commands extends BrowserLaunch {
	@Test
	public void verifyHomepageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/");
		String title=driver.getTitle();
		System.out.println(title);
	}

}
