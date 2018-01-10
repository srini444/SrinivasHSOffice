package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.FlightBookingPageObject;
import pageobject.LoginPageObject;
import pageobject.RegistrationPageObject;

public class MercuryTours {
	
	RegistrationPageObject Registrationpage;
	LoginPageObject Login;
	FlightBookingPageObject Flightbookingpage;
	
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
		
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");

		Registrationpage = PageFactory.initElements(driver, RegistrationPageObject.class);
		Login = PageFactory.initElements(driver, LoginPageObject.class);
		Flightbookingpage = PageFactory.initElements(driver, FlightBookingPageObject.class);
		
	}

	
	@Test
	public void test() throws Exception {
		
		Registrationpage.Registration("first1", "last1", "user1", "pass1", "pass1");
		
		Login.Login("mercury", "mercury");
		
		Flightbookingpage.Flightbooking();
		
		
		
	}
	
	
	@AfterTest
	public void tearDown() throws Exception {
	}

	

}
