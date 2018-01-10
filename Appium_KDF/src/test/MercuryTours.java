package test;

import java.net.URL;
import java.util.Properties;

import operation.ReadObject;
import operation.UIOperation;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import excel.ExcelRead;
import io.appium.java_client.android.AndroidDriver;

public class MercuryTours {
	
	AndroidDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("deviceName", "0123456789ABCDEF");
		capabilities.setCapability("browserName", "Chrome");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	}
	
	
    @Test
	public void testLogin() throws Exception {
       
       ExcelRead file = new ExcelRead();
        
       ReadObject object = new ReadObject();
       
        Properties allObjects =  object.getObjectRepository();
        
        UIOperation operation = new UIOperation(driver);
        
        //Read keyword sheet
        Sheet sh = file.readExcel(System.getProperty("user.dir")+"\\","Keyword.xlsx" , "Sheet1");
        
        //Find number of rows in excel file
    	int rowCount = sh.getLastRowNum()-sh.getFirstRowNum();
    	
    	//Create a loop over all the rows of excel file to read it
		for (int i = 0; i < rowCount+1; i++)
    	{
    		//Loop over all the rows
    	Row row = sh.getRow(i);
 
    	//Call perform method to perform operation on UI
    	operation.perform(allObjects, row.getCell(0).toString(), row.getCell(1).toString(),
    	row.getCell(2).toString(), row.getCell(3).toString());
    	
    	}
    		}
    
    @AfterTest
	public void tearDown() throws Exception {
	}
    		
	}

