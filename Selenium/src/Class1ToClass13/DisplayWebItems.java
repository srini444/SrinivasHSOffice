package Class1ToClass13;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class DisplayWebItems {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		
	driver = new FirefoxDriver();
	
		
	}

	@Test
	public void test() {
		driver.get("http://newtours.demoaut.com/");
		
		//Display URL
		System.out.println(driver.getCurrentUrl());
		
		//Display Page Title
		System.out.println(driver.getTitle());
		
		//Display Window Handle ID
		System.out.println(driver.getWindowHandle());
		
		//Display Page Source Code
		System.out.println(driver.getPageSource());
		
		
	}
	
	@AfterTest
	public void afterTest() {
	}


}
