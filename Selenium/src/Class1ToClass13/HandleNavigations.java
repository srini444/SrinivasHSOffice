package Class1ToClass13;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class HandleNavigations {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		
	driver = new FirefoxDriver();
	
		
	}

	@Test
	public void test() throws Exception {
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("Cruises")).click();
		
		//Back Navigation
		Thread.sleep(2000);
		driver.navigate().back();
		
		//Forward Navigation
		Thread.sleep(2000);
		driver.navigate().forward();
		
		//Refresh Browser
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		//To Navigation
		Thread.sleep(2000);
		driver.navigate().to("http://parabank.parasoft.com/parabank/index.htm");
		
	}
	
	@AfterTest
	public void afterTest() {
	}


}
