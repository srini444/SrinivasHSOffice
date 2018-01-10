package test;


import static org.junit.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.FlightBookingPageObject;
import pageobject.LoginPageObject;
import pageobject.RegistrationPageObject;

public class MercuryToursModel3 {

	WebDriver driver;
	
	RegistrationPageObject Registrationpage;
	LoginPageObject Loginpage;
	FlightBookingPageObject FlightBookingpage;
	
	@BeforeTest
	public void setUp() throws Exception {
		
		driver = new FirefoxDriver();		
		driver.get("http://newtours.demoaut.com/");		
		
		Registrationpage = PageFactory.initElements(driver, RegistrationPageObject.class);
		Loginpage = PageFactory.initElements(driver, LoginPageObject.class);
		FlightBookingpage = PageFactory.initElements(driver, FlightBookingPageObject.class);
	
	}

	
	@Test
	public void test() throws Exception {
		
		//Registration Operations
		System.out.println(Registrationpage.registerlink.isDisplayed());
		Registrationpage.registerlink.click();
		
		
		Thread.sleep(3000);
		Registrationpage.firstnamefield.sendKeys("firstuser");
		Registrationpage.lastnamefield.sendKeys("lastuser");
		
		
		Registrationpage.selectDropdown();
		
		
		Registrationpage.usernamefield.sendKeys("user1");
		Registrationpage.passwordfield.sendKeys("pass1");
		Registrationpage.confirmpasswordfield.sendKeys("pass1");
		Registrationpage.registerbutton.click();	
		Thread.sleep(3000);
		
		String text = driver.findElement(By.xpath("//div[@class='footer']")).getText();
		assertEquals("© 2005, Mercury Interactive (v. 011003-1.01-058)", text);
		System.out.println(text);
		
		Registrationpage.signinlink.click();
		Thread.sleep(3000);
		
		//Login Operations
		Loginpage.usernamefield.sendKeys("mercury");
		Loginpage.passwordfield.sendKeys("mercury");
		Loginpage.loginbutton.click();
		Thread.sleep(3000);
		
		//Flight Reservation Operations
		FlightBookingpage.continuebutton1.click();
		Thread.sleep(3000);
		FlightBookingpage.continuebutton2.click();
		Thread.sleep(3000);
		FlightBookingpage.securepurchasebutton.click();
		Thread.sleep(3000);
		FlightBookingpage.logoutbutton.click();
		
	}
	
	
	@AfterTest
	public void tearDown() throws Exception {
	}

	

}
