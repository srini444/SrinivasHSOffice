package Class1ToClass13;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class URLLaunching {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		
	driver = new FirefoxDriver();
	
		
	}

	@Test
	public void test() {
		driver.get("http://newtours.demoaut.com/");
		
	}
	
	@AfterTest
	public void afterTest() {
	}


}
