package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import excel.ExcelRead;
import pageobject.FlightBookingPageObject;
import pageobject.LoginPageObject;
import pageobject.RegistrationPageObject;

public class MercuryTours {

	RegistrationPageObject Registrationpage;
	LoginPageObject Loginpage;
	FlightBookingPageObject Flightbookingpage;

	WebDriver driver;

	@BeforeTest
	public void setUp() throws Exception {

		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		

		Registrationpage = PageFactory.initElements(driver,RegistrationPageObject.class);
		Loginpage = PageFactory.initElements(driver, LoginPageObject.class);
		Flightbookingpage = PageFactory.initElements(driver,FlightBookingPageObject.class);

	}

	@Test
	public void test() throws Exception {

		
		String[][] dataArray = ExcelRead.readExcel("E:/Selenium Online Class/Class21/POM_JXL/", "JXLTestsheet.xls", "Sheet1");
		
		
		for (int i = 1; i < dataArray.length; i++) {

			for (int j = 0; j < dataArray[i].length;) {

				String firstname = dataArray[i][j];
				j++;

				String lastname = dataArray[i][j];
				j++;
				
				String address = dataArray[i][j];
				j++;

				String username = dataArray[i][j];
				j++;

				String password = dataArray[i][j];
				j++;

				String confirmpassword = dataArray[i][j];
				j++;

				String userID = dataArray[i][j];
				j++;

				String password1 = dataArray[i][j];
				j++;
				

				Registrationpage.Registration(firstname, lastname, address, username,password, confirmpassword);
				Thread.sleep(3000);
				Loginpage.Login(userID, password1);
				Thread.sleep(3000);
				Flightbookingpage.Flightbooking();

			

			}
		}

		

	}

	@AfterTest
	public void tearDown() throws Exception {
	}

}
