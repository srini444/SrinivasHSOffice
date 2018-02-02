package test;

import org.testng.annotations.Test;
import config.driver_config;
import excel.ExcelRead;
import io.appium.java_client.android.AndroidDeviceActionShortcuts;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import jxl.read.biff.BiffException;
import pageobject.SearchJobsPageObject;
import org.testng.annotations.BeforeTest;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class NewTest extends driver_config
{

	SearchJobsPageObject SearchJobs;
	
	
	 
  @Test
  public void f() throws InterruptedException, BiffException, IOException 
  {
	 
	  SearchJobs = PageFactory.initElements(driver, SearchJobsPageObject.class);
	  

		String[][] dataArray = ExcelRead.readExcel("E:/Selenium Online Class/Class21/POM_JXL/", "JXLTestsheet.xls", "Sheet3");
		
		
		for (int i = 1; i < dataArray.length; i++) {

			for (int j = 0; j < dataArray[i].length;) {

				String Keywords = dataArray[i][j];
				j++;

			/*	String Location = dataArray[i][j];
				j++;
				
				/*String mobile = dataArray[i][j];
				j++;


			*/
				
				SearchJobs.SearchJobsButton.click();
				Thread.sleep(3000);
						
				SearchJobs.KeywordsTextBox.sendKeys(Keywords);
				Thread.sleep(2000);
				
				SearchJobs.KeywordsEnter((AndroidDeviceActionShortcuts) driver);
						
				Thread.sleep(2000);
				SearchJobs.LocationButton.click();
			}
		}

  }
  

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}
