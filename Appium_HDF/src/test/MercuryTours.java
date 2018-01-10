package test;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import operation.ReadObject;
import operation.UIOperation;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
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
    
	@Test(dataProvider="testdata")
	public void testLogin(String testcaseName,String keyword,String objectName,String objectType,String value) throws Exception {
	 	
    	   	
        ReadObject object = new ReadObject();
        
        Properties allObjects =  object.getObjectRepository();
        
        UIOperation operation = new UIOperation(driver);
      	
        //Call perform function to perform operation on UI
    	operation.perform(allObjects, keyword, objectName,objectType, value);
    	    
	}

    
    @DataProvider(name="testdata")
	public Object[][] getDataFromDataprovider() throws IOException{
    
    Object[][] object = null; 
    
    ExcelRead file = new ExcelRead();
        
    //Read keyword sheet
    Sheet sh = file.readExcel(System.getProperty("user.dir")+"\\","Hybrid.xlsx" , "Sheet1");
    //Sheet sh = file.readExcel(("D:/Selenium") +"\\","Hybrid.xlsx" , "Sheet1");
    
    //Find number of rows in excel file
    int rowCount = sh.getLastRowNum()-sh.getFirstRowNum();
    object = new Object[rowCount][5];
    for (int i = 0; i < rowCount; i++) {
    		
    //Loop over all the rows
    Row row = sh.getRow(i+1);
    
    //Create a loop to print cell values in a row
    for (int j = 0; j < row.getLastCellNum(); j++) {
   
    //Print excel data in console
   object[i][j] = row.getCell(j).toString();
    		}
    	}
     	System.out.println("");
     	  return object;	 
	}
    
    
    @AfterTest
   	public void tearDown() throws Exception {
   	}
       		
   	}
    

