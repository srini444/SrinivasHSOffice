package Class1ToClass13;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class MaximizeBrowser {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
		
	}

	@Test
	public void test() {
		
	}
	
	@AfterTest
	public void afterTest() {
	}


}
