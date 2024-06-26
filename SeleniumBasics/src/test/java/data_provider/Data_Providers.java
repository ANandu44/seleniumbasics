package data_provider;

import org.testng.annotations.DataProvider;

public class Data_Providers {
	
	@DataProvider(name="InvalidUserCredntials")
	public Object[][] user_Credentials_Data()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="john324@gmail.com";
		data[0][1]="john@1234";
		
		data[1][0]="john314@gmail.com";
		data[1][1]="john@456";
		
		data[2][0]="john666@gmail.com";
		data[2][1]="john@456";
		
		return data;
	}
	
	

}
