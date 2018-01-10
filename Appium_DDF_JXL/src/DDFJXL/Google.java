package DDFJXL;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Google
{
	
	AndroidDriver driver;
	

	@BeforeTest
	public void setUp() throws Exception {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("deviceName", "110158e934f1334a");
		capabilities.setCapability("browserName", "Chrome");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
	}
	
	@Test(dataProvider = "testdata")
	
	public void search(String keyword) throws InterruptedException
	{
	
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys(keyword);
		driver.findElement(By.xpath("//button[@class='_Mle']")).submit();
		Thread.sleep(3000);
		
	
	}
	
	@DataProvider(name = "testdata")
	
	public Object[][] readExcel() throws BiffException, IOException
	{
		//File location outside eclipse
				/*
				File f = new File("D:/Selenium/DDFJXL.xls");
				Workbook w = Workbook.getWorkbook(f);
				*/
		
		
		//File location inside eclipse
				File f = new File(System.getProperty("user.dir"));
				
		       File classpathRoot = new File(f, "DDFJXL.xls");
				
				Workbook w = Workbook.getWorkbook(classpathRoot);		
		
		Sheet s = w.getSheet(0);
		int rows = s.getRows();
		System.out.println(rows);
		int columns = s.getColumns();
		System.out.println(columns);
		
		String inputdata [][] = new String[rows][columns];
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				Cell c = s.getCell(j,i);
				inputdata [i][j] = c.getContents();
				System.out.println(inputdata [i][j]);
				
				
			}
		}
		return inputdata;
		

	}
	
	@AfterTest
	public void tearDown() throws Exception {
	}

}