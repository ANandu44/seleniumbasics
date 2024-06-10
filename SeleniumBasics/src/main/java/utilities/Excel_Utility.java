package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utility {
	
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	

public static String getStringData(int a,int b, String sheetname) throws IOException
{
	f=new FileInputStream("C:\\Users\\chand\\git\\seleniumbasics\\SeleniumBasics\\src\\main\\resources\\TestData.xlsx");
	w=new XSSFWorkbook(f);
	sh=w.getSheet(sheetname);
	Row r=sh.getRow(a);
	Cell c=r.getCell(b);
	return c.getStringCellValue();
}


public static String getIntegerData(int a,int b, String sheetname) throws IOException
{
	f=new FileInputStream("C:\\Users\\chand\\git\\seleniumbasics\\SeleniumBasics\\src\\main\\resources\\TestData.xlsx");
	w=new XSSFWorkbook(f);
	sh=w.getSheet(sheetname);
	Row r=sh.getRow(a);
	Cell c=r.getCell(b);
	int x=(int) c.getNumericCellValue();
	return String.valueOf(x);
	
	
}

}
