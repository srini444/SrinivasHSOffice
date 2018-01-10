package test;

import org.testng.annotations.Test;


import config.driver_config;
import excel.ExcelRead;
import jxl.read.biff.BiffException;
import pageobject.LoginPageObject;
import pageobject.RegistrationPageObject;

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

				
				Registrationpage.JoinButton.click();	
				Registrationpage.namefield.sendKeys(name);
				Registrationpage.emailidfield.sendKeys(emailID);
				Registrationpage.mobilefield.sendKeys(mobile);
				driver.hideKeyboard();
				Registrationpage.passwordfield.sendKeys(password);
				Registrationpage.confirmpasswordfield.sendKeys(confirmpassword);
				Registrationpage.pincodefield.sendKeys(pincode);
				driver.hideKeyboard();
				
				/*try
				{
				if(driver.equals(driver))
				{
					System.out.println("PinCode Enter pass");
					driver.hideKeyboard();
					
				}
				}
				catch(NoSuchElementException e)
				{
					System.out.println("PinCode Enter Fail");
				}*/
					
				Thread.sleep(3000);
				Registrationpage.checkboxfield.click();
				Registrationpage.joinnowButton.click();
				
				Scanner scan = new Scanner(System.in);//System.in is an Input stream
				System.out.println("Enter Captcha");
				String captcha = scan.nextLine();

				driver.findElement(By.className("android.widget.EditText")).sendKeys(captcha);
				
				Thread.sleep(10000);
				Loginpage.mobilefield.sendKeys(mobile);
				Loginpage.passwordfield.sendKeys(password);
				Thread.sleep(3000);
				Loginpage.loginbutton.click();
				
			}
		}

  }
  

  @AfterTest
  public void afterTest() 
  {
	  
  }

}
