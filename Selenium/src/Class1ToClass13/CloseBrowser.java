package Class1ToClass13;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class CloseBrowser {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		
	driver = new FirefoxDriver();
		
	}

	@Test
	public void test() {
		
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
	}


}
