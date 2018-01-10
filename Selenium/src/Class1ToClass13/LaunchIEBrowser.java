package Class1ToClass13;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class LaunchIEBrowser {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		
	driver = new InternetExplorerDriver();
		
	}

	@Test
	public void test() {
		
	}
	
	@AfterTest
	public void afterTest() {
	}


}
