package org.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String current_url=driver.getCurrentUrl();
		System.out.println(current_url);
		String handle_id=driver.getWindowHandle();
		System.out.println(handle_id);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		driver.close();
		
		

	}

}
