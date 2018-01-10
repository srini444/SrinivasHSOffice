package test;

import org.testng.annotations.Test;


import config.driver_config;
import excel.ExcelRead;
import jxl.read.biff.BiffException;
import pageobject.LoginPageObject;
import pageobject.RegistrationPageObject;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class NewTest extends driver_config
{

	RegistrationPageObject Registrationpage;
	LoginPageObject Loginpage;
	
	
	 
  @Test
  public void f() throws InterruptedException, BiffException, IOException 
  {
	  Registrationpage = PageFactory.initElements(driver,RegistrationPageObject.class);
	  Loginpage = PageFactory.initElements(driver, LoginPageObject.class);
	  

		String[][] dataArray = ExcelRead.readExcel("E:/Selenium Online Class/Class21/POM_JXL/", "JXLTestsheet.xls", "Sheet2");
		
		
		for (int i = 1; i < dataArray.length; i++) {

			for (int j = 0; j < dataArray[i].length;) {

				String name = dataArray[i][j];
				j++;

				String emailID = dataArray[i][j];
				j++;
				
				String mobile = dataArray[i][j];
				j++;

				String password = dataArray[i][j];
				j++;

				String confirmpassword = dataArray[i][j];
				j++;

				String pincode = dataArray[i][j];
				j++;

				
				

				Registrationpage.Registration(name, emailID, mobile, password, confirmpassword, pincode);	
				Thread.sleep(3000);
				//Loginpage.Login(mobile, password);
				Thread.sleep(3000);
				driver.navigate().back();
				
				

			

			}
		}

  }
  

  @AfterTest
  public void afterTest() 
  {
	  
  }

}
