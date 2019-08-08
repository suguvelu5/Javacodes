package com.qa.test.keywordengine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.test.keyword.base;

public class KeywordEngine {
	
	public WebDriver driver;
	public Properties prop;
	public static Workbook book;
	public static Sheet sheet;
	public base base1;
	String locatorname; 
	String locatorvalue;
	public static String File_Path = "C:\\Users\\Vega\\Desktop\\keyword.xlsx";

	public void startExecution(String sheetname)
	{
		
		
			FileInputStream file = null;
			try {
				file = new FileInputStream(File_Path);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				book=WorkbookFactory.create(file);
			} catch (InvalidFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sheet=book.getSheet(sheetname);
		int j=0;
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			String locatorcolumn=sheet.getRow(i+1).getCell(j+1).toString().trim();
		
			if(!locatorcolumn.equalsIgnoreCase("NA"))
			{
				 locatorname=locatorcolumn.split("=")[0].trim(); //id
				 locatorvalue=locatorcolumn.split("=")[1].trim();//username
			}
			
			 String action=sheet.getRow(i+1).getCell(j+2).toString().trim();
			 String value=sheet.getRow(i+1).getCell(j+3).toString().trim();
			 
			 switch (action) {
			 	case "open browser": 
				base1=new base();
			    prop=base1.init_property();
			    if(value.isEmpty() || value.equals("NA")) {
			    	
			    	base1.init_driver(prop.getProperty("browser"));}
			    	else {
			    		base1.init_driver(value);
			    			}   					
				break;
				
			 	case "enter url":
			 		if(value.isEmpty()||value.equals("NA")) {
			 			driver.get(prop.getProperty("url"));
			 		}else {
			 			driver.get(value);
			 		}
			 		break;
			 	case "quit":
			 		driver.quit();
			 		break;
			 		default:
			 			break;

			 }
			 
			 switch (locatorname) {
			case "id":
				WebElement wb=driver.findElement(By.id(locatorvalue));
			if(action.equalsIgnoreCase("sendkeys"))
			{
				wb.clear();
				wb.sendKeys(value);
			}else if(action.equalsIgnoreCase("click"))
			{
				wb.click();
			}	locatorvalue=null;			
				break;
			case "linkText":
				WebElement wb1=driver.findElement(By.linkText(locatorvalue));
					wb1.click();
					locatorvalue=null;
					break;
					default:
					break;
			}
			 
			 
	}
		
	}
	
}
