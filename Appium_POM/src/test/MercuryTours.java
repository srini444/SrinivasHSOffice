package test;


import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.FlightBookingPageObject;
import pageobject.LoginPageObject;
import pageobject.RegistrationPageObject;

public class MercuryTours {
	
	
	
	RegistrationPageObject Registrationpage;
	LoginPageObject Loginpage;
	FlightBookingPageObject Flightbookingpage;
	
	AndroidDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
		
        DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("deviceName", "0123456789ABCDEF");
		capabilities.setCapability("browserName", "Chrome");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
	
		driver.get("http://newtours.demoaut.com/");
		
		
	
		
		Registrationpage = PageFactory.initElements(driver, RegistrationPageObject.class);
		Loginpage = PageFactory.initElements(driver, LoginPageObject.class);
		Flightbookingpage = PageFactory.initElements(driver, FlightBookingPageObject.class);
		
	}

	
	@Test
	public void test() {
		
		Registrationpage.Registration("first1", "last1", "user1", "pass1", "pass1");
		
		Loginpage.Login("mercury", "mercury");
		
		Flightbookingpage.Flightbooking();
		
	}
	
	
	@AfterTest
	public void tearDown() throws Exception {
	}

	

}
